package com.example.user.firstapplicationipc.activity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.user.firstapplicationipc.R;
import com.example.user.firstapplicationipc.broadcast.AlarmReceiver;

import java.util.Calendar;


/**
 * Created by User on 2017-06-13.
 */

public class AlarmActivity extends AppCompatActivity {

    Button btnStart;
    Button btnStop;
    TextView tvDescription;

    AlarmManager alarmManager;
    PendingIntent pendingIntentAlarm;

    private int timeHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
    private int timeMinute = Calendar.getInstance().get(Calendar.MINUTE);

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_start_stop);

        initializeMyComponent();

        addActionListener();
    }


    public void initializeMyComponent(){
        btnStart = (Button) findViewById(R.id.btn_start);
        btnStop  = (Button) findViewById(R.id.btn_stop);
        tvDescription = (TextView) findViewById(R.id.tv_description);
    }


    public void addActionListener(){
        btnStart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                setAlarmEvent();
            }
        });


        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cancelAlarm();
            }
        });
    }

    private void setAlarmEvent(){
        alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        Intent intentAlarm = new Intent(this, AlarmReceiver.class);
        pendingIntentAlarm = PendingIntent.getBroadcast(this,0,intentAlarm,0);

        timeHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        timeMinute = Calendar.getInstance().get(Calendar.MINUTE);
        setAlarm();
    }

    private void setAlarm(){

        Calendar calendar =Calendar.getInstance();
        calendar.set(Calendar.YEAR,2017);
        calendar.set(Calendar.MONTH,Calendar.JUNE);
        calendar.set(Calendar.DATE,13);
        calendar.set(Calendar.HOUR_OF_DAY,timeHour);
        calendar.set(Calendar.MINUTE,timeMinute+1);
        calendar.set(Calendar.AM_PM,1);

        tvDescription.setText(calendar.getTime().toString());


        alarmManager.setExact(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),pendingIntentAlarm);
    }

    private void cancelAlarm(){
        if (alarmManager!= null) {
            alarmManager.cancel(pendingIntentAlarm);
        }

    }





}
