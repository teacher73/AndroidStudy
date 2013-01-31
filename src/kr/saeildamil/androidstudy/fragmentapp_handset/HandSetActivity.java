package kr.saeildamil.androidstudy.fragmentapp_handset;

import kr.saeildamil.androidstudy.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class HandSetActivity extends Activity implements OnListItemSelectedListener{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragmentapp_handset);
	}

	@Override
	public void onListItemSelected(int position) {
		Intent intent = new Intent(HandSetActivity.this, DetailActivity.class);
		Bundle b = new Bundle();
		b.putInt("position", position);
		intent.putExtras(b);
		startActivity(intent);
	}
}
