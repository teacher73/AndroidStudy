package kr.saeildamil.androidstudy.gallery;

import kr.saeildamil.androidstudy.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class MyGallery extends Activity {
	int[] resImgLists;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mygallery);
		
		String[] imglists = getResources().getStringArray(R.array.gallery_img_lists);
		resImgLists = new int[imglists.length];
		
		for(int i=0; i<imglists.length; i++){
			resImgLists[i] = getResources().getIdentifier(imglists[i], "drawable", "kr.saeildamil.androidstudy");
		}
		
		Gallery gallery = (Gallery) findViewById(R.id.mygallery_gallery);
		gallery.setAdapter(new ImageAdapter(this));
		gallery.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v, int position ,long id) {
				ImageView imageView = (ImageView) findViewById(R.id.mygallery_imageView);
				imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
				imageView.setImageResource(resImgLists[position]);
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
			return resImgLists.length;
		}

		@Override
		public Object getItem(int position) {
			return resImgLists[position];
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			ImageView imageView = new ImageView(context);
			imageView.setImageResource(resImgLists[position]);
			imageView.setLayoutParams(new Gallery.LayoutParams(100, 80));
			
			imageView.setBackgroundResource(itemBackground);
			return imageView;
		}
		
	}
}
