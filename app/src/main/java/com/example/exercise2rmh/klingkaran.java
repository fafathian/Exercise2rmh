package com.example.exercise2rmh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class klingkaran extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_klingkaran);
        ImageView txPopup6=findViewById(R.id.backback);
        txPopup6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu ppMenu = new PopupMenu(klingkaran.this, v);
                ppMenu.setOnMenuItemClickListener(klingkaran.this);
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
                                Intent intent = new Intent(klingkaran.this, MainActivity.class);
                                klingkaran.this.startActivity(intent);
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

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        return false;
    }
}
