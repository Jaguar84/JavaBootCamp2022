package Odev1;

public class switcConditionals {
    public static void main(String[] args) {
        char grade = 'F';

        switch (grade) {
            case 'A':
                System.out.println("Mukemmel: Gectiniz");
                break;
            case 'B':
                System.out.println("Cok guzel : Gectniz");
                break;
            case 'C':
                System.out.println("Iyi :  gectiniz");
                break;
            case 'D':
                System.out.println("Fena deyil : gectiniz");
                break;
            case 'F':
                System.out.println("Malasef : Kesildiniz");
                break;
            default:
                System.out.println("Gecersiz not girdiniz");
                break;

        }
    }

}
