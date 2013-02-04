package kr.saeildamil.androidstudy.activitylifecycle;

import kr.saeildamil.androidstudy.R;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityLifeCycle extends Activity {

	private boolean backfinish;
	private TextView tv;
	
	protected void onCreate(Bundle savedInstanceState) {
		Log.d("Activity Life Cycle", "onCreate(Bundle savedInstanceState)");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activitylifecycle);
		tv = (TextView) findViewById(R.id.activity_lifecycle_tv);
		findViewById(R.id.activitylifecycle_finish_btn).setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				finish();
			}
		});
	}

	@Override
	protected void onDestroy() {
		Log.d("Activity Life Cycle", "onDestroy()");
		super.onDestroy();
	}

	@Override
	protected void onPause() {
		Log.d("Activity Life Cycle", "onPause()");
		super.onPause();
	}

	@Override
	protected void onRestart() {
		Log.d("Activity Life Cycle", "onRestart()");
		super.onRestart();
	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		Log.d("Activity Life Cycle", "onRestoreInstanceState(Bundle savedInstanceState)");
		super.onRestoreInstanceState(savedInstanceState);
		tv.setText(savedInstanceState.getString("message"));
	}

	@Override
	protected void onResume() {
		Log.d("Activity Life Cycle", "onResume()");
		super.onResume();
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		Log.d("Activity Life Cycle", "onSaveInstanceState(Bundle outState)");
		super.onSaveInstanceState(outState);
		outState.putString("message", "반갑습니다");
	}

	@Override
	protected void onStart() {
		Log.d("Activity Life Cycle", "onStart()");
		super.onStart();
	}

	@Override
	protected void onStop() {
		Log.d("Activity Life Cycle", "onStop()");
		super.onStop();
	}

	@Override
	protected void onUserLeaveHint() {
		Log.d("Activity Life Cycle", "onUserLeaveHint()");
		Toast.makeText(ActivityLifeCycle.this, "'홈' 버튼을 눌렀습니다.", Toast.LENGTH_LONG).show();
		super.onUserLeaveHint();
	}
	
	@Override
	public void onBackPressed() {
		if (!backfinish) {
			Toast.makeText(ActivityLifeCycle.this, "'뒤로' 버튼을 한번 더 누르시면 종료됩니다.", Toast.LENGTH_LONG).show();
			backfinish=true;
		}else{
			super.onBackPressed();
		}
	}
	

/*	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		new AlertDialog.Builder(this)
		.setIcon(android.R.drawable.ic_dialog_alert)
		.setTitle("앱 종료")
		.setMessage("종료 하시겠습니까?")
		.setPositiveButton("예", new DialogInterface.OnClickListener() {
			public void onClick( DialogInterface dialog, int which ) {
		    	 finish();
			}
		})
		.setNegativeButton( "아니오", null ).show(); 
		return true;
	}*/
	
}
