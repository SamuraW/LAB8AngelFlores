package lab.pkg8angelflores;

import java.util.Random;
import java.util.Scanner;

public class GreatHouse {
    String nombre;
    int recursos;
    int dinero;
    int defensas;
    GreatHouse (String nombre, int recursos, int dinero, int defensas){
        this.nombre = nombre;
        this.recursos = recursos;
        this.dinero = dinero;
        this.defensas = defensas;
    }
    public static void refinar (){
        Scanner entrada = new Scanner (System.in);
        int tamano = 5;
        System.out.println("Ingrese la posicion donde desea la refineria:");
        int pos = entrada.nextInt ();
        char [] lista = new char [tamano];
        lista [pos] = 'R';
            
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRecursos() {
        return recursos;
    }

    public void setRecursos(int recursos) {
        this.recursos = recursos;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getDefensas() {
        return defensas;
    }

    public void setDefensas(int defensas) {
        this.defensas = defensas;
    }
    
    
}
