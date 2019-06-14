package com.example.rocas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //creem un nou mètode pe a que quan s'apreti el botó de dades addicionals, s'executi
    //el noy layout. Rep un argument de tipus vista, que és el botó de dadades addicionals

    public void clickAdditionalDataButton (View view){

        //creem el nou intent indicant l'activitat on estem i la classe que conté el que s'ha de fer
        //el que estem fent és crear un nou intent (una mena d'event) on se li diu que el que ha
        //de fer es troba a la classe DataClass
        Intent intent = new Intent(this, DataClass.class);

        //utilitzem el mètode "startActivity" per iniciar. El botó serà el responsable de cridar
        //a aquest mètode.

        startActivity(intent);

    }

    //mètode per sortir de l'aplicació
    public void clickExitApp (View view){
        finish();
    }

    //mètode per crear el menú. El returns'ha creat sol en generar el codi del mètode fent
    //override. El profe de youtube havia fet return true. Com que ja funciona, ho deixo així
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_en_activity,menu );
        return super.onCreateOptionsMenu(menu);
       // return true;
    }


   //mètode per indicar a cada item del menú, què ha de fer.
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.configMenuItem){
            return true;
        } else if (id == R.id.dataMenuItem){
            clickAdditionalDataButton(null);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
