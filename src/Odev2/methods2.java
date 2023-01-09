package Odev2;

public class methods2 {
    public static void main(String[] args) {
        String mesaj="Bugun hava cok guzel";
        String yeniMesaj=sehirVer("Istanbul");
        System.out.println(yeniMesaj);
        int sayi=topla(3,5);
        int sayi1=topla2(2,3,4,5,6,10);

        System.out.println(sayi1);

    }

    public static void ekle(){
        System.out.println("Eklendi");
    }

    public static  void sil(){
        System.out.println("Silindi");
    }

    public  static void guncelle(){
        System.out.println("Guncellendi");
    }

    public  static  int topla(int a, int b){
        return a+b;
    }

    public  static int topla2(int... sayilar){
        int toplam=0;
        for(int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }


    public static  String sehirVer(String sehirAdi){
        return  sehirAdi;
    }
}
