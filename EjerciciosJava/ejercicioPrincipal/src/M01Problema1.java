import java.util.Scanner;
class M01Problema1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre completo: ");
        String nom = sc.nextLine();

        System.out.println("Ingrese su edad: ");
        byte edad = sc.nextByte();
        sc.nextLine();//Si no fuera por esta linea tendria problemas porque eso hace que haga un salto de linea cuando es numerico.

        System.out.println("De que ciudad eres?");
        String ciu = sc.nextLine();

        System.out.println("Cual es tu Lenguaje de Programacion favorito?");
        String lp = sc.nextLine();

        System.out.println("==================");
        System.out.println(nom);
        System.out.println("==================");
        System.out.println("Edad: "+ edad +" años");
        System.out.println("Ciudad: "+ ciu);
        System.out.println("Lenguaje Favorito: "+lp);
    }
}
