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
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
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
		
		Preference p = findPreference("mobile");
		p.setOnPreferenceClickListener(new OnPreferenceClickListener() {
			public boolean onPreferenceClick(Preference preference) {
				Uri uri = Uri.parse("http://www.saeildamil.kr");
				Intent intent = new Intent(Intent.ACTION_VIEW, uri);
				startActivity(intent);
				return false;
			}
		});
	}
}
