/**
 *
 * @package		: kr.saeildamil.androidstudy.pref
 * @FileName	: MyPrefFragment.java
 * @Date  		: 2013. 2. 13.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package kr.saeildamil.androidstudy.pref;

import kr.saeildamil.androidstudy.R;
import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * 
 * @author mskim
 * @since 2013. 2. 13. 오후 9:57:48
 * @version 1.0.0
 */

public class MyPrefFragment extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getFragmentManager().beginTransaction().replace(android.R.id.content, new MyPreferenceFrag()).commit();
	}

}

class MyPreferenceFrag extends PreferenceFragment {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.prefs);
	}
}