package kr.saeildamil.androidstudy.fragmentapp_handset;

import kr.saeildamil.androidstudy.R;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailFragment extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.detailfragment, container, false);
		TextView tv = (TextView) view.findViewById(R.id.detailfragment_tv);
		String[] list = getResources().getStringArray(R.array.fraglists);
		tv.setText(list[getArguments().getInt("position", 0)]);
		return view;
	}
}
