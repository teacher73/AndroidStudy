package kr.saeildamil.androidstudy.fragmentcode;

import kr.saeildamil.androidstudy.R;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;

public class FragmentMainTwo extends Activity {
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();
		
		FragmentPortrait f1 = new FragmentPortrait();
		FragmentLandscape f2 = new FragmentLandscape();
		
		if (getWindowManager().getDefaultDisplay().getRotation() == Surface.ROTATION_0){
			ft.replace(android.R.id.content, f1);
		}else{
			ft.replace(android.R.id.content, f2);
		}
		
		ft.commit();
	}
	
	public static class FragmentPortrait extends Fragment{
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			return inflater.inflate(R.layout.fragmentportrait, container, false);
		}
	}
	
	public static class FragmentLandscape extends Fragment{
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			return inflater.inflate(R.layout.fragmentlandscape, container, false);
		}
	}
}
