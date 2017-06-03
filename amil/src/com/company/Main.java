package com.company;

public class Main {

    public static void main(String[] args) {

	singleton.getInstance().add(5);
	singleton.getInstance().add(5);
        System.out.println(singleton.getInstance().getX());

    }
}
