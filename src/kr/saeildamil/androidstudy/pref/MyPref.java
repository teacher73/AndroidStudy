/**
 *
 * @package		: kr.saeildamil.androidstudy.pref
 * @FileName	: MyPref.java
 * @Date  		: 2013. 2. 13.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package kr.saeildamil.androidstudy.pref;

import kr.saeildamil.androidstudy.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * 
 * @author	mskim
 * @since	2013. 2. 13. 오후 9:50:06
 * @version	1.0.0
 */

public class MyPref extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mypref);
	}
	
	public void mOnClick(View v){
		switch (v.getId()) {
		case R.id.mypref_btn01:
			startActivity(new Intent(MyPref.this, MyPrefActivity.class));
			break;
		case R.id.mypref_btn02:
			startActivity(new Intent(MyPref.this, MyPrefFragment.class));
		default:
			break;
		}
	}
}
