package ru.scopato.dev.implictintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_v1 extends AppCompatActivity {

    private final String mapSearchIntent = "com.decarta.mapsearch.intent.action.SEARCH";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout. activity_main);

        Uri mapUri = Uri.parse("geo:39.906033,116.397700");
        Intent i = new Intent(mapSearchIntent, mapUri);
        i.setData(mapUri);
        startActivity(i);
    }
}