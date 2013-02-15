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
		
		prefs = PreferenceManager.getDefaultSharedPreferences(this);

		
		/*final Editor editor = prefs.edit();
		
		chkprefs= (CheckBoxPreference) getPreferenceScreen().findPreference("autologin");
		loginDlg = (AutoLoginPref) getPreferenceScreen().findPreference("my");
		
		boolean chk = prefs.getBoolean("autologin", false);
		

		chkprefs.setOnPreferenceChangeListener(new OnPreferenceChangeListener() {
			public boolean onPreferenceChange(Preference preference, Object newValue) {
				Toast.makeText(getApplicationContext(), "Check : "  + newValue.toString() , Toast.LENGTH_LONG).show();

				if ((Boolean)newValue){
					loginDlg.setEnabled(true);
					editor.putBoolean("autologin", true);
				}else{
					loginDlg.setEnabled(false);
					editor.putBoolean("autologin", false);
				}
				return false;
			}
		});*/
	}
}
