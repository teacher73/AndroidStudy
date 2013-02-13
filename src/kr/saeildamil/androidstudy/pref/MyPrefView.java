/**
 *
 * @package		: kr.saeildamil.androidstudy.pref
 * @FileName	: MyPrefView.java
 * @Date  		: 2013. 2. 13.
 * @version  	: 1.0.0
 * @Comment  	:
 *
 */

package kr.saeildamil.androidstudy.pref;

import kr.saeildamil.androidstudy.R;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.EditText;

/**
 * 
 * @author	mskim
 * @since	2013. 2. 13. 오후 10:49:28
 * @version	1.0.0
 */

public class MyPrefView extends Activity {
	private EditText wifi;
	private EditText network;
	private EditText bluetooth;
	private EditText device;
	private EditText userName;
	private EditText userSite;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.myprefview);
		wifi = (EditText) findViewById(R.id.mypref_wifi);
		network = (EditText) findViewById(R.id.mypref_network);
		bluetooth = (EditText) findViewById(R.id.mypref_bluetooth);
		device = (EditText) findViewById(R.id.mypref_device);
		userName = (EditText) findViewById(R.id.mypref_username);
		userSite = (EditText) findViewById(R.id.mypref_site);
	}

	@Override
	protected void onResume() {
		super.onResume();
		SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
		userName.setText(prefs.getString("username", ""));
		userSite.setText(prefs.getString("mobile", "http://www.naver.com"));
		wifi.setText(prefs.getBoolean("wifi", false)+"");
		network.setText(prefs.getString("network", "000"));
		bluetooth.setText(prefs.getBoolean("bluetooth", false)+"");
		device.setText(prefs.getString("device", ""));
	}
	
	public void mOnClick(View v){
		switch(v.getId()){
		case R.id.myprefview_leftBtn:
			startActivity(new Intent(MyPrefView.this, MyPrefActivity.class));
			break;
		case R.id.myprefview_rightBtn:
			startActivity(new Intent(MyPrefView.this, MyPrefFragment.class));
			break;
		}
		
	}
}
