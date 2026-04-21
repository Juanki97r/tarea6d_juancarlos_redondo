package daw;

import java.io.FileReader;
import java.io.IOException;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.util.ArrayList;
import java.util.List;

public class LeerCsv {
      
    public static void main(String[] args)  {
        
        String archivo = "vehiculos.csv";
        try (CSVReader reader = new CSVReader(new FileReader(archivo))) {
            String[] linea;
            // Lee línea por línea
            while ((linea = reader.readNext()) != null) {
                for (String campo : linea) {
                    System.out.print(campo + " | ");
                }
                System.out.println();
            }
        } catch (IOException | CsvValidationException  e) {
            e.printStackTrace();
        }
    }

    public static List<Vehiculo> leerVehiculosDesdeCSV(String archivo) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(archivo))) {
            String[] linea;
            // Lee línea por línea
            while ((linea = reader.readNext()) != null) {
                if (linea.length == 6) { // Asegura que hay 6 campos
                    String make = linea[0];
                    String model = linea[1];
                    int year = Integer.parseInt(linea[2]);
                    String vin = linea[3];
                    String color = linea[4];
                    String licensePlate = linea[5];
                    Vehiculo vehiculo = new Vehiculo(make, model, year, vin, color, licensePlate);
                    vehiculos.add(vehiculo);
                }
            }

        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
    
    }
        return vehiculos;
}    

}


