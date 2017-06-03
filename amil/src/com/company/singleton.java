package com.company;

/**
 * Created by 170101022 on 6/3/2017.
 */
public class singleton {
    public static final singleton instance=new singleton();

    private int x;

    public void setx(int x){
        this.x=x;
    }
    public int getX(){
        return x;
    }
    public int add (int val){
        x +=val;
        return x;
    }
    public static singleton getInstance(){
        return instance;
    }
}
