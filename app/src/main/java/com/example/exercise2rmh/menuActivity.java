package com.example.exercise2rmh;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class menuActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    ImageView backback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ImageView txPopup=findViewById(R.id.persegi);
        //Event jika tulisan di klik
        txPopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu ppMenu = new PopupMenu(menuActivity.this, v);
                ppMenu.setOnMenuItemClickListener(menuActivity.this);
//kaitkan dengan popupmenu.xml
                ppMenu.inflate(R.menu.menu);
                ppMenu.show();
                ppMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        int id = item.getItemId();
                        switch (id) {
                            case R.id.menu1:
                                Toast.makeText(getApplicationContext(), "welcome to page luas persegi", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(menuActivity.this, Lpersegi.class);
                                menuActivity.this.startActivity(intent);
                                finish();
                            case R.id.menu2:
                                Toast.makeText(getApplicationContext(), "welcome to page keliling persegi", Toast.LENGTH_SHORT).show();
                                Intent i = new Intent(menuActivity.this, kpersegi.class);
                                menuActivity.this.startActivity(i);
                                finish();
                            default:
                                return false;
                        }
//kaitkan dengan popupmenu.xml

                    }
                });

            };
        });

        ImageView txPopup2 = findViewById(R.id.persegipanjang);
        txPopup2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu ppMenu = new PopupMenu(menuActivity.this, v);
                ppMenu.setOnMenuItemClickListener(menuActivity.this);
                ppMenu.inflate(R.menu.menu);
                ppMenu.show();
                ppMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        int id = item.getItemId();
                        switch(id) {
                            case R.id.menu1:
                                Toast.makeText(getApplicationContext(),"welcome to page luas persegi panjang",Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(menuActivity.this, Lpersegipanjang.class);
                                menuActivity.this.startActivity(intent);
                                finish();
                            case R.id.menu2:
                                Toast.makeText(getApplicationContext(),"welcome to page keliling persegi panjang",Toast.LENGTH_SHORT).show();
                                Intent i = new Intent(menuActivity.this, kpersegipanjang.class);
                                menuActivity.this.startActivity(i);
                                finish();
                            default:
                                return true;
                    }
//kaitkan dengan popupmenu.xml

            }
        });

        ImageView txPopup3=findViewById(R.id.segitiga);
        txPopup3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu ppMenu = new PopupMenu(menuActivity.this, v);
                ppMenu.setOnMenuItemClickListener(menuActivity.this);
//kaitkan dengan popupmenu.xml
                ppMenu.inflate(R.menu.menu);
                ppMenu.show();
                ppMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        int id = item.getItemId();
                        switch(id) {
                            case R.id.menu1:
                                Toast.makeText(getApplicationContext(),"welcome to page luas segitiga",Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(menuActivity.this, Lsegitiga.class);
                                menuActivity.this.startActivity(intent);
                                finish();
                            case R.id.menu2:
                                Toast.makeText(getApplicationContext(),"welcome to page keliling segitiga",Toast.LENGTH_SHORT).show();
                                Intent i = new Intent(menuActivity.this, ksegitiga.class);
                                menuActivity.this.startActivity(i);
                                finish();
                            default:
                                return true;
                        }
//kaitkan dengan popupmenu.xml
                    }
            });
            }
        });
        ImageView txPopup4=findViewById(R.id.trapesium);
        txPopup4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu ppMenu = new PopupMenu(menuActivity.this, v);
                ppMenu.setOnMenuItemClickListener(menuActivity.this);
//kaitkan dengan popupmenu.xml
                ppMenu.inflate(R.menu.menu);
                ppMenu.show();
                ppMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        int id = item.getItemId();
                        switch(id) {
                            case R.id.menu1:
                                Toast.makeText(getApplicationContext(),"welcome to page luas trapesium",Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(menuActivity.this, Ltrapesium.class);
                                menuActivity.this.startActivity(intent);
                                finish();
                            case R.id.menu2:
                                Toast.makeText(getApplicationContext(),"welcome to page keliling trapesium",Toast.LENGTH_SHORT).show();
                                Intent i = new Intent(menuActivity.this, ktrapesium.class);
                                menuActivity.this.startActivity(i);
                                finish();
                            default:
                                return true;
                        }
//kaitkan dengan popupmenu.xml
                    }
                });
            }
        });
        ImageView txPopup5=findViewById(R.id.lingkaran);
        txPopup5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu ppMenu = new PopupMenu(menuActivity.this, v);
                ppMenu.setOnMenuItemClickListener(menuActivity.this);
//kaitkan dengan popupmenu.xml
                ppMenu.inflate(R.menu.menu);
                ppMenu.show();
                ppMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        int id = item.getItemId();
                        switch(id) {
                            case R.id.menu1:
                                Toast.makeText(getApplicationContext(),"welcome to page luas lingkaran",Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(menuActivity.this, Llingkaran.class);
                                menuActivity.this.startActivity(intent);
                                finish();
                            case R.id.menu2:
                                Toast.makeText(getApplicationContext(),"welcome to page keliling lingkaran",Toast.LENGTH_SHORT).show();
                                Intent i = new Intent(menuActivity.this, klingkaran.class);
                                menuActivity.this.startActivity(i);
                                finish();
                            default:
                                return true;
                        }
//kaitkan dengan popupmenu.xml
                    }
                });
            }
        });

                ImageView txPopup6=findViewById(R.id.backback);
                txPopup6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        PopupMenu ppMenu = new PopupMenu(menuActivity.this, v);
                        ppMenu.setOnMenuItemClickListener(menuActivity.this);
//kaitkan dengan popupmenu.xml
                        ppMenu.inflate(R.menu.logout);
                        ppMenu.show();
                        ppMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                            @Override
                            public boolean onMenuItemClick(MenuItem item) {
                                int id = item.getItemId();
                                switch(id) {
                                    case R.id.logout:
                                        Toast.makeText(getApplicationContext(),"anda telah log out",Toast.LENGTH_SHORT).show();
                                        Intent intent = new Intent(menuActivity.this, MainActivity.class);
                                        menuActivity.this.startActivity(intent);
                                        finish();
                                    default:
                                        return true;
                                }
//kaitkan dengan popupmenu.xml
                            }
                        });
                    }
                });
    }
});
    }
    public boolean onMenuItemClick(MenuItem menuItem) {
        return true;
    }
}


