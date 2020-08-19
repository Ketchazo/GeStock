package com.mel.GeStock;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Magasin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magasin);



        //Bottom menu

        //Initialize and assign variables
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        //set home selected
        bottomNavigationView.setSelectedItemId(R.id.magasin);
        //perfom itemselectedlistener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.entrepot:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.type_produit:
                        startActivity(new Intent(getApplicationContext(), Type_produit.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.produits:
                        startActivity(new Intent(getApplicationContext(),Produits.class));
                        overridePendingTransition(0,0);

                        return true;

                    case R.id.fournisseur:
                        startActivity(new Intent(getApplicationContext(),Fournisseur.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.magasin:

                        return true;
                }
                return false;
            }
        });
    }
}