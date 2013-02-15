package kr.saeildamil.androidstudy.statusbar;

import kr.saeildamil.androidstudy.R;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.View;

public class MyStatusBar extends Activity {
	private NotificationManager notiMgr;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mystatusbar);

		notiMgr = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
	}

	public void mOnClick(View v) {
		Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:01025350787"));

		PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
		
		switch (v.getId()) {
		case R.id.mystatusbar_btn01:
			Notification noti = new Notification(R.drawable.ic_launcher, "전화",
					 System.currentTimeMillis()); noti.setLatestEventInfo(this, "전화걸기", "전화 걸 시간", pendingIntent); 
					 noti.flags=Notification.FLAG_AUTO_CANCEL;
					 notiMgr.notify(0, noti);
			break;
		case R.id.mystatusbar_btn02:
			NotificationCompat.Builder notiBuilder = new NotificationCompat.Builder(
					MyStatusBar.this).setContentTitle("전화걸기")
					.setContentText("전화 걸 시간").setSmallIcon(R.drawable.ic_launcher)
					.setAutoCancel(true).setContentIntent(pendingIntent);

			notiMgr.notify(0, notiBuilder.build());
			break;
		}

			 

		

	}

}
