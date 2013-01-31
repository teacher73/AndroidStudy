package kr.saeildamil.androidstudy.fragmentapp_handset;

import android.app.Activity;
import android.os.Bundle;

public class DetailActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		DetailFragment df = new DetailFragment();
		df.setArguments(getIntent().getExtras());
		getFragmentManager().beginTransaction().add(android.R.id.content, df).commit();
	}
}
