package kr.saeildamil.androidstudy.fragmentapp_handset;

import kr.saeildamil.androidstudy.R;
import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListFragHandSet extends ListFragment {
	OnListItemSelectedListener listener;
	
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		try{
			listener = (OnListItemSelectedListener) activity;
		}catch(ClassCastException e){
			String str = activity.toString() + "must implement OnListItemSelectedListener interface";
			throw new ClassCastException(str);
		}
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		setListAdapter(ArrayAdapter.createFromResource(getActivity(), R.array.fraglists, android.R.layout.simple_list_item_1));
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		listener.onListItemSelected(position);
	}
	
	
}
