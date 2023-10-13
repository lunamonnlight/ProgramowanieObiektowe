import java.awt.desktop.SystemSleepEvent;
import java.sql.Connection;
import java.util.*;
import java.util.function.DoubleToIntFunction;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static Random random = new Random();


    public static void main(String[] args) {
        generateRandomInt();
        System.out.println(generateRandomInt());
        System.out.println(generateRandomDouble());
        int[] tab = {61, 33, 86, 28, 9, 16, 267, 10, 18, 11};
        System.out.println(Arrays.stream(tab).min().getAsInt());

        ArrayList<Integer> listaliczb = new ArrayList<>();
        listaliczb.add(5);
        ArrayList<Double> tablica = new ArrayList<>(Double);
        for (int i = 0; i < 10; i++) {
            tablica.add(generateRandomDouble());
        }
        piramida();
        System.out.println(generateRandomGaussian());
        System.out.println(generateRandomBoolean());
        WyswietlanieTablicy(tab);
        System.out.println(" --------");
        tablicado20();
        System.out.println(" --------");
        najwiekszanajmniejsza();
        System.out.println(" --------");
        bananowy();
        System.out.println(" --------");
        reverse();
        System.out.println(" --------");
        listaOdwr();
        System.out.println("---------");
        average();
        System.out.println("---------");
        System.out.println(countZeros());


    }

    public static int generateRandomInt() {
        return random.nextInt();
    }

    public static double generateRandomDouble() {
        return random.nextDouble();
    }

    public static void piramida() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj znak");
        String znak = scanner.next();
        System.out.println("Podaj wysokosc:");
        int wysokosc = scanner.nextInt();

        for (int i = 0; i < wysokosc; i++) {
            int liczbaSpacji = wysokosc - 1 - i;
            int liczbaZnakow = 2 * i + 1;

            StringBuilder sb = new StringBuilder();
            while (liczbaSpacji-- > 0) {
                sb.append(' ');
            }
            while (liczbaZnakow-- > 0) {
                sb.append(znak);
            }
            String doWypisania = sb.toString();
            System.out.println(doWypisania);
        }
    }


    public static double generateRandomGaussian() {
        double wynik = random.nextGaussian();
        return wynik;

    }

    public static boolean generateRandomBoolean() {
        boolean wynik = random.nextBoolean();
        return wynik;
    }

    public static void WyswietlanieTablicy(int[] tab) {
        for (int i = tab.length - 1; i >= 0; i--) {
            System.out.println(tab[i]);
        }
    }

    public static void tablicado20() {
        int[] arr = new int[20];
        int suma = 0;
        for (int i = 0; i < 20; i++) {
            arr[i] = random.nextInt(1, 100);
            suma += i;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.printf(arr[j] + ",");
        }
        double srednia = suma / 20;
        System.out.println("Srednia: " + srednia);
    }

    public static void najwiekszanajmniejsza() {
        int[] arr = new int[15];
        for (int i = 0; i < 15; i++) {
            arr[i] = random.nextInt(1, 100);

        }
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        for (int j = 0; j < arr.length; j++) {
            System.out.printf(arr[j] + ",");
        }
        System.out.println(" ");
        System.out.println("Max: " + max + " min: " + min);
    }

    public static void bananowy() {
        String str = "bananowy";
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {

            if (result.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch);
            }

        }
        System.out.println(result);
    }

    public static void reverse() {
        String str = "wyraz";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        System.out.println(sb.reverse());

    }

    public static void listaOdwr() {
        ArrayList<Integer> listaliczb = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listaliczb.add(generateRandomInt());
        }

        for (int j = listaliczb.size() - 1; j >= 0; j--) {
            int a = listaliczb.get(j);
            System.out.printf(a + ",");

        }
        System.out.println(" ");
        System.out.println(listaliczb);


    }

    public static void average() {

    }

    public static int countZeros(ArrayList<Integer> tablica) {
        int LiczbaZer = 0;
        for (int i = 0; i < tab.size(); i++) {
            if (tab.get(i) == 0) {
                LiczbaZer++;
            }

        }
        return LiczbaZer;
    }
}
