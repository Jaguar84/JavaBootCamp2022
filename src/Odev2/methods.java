package Odev2;


public class methods {

    public static void main(String[] args) {
        sayiBulmaca(9);
    }

    public  static void sayiBulmaca(int arananSayi){

        int[] sayilar=new int[]{1,2,5,7,9,0};
//         int arancak=6;
         boolean varMi=false;
            String cevab;
         for(int sayi: sayilar){
             if(sayi==arananSayi){
                 varMi=true;
                 break;
             }
         }

        if(varMi){
            mesajVer("Sayi mevcutdur: "+arananSayi);
        }else{
            mesajVer("Sayi mevcut deyil: "+arananSayi);
        }

    }

    public  static void mesajVer(String mesaj){
        System.out.println(mesaj);

    }
}
