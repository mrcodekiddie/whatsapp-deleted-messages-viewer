package com.vmuthu1810.wa.del.viewer;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.Log;

public class NotificationListener extends NotificationListenerService
{
    @Override
    public void onNotificationPosted(StatusBarNotification sbn)
    {
        String packageName=sbn.getPackageName();
        String notitficationTitle=sbn.getNotification().extras.getString("android.title");
        String notificationtext=sbn.getNotification().extras.getString("android.text");

        Log.v("notify_pkg_name",packageName);
        Log.v("notify_title",notitficationTitle);
        Log.v("notify_text",notitficationTitle);

    }

    @Override
    public void onNotificationRemoved(StatusBarNotification sbn) {
        super.onNotificationRemoved(sbn);
    }
}
