package kr.saeildamil.androidstudy.fragmentapp;

import kr.saeildamil.androidstudy.R;
import android.app.Activity;
import android.os.Bundle;

public class FragmentAppList extends Activity implements OnListItemSeletedListener{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragmentapplist);
	}
	
	@Override
	public void onListItemSelected(int position) {
		DetailFragment df = (DetailFragment) getFragmentManager().findFragmentById(R.id.fragment2);
		if (df != null && df.isInLayout()){
			String[] arr = getResources().getStringArray(R.array.fraglists);
			df.setText(arr[position]);
		}
	}

}
