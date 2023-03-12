package com.example.photoapllication;

import java.util.ArrayList;

public class PhotoData {
    public static ArrayList<Photo> generatePhotoData() {
        ArrayList<Photo> photos = new ArrayList<>();
        photos.add(new Photo(1,R.drawable.eren, "Eren Yeager", "The Attack Titan"));
        photos.add(new Photo(2,R.drawable.mikasa,"Miaksa Ackerman", "Strongest women of Paradise"));
        photos.add(new Photo(3,R.drawable.levi, "Levi Ackerman", "Strongest man of Paradise"));
        photos.add(new Photo(4,R.drawable.reiner,"Reiner Braun", "The Armored Titan"));
        photos.add(new Photo(5,R.drawable.ymir, "Ymir","The first Founding Titan"));
        return photos;
    }

    public static Photo getPhotoById(int id) {
        ArrayList<Photo> photo = generatePhotoData();
        for (int i = 0; i < photo.size(); i++) {
            if (photo.get(i).getId() == id) {
                return photo.get(i);
            }
        }
        return null;
    }
}
