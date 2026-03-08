package POO.Level1.Banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int option;
        String helperPIN;

        Cajero cajero = new Cajero();
        ClientePerson dan = new ClientePerson("Daniela","301299");
        Cuenta c1 = new Cuenta(dan,"123-4554-324-1",7000000);

        System.out.println("------ Bienvenido "+dan.getName()+" ------");
        System.out.println("Ingresa tu clave PIN: ");
        helperPIN = reader.nextLine();

        if (helperPIN.equals(dan.getPin())) {
            System.out.println("Marca la opcion: ");
            System.out.println("Opcion 1: Ingresar dinero");
            System.out.println("Opcion 2: Retirar dinero");
            option = reader.nextInt();
            switch (option)  {
                case 1:
                    System.out.println("Ingresa el monto : ");
                    double montoAIngresar = reader.nextDouble();
                    cajero.ingresarDinero(dan,c1,montoAIngresar);
                    break;
                case 2:
                    System.out.println("Retirar el monto : ");
                    double montoAretirar = reader.nextDouble();
                    cajero.retirarDinero(dan,c1,montoAretirar);
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } else {
            System.out.println("Clave PIN incorrecto, finalzo programa");
        }




    }
}
