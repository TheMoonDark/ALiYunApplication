package com.example.soulapplication.bean;
/**
 * Created by 郝德琛 haodechen
 */
public class HomeProject {
    private int image;
    private String text1;
    private String test2;

    public HomeProject(int image, String text1, String test2) {

        this.image = image;
        this.text1 = text1;
        this.test2 = test2;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getTest2() {
        return test2;
    }

    public void setTest2(String test2) {
        this.test2 = test2;
    }
}
