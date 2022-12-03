import java.util.Scanner;
import java.util.Random;

/*ZADANIE 1
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Jaka jest pogoda?");
        System.out.println("Wpisz czy świeci słońce i czy pada deszcz?");
        System.out.println("Wpisz true lub false i ponownie true lub false");

        boolean czświecisłońce = scan.nextBoolean();
        boolean czypadadeszcz = scan.nextBoolean();

        if (czświecisłońce == true && czypadadeszcz == true)
        {
            System.out.println("Tęcza");
        }
        else if(czświecisłońce == true && czypadadeszcz == false)
        {
            System.out.println("Słonecznie");
        }
        else if(czświecisłońce == false && czypadadeszcz == true)
        {
            System.out.println("Plucha");
        }
        else
        {
            System.out.println("Pochmurno");
        }
    }
}*/

//ZADANIE 4

/*public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj dwie liczby całkowite i  naciśnij ENTER po każdej z nich:");
        int liczba1 = scan.nextInt();
        int liczba2 = scan.nextInt();
        System.out.println("Wybierz działanie:");
        System.out.println("ADD - dodawanie");
        System.out.println("SUB - odejmowanie");
        System.out.println("DIV - dzielenie");
        System.out.println("MUL - mnożenie");
        String option = scan.next();
        switch (option){
            case "ADD":
                dodawanie(liczba1, liczba2);
                break;
            case "SUB":
                odejmowanie(liczba1, liczba2);
                break;
            case "DIV":
                dzielenie(liczba1, liczba2);
                break;
            case "MUL":
                mnozenie(liczba1, liczba2);
                break;
            default:
                System.out.println("Złe działanie!");
                break;
        }
    }

    public static void dodawanie(int a, int b) {
        int wynik;
        wynik = a + b;
        System.out.println("Wynik dodawania: " + wynik);
    }

    public static void odejmowanie(int a, int b) {
        int wynik;
        wynik = a - b;
        System.out.println("Wynik odejmowania: " + wynik);
    }

    public static void dzielenie(int a, int b) {
        int wynik;
        wynik = a / b;
        System.out.println("Wynik dzielenia: " + wynik);
    }

    public static void mnozenie(int a, int b) {
        int wynik;
        wynik = a * b;
        System.out.println("Wynik mnożenia: " + wynik);
    }
}*/

//ZADANIE 5

/*public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj dwie liczby całkowite i naciśnij ENTER po każdej z nich:");
        int liczba1 = scan.nextInt();
        int liczba2 = scan.nextInt();
        System.out.println("Wybierz działanie:");
        System.out.println("ADD - dodawanie");
        System.out.println("SUB - odejmowanie");
        System.out.println("DIV - dzielenie");
        System.out.println("MUL - mnożenie");
        String option = scan.next();
        switch (option){
            case "ADD":
                dodawanie(liczba1, liczba2);
                break;
            case "SUB":
                odejmowanie(liczba1, liczba2);
                break;
            case "DIV":
                dzielenie(liczba1, liczba2);
                break;
            case "MUL":
                mnozenie(liczba1, liczba2);
                break;
            default:
                System.out.println("Złe działanie!");
                break;
        }
    }

    public static void dodawanie(int a, int b) {
        int wynik;
        wynik = a + b;
        int wynik1 = Math.abs(wynik);
        System.out.println("Wynik dodawania: " + wynik1);
    }

    public static void odejmowanie(int a, int b) {
        int wynik;
        wynik = a - b;
        int wynik1 = Math.abs(wynik);
        System.out.println("Wynik odejmowania: " + wynik1);
    }

    public static void dzielenie(int a, int b) {
        int wynik;
        wynik = a / b;
        int wynik1 = Math.abs(wynik);
        System.out.println("Wynik dzielenia: " + wynik1);
    }

    public static void mnozenie(int a, int b) {
        int wynik;
        wynik = a * b;
        int wynik1 = Math.abs(wynik);
        System.out.println("Wynik mnożenia: " + wynik1);
    }
}*/

//ZADANIE 6

/*public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź dwie liczby rzeczywiste i naciśnij ENTER po każdej z nich:");
        float liczba1 = scan.nextFloat();
        float liczba2 = scan.nextFloat();
        zadanie(liczba1, liczba2);
    }

    public static void zadanie(float a, float b){
        float c;
        if (a>b){
            c=b;
            b=a;
            a=c;

            System.out.println("Wybrany przedział: [" + a + ", " + b + "]");
        }
        else {
            System.out.println("Wybrany przedział: [" + a + ", " + b + "]");
        }

        Random rd = new Random();
        float random1 = rd.nextFloat(b - a) + a;
        float random2 = rd.nextFloat(b - a) + a;
        float random3 = rd.nextFloat(b - a) + a;
        System.out.println("Wartości generowane losowo:");
        System.out.println(random1);
        System.out.println(random2);
        System.out.println(random3);

        if(random1>random2){
            c = random1;
            random1 = random2;
            random2 = c;
        }
        if(random2>random3){
            c = random2;
            random2 = random3;
            random3 = c;
        }
        if(random1>random2){
            c = random1;
            random1 = random2;
            random2 = c;
        }
        System.out.println("Gdzie: " + random1 + " < " + random2 + " < " + random3);

    }
}*/

//ZADANIE 8

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Witamy w kantorze!");
        System.out.println("Wybierz walutę:");
        System.out.println("    1 - PLN");
        System.out.println("    2 - JPY");
        int waluta = scan.nextInt();
        if(waluta<1 || waluta>2){
            System.exit(0);
        }
        System.out.println("Wprowadź kwotę:");
        int kwota = scan.nextInt();
        wymiana(waluta, kwota);

    }

    public static void wymiana(int a, int b){
        int wynik;
        if (a==1){
            System.out.println(b + " zł => " + b * 30.27 + " ¥");
        }
        else{
            System.out.println(b + " ¥ => " + b / 30.27 + " zł");
        }

    }
}




