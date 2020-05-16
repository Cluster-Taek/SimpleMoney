package com.cookandroid.payproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button btnOpenDrawer;
    Button btnCloseDrawer;
    Button btnPageCalendar;
    Button btnPageGragh;
    Button btnPageTotal;
    Button btnPageSetting;
    Button btnPageMoney;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // 전체화면인 DrawerLayout 객체 참조
        final DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);

        // Drawer 화면(뷰) 객체 참조
        final View drawerView = (View) findViewById(R.id.drawer);


        // 드로어 화면을 열고 닫을 버튼 객체 참조
        btnOpenDrawer = (Button) findViewById(R.id.btn_OpenDrawer);
        btnCloseDrawer = (Button) findViewById(R.id.btn_CloseDrawer);
        btnPageCalendar = (Button) findViewById(R.id.btnPageCalender);
        btnPageGragh = (Button) findViewById(R.id.btnPageGraph);
        btnPageTotal = (Button) findViewById(R.id.btnPageTotal);
        btnPageSetting = (Button) findViewById(R.id.btnPageSetting);
        btnPageMoney = (Button) findViewById(R.id.btnPageMoney);


        // 드로어 여는 버튼 리스너
        btnOpenDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(drawerView);
            }
        });


        // 드로어 닫는 버튼 리스너
        btnCloseDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.closeDrawer(drawerView);
            }
        });

        //추가 여는 버튼 리스너
        btnPageMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,PageMoney.class);
                startActivity(intent);
            }
        });

        //달력 여는 버튼 리스너
        btnPageCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,PageCalendar.class);
                startActivity(intent);
            }
        });

        //통계 여는 버튼 리스너
        btnPageGragh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,PageGraph.class);
                startActivity(intent);
            }
        });

        //개요 여는 버튼 리스너
        btnPageTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,PageTotal.class);
                startActivity(intent);
            }
        });

        //설정 여는 버튼 리스너
        btnPageSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,PageSetting.class);
                startActivity(intent);
            }
        });


    }
}
