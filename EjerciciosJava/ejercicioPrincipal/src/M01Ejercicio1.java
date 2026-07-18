import java.util.Scanner;

class M01Ejercicio1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        String nom = sc.nextLine();

        System.out.println("Cual es su edad: ");
        byte edad = sc.nextByte();

        System.out.println("cual es su nota final? ");
        float nota = sc.nextFloat();

        System.out.println("Le gusta programar? (true/ false)");
        boolean programa = sc.nextBoolean();

        System.out.printf("Hola "+nom+" tienes "+edad+" años y tu" +
                " nota final es "+nota+" tambien se sabe que " +
                "programar "+programa+" te gusta!");

    }
}
