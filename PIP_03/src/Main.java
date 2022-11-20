import java.util.Scanner;

public class Main {


    public static void pogoda(String czypada, String czyswiecislonce){

        if (czypada.equals("pada") && czyswiecislonce.equals("świeci słońce")){
            System.out.println("Tęcza");
        }
        if (czypada.equals("pada") && czyswiecislonce.equals("nie świeci słońce")){
            System.out.println("Plucha");
        }
        if (czypada.equals("nie pada") && czyswiecislonce.equals("świeci słońce")){
            System.out.println("Słonecznie");
        }
        if (czypada.equals("nie pada") && czyswiecislonce.equals("nie świeci słońce")){
            System.out.println("Pochmurno");
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Jaka jest dzisiaj pogoda?");
        System.out.println("Czy pada? Napisz pada lub nie pada");
        String czypada = scan.nextLine();
        System.out.println("Czy świeci słońce? Napisz świeci słońce lub nie świeci słońce.");
        String czyswiecislonce = scan.nextLine();
        pogoda(czypada, czyswiecislonce);

    }
}