package ru.scopato.dev.implictintent;

import android.content.ContentUris;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.provider.CalendarContract;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;
import java.util.List;

public class MainActivity_v7 extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String contactNumber = "5667899";
        Intent phoneCall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", contactNumber, null));

        Intent whatsApp = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:" + contactNumber));
        Uri.Builder builder = CalendarContract.CONTENT_URI.buildUpon();
        builder.appendPath("time");
        ContentUris.appendId(builder, Calendar.getInstance().getTimeInMillis());
        Intent calendarIntent = new Intent(Intent.ACTION_VIEW).setData(builder.build());

        Intent chooser = Intent.createChooser(whatsApp, "What are you choose?"); // Default action
        chooser.putExtra(Intent.EXTRA_INITIAL_INTENTS, new Intent[]{phoneCall, calendarIntent});
        startActivity(chooser);
    }
}