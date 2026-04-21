package daw;

import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        
        List<Vehiculo> vehiculos = LeerCsv.leerVehiculosDesdeCSV("vehiculos.csv");
       
        //1)
        System.out.println("----------1---------------");
        StreamJava.primerosCinco(vehiculos);
        //2
         System.out.println("----------2---------------");
        StreamJava.vehiculos2012(vehiculos);
        //3
         System.out.println("----------3---------------");
        Set<String> marcasDistintas = StreamJava.marcasDistintas(vehiculos);
        for (String m : marcasDistintas) {
            System.out.println(m);
        }
        //4
        System.out.println("----------4---------------");
        List<Vehiculo> ordenadoPorAnio = StreamJava.ordenarPorAnio(vehiculos);
        for (Vehiculo v : ordenadoPorAnio) {
            System.out.println(v);
        }
        //5
        System.out.println("----------5---------------");
        List<Vehiculo> saltar10 = StreamJava.saltar10Limit5(ordenadoPorAnio);
        for (Vehiculo vehiculo : saltar10) {
            System.out.println(vehiculo);
        }
        //6
        System.out.println("----------6---------------");
        boolean verde = StreamJava.existeColorVerde(vehiculos);
        System.out.println(verde);
        //7
        System.out.println("----------7---------------");
        boolean todos1990 = StreamJava.todosDesde1990(vehiculos);
        System.out.println(todos1990);
        //8
        System.out.println("----------8---------------");
        long cantidadFord = StreamJava.contarFord(vehiculos);
        System.out.println(cantidadFord);
        //9
        System.out.println("----------9---------------");
        OptionalInt menorAnio = StreamJava.anioMasPequenio(vehiculos);
        System.out.println(menorAnio);
        //10
        System.out.println("----------10---------------");
        Set<String> coloresPost2010 = StreamJava.coloresPost2010(vehiculos);
        for (String color : coloresPost2010) {
            System.out.println(color);
        }
        //11
        System.out.println("----------11---------------");
        Map<String,Long> contarPorColor = StreamJava.contarPorColor(vehiculos);
        contarPorColor.forEach((key,value)->{
            System.out.println("Color: " + key + " , Cantidad: "+ value);
        });

        //12
        System.out.println("----------12---------------");
        Map<String,List<Vehiculo>> porMatricula = StreamJava.agruparPorMatricula(vehiculos);
        porMatricula.forEach((key,value)->{
            System.out.println("Matrícula: \n "+key+", Vehiculo: "+value );
            
        });
    }

    


}