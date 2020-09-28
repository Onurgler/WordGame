package com.example.kelime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText etk=(EditText) findViewById(R.id.editText);
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
        etk.setText(kelime[0]);
    }

    public void gonder(View view) {
        Intent intent = new Intent(getApplicationContext(),puanActivity.class);
        startActivity(intent);
    }

    public void basla(View view) {
        EditText etk=(EditText) findViewById(R.id.editText);
        String sonkul=etk.getText().toString(); String oku="";
        /*try {
            FileOutputStream fos = openFileOutput("dosya", Context.MODE_PRIVATE);
            fos.write("AAA :11 :        ".getBytes());//27
            fos.write(";11;_;0".getBytes());
            fos.write(";12;_;0".getBytes());
            fos.write(";13;_;0".getBytes());
            fos.write(";14;_;0".getBytes());
            fos.write(";15;_;0".getBytes());
            fos.write(";16;_;0".getBytes());
            fos.write(";21;_;0".getBytes());
            fos.write(";22;_;0".getBytes());
            fos.write(";23;_;0".getBytes());
            fos.write(";24;_;0".getBytes());
            fos.write(";25;_;0".getBytes());
            fos.write(";26;_;0".getBytes());
            fos.write(";31;_;0".getBytes());
            fos.write(";32;_;0".getBytes());
            fos.write(";33;_;0".getBytes());
            fos.write(";34;_;0".getBytes());
            fos.write(";35;_;0".getBytes());
            fos.write(";36;_;0".getBytes());
            fos.close();
        }catch (Exception e){
            e.printStackTrace();
        }*/
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
        if(kelime[0].equalsIgnoreCase(sonkul)){

            int don=Integer.parseInt(kelime[1]);
            don=don/10;
            if(don==1){
                Intent intent = new Intent(getApplicationContext(),puzle1Activity.class);
                startActivity(intent);
            }else if(don==2){
                Intent intent = new Intent(getApplicationContext(),puzle2Activity.class);
                startActivity(intent);
            }else if(don==3){
                Intent intent = new Intent(getApplicationContext(),puzle3Activity.class);
                startActivity(intent);
            }
        }else{
            kelime[0]=sonkul;
            kelime[1]=" :11 :";
            try {
                FileOutputStream fos = openFileOutput("dosya", Context.MODE_PRIVATE);
                for(int i=0;i<kelime.length;i++){
                    fos.write(kelime[i].getBytes());
                }
                fos.close();
            }catch (Exception e){
                e.printStackTrace();
            }
            Intent intent = new Intent(getApplicationContext(),puzle1Activity.class);
            Toast.makeText(getApplicationContext(),": "+sonkul,Toast.LENGTH_LONG).show();
            startActivity(intent);
        }


    }
}