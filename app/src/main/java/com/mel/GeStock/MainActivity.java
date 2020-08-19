package com.mel.GeStock;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    //Round menu
    public FloatingActionButton floatingActionButton;
    public FloatingActionButton floatingActionButton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Round menu
        floatingActionButton=findViewById(R.id.Client);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Client.class);
                startActivity(intent);
            }
        });

        floatingActionButton1=findViewById(R.id.New);
        floatingActionButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,New.class);
                startActivity(intent);
            }
        });

        //Bottom menu

        //Initialize and assign variables
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        //set home selected
        bottomNavigationView.setSelectedItemId(R.id.entrepot);
        //perfom itemselectedlistener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.entrepot:
                        return true;

                    case R.id.type_produit:
                        startActivity(new Intent(getApplicationContext(), Type_produit.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.produits:
                        startActivity(new Intent(getApplicationContext(), Produits.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.fournisseur:
                        startActivity(new Intent(getApplicationContext(),Fournisseur.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.magasin:
                        startActivity(new Intent(getApplicationContext(),Magasin.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
}