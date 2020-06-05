package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startPrint();

        startAdd();

        startGis();


    }

    private void startGis() {
        TextView txt = (TextView) findViewById(R.id.homeGis);
        txt.setMovementMethod(LinkMovementMethod.getInstance());
        txt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse("https://2gis.kg/bishkek/firm/70000001019789608?m=74.566431%2C42.876677%2F16.28/"));
                startActivity(browserIntent);
            }
        });


    }

    private void startAdd() {
        TextView txt = (TextView) findViewById(R.id.homeAdd);
        txt.setMovementMethod(LinkMovementMethod.getInstance());
        txt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse("https://goo.gl/maps/pYPjKuG71Jf2DJY39/"));
                startActivity(browserIntent);
            }
        });


    }

    private void startPrint() {
        TextView txt = (TextView) findViewById(R.id.home);
        txt.setMovementMethod(LinkMovementMethod.getInstance());
        txt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse("https://www.instagram.com/print_bishkek/"));
                startActivity(browserIntent);
            }
        });
    }

}
