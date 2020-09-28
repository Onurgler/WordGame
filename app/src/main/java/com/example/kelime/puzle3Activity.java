package com.example.kelime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Random;

public class puzle3Activity extends AppCompatActivity {

    int sayac=0;
    int puan=100;
    long startTime = System.currentTimeMillis();
    long endTime = 0;
    int seviye=1;
    int ok1=0, ok2=0, ok3=0, ok4=0, ok5=0, ok6=0;
    int butyer=0;
    Random random=new Random();
    String kullan="";
    int rand=random.nextInt(2)+1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzle3);
        rand=1;
        Button but9 = (Button)findViewById(R.id.button9);
        Button but8 = (Button)findViewById(R.id.button8);
        Button but6 = (Button)findViewById(R.id.button6);
        Button but5 = (Button)findViewById(R.id.button5);
        Button but4 = (Button)findViewById(R.id.button4);
        if(butyer==1){
            but4 = (Button)findViewById(R.id.button8); //4e 8i koy gibi
            but5 = (Button)findViewById(R.id.button6);
            but6 = (Button)findViewById(R.id.button9);
            but8 = (Button)findViewById(R.id.button4);
            but9 = (Button)findViewById(R.id.button5);
        }
        else if(butyer==2){
            but4 = (Button)findViewById(R.id.button9);
            but5 = (Button)findViewById(R.id.button4);
            but6 = (Button)findViewById(R.id.button5);
            but8 = (Button)findViewById(R.id.button8);
            but9 = (Button)findViewById(R.id.button6);
        }else if(butyer==3){
            but4 = (Button)findViewById(R.id.button5);
            but5 = (Button)findViewById(R.id.button9);
            but6 = (Button)findViewById(R.id.button4);
            but8 = (Button)findViewById(R.id.button6);
            but9 = (Button)findViewById(R.id.button8);
        }

        TextView tv1=(TextView) findViewById(R.id.textView1);
        TextView tv2=(TextView) findViewById(R.id.textView2);
        TextView tv3=(TextView) findViewById(R.id.textView3);
        TextView tv4=(TextView) findViewById(R.id.textView4);
        TextView tv5=(TextView) findViewById(R.id.textView5);
        TextView tv6=(TextView) findViewById(R.id.textView6);
        TextView tv7=(TextView) findViewById(R.id.textView7);
        TextView tv9=(TextView) findViewById(R.id.textView9);
        TextView tv10=(TextView) findViewById(R.id.textView10);
        TextView tv11=(TextView) findViewById(R.id.textView11);
        TextView tv12=(TextView) findViewById(R.id.textView12);
        TextView tv13=(TextView) findViewById(R.id.textView13);
        TextView tv14=(TextView) findViewById(R.id.textView14);
        TextView tv15=(TextView) findViewById(R.id.textView15);
        TextView tv16=(TextView) findViewById(R.id.textView16);
        TextView tv17=(TextView) findViewById(R.id.textView17);
        TextView tv18=(TextView) findViewById(R.id.textView18);
        TextView tv19=(TextView) findViewById(R.id.textView19);
        TextView tv20=(TextView) findViewById(R.id.textView20);
        TextView tv21=(TextView) findViewById(R.id.textView21);
        TextView tv22=(TextView) findViewById(R.id.textView22);
        TextView tv23=(TextView) findViewById(R.id.textView23);
        TextView tv24=(TextView) findViewById(R.id.textView24);
        TextView tv25=(TextView) findViewById(R.id.textView25);
        TextView tv26=(TextView) findViewById(R.id.textView26);
        TextView tv27=(TextView) findViewById(R.id.textView27);
        TextView tv28=(TextView) findViewById(R.id.textView28);
        TextView tv29=(TextView) findViewById(R.id.textView29);
        TextView tv30=(TextView) findViewById(R.id.textView30);
        TextView tv31=(TextView) findViewById(R.id.textView31);
        TextView tv32=(TextView) findViewById(R.id.textView32);
        TextView tv33=(TextView) findViewById(R.id.textView33);
        teres();
        seviye =sevget();
        if(seviye==1){
            if(rand==1){
                but4.setText("a");
                but5.setText("m");
                but6.setText("p");
                but8.setText("e");
                but9.setText("r");
            }
            else{

            }
        }
        else if(seviye==2){
            if(rand==1){
                but4.setText("a");
                but5.setText("n");
                but6.setText("d");
                but8.setText("ı");
                but9.setText("ç");
            }
            else{

            }
        }
        else if(seviye==3){
            if(rand==1){
                but4.setText("b");
                but5.setText("u");
                but6.setText("l");
                but8.setText("a");
                but9.setText("k");
            }
            else{

            }
        }
        else if(seviye==4){
            if(rand==1){
                but4.setText("k");
                but5.setText("a");
                but6.setText("l");
                but8.setText("ı");
                but9.setText("p");
            }
            else{

            }
        }
        else if(seviye==5){
            if(rand==1){
                but4.setText("a");
                but5.setText("l");
                but6.setText("k");
                but8.setText("ı");
                but9.setText("m");
            }
            else{

            }
        }
        else if(seviye==6){
            but4.setText("k");
            but5.setText("a");
            but6.setText("l");
            but8.setText("e");
            but9.setText("m");
        }
        if(seviye==1) {
            tv2.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv1.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv3.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv15.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv31.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv14.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv13.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv18.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv25.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
        }else if(seviye==2){
            tv2.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv1.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv3.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv15.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv31.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv12.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv16.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv6.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv10.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv33.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv19.setBackgroundColor(Color.parseColor("#7A8F6A6A"));

        }else if(seviye==3){
            tv12.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv16.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv6.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv2.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv1.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv3.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv14.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv15.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv13.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv31.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv18.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv7.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv25.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv11.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv17.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
        }else if(seviye==4){
            tv9.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv1.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv2.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv3.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv4.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv5.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv33.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv15.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv31.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv18.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv19.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv20.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv23.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv10.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv22.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv7.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv11.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv32.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
        }else if(seviye==5){
            tv12.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv14.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv1.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv2.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv3.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv15.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv31.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv16.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv13.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv26.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv27.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv6.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv4.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv18.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv10.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv25.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv11.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv17.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv24.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
        }else if(seviye==6){
            tv14.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv1.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv2.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv3.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv15.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv26.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv27.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv16.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv31.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv13.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv6.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv4.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv18.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv10.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv7.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv25.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv11.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv17.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv24.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv28.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv29.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv21.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv30.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
        }

    }

    public void but4(View view) {
        TextView et8=(TextView) findViewById(R.id.textView8);
        String as= (String) et8.getText();
        if(butyer==0){
            if(seviye==1&&rand==1)
                et8.setText(as+"A");
            else if(seviye==2&&rand==1)
                et8.setText(as+"A");
            else if(seviye==3&&rand==1)
                et8.setText(as+"B");
            if(seviye==4&&rand==1)
                et8.setText(as+"K");
            else if(seviye==5&&rand==1)
                et8.setText(as+"A");
            else if(seviye==6)
                et8.setText(as+"K");
        }else if(butyer==1){
            if(seviye==1&&rand==1)
                et8.setText(as+"E");
            else if(seviye==2&&rand==1)
                et8.setText(as+"I");
            else if(seviye==3&&rand==1)
                et8.setText(as+"A");
            if(seviye==4&&rand==1)
                et8.setText(as+"I");
            else if(seviye==5&&rand==1)
                et8.setText(as+"I");
            else if(seviye==6)
                et8.setText(as+"E");
        }else if(butyer==2){
            if(seviye==1&&rand==1)
                et8.setText(as+"M");
            else if(seviye==2&&rand==1)
                et8.setText(as+"N");
            else if(seviye==3&&rand==1)
                et8.setText(as+"U");
            if(seviye==4&&rand==1)
                et8.setText(as+"A");
            else if(seviye==5&&rand==1)
                et8.setText(as+"L");
            else if(seviye==6)
                et8.setText(as+"A");
        }else if(butyer==3){
            if(seviye==1&&rand==1)
                et8.setText(as+"P");
            else if(seviye==2&&rand==1)
                et8.setText(as+"D");
            else if(seviye==3&&rand==1)
                et8.setText(as+"L");
            if(seviye==4&&rand==1)
                et8.setText(as+"L");
            else if(seviye==5&&rand==1)
                et8.setText(as+"K");
            else if(seviye==6)
                et8.setText(as+"L");
        }

    }
    public void but5(View view) {
        TextView et8=(TextView) findViewById(R.id.textView8);
        String as= (String) et8.getText();
        if(butyer==0){
            if(seviye==1&&rand==1)
                et8.setText(as+"M");
            else if(seviye==2&&rand==1)
                et8.setText(as+"N");
            else if(seviye==3&&rand==1)
                et8.setText(as+"U");
            if(seviye==4&&rand==1)
                et8.setText(as+"A");
            else if(seviye==5&&rand==1)
                et8.setText(as+"L");
            else if(seviye==6)
                et8.setText(as+"A");
        }
        else if(butyer==1){
            if(seviye==1&&rand==1)
                et8.setText(as+"R");
            else if(seviye==2&&rand==1)
                et8.setText(as+"Ç");
            else if(seviye==3&&rand==1)
                et8.setText(as+"K");
            if(seviye==4&&rand==1)
                et8.setText(as+"P");
            else if(seviye==5&&rand==1)
                et8.setText(as+"M");
            else if(seviye==6)
                et8.setText(as+"M");
        }
        else if(butyer==2){
            if(seviye==1&&rand==1)
                et8.setText(as+"P");
            else if(seviye==2&&rand==1)
                et8.setText(as+"D");
            else if(seviye==3&&rand==1)
                et8.setText(as+"L");
            if(seviye==4&&rand==1)
                et8.setText(as+"L");
            else if(seviye==5&&rand==1)
                et8.setText(as+"K");
            else if(seviye==6)
                et8.setText(as+"L");
        }
        else if(butyer==3){
            if(seviye==1&&rand==1)
                et8.setText(as+"A");
            else if(seviye==2&&rand==1)
                et8.setText(as+"A");
            else if(seviye==3&&rand==1)
                et8.setText(as+"B");
            if(seviye==4&&rand==1)
                et8.setText(as+"K");
            else if(seviye==5&&rand==1)
                et8.setText(as+"A");
            else if(seviye==6)
                et8.setText(as+"K");
        }
    }
    public void but6(View view) {
        TextView et8=(TextView) findViewById(R.id.textView8);
        String as= (String) et8.getText();
        if(butyer==0){
            if(seviye==1&&rand==1)
                et8.setText(as+"P");
            else if(seviye==2&&rand==1)
                et8.setText(as+"D");
            else if(seviye==3&&rand==1)
                et8.setText(as+"L");
            if(seviye==4&&rand==1)
                et8.setText(as+"L");
            else if(seviye==5&&rand==1)
                et8.setText(as+"K");
            else if(seviye==6)
                et8.setText(as+"L");
        }
        else if(butyer==1){
            if(seviye==1&&rand==1)
                et8.setText(as+"M");
            else if(seviye==2&&rand==1)
                et8.setText(as+"N");
            else if(seviye==3&&rand==1)
                et8.setText(as+"U");
            if(seviye==4&&rand==1)
                et8.setText(as+"A");
            else if(seviye==5&&rand==1)
                et8.setText(as+"L");
            else if(seviye==6)
                et8.setText(as+"A");
        }
        else if(butyer==2){
            if(seviye==1&&rand==1)
                et8.setText(as+"R");
            else if(seviye==2&&rand==1)
                et8.setText(as+"Ç");
            else if(seviye==3&&rand==1)
                et8.setText(as+"K");
            if(seviye==4&&rand==1)
                et8.setText(as+"P");
            else if(seviye==5&&rand==1)
                et8.setText(as+"M");
            else if(seviye==6)
                et8.setText(as+"M");
        }
        else if(butyer==3){
            if(seviye==1&&rand==1)
                et8.setText(as+"E");
            else if(seviye==2&&rand==1)
                et8.setText(as+"I");
            else if(seviye==3&&rand==1)
                et8.setText(as+"A");
            if(seviye==4&&rand==1)
                et8.setText(as+"I");
            else if(seviye==5&&rand==1)
                et8.setText(as+"I");
            else if(seviye==6)
                et8.setText(as+"E");
        }
    }
    public void but8(View view) {
        TextView et8=(TextView) findViewById(R.id.textView8);
        String as= (String) et8.getText();
        if(butyer==0){
            if(seviye==1&&rand==1)
                et8.setText(as+"E");
            else if(seviye==2&&rand==1)
                et8.setText(as+"I");
            else if(seviye==3&&rand==1)
                et8.setText(as+"A");
            if(seviye==4&&rand==1)
                et8.setText(as+"I");
            else if(seviye==5&&rand==1)
                et8.setText(as+"I");
            else if(seviye==6)
                et8.setText(as+"E");
        }
        else if(butyer==1){
            if(seviye==1&&rand==1)
                et8.setText(as+"A");
            else if(seviye==2&&rand==1)
                et8.setText(as+"A");
            else if(seviye==3&&rand==1)
                et8.setText(as+"B");
            if(seviye==4&&rand==1)
                et8.setText(as+"K");
            else if(seviye==5&&rand==1)
                et8.setText(as+"A");
            else if(seviye==6)
                et8.setText(as+"K");
        }
        else if(butyer==2){
            if(seviye==1&&rand==1)
                et8.setText(as+"E");
            else if(seviye==2&&rand==1)
                et8.setText(as+"I");
            else if(seviye==3&&rand==1)
                et8.setText(as+"A");
            if(seviye==4&&rand==1)
                et8.setText(as+"I");
            else if(seviye==5&&rand==1)
                et8.setText(as+"I");
            else if(seviye==6)
                et8.setText(as+"E");
        }
        else if(butyer==3){
            if(seviye==1&&rand==1)
                et8.setText(as+"R");
            else if(seviye==2&&rand==1)
                et8.setText(as+"Ç");
            else if(seviye==3&&rand==1)
                et8.setText(as+"K");
            if(seviye==4&&rand==1)
                et8.setText(as+"P");
            else if(seviye==5&&rand==1)
                et8.setText(as+"M");
            else if(seviye==6)
                et8.setText(as+"M");
        }
    }

    public void but9(View view) {
        TextView et8=(TextView) findViewById(R.id.textView8);
        String as= (String) et8.getText();
        if(butyer==0){
            if(seviye==1&&rand==1)
                et8.setText(as+"R");
            else if(seviye==2&&rand==1)
                et8.setText(as+"Ç");
            else if(seviye==3&&rand==1)
                et8.setText(as+"K");
            if(seviye==4&&rand==1)
                et8.setText(as+"P");
            else if(seviye==5&&rand==1)
                et8.setText(as+"M");
            else if(seviye==6)
                et8.setText(as+"M");
        }
        else if(butyer==1){
            if(seviye==1&&rand==1)
                et8.setText(as+"P");
            else if(seviye==2&&rand==1)
                et8.setText(as+"D");
            else if(seviye==3&&rand==1)
                et8.setText(as+"L");
            if(seviye==4&&rand==1)
                et8.setText(as+"L");
            else if(seviye==5&&rand==1)
                et8.setText(as+"K");
            else if(seviye==6)
                et8.setText(as+"L");
        }
        else if(butyer==2){
            if(seviye==1&&rand==1)
                et8.setText(as+"A");
            else if(seviye==2&&rand==1)
                et8.setText(as+"A");
            else if(seviye==3&&rand==1)
                et8.setText(as+"B");
            if(seviye==4&&rand==1)
                et8.setText(as+"K");
            else if(seviye==5&&rand==1)
                et8.setText(as+"A");
            else if(seviye==6)
                et8.setText(as+"K");
        }
        else if(butyer==3){
            if(seviye==1&&rand==1)
                et8.setText(as+"M");
            else if(seviye==2&&rand==1)
                et8.setText(as+"N");
            else if(seviye==3&&rand==1)
                et8.setText(as+"U");
            if(seviye==4&&rand==1)
                et8.setText(as+"A");
            else if(seviye==5&&rand==1)
                et8.setText(as+"L");
            else if(seviye==6)
                et8.setText(as+"A");
        }
    }

    public void but3(View view) {
        butyer=butyer+1;
        butyer=butyer%4;
        puan=puan+5;
        TextView son=(TextView) findViewById(R.id.textView8);
        son.setText(" ");
        tamam(view);
    }

    public void tamam(View view) {
        int sevde=seviyeget();
        if(sevde>40){
            Toast.makeText(getApplicationContext(),"Tebrikler : "+kullan,Toast.LENGTH_LONG).show();
            finish();
        }
        seviye =sevget();
        Button but9 = (Button)findViewById(R.id.button9);
        Button but8 = (Button)findViewById(R.id.button8);
        Button but6 = (Button)findViewById(R.id.button6);
        Button but5 = (Button)findViewById(R.id.button5);
        Button but4 = (Button)findViewById(R.id.button4);
        if(butyer==1){
            but4 = (Button)findViewById(R.id.button8);
            but5 = (Button)findViewById(R.id.button6);
            but6 = (Button)findViewById(R.id.button9);
            but8 = (Button)findViewById(R.id.button4);
            but9 = (Button)findViewById(R.id.button5);
        }
        else if(butyer==2){
            but4 = (Button)findViewById(R.id.button9);
            but5 = (Button)findViewById(R.id.button4);
            but6 = (Button)findViewById(R.id.button5);
            but8 = (Button)findViewById(R.id.button8);
            but9 = (Button)findViewById(R.id.button6);
        }else if(butyer==3){
            but4 = (Button)findViewById(R.id.button5);
            but5 = (Button)findViewById(R.id.button9);
            but6 = (Button)findViewById(R.id.button4);
            but8 = (Button)findViewById(R.id.button6);
            but9 = (Button)findViewById(R.id.button8);
        }

        TextView son=(TextView) findViewById(R.id.textView8);
        String sss=son.getText().toString();

        TextView tv1=(TextView) findViewById(R.id.textView1);
        TextView tv2=(TextView) findViewById(R.id.textView2);
        TextView tv3=(TextView) findViewById(R.id.textView3);
        TextView tv4=(TextView) findViewById(R.id.textView4);
        TextView tv5=(TextView) findViewById(R.id.textView5);
        TextView tv6=(TextView) findViewById(R.id.textView6);
        TextView tv7=(TextView) findViewById(R.id.textView7);
        TextView tv9=(TextView) findViewById(R.id.textView9);
        TextView tv10=(TextView) findViewById(R.id.textView10);
        TextView tv11=(TextView) findViewById(R.id.textView11);
        TextView tv12=(TextView) findViewById(R.id.textView12);
        TextView tv13=(TextView) findViewById(R.id.textView13);
        TextView tv14=(TextView) findViewById(R.id.textView14);
        TextView tv15=(TextView) findViewById(R.id.textView15);
        TextView tv16=(TextView) findViewById(R.id.textView16);
        TextView tv17=(TextView) findViewById(R.id.textView17);
        TextView tv18=(TextView) findViewById(R.id.textView18);
        TextView tv19=(TextView) findViewById(R.id.textView19);
        TextView tv20=(TextView) findViewById(R.id.textView20);
        TextView tv21=(TextView) findViewById(R.id.textView21);
        TextView tv22=(TextView) findViewById(R.id.textView22);
        TextView tv23=(TextView) findViewById(R.id.textView23);
        TextView tv24=(TextView) findViewById(R.id.textView24);
        TextView tv25=(TextView) findViewById(R.id.textView25);
        TextView tv26=(TextView) findViewById(R.id.textView26);
        TextView tv27=(TextView) findViewById(R.id.textView27);
        TextView tv28=(TextView) findViewById(R.id.textView28);
        TextView tv29=(TextView) findViewById(R.id.textView29);
        TextView tv30=(TextView) findViewById(R.id.textView30);
        TextView tv31=(TextView) findViewById(R.id.textView31);
        TextView tv32=(TextView) findViewById(R.id.textView32);
        TextView tv33=(TextView) findViewById(R.id.textView33);
        if(sayac==0){
            teres();
        }
        if(seviye==1){
            if(rand==1){
                but4.setText("a");
                but5.setText("m");
                but6.setText("p");
                but8.setText("e");
                but9.setText("r");
            }
            else{

            }
        }
        else if(seviye==2){
            if(rand==1){
                but4.setText("a");
                but5.setText("n");
                but6.setText("d");
                but8.setText("ı");
                but9.setText("ç");
            }
            else{

            }
        }
        else if(seviye==3){
            if(rand==1){
                but4.setText("b");
                but5.setText("u");
                but6.setText("l");
                but8.setText("a");
                but9.setText("k");
            }
            else{

            }
        }
        else if(seviye==4){
            if(rand==1){
                but4.setText("k");
                but5.setText("a");
                but6.setText("l");
                but8.setText("ı");
                but9.setText("p");
            }
            else{

            }
        }
        else if(seviye==5){
            if(rand==1){
                but4.setText("a");
                but5.setText("l");
                but6.setText("k");
                but8.setText("ı");
                but9.setText("m");
            }
            else{

            }
        }
        else if(seviye==6){
            but4.setText("k");
            but5.setText("a");
            but6.setText("l");
            but8.setText("e");
            but9.setText("m");
        }

        if(seviye==1) {
            tv2.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv1.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv3.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv15.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv31.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv14.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv13.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv18.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv25.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
        }else if(seviye==2){
            tv2.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv1.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv3.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv15.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv31.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv12.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv16.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv6.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv10.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv33.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv19.setBackgroundColor(Color.parseColor("#7A8F6A6A"));

        }else if(seviye==3){
            tv12.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv16.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv6.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv2.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv1.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv3.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv14.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv15.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv13.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv31.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv18.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv7.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv25.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv11.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv17.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
        }else if(seviye==4){
            tv9.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv1.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv2.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv3.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv4.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv5.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv33.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv15.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv31.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv18.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv19.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv20.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv23.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv10.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv22.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv7.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv11.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv32.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
        }else if(seviye==5){
            tv12.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv14.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv1.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv2.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv3.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv15.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv31.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv16.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv13.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv26.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv27.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv6.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv4.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv18.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv10.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv25.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv11.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv17.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv24.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
        }else if(seviye==6){
            tv14.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv1.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv2.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv3.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv15.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv26.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv27.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv16.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv31.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv13.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv6.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv4.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv18.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv10.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv7.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv25.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv11.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv17.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv24.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv28.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv29.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv21.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv30.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
        }

        if(sss.startsWith("Puan")){
            startTime = System.currentTimeMillis();  puan=105;
        }
        if(seviye==1&&rand==1){
            if(sss.equalsIgnoreCase(" AMPER")&&ok1==0){
                sayac++; ok1++;
                tv2.setText("A");
                tv1.setText("M");
                tv3.setText("P");
                tv15.setText("E");
                tv31.setText("R");
            }
            else if(sss.equalsIgnoreCase(" PERMA")&&ok2==0){
                sayac++; ok2++;
                tv14.setText("P");
                tv15.setText("E");
                tv13.setText("R");
                tv18.setText("M");
                tv25.setText("A");
            }
            else{
                puan=puan-5;
            }
            son.setText(" ");}
        else if(seviye==2&&rand==1){
            if(sss.equalsIgnoreCase(" ÇANDI")&&ok1==0){
                sayac++; ok1++;
                tv12.setText("Ç");
                tv2.setText("A");
                tv16.setText("N");
                tv6.setText("D");
                tv10.setText("I");
            }
            else if(sss.equalsIgnoreCase(" ANDIÇ")&&ok2==0){
                sayac++; ok2++;
                tv2.setText("A");
                tv1.setText("N");
                tv3.setText("D");
                tv15.setText("I");
                tv31.setText("Ç");
            }
            else if(sss.equalsIgnoreCase(" ÇAN")&&ok3==0){
                sayac++; ok3++;
                tv31.setText("Ç");
                tv33.setText("A");
                tv19.setText("N");
            }
            else{
                puan=puan-5;
            }
            son.setText(" ");}
        else if(seviye==3&&rand==1){
            if(sss.equalsIgnoreCase(" BULAK")&&ok1==0){
                sayac++; ok1++;
                tv2.setText("B");
                tv1.setText("U");
                tv3.setText("L");
                tv15.setText("A");
                tv31.setText("K");
            }
            else if(sss.equalsIgnoreCase(" KABUL")&&ok2==0){
                sayac++; ok2++;
                tv14.setText("K");
                tv15.setText("A");
                tv13.setText("B");
                tv18.setText("U");
                tv25.setText("L");
            }
            else if(sss.equalsIgnoreCase(" ABUK")&&ok3==0){
                sayac++; ok3++;
                tv12.setText("A");
                tv2.setText("B");
                tv16.setText("U");
                tv6.setText("K");
            }
            else if(sss.equalsIgnoreCase(" ULAK")&&ok4==0){
                sayac++; ok4++;
                tv7.setText("U");
                tv25.setText("L");
                tv11.setText("A");
                tv17.setText("K");
            }
            else{
                puan=puan-5;
            }
            son.setText(" ");}
        else if(seviye==4&&rand==1){
            if(sss.equalsIgnoreCase(" KALIP")&&ok1==0){
                sayac++; ok1++;
                tv2.setText("K");
                tv1.setText("A");
                tv3.setText("L");
                tv15.setText("I");
                tv31.setText("P");
            }
            else if(sss.equalsIgnoreCase(" KAPLI")&&ok2==0){
                sayac++; ok2++;
                tv9.setText("K");
                tv1.setText("A");
                tv5.setText("P");
                tv4.setText("L");
                tv22.setText("I");
            }
            else if(sss.equalsIgnoreCase(" PLAK")&&ok3==0){
                sayac++; ok3++;
                tv31.setText("P");
                tv33.setText("L");
                tv19.setText("A");
                tv11.setText("K");
            }
            else if(sss.equalsIgnoreCase(" AKIL")&&ok4==0){
                sayac++; ok4++;
                tv23.setText("A");
                tv10.setText("K");
                tv22.setText("I");
                tv7.setText("L");
            }
            else if(sss.equalsIgnoreCase(" KALP")&&ok5==0){
                sayac++; ok5++;
                tv18.setText("K");
                tv19.setText("A");
                tv20.setText("L");
                tv32.setText("P");
            }
            else{
                puan=puan-5;
            }
            son.setText(" ");}
        else if(seviye==5&&rand==1){
            if(sss.equalsIgnoreCase(" ALKIM")&&ok1==0){
                sayac++; ok1++;
                tv2.setText("A");
                tv1.setText("L");
                tv3.setText("K");
                tv15.setText("I");
                tv31.setText("M");
            }
            else if(sss.equalsIgnoreCase(" KALIM")&&ok2==0){
                sayac++; ok2++;
                tv12.setText("K");
                tv2.setText("A");
                tv16.setText("L");
                tv6.setText("I");
                tv10.setText("M");
            }
            else if(sss.equalsIgnoreCase(" KILMA")&&ok3==0){
                sayac++; ok3++;
                tv14.setText("K");
                tv15.setText("I");
                tv13.setText("L");
                tv18.setText("M");
                tv25.setText("A");
            }
            else if(sss.equalsIgnoreCase(" AKIM")&&ok4==0){
                sayac++; ok4++;
                tv25.setText("A");
                tv11.setText("K");
                tv17.setText("I");
                tv24.setText("M");
            }
            else if(sss.equalsIgnoreCase(" ALIK")&&ok5==0){
                sayac++; ok5++;
                tv26.setText("A");
                tv27.setText("L");
                tv6.setText("I");
                tv4.setText("K");
            }
            else{
                puan=puan-5;
            }
            son.setText(" ");}
        else if(seviye==6) {
            if (sss.equalsIgnoreCase(" KALEM")&&ok1==0) {
                sayac++; ok1++;
                tv2.setText("K");
                tv1.setText("A");
                tv3.setText("L");
                tv15.setText("E");
                tv31.setText("M");
            } else if (sss.equalsIgnoreCase(" EMLAK")&&ok2==0) {
                sayac++; ok2++;
                tv7.setText("E");
                tv25.setText("M");
                tv11.setText("L");
                tv17.setText("A");
                tv24.setText("K");
            } else if (sss.equalsIgnoreCase(" KELAM")&&ok3==0) {
                sayac++; ok3++;
                tv14.setText("K");
                tv15.setText("E");
                tv13.setText("L");
                tv18.setText("A");
                tv25.setText("M");
            } else if (sss.equalsIgnoreCase(" KEMAL")&&ok4==0) {
                sayac++; ok4++;
                tv2.setText("K");
                tv16.setText("E");
                tv6.setText("M");
                tv10.setText("A");
                tv21.setText("L");
            } else if (sss.equalsIgnoreCase(" ELMA")&&ok5==0) {
                sayac++; ok5++;
                tv26.setText("E");
                tv27.setText("L");
                tv6.setText("M");
                tv4.setText("A");
            } else if (sss.equalsIgnoreCase(" KALE")&&ok6==0) {
                sayac++; ok6++;
                tv28.setText("K");
                tv29.setText("A");
                tv21.setText("L");
                tv30.setText("E");
            }else {
                puan = puan - 5;
            }
            son.setText(" ");}

        if((sayac==2&&seviye==1)||(sayac==3&&seviye==2)||(sayac==4&&seviye==3)||(sayac==5&&seviye==4)||(sayac==5&&seviye==5)||(sayac==6&&seviye==6)){
            endTime = System.currentTimeMillis();
            long estimatedTime = endTime - startTime;
            double seconds = (double)estimatedTime/1000;
            son.setText("Puan: "+(puan-(int)seconds));
            int puu=puan-(int)seconds;
            if(puu<0)
                finish();
            puan=puan-(int)seconds;
            puanset(seviye+30);
            seviye++;
            if(seviye==7){
                seviye=11;
            }
            kulset(seviye+30);
            sayac=0;
            ok1=0; ok2=0; ok3=0; ok4=0; ok5=0; ok6=0;
            return;
        }
        TextView tv34=(TextView) findViewById(R.id.textView34);
        endTime = System.currentTimeMillis();
        long estimatedTime = endTime - startTime;
        double seconds = (double)estimatedTime/1000;
        tv34.setText(""+(puan-(int)seconds));
        int puu=puan-(int)seconds;
        if(puu<0)
            finish();
    }
    public void teres(){
        TextView tv1=(TextView) findViewById(R.id.textView1);
        TextView tv2=(TextView) findViewById(R.id.textView2);
        TextView tv3=(TextView) findViewById(R.id.textView3);
        TextView tv4=(TextView) findViewById(R.id.textView4);
        TextView tv5=(TextView) findViewById(R.id.textView5);
        TextView tv6=(TextView) findViewById(R.id.textView6);
        TextView tv7=(TextView) findViewById(R.id.textView7);
        TextView tv9=(TextView) findViewById(R.id.textView9);
        TextView tv10=(TextView) findViewById(R.id.textView10);
        TextView tv11=(TextView) findViewById(R.id.textView11);
        TextView tv12=(TextView) findViewById(R.id.textView12);
        TextView tv13=(TextView) findViewById(R.id.textView13);
        TextView tv14=(TextView) findViewById(R.id.textView14);
        TextView tv15=(TextView) findViewById(R.id.textView15);
        TextView tv16=(TextView) findViewById(R.id.textView16);
        TextView tv17=(TextView) findViewById(R.id.textView17);
        TextView tv18=(TextView) findViewById(R.id.textView18);
        TextView tv19=(TextView) findViewById(R.id.textView19);
        TextView tv20=(TextView) findViewById(R.id.textView20);
        TextView tv21=(TextView) findViewById(R.id.textView21);
        TextView tv22=(TextView) findViewById(R.id.textView22);
        TextView tv23=(TextView) findViewById(R.id.textView23);
        TextView tv24=(TextView) findViewById(R.id.textView24);
        TextView tv25=(TextView) findViewById(R.id.textView25);
        TextView tv26=(TextView) findViewById(R.id.textView26);
        TextView tv27=(TextView) findViewById(R.id.textView27);
        TextView tv28=(TextView) findViewById(R.id.textView28);
        TextView tv29=(TextView) findViewById(R.id.textView29);
        TextView tv30=(TextView) findViewById(R.id.textView30);
        TextView tv31=(TextView) findViewById(R.id.textView31);
        TextView tv32=(TextView) findViewById(R.id.textView32);
        TextView tv33=(TextView) findViewById(R.id.textView33);
        tv1.setBackgroundColor(Color.parseColor("#FAFAFA"));
        tv2.setBackgroundColor(Color.parseColor("#FAFAFA"));
        tv3.setBackgroundColor(Color.parseColor("#FAFAFA"));
        tv4.setBackgroundColor(Color.parseColor("#FAFAFA"));
        tv5.setBackgroundColor(Color.parseColor("#FAFAFA"));
        tv6.setBackgroundColor(Color.parseColor("#FAFAFA"));
        tv7.setBackgroundColor(Color.parseColor("#FAFAFA"));
        tv9.setBackgroundColor(Color.parseColor("#FAFAFA"));
        tv10.setBackgroundColor(Color.parseColor("#FAFAFA"));
        tv11.setBackgroundColor(Color.parseColor("#FAFAFA"));
        tv12.setBackgroundColor(Color.parseColor("#FAFAFA"));
        tv13.setBackgroundColor(Color.parseColor("#FAFAFA"));
        tv14.setBackgroundColor(Color.parseColor("#FAFAFA"));
        tv15.setBackgroundColor(Color.parseColor("#FAFAFA"));
        tv16.setBackgroundColor(Color.parseColor("#FAFAFA"));
        tv17.setBackgroundColor(Color.parseColor("#FAFAFA"));
        tv18.setBackgroundColor(Color.parseColor("#FAFAFA"));
        tv19.setBackgroundColor(Color.parseColor("#FAFAFA"));
        tv20.setBackgroundColor(Color.parseColor("#FAFAFA"));
        tv21.setBackgroundColor(Color.parseColor("#FAFAFA"));
        tv22.setBackgroundColor(Color.parseColor("#FAFAFA"));
        tv23.setBackgroundColor(Color.parseColor("#FAFAFA"));
        tv24.setBackgroundColor(Color.parseColor("#FAFAFA"));
        tv25.setBackgroundColor(Color.parseColor("#FAFAFA"));
        tv26.setBackgroundColor(Color.parseColor("#FAFAFA"));
        tv27.setBackgroundColor(Color.parseColor("#FAFAFA"));
        tv28.setBackgroundColor(Color.parseColor("#FAFAFA"));
        tv29.setBackgroundColor(Color.parseColor("#FAFAFA"));
        tv30.setBackgroundColor(Color.parseColor("#FAFAFA"));
        tv31.setBackgroundColor(Color.parseColor("#FAFAFA"));
        tv32.setBackgroundColor(Color.parseColor("#FAFAFA"));
        tv33.setBackgroundColor(Color.parseColor("#FAFAFA"));
        tv1.setText(" "); tv2.setText(" "); tv3.setText(" "); tv4.setText(" "); tv5.setText(" ");
        tv6.setText(" "); tv7.setText(" "); tv9.setText(" "); tv10.setText(" "); tv11.setText(" ");
        tv12.setText(" "); tv13.setText(" "); tv14.setText(" "); tv15.setText(" "); tv16.setText(" ");
        tv17.setText(" "); tv18.setText(" "); tv19.setText(" "); tv20.setText(" "); tv21.setText(" ");
        tv22.setText(" "); tv23.setText(" "); tv24.setText(" "); tv25.setText(" "); tv26.setText(" ");
        tv27.setText(" "); tv28.setText(" "); tv29.setText(" "); tv30.setText(" ");
        tv31.setText(" "); tv32.setText(" "); tv33.setText(" ");
    }
    public int sevget(){
        String oku="";
        try{
            FileInputStream fis= openFileInput("dosya");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br= new BufferedReader(isr);
            oku=br.readLine();
            fis.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        String[] kelime=oku.split(" :");
        kullan=kelime[0];
        int don=Integer.parseInt(kelime[1]);
        don=don%10;
        return don;
    }
    public int seviyeget(){
        String oku="";
        try{
            FileInputStream fis= openFileInput("dosya");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br= new BufferedReader(isr);
            oku=br.readLine();
            fis.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        String[] kelime=oku.split(" :");
        kullan=kelime[0];
        int don=Integer.parseInt(kelime[1]);
        return don;
    }
    public void kulset(int lev){
        String oku="";
        try{
            FileInputStream fis= openFileInput("dosya");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br= new BufferedReader(isr);
            oku=br.readLine();
            fis.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        String[] kelime=oku.split(" :");
        kelime[1]=" :"+String.valueOf(lev)+" :";
        try {
            FileOutputStream fos = openFileOutput("dosya", Context.MODE_PRIVATE);
            for(int i=0;i<kelime.length;i++){
                fos.write(kelime[i].getBytes());
            }
            fos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void puanset(int seon){
        String oku="";
        try{
            FileInputStream fis= openFileInput("dosya");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br= new BufferedReader(isr);
            oku=br.readLine();
            fis.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        String[] kelime=oku.split(";");
        for(int i=1;i<kelime.length;i++){
            if(kelime[i].equalsIgnoreCase(String.valueOf(seon))){
                if(Integer.parseInt(kelime[i+2])<puan){
                    kelime[i+1]=kullan; kelime[i+2]=String.valueOf(puan);

                }
                break;
            }
        }
        try {
            FileOutputStream fos = openFileOutput("dosya", Context.MODE_PRIVATE);
            fos.write(kelime[0].getBytes());
            for(int i=1;i<kelime.length;i++){
                fos.write((";"+kelime[i]).getBytes());
            }
            fos.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
