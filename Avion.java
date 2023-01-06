import java.time.LocalDate;

public class Avion {
    //atributos
    private long nro_serie;
    private String tipo;
    private int capacidad;
    private int antiguedad;
    private LocalDate ultimo_mantenimiento;
    
    //constructor
    public Avion(long nro_serie, String tipo, int capacidad, int antiguedad, LocalDate ultimo_mantenimiento) {
        this.nro_serie = nro_serie;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.antiguedad = antiguedad;
        this.ultimo_mantenimiento = ultimo_mantenimiento;
    }

    //getters
    public long getNro_serie() {
        return nro_serie;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public LocalDate getUltimo_mantenimiento() {
        return ultimo_mantenimiento;
    }

    //methods
    public void despegar(){
        System.out.println("Despegando...!");
    }

    public void aterrizar(){
        System.out.println("Aterrizando...!");
    }

    

    

    
}
