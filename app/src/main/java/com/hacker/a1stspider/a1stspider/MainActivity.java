package com.hacker.a1stspider.a1stspider;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ArrayAdapter<String> aaa;
    Spinner spinner;
    Intent nextpg;
    EditText name;
    EditText rollno;
    CheckBox ad,wd,al,tr;
    int count=0;
    Switch  no;
    Button done;
    String transname;
    RelativeLayout bg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] dept={"ARCHI", "CS", "ECE","MECH","EEE","ICE","CHEM","CIVIL","PROD","META"};
        aaa= new ArrayAdapter<>(this,
                        android.R.layout.simple_spinner_dropdown_item,
                        dept);
        bg=(RelativeLayout)findViewById(R.id.bg);
        name=(EditText)findViewById(R.id.name);
        rollno=(EditText)findViewById(R.id.rollno);
        done=(Button)findViewById(R.id.done);
        spinner = (Spinner)  findViewById(R.id.depart);
        spinner.setAdapter(aaa);
        ad=(CheckBox)findViewById(R.id.ad);
        wd=(CheckBox)findViewById(R.id.wd);
        al=(CheckBox)findViewById(R.id.al);
        tr=(CheckBox)findViewById(R.id.tr);
        no=(Switch)findViewById(R.id.no);
        done.setOnClickListener(this);
    bg.setBackgroundColor(Color.BLACK);}
    public void onClick(View v) {
        if(ad.isChecked())
            count++;
        else if(wd.isChecked())
            count++;
        else if(al.isChecked())
            count++;
        else if(tr.isChecked())
            count++;
        if(name.getText().toString().equals(""))
            Toast.makeText(this, "Please enter you Name", Toast.LENGTH_SHORT).show();
        else if(rollno.getText().toString().equals(""))
            Toast.makeText(this, "Please enter you Roll Number", Toast.LENGTH_SHORT).show();
        else if(count==0)
            Toast.makeText(this, "Please check any of the Profile", Toast.LENGTH_SHORT).show();
        else {
            Toast.makeText(this, "BYE DAW", Toast.LENGTH_SHORT).show();
            nextpg = new Intent(this, end.class);
            transname=name.getText().toString();
            nextpg.putExtra("transfer",transname);
            startActivity(nextpg);
        }
    }
}
