package kr.saeildamil.androidstudy;

import kr.saeildamil.androidstudy.actionbar.MyActionBar;
import kr.saeildamil.androidstudy.actionbar.MyActionBarButton;
import kr.saeildamil.androidstudy.actionbar.MyActionBarSearchView;
import kr.saeildamil.androidstudy.actionbar.MyActionBarTab;
import kr.saeildamil.androidstudy.actionbar.MyActionBarTabList;
import kr.saeildamil.androidstudy.activitylifecycle.ActivityLifeCycle;
import kr.saeildamil.androidstudy.autologin.AutoLogin;
import kr.saeildamil.androidstudy.fragmentapp.FragmentAppList;
import kr.saeildamil.androidstudy.fragmentapp_handset.HandSetActivity;
import kr.saeildamil.androidstudy.fragmentbackstack.FragmentBackStack;
import kr.saeildamil.androidstudy.fragmentcode.FragmentMainTwo;
import kr.saeildamil.androidstudy.fragmentxml.FragmentMainOne;
import kr.saeildamil.androidstudy.gallery.MyGallery;
import kr.saeildamil.androidstudy.gallery.MyGallerySd;
import kr.saeildamil.androidstudy.mylayout.MyLayout;
import kr.saeildamil.androidstudy.pref.MyPref;
import kr.saeildamil.androidstudy.slidingdraw.MySlidingDraw;
import kr.saeildamil.androidstudy.statusbar.MyStatusBar;
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
		case R.id.main_btn09:
			startActivity(new Intent(MainActivity.this, MyActionBarTab.class));
			break;
		case R.id.main_btn10:
			startActivity(new Intent(MainActivity.this, MyActionBarTabList.class));
			break;
		case R.id.main_btn11:
			startActivity(new Intent(MainActivity.this, ActivityLifeCycle.class));
			break;
		case R.id.main_btn12:
			startActivity(new Intent(MainActivity.this, MyGallery.class));
			break;
		case R.id.main_btn13:
			startActivity(new Intent(MainActivity.this, MyGallerySd.class));
			break;
		case R.id.main_btn14:
			startActivity(new Intent(MainActivity.this, MySlidingDraw.class));
			break;
		case R.id.main_btn15:
			startActivity(new Intent(MainActivity.this, MyLayout.class));
			break;
		case R.id.main_btn16:
			startActivity(new Intent(MainActivity.this, MyPref.class));
			break;
		case R.id.main_btn17:
			startActivity(new Intent(MainActivity.this, AutoLogin.class));
			break;
		case R.id.main_btn18:
			startActivity(new Intent(MainActivity.this, MyStatusBar.class));
			break;

		}
	}

}
