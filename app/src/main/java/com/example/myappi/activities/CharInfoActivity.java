package com.example.myappi.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myappi.R;
import com.example.myappi.model.Character;

public class CharInfoActivity extends AppCompatActivity {

    private TextView charName, fullName,shortBio,longBio,firstAppearance,nickName;
    private ImageView coverImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_char__info);

        initView();
        parseInt();
    }

    private void parseInt() {
        Character character = (Character) getIntent().getSerializableExtra("HeroClass");

        charName.setText(character.getCharName());
        fullName.setText(character.getFullName());
        shortBio.setText(character.getShortBio());
        longBio.setText(character.getLongBio());
        firstAppearance.setText(character.getFirstAppearance());
        nickName.setText(character.getNickName());

        coverImage.setImageDrawable(getDrawable(character.getCoverImage()));
    }

    private void initView() {
        charName = findViewById(R.id.charName);
        fullName = findViewById(R.id.fullName);
        nickName = findViewById(R.id.nickName);
        shortBio = findViewById(R.id.shortBio);
        longBio = findViewById(R.id.longBio);
        firstAppearance =findViewById(R.id.firsAppearance);
        coverImage = findViewById(R.id.coverImage);
    }
}