import java.time.LocalDate;

public class Vuelo {
    //atributos
    private String id;
    private LocalDate fechaSalida;
    private LocalDate fechaLlegada;
    private double horaSalida;
    private double horaLlegadaEstimada;
    private int puerta;
    private String piloto;

    //constructor
    public Vuelo(String id, LocalDate fechaSalida, LocalDate fechaLlegada, double horaSalida, double horaLlegadaEstimada, int puerta, String piloto){
        this.id = id;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
        this.horaSalida = horaSalida;
        this.horaLlegadaEstimada = horaLlegadaEstimada;
        this.puerta = puerta;
        this.piloto = piloto;
    }

    //getters
    public String getId() {
        return id;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public LocalDate getFechaLlegada() {
        return fechaLlegada;
    }

    public double getHoraSalida() {
        return horaSalida;
    }

    public double getHoraLlegadaEstimada() {
        return horaLlegadaEstimada;
    }

    public int getPuerta() {
        return puerta;
    }

    public String getPiloto() {
        return piloto;
    }

    

    
}
