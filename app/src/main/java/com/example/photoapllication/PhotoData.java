package com.example.photoapllication;

import java.util.ArrayList;

public class PhotoData {
    public static ArrayList<Photo> generatePhotoData() {
        ArrayList<Photo> photos = new ArrayList<>();
        photos.add(new Photo(1,"https://i.pinimg.com/736x/8c/53/b0/8c53b0d63904e01025229f3a842e925d.jpg", "Eren Yeager", "The Attack Titan"));
        photos.add(new Photo(2,"https://2.bp.blogspot.com/--Hz7MzXUPyc/UpQX4OISU5I/AAAAAAAAA74/TVfpYK5vkxI/s640/Mikasa_Ackerman_PAMBAH.Corps.png","Miaksa Ackerman", "Strongest women of Paradise"));
        photos.add(new Photo(3, "https://www.anime-internet.com/content/images/size/w2000/wordpress/2021/02/c2180b854c81945835d05aad85a6d89b.jpg", "Levi Ackerman", "Strongest man of Paradise"));
        photos.add(new Photo(4,"https://i.pinimg.com/236x/54/ed/af/54edaff93298cc78df9748f22c81e6d9.jpg?nii=t","Reiner Braun", "The Armored Titan"));
        photos.add(new Photo(5,"https://i.redd.it/zicclmbmffb61.jpg", "Ymir","The first Founding Titan"));
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
