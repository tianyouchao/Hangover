package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner longlength=new Scanner(System.in);
        double longa= longlength.nextDouble();
        double sum=0;
        if(longa==0){
            return;
        }
        for (int i = 0; i < 800; i++) {
            sum = sum + 1.0 / (i + 2);
            if (sum > longa) {
                System.out.println((i + 1) + " card(s)");
                break;
            }
        }
    }
}