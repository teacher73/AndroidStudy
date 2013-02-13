package kr.saeildamil.androidstudy.mylayout;

import kr.saeildamil.androidstudy.R;
import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.InputType;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyLayout extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mylayout);
		
		TextView tv = (TextView) findViewById(R.id.mylayout_tv);
		Typeface face = Typeface.createFromAsset(getAssets(), "fonts/nanumbrush.ttf");
		tv.setTypeface(face);
		
		EditText et = new EditText(this);
		et.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD);
		
		LinearLayout layout = (LinearLayout) findViewById(R.id.layout);
		layout.addView(et);
	}
}
