package com.hacker.a1stspider.a1stspider;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.BundleCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.sql.Timestamp;

/**
 * Created by hacker on 10/6/16.
 */
public class end extends AppCompatActivity implements View.OnClickListener {
    TextView greeting;
    Button b;
    Intent page1;
    String transname;
    Intent nextpg;
    TextView time;
    RelativeLayout bg;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        bg=(RelativeLayout)findViewById(R.id.bg);
        nextpg=getIntent();
        transname=nextpg.getStringExtra("transfer");
        greeting=(TextView) findViewById(R.id.greeting);
        greeting.setText("Thank you" +" " +transname+ " " + "for your reply");
        b = (Button) findViewById(R.id.back);

       java.util.Date date= new java.util.Date();
        time= (TextView) findViewById(R.id.time);
        time.setText(""+(new Timestamp(date.getTime())));
        b.setOnClickListener(this);
        bg.setBackgroundColor(Color.BLACK);
    }
    @Override
    public void onClick(View v) {
        page1=new Intent(this,MainActivity.class);
        startActivity(page1);

    }
}
