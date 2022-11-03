import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*Random generator,
         * Create tab size 10,
         * Draw elements 1-10 range, for your tab,
         * As next, calculate the average,
         */
        Random generator = new Random();

        int[] tab = new int[10];
        for (int i=0; i<tab.length; i++) {
            tab[i] = generator.nextInt(11);
        }
        wyswietl(tab);

        double srednia;
        int suma = 0;
        for (int liczba: tab) {
            suma += liczba;

        }
        System.out.println("\nSuma: " + suma);
        srednia = (double)suma/ tab.length;
        System.out.println("Srednia: " + srednia);


    }
    static void wyswietl(int[] tablica) {
        for( int elem: tablica) {
            System.out.print(elem+" " );
        }
    }

    }