package Odev1;

public class StringClass {
    public static void main(String[] args) {
        String mesaj="Bugun hava cok guzel.";
        System.out.println(mesaj);

        System.out.println("Elemansayisi : "+mesaj.length());
        System.out.println("Besinci eleman : "+mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yasasin!"));
        System.out.println(mesaj.startsWith("Bu gun1"));
        System.out.println(mesaj.endsWith("!"));
        char[] karakterler=new char[5];
        mesaj.getChars(0,4,karakterler,0);
        System.out.println(karakterler);

        System.out.println(mesaj.indexOf('a'));
        System.out.println(mesaj.lastIndexOf("e"));
        String yenimesaj=mesaj.replace(" ", "-");
        System.out.println(yenimesaj);
        System.out.println(mesaj.substring(2));
        System.out.println(mesaj.substring(2,4));

        for (String kelime: mesaj.split(" ")){
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());
    }
}
