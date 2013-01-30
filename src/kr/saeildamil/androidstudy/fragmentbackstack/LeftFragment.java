package kr.saeildamil.androidstudy.fragmentbackstack;

import kr.saeildamil.androidstudy.R;
import kr.saeildamil.androidstudy.fragmentapp.OnListItemSeletedListener;
import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LeftFragment extends ListFragment {
	OnListItemSeletedListener listener;
	
	/**
	 * @see android.app.Fragment#onAttach(android.app.Activity)
	 */
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		try{
			listener = (OnListItemSeletedListener) activity;
		} catch(ClassCastException e){
			throw new ClassCastException(activity.toString() +
					"must implement OnListItemSelectedListener interface");
		}
	}
	
	/**
	 * @see android.app.Fragment#onActivityCreated(android.os.Bundle)
	 */
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		setListAdapter(ArrayAdapter.createFromResource(getActivity(), R.array.fraglists, android.R.layout.simple_list_item_1));
	}
	
	/**
	 * @see android.app.ListFragment#onListItemClick(android.widget.ListView, android.view.View, int, long)
	 */
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		listener.onListItemSelected(position);
	}
}
