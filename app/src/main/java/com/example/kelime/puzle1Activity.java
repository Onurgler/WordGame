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

public class puzle1Activity extends AppCompatActivity {

    int sayac=0;
    int puan=100;
    long startTime = System.currentTimeMillis();
    long endTime = 0;
    int seviye=1;
    int ok1=0, ok2=0, ok3=0, ok4=0, ok5=0;
    int butyer=0;
    Random random=new Random();
    String kullan="";
    int rand=random.nextInt(2)+1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzle1);
        Button but6 = (Button)findViewById(R.id.button6);
        Button but5 = (Button)findViewById(R.id.button5);
        Button but4 = (Button)findViewById(R.id.button4);
        if(butyer==1){
            but4 = (Button)findViewById(R.id.button6);
            but5 = (Button)findViewById(R.id.button5);
            but6 = (Button)findViewById(R.id.button4);
        }
        else if(butyer==2){
            but5 = (Button)findViewById(R.id.button6);
            but6 = (Button)findViewById(R.id.button5);
            but4 = (Button)findViewById(R.id.button4);
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
        teres();
        seviye =sevget();
        if(seviye==1){

            tv1.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv2.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv3.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv9.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv5.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            if(rand==1){
                but4.setText("K");
                but5.setText("I");
                but6.setText("Ş");
            }
            else{
                but4.setText("K");
                but5.setText("I");
                but6.setText("T");
            }
        }
        else if(seviye==2){
            if(rand==1){
                but4.setText("K");
                but5.setText("A");
                but6.setText("P");
            }
            else{
                but4.setText("Ç");
                but5.setText("A");
                but6.setText("M");
            }
        }
        else if(seviye==3){
            if(rand==1){
                but4.setText("K");
                but5.setText("A");
                but6.setText("R");
            }
            else{
                but4.setText("K");
                but5.setText("A");
                but6.setText("T");
            }
        }
        else if(seviye==4){
            if(rand==1){
                but4.setText("H");
                but5.setText("A");
                but6.setText("P");
            }
            else{
                but4.setText("A");
                but5.setText("L");
                but6.setText("İ");
            }
        }
        else if(seviye==5){
            if(rand==1){
                but4.setText("Y");
                but5.setText("A");
                but6.setText("T");
            }
            else{
                but4.setText("K");
                but5.setText("A");
                but6.setText("L");
            }
        }
        else if(seviye==6){
            but4.setText("A");
            but5.setText("L");
            but6.setText("P");
        }

        if(seviye==2){
            tv1.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv2.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv4.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv5.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv6.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv10.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
        }else if(seviye==3&&rand==1){
            tv1.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv2.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv3.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv4.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv5.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv6.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv7.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
        }else if(seviye==3){
            tv1.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv2.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv4.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv5.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv6.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv10.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv11.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
        }else if(seviye==4){
            tv1.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv2.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv4.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv5.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv6.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv10.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv12.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
        }else if(seviye==5){
            tv1.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv2.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv4.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv5.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv6.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv10.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv11.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv12.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
        }else if(seviye==6){
            tv1.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv2.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv4.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv5.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv6.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv10.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv11.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv12.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv13.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
        }

    }

    public void but4(View view) {
        TextView et8=(TextView) findViewById(R.id.textView8);
        String as= (String) et8.getText();
        if(butyer==0||butyer==2){
            if(seviye==1&&rand==1)
                et8.setText(as+"K");
            else if(seviye==1)
                et8.setText(as+"K");
            else if(seviye==2&&rand==1)
                et8.setText(as+"K");
            else if(seviye==2)
                et8.setText(as+"Ç");
            else if(seviye==3&&rand==1)
                et8.setText(as+"K");
            else if(seviye==3)
                et8.setText(as+"K");
            if(seviye==4&&rand==1)
                et8.setText(as+"H");
            else if(seviye==4)
                et8.setText(as+"A");
            else if(seviye==5&&rand==1)
                et8.setText(as+"Y");
            else if(seviye==5)
                et8.setText(as+"K");
            else if(seviye==6)
                et8.setText(as+"A");
        }else if(butyer==1){
            if(seviye==1&&rand==1)
                et8.setText(as+"Ş");
            else if(seviye==1)
                et8.setText(as+"T");
            else if(seviye==2&&rand==1)
                et8.setText(as+"P");
            else if(seviye==2)
                et8.setText(as+"M");
            else if(seviye==3&&rand==1)
                et8.setText(as+"R");
            else if(seviye==3)
                et8.setText(as+"T");
            if(seviye==4&&rand==1)
                et8.setText(as+"P");
            else if(seviye==4)
                et8.setText(as+"İ");
            else if(seviye==5&&rand==1)
                et8.setText(as+"T");
            else if(seviye==5)
                et8.setText(as+"L");
            else if(seviye==6)
                et8.setText(as+"P");
        }

    }
    public void but5(View view) {
        TextView et8=(TextView) findViewById(R.id.textView8);
        String as= (String) et8.getText();
        if(butyer==0||butyer==1){
            if(seviye==1&&rand==1)
                et8.setText(as+"I");
            else if(seviye==1)
                et8.setText(as+"I");
            else if(seviye==2&&rand==1)
                et8.setText(as+"A");
            else if(seviye==2)
                et8.setText(as+"A");
            else if(seviye==3&&rand==1)
                et8.setText(as+"A");
            else if(seviye==3)
                et8.setText(as+"A");
            if(seviye==4&&rand==1)
                et8.setText(as+"A");
            else if(seviye==4)
                et8.setText(as+"L");
            else if(seviye==5&&rand==1)
                et8.setText(as+"A");
            else if(seviye==5)
                et8.setText(as+"A");
            else if(seviye==6)
                et8.setText(as+"L");
        }
        else if(butyer==2){
            if(seviye==1&&rand==1)
                et8.setText(as+"Ş");
            else if(seviye==1)
                et8.setText(as+"T");
            else if(seviye==2&&rand==1)
                et8.setText(as+"P");
            else if(seviye==2)
                et8.setText(as+"M");
            else if(seviye==3&&rand==1)
                et8.setText(as+"R");
            else if(seviye==3)
                et8.setText(as+"T");
            if(seviye==4&&rand==1)
                et8.setText(as+"P");
            else if(seviye==4)
                et8.setText(as+"İ");
            else if(seviye==5&&rand==1)
                et8.setText(as+"T");
            else if(seviye==5)
                et8.setText(as+"L");
            else if(seviye==6)
                et8.setText(as+"P");
        }
    }
    public void but6(View view) {
        TextView et8=(TextView) findViewById(R.id.textView8);
        String as= (String) et8.getText();
        if(butyer==0){
            if(seviye==1&&rand==1)
                et8.setText(as+"Ş");
            else if(seviye==1)
                et8.setText(as+"T");
            else if(seviye==2&&rand==1)
                et8.setText(as+"P");
            else if(seviye==2)
                et8.setText(as+"M");
            else if(seviye==3&&rand==1)
                et8.setText(as+"R");
            else if(seviye==3)
                et8.setText(as+"T");
            if(seviye==4&&rand==1)
                et8.setText(as+"P");
            else if(seviye==4)
                et8.setText(as+"İ");
            else if(seviye==5&&rand==1)
                et8.setText(as+"T");
            else if(seviye==5)
                et8.setText(as+"L");
            else if(seviye==6)
                et8.setText(as+"P");
        }
        else if(butyer==1){
            if(seviye==1&&rand==1)
                et8.setText(as+"K");
            else if(seviye==1)
                et8.setText(as+"K");
            else if(seviye==2&&rand==1)
                et8.setText(as+"K");
            else if(seviye==2)
                et8.setText(as+"Ç");
            else if(seviye==3&&rand==1)
                et8.setText(as+"K");
            else if(seviye==3)
                et8.setText(as+"K");
            if(seviye==4&&rand==1)
                et8.setText(as+"H");
            else if(seviye==4)
                et8.setText(as+"A");
            else if(seviye==5&&rand==1)
                et8.setText(as+"Y");
            else if(seviye==5)
                et8.setText(as+"K");
            else if(seviye==6)
                et8.setText(as+"A");
        }
        else{
            if(seviye==1&&rand==1)
                et8.setText(as+"I");
            else if(seviye==1)
                et8.setText(as+"I");
            else if(seviye==2&&rand==1)
                et8.setText(as+"A");
            else if(seviye==2)
                et8.setText(as+"A");
            else if(seviye==3&&rand==1)
                et8.setText(as+"A");
            else if(seviye==3)
                et8.setText(as+"A");
            if(seviye==4&&rand==1)
                et8.setText(as+"A");
            else if(seviye==4)
                et8.setText(as+"L");
            else if(seviye==5&&rand==1)
                et8.setText(as+"A");
            else if(seviye==5)
                et8.setText(as+"A");
            else if(seviye==6)
                et8.setText(as+"L");
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
        if(sevde>20){
            Intent intent = new Intent(getApplicationContext(),puzle2Activity.class);
            Toast.makeText(getApplicationContext(),"2. bölüm : "+kullan,Toast.LENGTH_LONG).show();
            startActivity(intent);
            finish();
        }
        seviye =sevget();
        Button but6 = (Button)findViewById(R.id.button6);
        Button but5 = (Button)findViewById(R.id.button5);
        Button but4 = (Button)findViewById(R.id.button4);
         if(butyer==1){
            but4 = (Button)findViewById(R.id.button6);
            but5 = (Button)findViewById(R.id.button5);
            but6 = (Button)findViewById(R.id.button4);

        }
        else if(butyer==2){
            but5 = (Button)findViewById(R.id.button6);
            but6 = (Button)findViewById(R.id.button5);
            but4 = (Button)findViewById(R.id.button4);
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
        if(sayac==0){
            teres();
        }
        if(seviye==1){

            tv1.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv2.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv3.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv9.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            tv5.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            if(rand==1){
                but4.setText("K");
                but5.setText("I");
                but6.setText("Ş");
            }
            else{
                but4.setText("K");
                but5.setText("I");
                but6.setText("T");
            }
        }
            else if(seviye==2){
                if(rand==1){
                    but4.setText("K");
                    but5.setText("A");
                    but6.setText("P");
                }
                else{
                    but4.setText("Ç");
                    but5.setText("A");
                    but6.setText("M");
                }
            }
            else if(seviye==3){
                if(rand==1){
                    but4.setText("K");
                    but5.setText("A");
                    but6.setText("R");
                }
                else{
                    but4.setText("K");
                    but5.setText("A");
                    but6.setText("T");
                }
            }
            else if(seviye==4){
                if(rand==1){
                    but4.setText("H");
                    but5.setText("A");
                    but6.setText("P");
                }
                else{
                    but4.setText("A");
                    but5.setText("L");
                    but6.setText("İ");
                }
            }
            else if(seviye==5){
                if(rand==1){
                    but4.setText("Y");
                    but5.setText("A");
                    but6.setText("T");
                }
                else{
                    but4.setText("K");
                    but5.setText("A");
                    but6.setText("L");
                }
            }
            else if(seviye==6){
                but4.setText("A");
                but5.setText("L");
                but6.setText("P");
            }

            if(seviye==2){
                tv1.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv2.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv4.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv5.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv6.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv10.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            }else if(seviye==3&&rand==1){
                tv1.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv2.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv3.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv4.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv5.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv6.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv7.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            }else if(seviye==3){
                tv1.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv2.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv4.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv5.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv6.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv10.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv11.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            }else if(seviye==4){
                tv1.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv2.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv4.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv5.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv6.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv10.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv12.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            }else if(seviye==5){
                tv1.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv2.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv4.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv5.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv6.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv10.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv11.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv12.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            }else if(seviye==6){
                tv1.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv2.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv4.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv5.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv6.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv10.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv11.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv12.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
                tv13.setBackgroundColor(Color.parseColor("#7A8F6A6A"));
            }

        if(sayac==0&&sss.startsWith("Puan")){
            startTime = System.currentTimeMillis();   puan=105;
        }
        if(seviye==1&&rand==1){
            if(sss.equalsIgnoreCase(" KIŞ")&&ok1==0){
                sayac++; ok1++;
                tv9.setText("K");
                tv1.setText("I");
                tv5.setText("Ş");
            }
            else if(sss.equalsIgnoreCase(" ŞIK")&&ok2==0){
                sayac++; ok2++;
                tv2.setText("Ş");
                tv1.setText("I");
                tv3.setText("K");
            }
            else{
                puan=puan-5;
            }
            son.setText(" ");}
        else if(seviye==1){
            if(sss.equalsIgnoreCase(" KIT")&&ok1==0){
                sayac++; ok1++;
                tv9.setText("K");
                tv1.setText("I");
                tv5.setText("T");
            }
            else if(sss.equalsIgnoreCase(" TIK")&&ok2==0){
                sayac++; ok2++;
                tv2.setText("T");
                tv1.setText("I");
                tv3.setText("K");
            }
            else{
                puan=puan-5;
            }
            son.setText(" ");}
        else if(seviye==2&&rand==1){
            if(sss.equalsIgnoreCase(" KAP")&&ok1==0){
                sayac++; ok1++;
                tv10.setText("K");
                tv2.setText("A");
                tv1.setText("P");
            }
            else if(sss.equalsIgnoreCase(" PAK")&&ok2==0){
                sayac++; ok2++;
                tv1.setText("P");
                tv5.setText("A");
                tv4.setText("K");
            }
            else if(sss.equalsIgnoreCase(" AK")&&ok3==0){
                sayac++; ok3++;
                tv6.setText("A");
                tv4.setText("K");
            }
            else{
                puan=puan-5;
            }
            son.setText(" ");}
        else if(seviye==2){
            if(sss.equalsIgnoreCase(" ÇAM")&&ok1==0){
                sayac++; ok1++;
                tv10.setText("Ç");
                tv2.setText("A");
                tv1.setText("M");
            }
            else if(sss.equalsIgnoreCase(" MAÇ")&&ok2==0){
                sayac++; ok2++;
                tv1.setText("M");
                tv5.setText("A");
                tv4.setText("Ç");
            }
            else if(sss.equalsIgnoreCase(" AÇ")&&ok3==0){
                sayac++; ok3++;
                tv6.setText("A");
                tv4.setText("Ç");
            }
            else{
                puan=puan-5;
            }
            son.setText(" ");}
        else if(seviye==3&&rand==1){
            if(sss.equalsIgnoreCase(" ARK")&&ok1==0){
                sayac++; ok1++;
                tv1.setText("A");
                tv5.setText("R");
                tv4.setText("K");
            }
            else if(sss.equalsIgnoreCase(" KAR")&&ok2==0){
                sayac++; ok2++;
                tv1.setText("A");
                tv3.setText("R");
                tv2.setText("K");
            }
            else if(sss.equalsIgnoreCase(" AR")&&ok3==0){
                sayac++; ok3++;
                tv7.setText("A");
                tv3.setText("R");
            }
            else if(sss.equalsIgnoreCase(" AK")&&ok4==0){
                sayac++; ok4++;
                tv6.setText("A");
                tv4.setText("K");
            }
            else{
                puan=puan-5;
            }
            son.setText(" ");}
        else if(seviye==3){
            if(sss.equalsIgnoreCase(" KAT")&&ok1==0){
                sayac++; ok1++;
                tv10.setText("K");
                tv2.setText("A");
                tv1.setText("T");
            }
            else if(sss.equalsIgnoreCase(" TAK")&&ok2==0){
                sayac++; ok2++;
                tv1.setText("T");
                tv5.setText("A");
                tv4.setText("K");
            }
            else if(sss.equalsIgnoreCase(" AK")&&ok3==0){
                sayac++; ok3++;
                tv6.setText("A");
                tv4.setText("K");
            }
            else if(sss.equalsIgnoreCase(" AT")&&ok4==0){
                sayac++; ok4++;
                tv5.setText("A");
                tv11.setText("T");
            }
            else{
                puan=puan-5;
            }
            son.setText(" ");}
        else if(seviye==4&&rand==1){
            if(sss.equalsIgnoreCase(" HAP")&&ok1==0){
                sayac++; ok1++;
                tv10.setText("H");
                tv2.setText("A");
                tv1.setText("P");
            }
            else if(sss.equalsIgnoreCase(" PAH")&&ok2==0){
                sayac++; ok2++;
                tv1.setText("P");
                tv5.setText("A");
                tv4.setText("H");
            }
            else if(sss.equalsIgnoreCase(" AH")&&ok3==0){
                sayac++; ok3++;
                tv6.setText("A");
                tv4.setText("H");
            }
            else if(sss.equalsIgnoreCase(" HA")&&ok4==0){
                sayac++; ok4++;
                tv12.setText("H");
                tv2.setText("A");
            }
            else{
                puan=puan-5;
            }
            son.setText(" ");}
        else if(seviye==4){
            if(sss.equalsIgnoreCase(" ALİ")&&ok1==0){
                sayac++; ok1++;
                tv10.setText("A");
                tv2.setText("L");
                tv1.setText("İ");
            }
            else if(sss.equalsIgnoreCase(" İLA")&&ok2==0){
                sayac++; ok2++;
                tv1.setText("İ");
                tv5.setText("L");
                tv4.setText("A");
            }
            else if(sss.equalsIgnoreCase(" LA")&&ok3==0){
                sayac++; ok3++;
                tv6.setText("L");
                tv4.setText("A");
            }
            else if(sss.equalsIgnoreCase(" AL")&&ok4==0){
                sayac++; ok4++;
                tv12.setText("A");
                tv2.setText("L");
            }
            else{
                puan=puan-5;
            }
            son.setText(" ");}
        else if(seviye==5&&rand==1){
            if(sss.equalsIgnoreCase(" YAT")&&ok1==0){
                sayac++; ok1++;
                tv10.setText("Y");
                tv2.setText("A");
                tv1.setText("T");
            }
            else if(sss.equalsIgnoreCase(" TAY")&&ok2==0){
                sayac++; ok2++;
                tv1.setText("T");
                tv5.setText("A");
                tv4.setText("Y");
            }
            else if(sss.equalsIgnoreCase(" AY")&&ok3==0){
                sayac++; ok3++;
                tv6.setText("A");
                tv4.setText("Y");
            }
            else if(sss.equalsIgnoreCase(" AT")&&ok4==0){
                sayac++; ok4++;
                tv5.setText("A");
                tv11.setText("T");
            }
            else if(sss.equalsIgnoreCase(" YA")&&ok5==0){
                sayac++; ok5++;
                tv12.setText("Y");
                tv2.setText("A");
            }
            else{
                puan=puan-5;
            }
            son.setText(" ");}
        else if(seviye==5){
            if(sss.equalsIgnoreCase(" KAL")&&ok1==0){
                sayac++; ok1++;
                tv10.setText("K");
                tv2.setText("A");
                tv1.setText("L");
            }
            else if(sss.equalsIgnoreCase(" LAK")&&ok2==0){
                sayac++; ok2++;
                tv1.setText("L");
                tv5.setText("A");
                tv4.setText("K");
            }
            else if(sss.equalsIgnoreCase(" AK")&&ok3==0){
                sayac++; ok3++;
                tv6.setText("A");
                tv4.setText("K");
            }
            else if(sss.equalsIgnoreCase(" AL")&&ok4==0){
                sayac++; ok4++;
                tv5.setText("A");
                tv11.setText("L");
            }
            else if(sss.equalsIgnoreCase(" LA")&&ok5==0){
                sayac++; ok5++;
                tv12.setText("L");
                tv2.setText("A");
            }
            else{
                puan=puan-5;
            }
            son.setText(" ");}
        else if(seviye==6) {
            if (sss.equalsIgnoreCase(" LAP")&&ok1==0) {
                sayac++; ok1++;
                tv10.setText("L");
                tv2.setText("A");
                tv1.setText("P");
            } else if (sss.equalsIgnoreCase(" PAL")&&ok2==0) {
                sayac++; ok2++;
                tv1.setText("P");
                tv5.setText("A");
                tv4.setText("L");
            } else if (sss.equalsIgnoreCase(" ALP")&&ok3==0) {
                sayac++; ok3++;
                tv5.setText("A");
                tv11.setText("L");
                tv13.setText("P");
            } else if (sss.equalsIgnoreCase(" AL")&&ok4==0) {
                sayac++; ok4++;
                tv6.setText("A");
                tv4.setText("L");
            } else if (sss.equalsIgnoreCase(" LA")&&ok5==0) {
                sayac++; ok5++;
                tv12.setText("L");
                tv2.setText("A");
            } else {
                puan = puan - 5;
            }
            son.setText(" ");}

        if((sayac==2&&seviye==1)||(sayac==3&&seviye==2)||(sayac==4&&seviye==3)||(sayac==4&&seviye==4)||(sayac==5&&seviye==5)||(sayac==5&&seviye==6)){
            endTime = System.currentTimeMillis();
            long estimatedTime = endTime - startTime;
            double seconds = (double)estimatedTime/1000;
            son.setText("Puan: "+(puan-(int)seconds));
            int puu=puan-(int)seconds;
            if(puu<0)
                finish();
            puan=puan-(int)seconds;
            puanset(seviye+10);
            seviye++;
            if(seviye==7){
                seviye=11;
            }
            kulset(seviye+10);
            sayac=0;
            ok1=0; ok2=0; ok3=0; ok4=0; ok5=0;
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
        tv1.setText(" "); tv2.setText(" "); tv3.setText(" "); tv4.setText(" "); tv5.setText(" ");
        tv6.setText(" "); tv7.setText(" "); tv9.setText(" "); tv10.setText(" "); tv11.setText(" ");
        tv12.setText(" "); tv13.setText(" ");
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
