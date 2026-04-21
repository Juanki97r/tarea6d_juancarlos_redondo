package daw;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamJava {
    //1
    public static void primerosCinco(List<Vehiculo> lista) {
        lista.stream()
                .limit(5)
                .forEach(v-> System.out.println(v));;
    }
    //2
     public static void vehiculos2012(List<Vehiculo> lista) {
        lista.stream()
                .filter(v -> v.getVehicle_year() == 2012)
                .forEach(System.out::println);
    }
    //3
    public static Set<String> marcasDistintas(List<Vehiculo> lista) {
        return lista.stream()
                .map(Vehiculo::getVehicle_make)
                .collect(Collectors.toSet());
    }
}
