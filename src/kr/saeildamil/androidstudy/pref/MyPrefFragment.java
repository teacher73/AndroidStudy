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
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
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
		
		Preference p = findPreference("mobile");
		p.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			public boolean onPreferenceClick(Preference preference) {
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.saeildamil.kr")));
				return false;
			}
		});
	}
}