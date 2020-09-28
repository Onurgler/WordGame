package com.example.kelime;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class puanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puan);
        String oku="";
        TextView tv= (TextView) findViewById(R.id.textView);
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
        int asd=Integer.parseInt(kelime[1]);
        TextView tv35=(TextView) findViewById(R.id.textView35);
        if(asd!=41){
            tv35.setText("Son kul: "+kelime[0]+" -> "+(asd/10)+". böl "+(asd%10)+". sev"+"    ");
        }else
            tv35.setText(kelime[0]+" bitirmiş. Yeni isim giriniz");
        String puanlar="";
        String[] dene=kelime[2].split(";");
        for(int i=1;i<dene.length;i=i+3){
            int as=Integer.parseInt(dene[i]);
            puanlar=puanlar+(as/10)+".böl_"+(as%10)+".sev"+":"+dene[i+1]+"=>"+dene[i+2]+"  ";
        }
        tv.setText(puanlar);

    }
}
