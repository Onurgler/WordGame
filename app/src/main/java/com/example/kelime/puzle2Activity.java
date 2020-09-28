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

public class puzle2Activity extends AppCompatActivity {

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
        setContentView(R.layout.activity_puzle2);
        butyer=0;     rand=1;
        Button but8 = (Button)findViewById(R.id.button8);
        Button but6 = (Button)findViewById(R.id.button6);
        Button but5 = (Button)findViewById(R.id.button5);
        Button but4 = (Button)findViewById(R.id.button4);
        if(butyer==1){
            but8 = (Button)findViewById(R.id.button6);
            but6 = (Button)findViewById(R.id.button4);
            but5 = (Button)findViewById(R.id.button8);
            but4 = (Button)findViewById(R.id.button5);
        }
        else if(butyer==2){
            but8 = (Button)findViewById(R.id.button4);
            but6 = (Button)findViewById(R.id.button5);
            but5 = (Button)findViewById(R.id.button6);
            but4 = (Button)findViewById(R.id.button8);
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

        teres();
        seviye =sevget();
        if(seviye==1){
            if(rand==1){
                but4.setText("a");
                but5.setText("ş");
                but6.setText("ı");
                but8.setText("k");
            }
            else{

            }
        }
        else if(seviye==2){
            if(rand==1){
                but4.setText("n");
                but5.setText("i");
                but6.setText("y");
                but8.setText("e");
            }
            else{

            }
        }
        else if(seviye==3){
            if(rand==1){
                but4.setText("d");
                but5.setText("e");
                but6.setText("v");
                but8.setText("a");
            }
            else{

            }
        }
        else if(seviye==4){
            if(rand==1){
                but4.setText("e");
                but5.setText("s");
                but6.setText("i");
                but8.setText("r");
            }
            else{

            }
        }
        else if(seviye==5){
            if(rand==1){
                but4.setText("a");
                but5.setText("k");
                but6.setText("o");
                but8.setText("r");
            }
            else{

            }
        }
        else if(seviye==6){
            but4.setText("e");
            but5.setText("t");
            but6.setText("i");
            but8.setText("l");
        }
        if(seviye==1) {
            tv3.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv5.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv7.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv11.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv13.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv16.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv17.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
        }else if(seviye==2){
            tv3.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv5.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv7.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv9.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv11.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv12.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv13.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv14.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv16.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv17.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
        }else if(seviye==3){
            tv3.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv5.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv7.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv9.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv11.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv12.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv6.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv14.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv16.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv17.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv2.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
        }else if(seviye==4){
             tv13.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv5.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv7.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv9.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv11.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv12.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv18.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv14.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv16.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv15.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv6.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv19.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv20.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
        }else if(seviye==5){
             tv13.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv5.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv7.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv9.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv11.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv12.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv18.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv14.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv16.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv15.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv4.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv19.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv1.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv20.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
        }else if(seviye==6){
             tv1.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv2.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv4.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv25.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv5.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv26.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv9.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv21.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv22.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv18.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv24.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv23.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv15.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv17.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv6.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv3.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
             tv10.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
        }

    }

    public void but4(View view) {
        TextView et8=(TextView) findViewById(R.id.textView8);
        String as= (String) et8.getText();
        if(butyer==0){
            if(seviye==1&&rand==1)
                et8.setText(as+"A");
            else if(seviye==2&&rand==1)
                et8.setText(as+"N");
            else if(seviye==3&&rand==1)
                et8.setText(as+"D");
            if(seviye==4&&rand==1)
                et8.setText(as+"E");
            else if(seviye==5&&rand==1)
                et8.setText(as+"A");
            else if(seviye==6)
                et8.setText(as+"E");
        }
        else if(butyer==1){
            if(seviye==1&&rand==1)
                et8.setText(as+"I");
            else if(seviye==2&&rand==1)
                et8.setText(as+"Y");
            else if(seviye==3&&rand==1)
                et8.setText(as+"V");
            if(seviye==4&&rand==1)
                et8.setText(as+"İ");
            else if(seviye==5&&rand==1)
                et8.setText(as+"O");
            else if(seviye==6)
                et8.setText(as+"İ");
        }
        else if(butyer==2){
            if(seviye==1&&rand==1)
                et8.setText(as+"K");
            else if(seviye==2&&rand==1)
                et8.setText(as+"E");
            else if(seviye==3&&rand==1)
                et8.setText(as+"A");
            if(seviye==4&&rand==1)
                et8.setText(as+"R");
            else if(seviye==5&&rand==1)
                et8.setText(as+"R");
            else if(seviye==6)
                et8.setText(as+"L");
        }

    }
    public void but5(View view) {
        TextView et8=(TextView) findViewById(R.id.textView8);
        String as= (String) et8.getText();
        if(butyer==0){
            if(seviye==1&&rand==1)
                et8.setText(as+"Ş");
            else if(seviye==2&&rand==1)
                et8.setText(as+"İ");
            else if(seviye==3&&rand==1)
                et8.setText(as+"E");
            if(seviye==4&&rand==1)
                et8.setText(as+"S");
            else if(seviye==5&&rand==1)
                et8.setText(as+"K");
            else if(seviye==6)
                et8.setText(as+"T");
        }
        else if(butyer==1){
            if(seviye==1&&rand==1)
                et8.setText(as+"A");
            else if(seviye==2&&rand==1)
                et8.setText(as+"N");
            else if(seviye==3&&rand==1)
                et8.setText(as+"D");
            if(seviye==4&&rand==1)
                et8.setText(as+"E");
            else if(seviye==5&&rand==1)
                et8.setText(as+"A");
            else if(seviye==6)
                et8.setText(as+"E");
        }
        else if(butyer==2){
            if(seviye==1&&rand==1)
                et8.setText(as+"I");
            else if(seviye==2&&rand==1)
                et8.setText(as+"Y");
            else if(seviye==3&&rand==1)
                et8.setText(as+"V");
            if(seviye==4&&rand==1)
                et8.setText(as+"İ");
            else if(seviye==5&&rand==1)
                et8.setText(as+"O");
            else if(seviye==6)
                et8.setText(as+"İ");
        }
    }
    public void but6(View view) {
        TextView et8=(TextView) findViewById(R.id.textView8);
        String as= (String) et8.getText();
        if(butyer==0){
            if(seviye==1&&rand==1)
                et8.setText(as+"I");
            else if(seviye==2&&rand==1)
                et8.setText(as+"Y");
            else if(seviye==3&&rand==1)
                et8.setText(as+"V");
            if(seviye==4&&rand==1)
                et8.setText(as+"İ");
            else if(seviye==5&&rand==1)
                et8.setText(as+"O");
            else if(seviye==6)
                et8.setText(as+"İ");
        }
        else if(butyer==1){
            if(seviye==1&&rand==1)
                et8.setText(as+"K");
            else if(seviye==2&&rand==1)
                et8.setText(as+"E");
            else if(seviye==3&&rand==1)
                et8.setText(as+"A");
            if(seviye==4&&rand==1)
                et8.setText(as+"R");
            else if(seviye==5&&rand==1)
                et8.setText(as+"R");
            else if(seviye==6)
                et8.setText(as+"L");
        }
        else if(butyer==2){
            if(seviye==1&&rand==1)
                et8.setText(as+"Ş");
            else if(seviye==2&&rand==1)
                et8.setText(as+"İ");
            else if(seviye==3&&rand==1)
                et8.setText(as+"E");
            if(seviye==4&&rand==1)
                et8.setText(as+"S");
            else if(seviye==5&&rand==1)
                et8.setText(as+"K");
            else if(seviye==6)
                et8.setText(as+"T");
        }
    }
    public void but8(View view) {
        TextView et8=(TextView) findViewById(R.id.textView8);
        String as= (String) et8.getText();
        if(butyer==0){
            if(seviye==1&&rand==1)
                et8.setText(as+"K");
            else if(seviye==2&&rand==1)
                et8.setText(as+"E");
            else if(seviye==3&&rand==1)
                et8.setText(as+"A");
            if(seviye==4&&rand==1)
                et8.setText(as+"R");
            else if(seviye==5&&rand==1)
                et8.setText(as+"R");
            else if(seviye==6)
                et8.setText(as+"L");
        }
        else if(butyer==1){
            if(seviye==1&&rand==1)
                et8.setText(as+"Ş");
            else if(seviye==2&&rand==1)
                et8.setText(as+"İ");
            else if(seviye==3&&rand==1)
                et8.setText(as+"E");
            if(seviye==4&&rand==1)
                et8.setText(as+"S");
            else if(seviye==5&&rand==1)
                et8.setText(as+"K");
            else if(seviye==6)
                et8.setText(as+"T");
        }
        else if(butyer==2){
            if(seviye==1&&rand==1)
                et8.setText(as+"A");
            else if(seviye==2&&rand==1)
                et8.setText(as+"N");
            else if(seviye==3&&rand==1)
                et8.setText(as+"D");
            if(seviye==4&&rand==1)
                et8.setText(as+"E");
            else if(seviye==5&&rand==1)
                et8.setText(as+"A");
            else if(seviye==6)
                et8.setText(as+"E");
        }
    }

    public void but3(View view) {
        butyer=butyer+1;
        butyer=butyer%3;
        puan=puan+5;
        TextView son=(TextView) findViewById(R.id.textView8);
        son.setText(" ");
        tamam(view);
    }

    public void tamam(View view) {
        int sevde=seviyeget();
        if(sevde>30){
            Intent intent = new Intent(getApplicationContext(),puzle3Activity.class);
            Toast.makeText(getApplicationContext(),"3. bölüm : "+kullan,Toast.LENGTH_LONG).show();
            startActivity(intent);
            finish();
        }
        seviye =sevget();
        Button but8 = (Button)findViewById(R.id.button8);
        Button but6 = (Button)findViewById(R.id.button6);
        Button but5 = (Button)findViewById(R.id.button5);
        Button but4 = (Button)findViewById(R.id.button4);
        if(butyer==1){
            but8 = (Button)findViewById(R.id.button6);
            but6 = (Button)findViewById(R.id.button4);
            but5 = (Button)findViewById(R.id.button8);
            but4 = (Button)findViewById(R.id.button5);
        }
        else if(butyer==2){
            but8 = (Button)findViewById(R.id.button4);
            but6 = (Button)findViewById(R.id.button5);
            but5 = (Button)findViewById(R.id.button6);
            but4 = (Button)findViewById(R.id.button8);
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
        if(sayac==0){
            teres();
        }
        if(seviye==1){
            if(rand==1){
                but4.setText("a");
                but5.setText("ş");
                but6.setText("ı");
                but8.setText("k");
            }
            else{

            }
        }
        else if(seviye==2){
            if(rand==1){
                but4.setText("n");
                but5.setText("i");
                but6.setText("y");
                but8.setText("e");
            }
            else{

            }
        }
        else if(seviye==3){
            if(rand==1){
                but4.setText("d");
                but5.setText("e");
                but6.setText("v");
                but8.setText("a");
            }
            else{

            }
        }
        else if(seviye==4){
            if(rand==1){
                but4.setText("e");
                but5.setText("s");
                but6.setText("i");
                but8.setText("r");
            }
            else{

            }
        }
        else if(seviye==5){
            if(rand==1){
                but4.setText("a");
                but5.setText("k");
                but6.setText("o");
                but8.setText("r");
            }
            else{

            }
        }
        else if(seviye==6){
            but4.setText("e");
            but5.setText("t");
            but6.setText("i");
            but8.setText("l");
        }

        if(seviye==1) {
            tv3.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv5.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv7.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv11.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv13.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv16.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv17.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
        }else if(seviye==2){
            tv3.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv5.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv7.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv9.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv11.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv12.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv13.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv14.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv16.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv17.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
        }else if(seviye==3){
            tv3.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv5.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv7.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv9.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv11.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv12.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv6.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv14.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv16.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv17.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv2.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
        }else if(seviye==4){
            tv13.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv5.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv7.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv9.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv11.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv12.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv18.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv14.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv16.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv15.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv6.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv19.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv20.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
        }else if(seviye==5){
            tv13.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv5.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv7.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv9.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv11.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv12.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv18.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv14.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv16.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv15.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv4.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv19.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv1.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv20.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
        }else if(seviye==6){
            tv1.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv2.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv4.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv25.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv5.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv26.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv9.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv21.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv22.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv18.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv24.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv23.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv15.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv17.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv6.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv3.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv10.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
        }

        if(sayac==0&&sss.startsWith("Puan")){
            startTime = System.currentTimeMillis();  puan=105;
        }
        if(seviye==1&&rand==1){
            if(sss.equalsIgnoreCase(" AŞIK")&&ok1==0){
                sayac++; ok1++;
                tv7.setText("A");
                tv3.setText("Ş");
                tv11.setText("I");
                tv17.setText("K");
            }
            else if(sss.equalsIgnoreCase(" AKIŞ")&&ok2==0){
                sayac++; ok2++;
                tv16.setText("A");
                tv5.setText("K");
                tv11.setText("I");
                tv13.setText("Ş");
            }
            else{
                puan=puan-5;
            }
            son.setText(" ");}
        else if(seviye==2&&rand==1){
            if(sss.equalsIgnoreCase(" NİYE")&&ok1==0){
                sayac++; ok1++;
                tv12.setText("N");
                tv9.setText("İ");
                tv7.setText("Y");
                tv14.setText("E");
            }
            else if(sss.equalsIgnoreCase(" YİNE")&&ok2==0){
                sayac++; ok2++;
                tv7.setText("Y");
                tv3.setText("İ");
                tv11.setText("N");
                tv17.setText("E");
            }
            else if(sss.equalsIgnoreCase(" YENİ")&&ok3==0){
                sayac++; ok3++;
                tv16.setText("Y");
                tv5.setText("E");
                tv11.setText("N");
                tv13.setText("İ");
            }
            else{
                puan=puan-5;
            }
            son.setText(" ");}
        else if(seviye==3&&rand==1){
            if(sss.equalsIgnoreCase(" VEDA")&&ok1==0){
                sayac++; ok1++;
                tv12.setText("V");
                tv9.setText("E");
                tv7.setText("D");
                tv14.setText("A");
            }
            else if(sss.equalsIgnoreCase(" DEVA")&&ok2==0){
                sayac++; ok2++;
                tv7.setText("D");
                tv3.setText("E");
                tv11.setText("V");
                tv17.setText("A");
            }
            else if(sss.equalsIgnoreCase(" VADE")&&ok3==0){
                sayac++; ok3++;
                tv12.setText("V");
                tv2.setText("A");
                tv16.setText("D");
                tv6.setText("E");
            }
            else if(sss.equalsIgnoreCase(" DEV")&&ok4==0){
                sayac++; ok4++;
                tv16.setText("D");
                tv5.setText("E");
                tv11.setText("V");
            }
            else{
                puan=puan-5;
            }
            son.setText(" ");}
        else if(seviye==4&&rand==1){
            if(sss.equalsIgnoreCase(" ESİR")&&ok1==0){
                sayac++; ok1++;
                tv16.setText("E");
                tv5.setText("S");
                tv11.setText("İ");
                tv13.setText("R");
            }
            else if(sss.equalsIgnoreCase(" REİS")&&ok2==0){
                sayac++; ok2++;
                tv12.setText("R");
                tv9.setText("E");
                tv7.setText("İ");
                tv14.setText("S");
            }
            else if(sss.equalsIgnoreCase(" SERİ")&&ok3==0){
                sayac++; ok3++;
                tv14.setText("S");
                tv15.setText("E");
                tv13.setText("R");
                tv18.setText("İ");
            }
            else if(sss.equalsIgnoreCase(" İRS")&&ok4==0){
                sayac++; ok4++;
                tv18.setText("İ");
                tv19.setText("R");
                tv20.setText("S");
            }
            else if(sss.equalsIgnoreCase(" ES")&&ok5==0){
                sayac++; ok5++;
                tv16.setText("E");
                tv6.setText("S");
            }
            else{
                puan=puan-5;
            }
            son.setText(" ");}
        else if(seviye==5&&rand==1){
            if(sss.equalsIgnoreCase(" ORAK")&&ok1==0){
                sayac++; ok1++;
                tv16.setText("O");
                tv5.setText("R");
                tv11.setText("A");
                tv13.setText("K");
            }
            else if(sss.equalsIgnoreCase(" AKOR")&&ok2==0){
                sayac++; ok2++;
                tv12.setText("A");
                tv9.setText("K");
                tv7.setText("O");
                tv14.setText("R");
            }
            else if(sss.equalsIgnoreCase(" ROKA")&&ok3==0){
                sayac++; ok3++;
                tv14.setText("R");
                tv15.setText("O");
                tv13.setText("K");
                tv18.setText("A");
            }
            else if(sss.equalsIgnoreCase(" KARO")&&ok4==0){
                sayac++; ok4++;
                tv9.setText("K");
                tv1.setText("A");
                tv5.setText("R");
                tv4.setText("O");
            }
            else if(sss.equalsIgnoreCase(" ARK")&&ok5==0){
                sayac++; ok5++;
                tv18.setText("A");
                tv19.setText("R");
                tv20.setText("K");
            }
            else{
                puan=puan-5;
            }
            son.setText(" ");}
        else if(seviye==6) {
            if (sss.equalsIgnoreCase(" ETİL")&&ok1==0) {
                sayac++; ok1++;
                tv9.setText("E");
                tv1.setText("T");
                tv5.setText("İ");
                tv4.setText("L");
            } else if (sss.equalsIgnoreCase(" ELİT")&&ok2==0) {
                sayac++; ok2++;
                tv6.setText("E");
                tv10.setText("L");
                tv21.setText("İ");
                tv22.setText("T");
            } else if (sss.equalsIgnoreCase(" ELTİ")&&ok3==0) {
                sayac++; ok3++;
                tv6.setText("E");
                tv4.setText("L");
                tv17.setText("T");
                tv18.setText("İ");
            } else if (sss.equalsIgnoreCase(" ETLİ")&&ok4==0) {
                sayac++; ok4++;
                tv2.setText("E");
                tv1.setText("T");
                tv3.setText("L");
                tv15.setText("İ");
            } else if (sss.equalsIgnoreCase(" İLE")&&ok5==0) {
                sayac++; ok5++;
                tv18.setText("İ");
                tv25.setText("L");
                tv26.setText("E");
            } else if (sss.equalsIgnoreCase(" TEL")&&ok6==0) {
                sayac++; ok6++;
                tv22.setText("T");
                tv23.setText("E");
                tv24.setText("L");
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
            puanset(seviye+20);
            seviye++;
            if(seviye==7){
                seviye=11;
            }
            kulset(seviye+20);
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
        tv1.setText(" "); tv2.setText(" "); tv3.setText(" "); tv4.setText(" "); tv5.setText(" ");
        tv6.setText(" "); tv7.setText(" "); tv9.setText(" "); tv10.setText(" "); tv11.setText(" ");
        tv12.setText(" "); tv13.setText(" "); tv14.setText(" "); tv15.setText(" ");tv16.setText(" ");
        tv17.setText(" "); tv18.setText(" "); tv19.setText(" "); tv20.setText(" ");
        tv21.setText(" "); tv22.setText(" "); tv23.setText(" "); tv24.setText(" "); tv25.setText(" ");
        tv26.setText(" ");
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
