package com.mel.GeStock;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Type_produit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_produit);

        //Bottom menu

        //Initialize and assign variables
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        //set home selected
        bottomNavigationView.setSelectedItemId(R.id.type_produit);
        //perfom itemselectedlistener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.entrepot:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.type_produit:

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
                        startActivity(new Intent(getApplicationContext(),Magasin.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
}