package Odev1;

import java.util.Scanner;

public class MiniProjeAsalSayi {
    public static void main(String[] args) {
        int number = 1;
        int remainder = number % 2;
        boolean isPrime = true;

//        System.out.println(remainder);
//        Scanner scanner=new Scanner(System.in);
//        int number=scanner.nextInt();
//        boolean asalsayi=false;

        if (number < 2) {
            System.out.println("Gecersiz sayi");
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }

        if (isPrime) {
            System.out.println("Sayi asaldir");
        } else {
            System.out.println("Sayi asal deyil");
        }
        }
    }


}
