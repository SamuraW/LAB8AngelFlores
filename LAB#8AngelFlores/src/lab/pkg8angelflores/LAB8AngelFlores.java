package lab.pkg8angelflores;

import java.util.Scanner;

public class LAB8AngelFlores {

    public static void main(String[] args) {

    }

    public static void play() {
       static GreatHouse atraidis = new (nombre; recursos; dinero; defensas);
       static GreatHouse harkonnen = new (nombre; recursos; dinero; defensas);
       static GreatHouse corrino = new (nombre; recursos; dinero; defensas);
       static atraidis.setNombre("atraidis");
       static atraidis.setDinero (300);
       static atraidis.setRecursos (200);
       static atraidis.setDefensas (300);
       static harkonnen.setNombre ("harkonnen");
       static harkonnen.setDinero (0);
       static harkonnen.setRecursos (300);
       static harkonnen.setDefensass(500);
       static corrino.setNombre ("corrino");
       static corrino.setDinero (0);
       static corrino.setRecursos(300);
       static corrino.setDefensas (500);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Reursos de Guerra:" + 200);
        System.out.println("Cantidad de dinero:" + 300);
        System.out.println("Defensas:" + 300);
        System.out.println("---------------------------------------------------");
        System.out.println("Ingrese una opcion");
        System.out.println("1) refinar especie");
        System.out.println("2)Reclutar legiones fremen");
        System.out.println("3) invertir en defensas");
        System.out.println("4) Estadisticas de casa corrino");
        System.out.println("5) estadisticas estadisticas de casa HARKONNEN");
        System.out.println("6) Ataque a las Grandes casas");
        int op = entrada.nextInt();
        switch (op) {
            case 1: {
                System.out.println("RefinarEspecie");
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                System.out.println("la casa atraidisi aumento sus defensas. La cantidad de defensas a aumentado por ");
                break;
            }
            case 4: {
                System.out.println("Estadisticcas de la casa corrino:");
                System.out.println("nombre"+"="+"corrino");
                System.out.println("recursos de guerra"+"="+300);
                System.out.println("dinero"+"="+0);
                System.out.println("Defensas"+"="+500);
                break;
            }
            case 5: {
                System.out.println("Estadisticcas de la casa HARKONNEN:");
                System.out.println("nombre"+"="+Harkonnen);
                System.out.println("recursos de guerra"+"="+300);
                System.out.println("dinero"+"="+0);
                break;
            }
            case 6: {
                break;
            }

            default:
                throw new AssertionError();
        }
    }
    public static void ataque (){

}


}
