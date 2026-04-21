package daw;

import java.util.List;
import java.util.stream.Collectors;

public class StreamJava {
    
    public static void primerosCinco(List<Vehiculo> lista) {
        lista.stream()
                .limit(5)
                .forEach(v-> System.out.println(v));;
    }
}
