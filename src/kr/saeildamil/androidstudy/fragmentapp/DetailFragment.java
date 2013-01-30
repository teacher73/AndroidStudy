package kr.saeildamil.androidstudy.fragmentapp;

import kr.saeildamil.androidstudy.R;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailFragment extends Fragment {

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.detailfragment, container);
	}
	
	public void setText(String item){
		TextView tv = (TextView) getView().findViewById(R.id.detailfragment_tv);
		tv.setText(item);
	}
}
