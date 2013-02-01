package kr.saeildamil.androidstudy.actionbar;

import kr.saeildamil.androidstudy.R;
import android.app.ActionBar;
import android.app.ActionBar.OnNavigationListener;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;

public class MyActionBarTabList extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.myactionbartablist);
		
		ActionBar actionBar = getActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);
		
		SpinnerAdapter adapter = ArrayAdapter.createFromResource(MyActionBarTabList.this, R.array.actionbar_tab_list, android.R.layout.simple_spinner_dropdown_item);
		
		actionBar.setListNavigationCallbacks(adapter, listener);
	}
	

	OnNavigationListener listener = new OnNavigationListener() {
		public boolean onNavigationItemSelected(int itemPosition, long itemId) {
			Fragment f1 = new FragmentOne();
			Fragment f2 = new FragmentTwo();
			
			getFragmentManager()
			.beginTransaction()
			.replace(R.id.myactionbartablist_fragment, itemPosition == 0 ? f1:f2)
			.commit();
			
			return true;
		}
	};
	
	public static class FragmentOne extends Fragment{
		
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			return inflater.inflate(R.layout.myactionbartablist_fragment1, container, false);
		}
	}
	
	public static class FragmentTwo extends Fragment{
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			return inflater.inflate(R.layout.myactionbartablist_fragment2, container, false);
		}
	}
}
