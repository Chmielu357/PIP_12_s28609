import java.util.Scanner;


/*ZADANIE 1
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz liczbę całkowitą i naciśnij ENTER.");
        int l = scan.nextInt();
        liczby(l);

    }

    static void liczby(int l) {

        if(l>0) {
            for (int i = 0; i <= l; i++) {
                System.out.println(i);
            }
        }
        else{
            for (int i = 0; i >= l; i--) {
                System.out.println(i);
            }
        }
    }
}*/

/*ZADANIE 2
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz liczbę całkowitą i naciśnij ENTER.");
        int l = scan.nextInt();
        System.out.println(l+"-ty wyraz ciagu Fibonacciego: "+fibonacii(l));

    }

    static int fibonacii(int l) {
        if(l==0){
            return 0;
        }

        else if(l==1){
            return 1;
        }
        else{
            return fibonacii (l-1) + fibonacii (l-2);
        }
    }
}*/


//ZADANIE 3
/*public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz liczbę całkowitą i naciśnij ENTER.");
        int l = scan.nextInt();
        gwiazdki(l);

    }

    static void gwiazdki(int l) {

        if(l%2==0) {
            System.out.println("Gdzie n = " + (l-1));
            for (int i = 0; i <= l-1; i++) {
                for(int j=1; j <=i ; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else{
            for (int i = 0; i <= l; i++) {
                for(int j=1; j <=i ; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}*/


//ZADANIE 4
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj trzy liczby całkowite");
        System.out.print("X: ");
        int x = scan.nextInt();
        System.out.print("Y: ");
        int y = scan.nextInt();
        System.out.print("Z: ");
        int z = scan.nextInt();
        gwiazdki(x,y,z);

    }

    static void gwiazdki(int x, int y, int z) {

        int max=0;
        if(x>y && x>z){
            max=x;
        }
        else if (y>x && y>z) {
            max=y;
        }
        else{
            max=z;
        }

        for (int i = 0; i < max; i++) {
            if (x==max) {
                System.out.print("*");
            }
            else if((max - x) > 0){
                System.out.print(" ");
                x++;
            }
            else
                System.out.println("*");
            if (y==max) {
                System.out.print("*");
            }
            else if((max - y) > 0){
                System.out.print(" ");
                y++;
            }
            else
                System.out.println("*");
            if (z==max) {
                System.out.print("*");
            }
            else if((max - z) > 0){
                System.out.print(" ");
                z++;
            }
            else
                System.out.println("*");
            System.out.println();
        }
    }
}