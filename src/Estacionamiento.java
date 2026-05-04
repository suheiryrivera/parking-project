import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Estacionamiento {

    //Requisitos para el estacionamiento implementados como pide la rubrica
    private Set<Espacio> espaciosDisponibles;
    private LinkedList<String> historial;
    private HashMap<Auto, Espacio> reservas;
    private Stack<String> undo;
    private Queue<String> listaEspera;

    public Estacionamiento() {

        espaciosDisponibles = new HashSet<>();
        historial = new LinkedList<>();
        reservas = new HashMap<>();
        undo = new Stack<>();
        listaEspera = new LinkedList<>();
    }


}
