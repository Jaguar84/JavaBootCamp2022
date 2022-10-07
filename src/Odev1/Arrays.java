package Odev1;

public class Arrays {
    public static void main(String[] args) {
        String[] ogrenciler= new String[3];
        ogrenciler[0]="Nusret";
        ogrenciler[1]="Fikret";
        ogrenciler[2]="Eli";

        int arrayLength=ogrenciler.length;
        for(int i=0; i<arrayLength; i++){
            System.out.println("Ad : "+ogrenciler[i]);
        }

        for (String ogrenci: ogrenciler){
            System.out.println(ogrenci);
        }

    }
}
