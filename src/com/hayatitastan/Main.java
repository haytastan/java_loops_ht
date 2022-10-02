package com.hayatitastan;

/**
 * Created by Dr. Hayati TAŞTAN on $DATE
 */
public class Main {
    public static void main(String[] args) {

        //for loop:
        System.out.println("Tüm Sayılar (for loop):");
        for (int i=1; i<10; i++){ //i+=1 veya i= i+1
            System.out.println(i);
        }

        System.out.println("Çift Sayılar (for loop):");
        for (int i=2; i<10; i+=2){ //i=i+2
            System.out.println(i);
        }

        System.out.println("Tek Sayılar (for loop):");
        for (int i=1; i<10; i+=2){ //i=i+2
            System.out.println(i);
        }

        System.out.println("Tek Sayılar (geriye doğru) (for loop):");
        for (int i=9; i>0; i-=2){ //i=i-2
            System.out.println(i);
        }

        // while loop:
        System.out.println("Tüm Sayılar (while loop):");
        int i=1;
        while (i<10){
            System.out.println("Sayı = "+i);
            i++;
        }
        System.out.println("Çift Sayılar (while loop):");

        int j=2;
        while (j<10){
            System.out.println("Sayı = "+j);
            j+=2;
        }

        //do-while loop:
        System.out.println("Tüm Sayılar (do-while loop):");
        int k=1;
        do{
            System.out.println("Sayı = "+k);
            k++;
        }while (k<10);

    }
}
