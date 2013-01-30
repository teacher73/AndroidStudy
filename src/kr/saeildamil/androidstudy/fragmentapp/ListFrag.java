package kr.saeildamil.androidstudy.fragmentapp;

import kr.saeildamil.androidstudy.R;
import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ListFrag extends ListFragment {
	OnListItemSeletedListener listener;
	
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		try{
			listener = (OnListItemSeletedListener) activity;
		}catch(ClassCastException e){
			throw new ClassCastException(activity.toString() + "must implement" +
					"OnListItemSelectedListener interface");
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
