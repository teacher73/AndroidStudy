/**
 *
 * @package		: kr.saeildamil.androidstudy.fragmentbackstack
 * @FileName	: DetailFragmentBackStack.java
 * @Date  		: 2013. 1. 30.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package kr.saeildamil.androidstudy.fragmentbackstack;

import kr.saeildamil.androidstudy.R;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * 
 * @author	mskim
 * @since	2013. 1. 30. 오후 11:48:05
 * @version	1.0.0
 */

public class DetailFragmentBackStack extends Fragment {
	/**
	 * @see android.app.Fragment#onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.detailfragmentbackstack, container);
		TextView tv = (TextView) v.findViewById(R.id.detail_tv);
		String[] list = getResources().getStringArray(R.array.fraglists);
		tv.setText(list[getArguments().getInt("position", 0)]);
		return inflater.inflate(R.layout.detailfragmentbackstack, container);
	}
}
