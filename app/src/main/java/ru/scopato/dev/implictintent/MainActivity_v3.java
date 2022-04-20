package ru.scopato.dev.implictintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity_v3 extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent textIntent  = new Intent(Intent.ACTION_SEND);
        Intent emailIntent  = new Intent(Intent.ACTION_SEND);
        emailIntent.setType("image/jpg");
        textIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {"mail@mail.ru"});
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Email subject");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Message text");
        startActivity(emailIntent);
        startActivity(textIntent);
    }
}