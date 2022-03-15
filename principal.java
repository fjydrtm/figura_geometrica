import java.util.Scanner;
public class principal {
    public static void main(String[] arcs ){
        quadrado quadrado =new quadrado();
        System.out.println("Digite um lado");
        Scanner sc= new Scanner(System.in);
        quadrado.setLado(sc.nextDouble());
    
        sc.close();

    }
    
}
