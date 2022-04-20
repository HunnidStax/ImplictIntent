package ru.scopato.dev.implictintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private Uri data;
    private String action;

    /**
     * Called when the activity is first created.
     **/

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        if (intent.getAction() != null)
            action = intent.getAction();

        if (intent.getData() != null)
            data = intent.getData();

        if (action.equals("com.decarta.mapsearch.intent.action.SEARCH")) {
            Intent i = new Intent(Intent.ACTION_VIEW, data);
            startActivity(i);
        }
    }
}
