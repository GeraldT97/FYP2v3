package com.example.enduser.myapplication;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.widget.Toast;

import static android.app.Service.START_STICKY;
import static java.security.AccessController.getContext;

public class MyService extends Service  {
    Context context;
    private final String CHANNEL_ID = "personal_notifications";
    private final int NOTIFICATION_ID = 001;
    String sensor1;

    public MyService() {
        /*BluetoothConnection2 bluetoothConnection2 = new BluetoothConnection2();
        String oil= String.valueOf(bluetoothConnection2.oilevel.getText());
        Toast.makeText(MyService.this, oil, Toast.LENGTH_SHORT).show();*/


    }



    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

       // sensor1 = intent.getExtras().getString("sensor1");
       // Toast.makeText(context, sensor1, Toast.LENGTH_SHORT).show();
        //int Sensor1 = Integer.parseInt(sensor1);

        //while(sensor1.toString().equals("<25%")) {
        //  displayNotification();
        //}
       return START_NOT_STICKY;
    }

    public void displayNotification(){
        createNotificationChannel();
        Toast.makeText(MyService.this, "Walao eh", Toast.LENGTH_SHORT).show();

        Intent landingIntent = new Intent(this, HomePage3.class);
        landingIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);

        PendingIntent landingPendingIntent = PendingIntent.getActivity(this,0,landingIntent,PendingIntent.FLAG_ONE_SHOT);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID);
        builder.setSmallIcon(R.drawable.gas);
        builder.setContentTitle("Teck Kian very handsome");
        builder.setContentText("Teck Kian is really handsome now");
        builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);
        builder.setContentIntent(landingPendingIntent);
        builder.setAutoCancel(true);

        NotificationManagerCompat notificationManagerCompat= NotificationManagerCompat.from(this);
        notificationManagerCompat.notify(NOTIFICATION_ID,builder.build());

    }

    private  void createNotificationChannel()
    {
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O)
        {
            CharSequence name= "Personal Notifications";
            String description = "Include all the personal notifications";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;

            NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID,name,importance);

            notificationChannel.setDescription(description);

            NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }


}
