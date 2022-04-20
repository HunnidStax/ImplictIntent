package ru.scopato.dev.implictintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity_v2 extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Uri address = Uri.parse("http://google.com");
        Intent i  = new Intent(Intent.ACTION_VIEW, address);
        i.setData(address);
        startActivity(i);
    }
}