package Odev1;

public class RecapDemo1 {
    public static void main(String[] args) {
        int sayi1=20;
        int sayi2=25;
        int sayi3=200;

        int enBuyuksayi=sayi1;

        if(enBuyuksayi<sayi2){
            enBuyuksayi=sayi2;
        }

        if(enBuyuksayi<sayi3){
            enBuyuksayi=sayi3;
        }
        System.out.println(enBuyuksayi);
    }
}
