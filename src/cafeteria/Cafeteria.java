package cafeteria;

import java.util.Scanner;

public class Cafeteria {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int op = 1, tot = 0;
        String res = "Si";
        System.out.println("Pones el perro menú");
       do {
            System.out.println("Eleccion:");
            op = in.nextInt();
            switch (op) {
                case 1:
                    tot+=25;
                    break;
                case 2:
                    tot+=20;
                    break;
                case 3:
                    tot+=30;
                    break;
                case 4:
                    tot+=35;
                    break;
                case 5:
                    tot+=40;
                    break;
                default:
                    System.out.println("Seleccion invalida");
                    break;
            }
            System.out.println("Otra?");
            System.out.println("Si/No");
            res = in.next();
        } while (res.equalsIgnoreCase("Si"));
        System.out.println("Total: " + tot);
    }

}
