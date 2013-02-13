/**
 *
 * @package		: kr.saeildamil.androidstudy.pref
 * @FileName	: MyPrefActivity.java
 * @Date  		: 2013. 2. 13.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package kr.saeildamil.androidstudy.pref;

import kr.saeildamil.androidstudy.R;
import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * 
 * @author	mskim
 * @since	2013. 2. 13. 오후 9:57:26
 * @version	1.0.0
 */

public class MyPrefActivity extends PreferenceActivity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);	
		addPreferencesFromResource(R.xml.prefs);
	}
}
