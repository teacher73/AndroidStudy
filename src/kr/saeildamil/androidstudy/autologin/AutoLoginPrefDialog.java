package kr.saeildamil.androidstudy.autologin;

import kr.saeildamil.androidstudy.R;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import android.widget.Toast;

public class AutoLoginPrefDialog extends PreferenceActivity {
	private SharedPreferences prefs;
	private CheckBoxPreference chkprefs;
	private AutoLoginPref loginDlg;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.prefs);
	}
}
