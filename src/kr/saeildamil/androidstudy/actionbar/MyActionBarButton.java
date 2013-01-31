package kr.saeildamil.androidstudy.actionbar;

import kr.saeildamil.androidstudy.R;
import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MyActionBarButton extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.myactionbarbutton);
		
		View view = getLayoutInflater().inflate(R.layout.button, null);
		
		ActionBar ab = getActionBar();
		ab.setCustomView(view);
		ab.setDisplayOptions(ActionBar.DISPLAY_SHOW_HOME |
				ActionBar.DISPLAY_SHOW_TITLE |
				ActionBar.DISPLAY_SHOW_CUSTOM);
	}
	
	public void mOnClick(View v){
		LinearLayout layout = (LinearLayout) findViewById(R.id.body);
		switch(v.getId()){
		case R.id.button_white:
			layout.setBackgroundColor(Color.WHITE);	break;
		case R.id.button_black:
			layout.setBackgroundColor(Color.BLACK); break;
		}
	}
}
