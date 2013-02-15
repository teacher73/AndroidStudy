package kr.saeildamil.androidstudy.autologin;

import kr.saeildamil.androidstudy.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AutoLogin extends Activity {
	private TextView result;
	private Button loginBtn;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.autologin);
		result = (TextView) findViewById(R.id.login_result);
		loginBtn = (Button) findViewById(R.id.autologin_btn);
	}
	
	protected void onResume() {
		super.onResume();
		SharedPreferences pf = (SharedPreferences) getSharedPreferences("my", MODE_PRIVATE);
		
		
		if (pf.getBoolean("autologin", false)){
			loginBtn.setVisibility(View.GONE);
			result.setVisibility(View.VISIBLE);
			result.setText(pf.getString("id", "").toString() + "님 방가~~!");
		}
	}
	
	public void mOnClick(View v){
		LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.logindialog, null);
		
		final EditText id = (EditText) layout.findViewById(R.id.logindialog_id);
		final EditText pw = (EditText) layout.findViewById(R.id.logindialog_pw);
		
		new AlertDialog.Builder(AutoLogin.this).setTitle("로그인").setView(layout)
		.setNegativeButton("확인", new OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				
				if (id.getText().toString().equals("root") & pw.getText().toString().equals("1234")){
					loginBtn.setVisibility(View.GONE);
					result.setVisibility(View.VISIBLE);
					result.setText(id.getText().toString()+"님 방가~~!");
				}
			}
		}).show();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add(Menu.NONE, 1, Menu.NONE, "자동로그인 설정");
		return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (item.getItemId() == 1){
			startActivity(new Intent(AutoLogin.this, AutoLoginPrefDialog.class));
		}
		return super.onOptionsItemSelected(item);
	}
}
