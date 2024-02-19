package org.example;
/*
Woodall sayıları, matematiksel olarak ilginç bir yapıya sahip olan özel bir sayı dizisidir.Woodall sayıları, adını Amerikalı
matematikçi John L. Woodall'dan alır. Bu sayılar, asal sayılar gibi belirli bir matematiksel özellik taşıyan özel sayılardır.

Woodall sayıları, matematiksel teoriye katkıda bulunmak, sayılar arasındaki özel ilişkileri incelemek ve sayı teorisinin
derinliklerine inmek için kullanılır. Özellikle, asal sayılarla ilgili çalışmalar ve sayı teorisi araştırmaları için önemli
bir konudur.
*/
public class Main {
    public static void main(String[] args) {
        int n = 1;     // Başlangıç sayısı
        int count = 5; // Kaç Woodall sayısı bulunacağı

        for (int i = 0; i < count; i++) {
            long woodallNumber = calculateWoodallNumber(n);
            System.out.println("W_" + n + " = " + woodallNumber);
            n++;
        }
    }

    public static long calculateWoodallNumber(int n) {
        return (long) (n * Math.pow(2, n) - 1);
    }
}