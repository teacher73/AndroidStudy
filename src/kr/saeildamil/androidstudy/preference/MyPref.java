package kr.saeildamil.androidstudy.preference;

import kr.saeildamil.androidstudy.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MyPref extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mypref);
	}
	
	public void mOnClick(View v){
		switch(v.getId()){
		case R.id.mypref_btn01:
			break;
		case R.id.mypref_btn02:
			break;
		}
	}
}
