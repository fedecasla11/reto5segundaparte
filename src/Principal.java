import fede.string;

import java.util.Scanner;
import java.lang.String;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);


        String telefono;



        System.out.println("Introduce Numero de teléfono: ");
        telefono=teclado.nextLine();


        while (telefono.length()<9 || telefono.length()>=10){


            System.out.println("número incorrecto vuelva a introducir Número de teléfono: ");
            telefono=teclado.nextLine();

        }

            if (telefono.length() >=9)

        {System.out.print("("+telefono.charAt(0)+telefono.charAt(1)+")"+
                "-"+telefono.charAt(2)+telefono.charAt(3)+telefono.charAt(4)+
                "-"+telefono.charAt(5)+telefono.charAt(6)+"-"+telefono.charAt(7)+telefono.charAt(8));


        }


    }
}
