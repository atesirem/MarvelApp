package com.example.myappi.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.myappi.R;
import com.example.myappi.data.Data;
import com.example.myappi.model.Character;

public class MainActivity extends AppCompatActivity {


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void goToHero(View view) {
        Data data = new Data();

        Intent intent = new Intent(this, CharInfoActivity.class);
        Character character = data.getIronMan();

        switch (view.getId()) {
            case R.id.button1:
                character = data.getIronMan();
                break;
            case R.id.button2:
                character = data.getBlackWidow();
                break;
            case R.id.button3:
                character = data.getCaptainAmerica();
                break;
            case R.id.button4:
                character = data.getThor();
                break;
            case R.id.button5:
                character = data.getHulk();
                break;
            case R.id.button6:
                character = data.getHawkeye();
                break;
            case R.id.button7:
                character = data.getAntman();
                break;
            case R.id.button8:
                character = data.getNebula();
                break;
            case R.id.button9:
                character = data.getCaptainMarvel();
                break;
            case R.id.button10:
                character = data.getWong();
                break;

            default:character = data.getIronMan();
        }

        intent.putExtra("HeroClass", character);
        startActivity(intent);
    }

}
