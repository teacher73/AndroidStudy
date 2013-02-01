package kr.saeildamil.androidstudy;

import kr.saeildamil.androidstudy.actionbar.MyActionBar;
import kr.saeildamil.androidstudy.actionbar.MyActionBarButton;
import kr.saeildamil.androidstudy.actionbar.MyActionBarSearchView;
import kr.saeildamil.androidstudy.fragmentapp.FragmentAppList;
import kr.saeildamil.androidstudy.fragmentapp_handset.HandSetActivity;
import kr.saeildamil.androidstudy.fragmentbackstack.FragmentBackStack;
import kr.saeildamil.androidstudy.fragmentcode.FragmentMainTwo;
import kr.saeildamil.androidstudy.fragmentxml.FragmentMainOne;
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
			startActivity(new Intent(MainActivity.this, FragmentMainOne.class));
			break;
		case R.id.main_btn02:
			startActivity(new Intent(MainActivity.this, FragmentMainTwo.class));
			break;
		case R.id.main_btn03:
			startActivity(new Intent(MainActivity.this, FragmentAppList.class));
			break;
		case R.id.main_btn04:
			startActivity(new Intent(MainActivity.this, FragmentBackStack.class));
			break;
		case R.id.main_btn05:
			startActivity(new Intent(MainActivity.this, HandSetActivity.class));
			break;
		case R.id.main_btn06:
			startActivity(new Intent(MainActivity.this, MyActionBar.class));
			break;
		case R.id.main_btn07:
			startActivity(new Intent(MainActivity.this, MyActionBarButton.class));
			break;
		case R.id.main_btn08:
			startActivity(new Intent(MainActivity.this, MyActionBarSearchView.class));
			break;
		}
	}

}
