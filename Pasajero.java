import java.util.ArrayList;

public class Pasajero{
    //atributos
    private String nombre;
    private String apellido;
    private long dni;
    private boolean pasaporte;
    private long num_pasaporte;
    private ArrayList<String> causas_penales;
    private double peso_del_equipaje;
    private Vuelo vuelo;
    
    //constructor
    public Pasajero(boolean pasaporte, long num_pasaporte, String nombre, String apellido, long dni, double peso_del_equipaje, Vuelo vuelo) {
        this.pasaporte = pasaporte;
        this.num_pasaporte = num_pasaporte;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso_del_equipaje = peso_del_equipaje;
        this.vuelo = vuelo;
        this.causas_penales = new ArrayList<>();
    }

    //getters
    public boolean isPasaporte() {
        return this.pasaporte;
    }

    public long getNum_pasaporte() {
        return this.num_pasaporte;
    }

    public ArrayList<String> getCausas_penales() {
        return new ArrayList<>(causas_penales);
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public long getDni() {
        return this.dni;
    }

    public double getPeso_del_equipaje() {
        return this.peso_del_equipaje;
    }

    public Vuelo getVuelo() {
        return this.vuelo;
    }
 
    


    
    
}
