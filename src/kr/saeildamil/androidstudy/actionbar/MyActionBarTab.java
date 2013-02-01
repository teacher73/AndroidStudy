package kr.saeildamil.androidstudy.actionbar;

import kr.saeildamil.androidstudy.R;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MyActionBarTab extends Activity {
	Fragment f1, f2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.myactionbartab);
		
		ActionBar actionBar = getActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		
		f1 = new FragmentOne();
		f2 = new FragmentTwo();
		
		actionBar.addTab(actionBar.newTab().setText("Text Fragment").setTabListener(listener));
		actionBar.addTab(actionBar.newTab().setText("Image Fragment").setTabListener(listener));
		
		
	}
	
	TabListener listener = new TabListener() {
		public void onTabUnselected(Tab tab, FragmentTransaction ft) {
			ft.remove(tab.getPosition()==0?f1:f2);
		}
		
		public void onTabSelected(Tab tab, FragmentTransaction ft) {
			ft.replace(R.id.myactionbartab_fragment, tab.getPosition()==0?f1:f2);
		}
		
		public void onTabReselected(Tab tab, FragmentTransaction ft) {
			Toast.makeText(MyActionBarTab.this, "Reselected!", Toast.LENGTH_LONG).show();
		}
	};
	
	public static class FragmentOne extends Fragment{
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			return inflater.inflate(R.layout.myactionbartab_fragment1, container, false);
		}
	}
	
	public static class FragmentTwo extends Fragment {
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			return inflater.inflate(R.layout.myactionbartab_fragment2, container, false);
		}
	}
	
	
}
