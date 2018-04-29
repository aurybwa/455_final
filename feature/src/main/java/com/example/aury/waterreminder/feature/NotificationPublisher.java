package com.example.aury.waterreminder.feature;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

//this controls the notification manager

public class NotificationPublisher extends BroadcastReceiver{
    public static String NOTIFICATION_ID = "notification-id";
    public static String NOTIFICATION = "notification";
    
//    String channelId = "0429";
//    CharSequence channelName = "Some Channel";
//    int importance = NotificationManager.IMPORTANCE_HIGH;
//    NotificationChannel notificationChannel = new NotificationChannel(channelId, channelName, importance);

    @Override
    public void onReceive(Context context, Intent intent) {
        NotificationManager nm = (NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);
        Notification notification = intent.getParcelableExtra(NOTIFICATION);
        int id = intent.getIntExtra(NOTIFICATION_ID, 0);
        nm.notify(id,notification);
    }
}
