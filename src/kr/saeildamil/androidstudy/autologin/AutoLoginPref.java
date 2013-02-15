package kr.saeildamil.androidstudy.autologin;

import kr.saeildamil.androidstudy.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

public class AutoLoginPref extends DialogPreference {
	
	private SharedPreferences prefs;
	private EditText idEdit;
	private EditText pwEdit;
	
	public AutoLoginPref(Context context, AttributeSet attrs) {
		super(context, attrs);
		prefs = getContext().getSharedPreferences(getKey(), Context.MODE_PRIVATE);
	}
	
	@Override
	protected View onCreateDialogView() {
		LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.logindialog, null);
		
		idEdit = (EditText) layout.findViewById(R.id.logindialog_id);
		pwEdit = (EditText) layout.findViewById(R.id.logindialog_pw);
		
		idEdit.setText(prefs.getString("id", ""));
		pwEdit.setText(prefs.getString("pw", ""));
		
		return layout;
	}
	
	public void onClick(DialogInterface dialog, int witch){
		if (witch ==DialogInterface.BUTTON_POSITIVE){
			prefs = getContext().getSharedPreferences(getKey(), Context.MODE_PRIVATE);
			Editor editor = prefs.edit();
			
			editor.putString("id", idEdit.getText().toString());
			editor.putString("pw", pwEdit.getText().toString());
			editor.putBoolean("autologin", true);
			
			editor.commit();
		}
	}
}
