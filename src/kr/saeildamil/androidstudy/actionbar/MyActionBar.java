package kr.saeildamil.androidstudy.actionbar;

import kr.saeildamil.androidstudy.R;
import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MyActionBar extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.myactionbar);
		getActionBar().setHomeButtonEnabled(true);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		String text = null;
		switch(item.getItemId()){
			case android.R.id.home: text = "home"; break;
			case R.id.add:			text="ifRoom"; break;
			case R.id.refresh:		text="always | withTet"; break;
			case R.id.search:		text="always"; break;
			case R.id.share:		text="never"; break;
			case R.id.etc:			text="default"; break;
			default: return false;
		}
		Toast.makeText(MyActionBar.this, text, Toast.LENGTH_LONG).show();
		return true;
	}
	
	public void mOnClick(View v){
		switch(v.getId()){
		case R.id.myactionbar_showtitle:
			getActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_HOME|ActionBar.DISPLAY_SHOW_TITLE);
			break;
		case R.id.myactionbar_notitle:
			getActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_HOME);
			break;
		}
	}
}
