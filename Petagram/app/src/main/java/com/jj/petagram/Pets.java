package com.jj.petagram;

import java.io.Serializable;

public class Pets implements Serializable {
    private int photo, boneWhite, boneYellow, start;
    private String name, likes;
    private boolean like;

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public int getBoneWhite() {
        return boneWhite;
    }

    public void setBoneWhite(int boneWhite) {
        this.boneWhite = boneWhite;
    }

    public int getBoneYellow() {
        return boneYellow;
    }

    public void setBoneYellow(int boneYellow) {
        this.boneYellow = boneYellow;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public boolean isLike() {
        return like;
    }

    public void setLike(boolean like) {
        this.like = like;
    }

    public int liked(){
        return (this.like) ? R.drawable.icons8_dog_bone_101: R.drawable.icons8_dog_bone_101;
    }

    public Pets(int photo, String name, String likes) {
        this.photo = photo;
        this.boneWhite = R.drawable.icons8_dog_bone_100;
        this.boneYellow = R.drawable.icons8_dog_bone_101;
        this.start = R.drawable.start_fav;
        this.name = name;
        this.likes = likes;
        this.like = true;
    }
}
