package Semana_2;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;


public class LecturaSensor {
    private String id;
    private double valor;
    private String tipo;
    private LocalDateTime timestamp;


    public LecturaSensor(String id, double valor, String tipo, LocalDateTime timestamp){
        this.id=id;
        this.valor=valor;
        this.tipo=tipo;
        this.timestamp=timestamp;

    }
//Gets
    public String getId(){
        return id;
    }
    public double getValor(){
        return valor;
    }
    public String getTipo(){
        return tipo;
    }
    public LocalDateTime getTimestamp(){
        return timestamp;
    }



    public static void main(String[] args){
    List<LecturaSensor> lectura = new ArrayList<>();
    lectura.add(new LecturaSensor("1", 23.5, "Temperatura", LocalDateTime.now()));
    lectura.add(new LecturaSensor("2", 18.2, "Luz", LocalDateTime.now().minusHours(5)));
    lectura.add(new LecturaSensor("3", 30.1, "Temperatura", LocalDateTime.now().minusHours(30)));
    lectura.add(new LecturaSensor("4", 50.0, "Luz", LocalDateTime.now().minusHours(2)));

    String Buscartipo= "Luz";

    List<LecturaSensor> filtrar = lectura.stream()
    .filter(l -> l.getTipo().equalsIgnoreCase(Buscartipo))
    .collect(Collectors.toList());

    LocalDateTime hace24hrs = LocalDateTime.now().minusHours(24); //de 0h a 24h

    double medio = lectura.stream()
    .filter(l -> l.getTimestamp().isAfter(hace24hrs))
    .mapToDouble(l -> l.getValor())
    .average() //calcula el promedio
    .orElse(0.0);//si no hay registros devuelve 0,0 //Es como if else

    LecturaSensor LecturaMax = lectura.stream()
    .max((l1,l2) -> Double.compare(l1.getValor(), l2.getValor()))
    .orElse(null);


    }

}
