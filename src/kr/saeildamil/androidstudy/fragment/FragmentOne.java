package kr.saeildamil.androidstudy.fragment;

import kr.saeildamil.androidstudy.R;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentOne extends Fragment {

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.d("Fragment", "FragmentOne - onCreateView(LayoutInflater inflater, ViewGroup container,	Bundle savedInstanceState)");
		return inflater.inflate(R.layout.fragmentone, container, false);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		Log.d("Fragment", "FragmentOne - onActivityCreated(Bundle savedInstanceState)");
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public void onAttach(Activity activity) {
		Log.d("Fragment", "FragmentOne - onAttach(Activity activity)");
		super.onAttach(activity);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.d("Fragment", "FragmentOne - onCreate(Bundle savedInstanceState)");
		super.onCreate(savedInstanceState);
	}

	@Override
	public void onDestroy() {
		Log.d("Fragment", "FragmentOne - onDestroy()");
		super.onDestroy();
	}

	@Override
	public void onDestroyView() {
		Log.d("Fragment", "FragmentOne - onDestroyView()");
		super.onDestroyView();
	}

	@Override
	public void onDetach() {
		Log.d("Fragment", "FragmentOne - onDetach()");
		super.onDetach();
	}

	@Override
	public void onPause() {
		Log.d("Fragment", "FragmentOne - onPause()");
		super.onPause();
	}

	@Override
	public void onResume() {
		Log.d("Fragment", "FragmentOne - onResume()");
		super.onResume();
	}

	@Override
	public void onStart() {
		Log.d("Fragment", "FragmentOne - onStart()");
		super.onStart();
	}

	@Override
	public void onStop() {
		Log.d("Fragment", "FragmentOne - onStop()");
		super.onStop();
	}
	
	
}
