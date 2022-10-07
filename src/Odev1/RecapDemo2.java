package Odev1;

public class RecapDemo2 {
    public static void main(String[] args) {
        //double[] myList=new double[4];
        double[] myList = {1.5, 3.5, 5.6, 1.3};
        double total = 0;
        double max = myList[0];

        for (double number : myList) {
            System.out.println(number);
        }

        for (double numbertotal : myList) {
            total += numbertotal;
        }

        System.out.println("Cem= " + total);

        for (double maxNumber : myList) {
            if (max < maxNumber) {
                max = maxNumber;
            }
        }
        System.out.println("En buyuk sayi: " + max);

    }
}
