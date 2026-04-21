package daw;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
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
    // 4
    public static List<Vehiculo> ordenarPorAnio(List<Vehiculo> lista) {
        return lista.stream()
                .sorted(Comparator.comparingInt(Vehiculo::getVehicle_year))
                .collect(Collectors.toList());
    }

    // 5
    public static List<Vehiculo> saltar10Limit5(List<Vehiculo> lista) {
        return lista.stream()
                .skip(10)
                .limit(5)
                .collect(Collectors.toList());
    }

    // 6
    public static boolean existeColorVerde(List<Vehiculo> lista) {
        return lista.stream()
                .anyMatch(v -> "Green".equalsIgnoreCase(v.getVehicle_color()));
    }

    // 7
    public static boolean todosDesde1990(List<Vehiculo> lista) {
        return lista.stream()
                .allMatch(v -> v.getVehicle_year() >= 1990);
    }

    // 8
    public static long contarFord(List<Vehiculo> lista) {
        return lista.stream()
                .filter(v -> "Ford".equalsIgnoreCase(v.getVehicle_make()))
                .count();
    }

    // 9
    public static OptionalInt anioMasPequenio(List<Vehiculo> lista) {
        return lista.stream()
                .mapToInt(Vehiculo::getVehicle_year)
                .min();
    }

    // 10
    public static Set<String> coloresPost2010(List<Vehiculo> lista) {
        return lista.stream()
                .filter(v -> v.getVehicle_year() > 2010)
                .map(Vehiculo::getVehicle_color)
                .collect(Collectors.toSet());
    }

    // 11
    public static Map<String, Long> contarPorColor(List<Vehiculo> lista) {
        return lista.stream()
                .collect(Collectors.groupingBy(
                        Vehiculo::getVehicle_color,
                        Collectors.counting()
                ));
    }

    // 12
    public static Map<String, List<Vehiculo>> agruparPorMatricula(List<Vehiculo> lista) {
        return lista.stream()
                .collect(Collectors.groupingBy(
                        Vehiculo::getVehicle_license_plate
                ));
    }
}
