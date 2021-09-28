import java.util.*;

public class Principal {

    public static void main(String[] args) {
        Integer numeroMaximo = Integer.parseInt(args[0]);
        guardarNumerosPares(numeroMaximo);
    }
    private static void guardarNumerosPares(Integer numeroMaximo){
        int numero = 0;
        List<Integer> numerosPares = new ArrayList<>();
        while(numero <= numeroMaximo) {
            if(validarSeEPar(numero)) numerosPares.add(numero);
            numero++;
        }
    }
    private static Boolean validarSeEPar(Integer numero) {
        return numero % 2 == 0;
    }
}