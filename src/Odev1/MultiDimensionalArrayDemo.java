package Odev1;

public class MultiDimensionalArrayDemo {
    public static void main(String[] args) {
        String[][] sehirler=new String[3][3];

        sehirler[0][0]="Istanbul";
        sehirler[0][1]="Bursa";
        sehirler[0][2]="Bilecik";

        sehirler[1][0]="Ankara";
        sehirler[1][1]="Konya";
        sehirler[1][2]="Kayseri";

        sehirler[2][0]="Diyarbakr";
        sehirler[2][1]="Şanliurfa";
        sehirler[2][2]="Gaziantep";



        for(int i=0; i<=2; i++){
            System.out.println("------");
            for (int a=0; a<=2; a++){
                System.out.println(sehirler[i][a]);
            }
        }


    }
}