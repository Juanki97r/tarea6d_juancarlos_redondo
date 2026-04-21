package daw;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Vehiculo> vehiculos = LeerCsv.leerVehiculosDesdeCSV("vehiculos.csv");
       
        //1) 
        StreamJava.primerosCinco(vehiculos);
        

    }

    


}