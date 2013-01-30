package kr.saeildamil.androidstudy;

import kr.saeildamil.androidstudy.fragment.FragmentMain;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void mOnClick(View v){
		switch(v.getId()){
		case R.id.main_btn01:
			startActivity(new Intent(MainActivity.this, FragmentMain.class));
			break;
			
		}
	}

}
