/**
 *
 * @package		: kr.saeildamil.androidstudy.fragmentbackstack
 * @FileName	: FragmentBackStack.java
 * @Date  		: 2013. 1. 30.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package kr.saeildamil.androidstudy.fragmentbackstack;

import kr.saeildamil.androidstudy.R;
import kr.saeildamil.androidstudy.fragmentapp.OnListItemSeletedListener;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;

/**
 * 
 * @author	mskim
 * @since	2013. 1. 30. 오후 11:33:49
 * @version	1.0.0
 */

public class FragmentBackStack extends Activity implements OnListItemSeletedListener{
	/**
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragmentbackstack);
	}

	/**
	 * @see kr.saeildamil.androidstudy.fragmentapp.OnListItemSeletedListener#onListItemSelected(int)
	 */
	@Override
	public void onListItemSelected(int position) {
		DetailFragmentBackStack df = (DetailFragmentBackStack) getFragmentManager().findFragmentById(R.id.detail);
		if (df != null && df.getArguments().getInt("position", 0) != position){
			df = new DetailFragmentBackStack();
			Bundle b = new Bundle();
			b.putInt("position", 0);
			df.setArguments(b);
			FragmentTransaction ft = getFragmentManager().beginTransaction();
			ft.replace(R.id.detail, df).addToBackStack(null).commit();
		}
	}
}
