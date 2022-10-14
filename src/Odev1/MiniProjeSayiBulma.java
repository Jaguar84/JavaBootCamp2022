package Odev1;

public class MiniProjeSayiBulma {
    public static void main(String[] args) {
        int[] sayilar=new int[]{1,2,5,7,9,0};
        int aranacaq=5;

        boolean Found=false;

        for (int sayi: sayilar){
            if(sayi==aranacaq){
                Found=true;
            }
        }

        if(Found){
            System.out.println("Sayi mevcut");
        }else{
            System.out.println("Sayi mevcut deyildir!");
        }
    }
}
