package lab.pkg8angelflores;

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
