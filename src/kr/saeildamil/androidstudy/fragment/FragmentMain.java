package kr.saeildamil.androidstudy.fragment;

import kr.saeildamil.androidstudy.R;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class FragmentMain extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.d("Fragment", "FragmentMain - onCreate(Bundle savedInstanceState)");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_main);
	}

	@Override
	protected void onDestroy() {
		Log.d("Fragment", "FragmentMain - onDestroy()");
		super.onDestroy();
	}

	@Override
	protected void onPause() {
		Log.d("Fragment", "FragmentMain - onPause()");
		super.onPause();
	}

	@Override
	protected void onRestart() {
		Log.d("Fragment", "FragmentMain - onRestart()");
		super.onRestart();
	}

	@Override
	protected void onResume() {
		Log.d("Fragment", "FragmentMain - onResume()");
		super.onResume();
	}

	@Override
	protected void onStart() {
		Log.d("Fragment", "FragmentMain - onStart()");
		super.onStart();
	}

	@Override
	protected void onStop() {
		Log.d("Fragment", "FragmentMain - onStop()");
		super.onStop();
	}
	
}
