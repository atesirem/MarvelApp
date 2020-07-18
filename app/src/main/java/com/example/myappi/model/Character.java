package com.example.myappi.model;

import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;

public class Character implements Serializable {
    private String charName, nickName, shortBio, fullName,firstAppearance , longBio;
    private int coverImage;

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) { this.charName = charName; }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortBio() {
        return shortBio;
    }

    public void setShortBio(String shortBio) {
        this.shortBio = shortBio;
    }

    public String getLongBio() {
        return longBio;
    }

    public void setLongBio(String longBio) {
        this.longBio = longBio;
    }

    public String getFirstAppearance() {
        return firstAppearance;
    }

    public void setFirstAppearance(String firstAppearance) {
        this.firstAppearance = firstAppearance;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(int coverImage) {
        this.coverImage = coverImage;
    }

    public Character(String charName, String fullName, String shortBio, String longBio, String firstAppearance, String nickName, int coverImage) {
        this.charName = charName;
        this.fullName = fullName;
        this.shortBio = shortBio;
        this.longBio = longBio;
        this.firstAppearance = firstAppearance;
        this.nickName = nickName;
        this.coverImage = coverImage;
    }
}
