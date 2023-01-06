import java.util.ArrayList;

public class Aeropuerto{
    private ArrayList<Aerolinea> aerolineas;
    private ArrayList<Vuelo> vuelos;
    private ArrayList<Pasajero> pasajeros;
    private ArrayList<Avion> aviones;
    private int cantidad_de_personas;
    
    //constructor
    public Aeropuerto(int cantidad_de_personas) {
        this.aerolineas = new ArrayList<>();
        this.vuelos = new ArrayList<>();
        this.pasajeros = new ArrayList<>();
        this.aviones = new ArrayList<>();
        this.cantidad_de_personas = cantidad_de_personas;
    }

    //getters
    public ArrayList<Aerolinea> getAerolineas() {
        return new ArrayList<>(aerolineas);
    }

    public ArrayList<Vuelo> getVuelos() {
        return new ArrayList<>(vuelos);
    }

    public ArrayList<Pasajero> getPasajeros() {
        return new ArrayList<>(pasajeros);
    }

    public ArrayList<Avion> getAviones() {
        return new ArrayList<>(aviones);
    }

    public int getCantidad() {
        return this.cantidad_de_personas;
    }

    //methods
    //adds

    //avion
    public void addAvion(Avion av){
        if(!aviones.contains(av)){
            aviones.add(av);
        }
    }
    //vuelo
    public void addVuelo(Vuelo vu){
        if(!vuelos.contains(vu)){
            vuelos.add(vu);
        }
    }
    //aerolinea
    public void addAerolinea(Aerolinea ae){
        if(!aerolineas.contains(ae)){
            aerolineas.add(ae);
        }
    }
    //pasajero
    public void addPasajero(Pasajero pas){
        if(!pasajeros.contains(pas)){
            pasajeros.add(pas);
        }
    }

    public void llamarPasajero(Pasajero pas){
        System.out.println("ULTIMO LLAMADO AL PASAJERO " + pas.getNombre() + " A LA PUERTA " + pas.getPuerta());
    }

    public 

    
    

   
    
}