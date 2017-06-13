package com.example.user.firstapplicationipc.broadcast;

import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.content.WakefulBroadcastReceiver;

import com.example.user.firstapplicationipc.activity.MessageActivity;

/**
 * Created by User on 2017-06-13.
 */

public class AlarmReceiver extends WakefulBroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        //Uri uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);
      //  Ringtone ringtone = RingtoneManager.getRingtone(context, uri);
      //  ringtone.play();

        Intent intentMessage = new Intent(context, MessageActivity.class);
        intentMessage.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intentMessage);
    }
}
