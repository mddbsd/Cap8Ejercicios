package matematicas;

public class Varias {
    /**
     * Ejercicio 1
     * Los numeros capucua son aquellos que se leen igual
     * de dercha a izquierda o de izuierda a derecha
     * 
     * @param numero el numero a comprobar
     * @return devulelve falso cuando no es capicua
     */
    public static boolean  esCapicua(int numero){
        int aux, numeroInvertido;
        aux = numero;   
        numeroInvertido = 0;
        while(aux > 0){
            numeroInvertido = numeroInvertido + (aux % 10);
            numeroInvertido = numeroInvertido * 10;
            aux = (int)(aux /10);
        }
        numeroInvertido = numeroInvertido / 10;
        if (numeroInvertido == numero){
            return true;
        } else {
            return false;
        }
        
    }
}
