package kr.saeildamil.androidstudy.gallery;

import kr.saeildamil.androidstudy.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;

public class MyGallerySd extends Activity {
	private Cursor cursor;
	
	int[] resImgLists;

	private int columnIndex;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mygallery);
		
		String[] proj = { MediaStore.Images.Thumbnails._ID };
		
		for(int i=0; i<proj.length; i++){
			Toast.makeText(this, proj[i], Toast.LENGTH_LONG).show();
		}
		
		cursor = managedQuery(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, 
				proj, null, null, null);
		startManagingCursor(cursor);
		
		columnIndex = cursor.getColumnIndexOrThrow(MediaStore.Images.Thumbnails._ID);
		
		Gallery gallery = (Gallery) findViewById(R.id.mygallery_gallery);
		gallery.setAdapter(new ImageAdapter(this));
		gallery.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v, int position ,long id) {
				String[] proj = { MediaStore.Images.Media.DATA };
				Cursor dataCursor = managedQuery(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, 
						proj, null, null, null);
				int columnIndex = dataCursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA );
				
				String fileName = dataCursor.getString(columnIndex);
				
				Bitmap bitmap = BitmapFactory.decodeFile(fileName);
				
				ImageView imageView = (ImageView) findViewById(R.id.mygallery_imageView);
				imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
				//imageView.setImageResource(resImgLists[position]);
				imageView.setImageBitmap(bitmap);
				dataCursor.close();
			}
		});

	}
	
	public class ImageAdapter extends BaseAdapter{
		private Context context;
		private int itemBackground;
		
		public ImageAdapter(Context context) {
			this.context = context;
			
			TypedArray a= obtainStyledAttributes(R.styleable.Galldery1);
			itemBackground = a.getResourceId(R.styleable.Galldery1_android_galleryItemBackground, 0);
			a.recycle();
		}

		@Override
		public int getCount() {
			return cursor.getCount();
		}

		@Override
		public Object getItem(int position) {
			return position;
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			ImageView imageView=null;
			if (convertView == null){
				imageView = new ImageView(context);
				imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
				imageView.setLayoutParams(new Gallery.LayoutParams(100, 80));
			}else{
				imageView = (ImageView) convertView;
			}
			
			cursor.moveToPosition(position);
			int id = cursor.getInt(columnIndex);
			
			//imageView.setImageResource(resImgLists[position]);
			//imageView.setBackgroundResource(itemBackground);
			imageView.setImageURI(Uri.withAppendedPath(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, "" + id));
			
			return imageView;
		}
		
	}
}
