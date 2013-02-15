package kr.saeildamil.androidstudy.autologin;

import kr.saeildamil.androidstudy.R;
import android.os.Bundle;
import android.preference.PreferenceActivity;

public class AutoLoginPrefDialog extends PreferenceActivity {
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.prefs);
	}
}
