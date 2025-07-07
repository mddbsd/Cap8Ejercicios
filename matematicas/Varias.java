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
    /**
     * Los numeros primos son aquellos numeros que solo son divisibles por si mismos
     * y por 1. Tomamos el numero inicial, y vamos didiviendo por todos sus numeros
     * anteriores. Si el modulo de alguna de estas divicios, nos da 0, entonces
     * el numero ya no es primo
     * @param numero numero inicial
     * @return verdadero cuando es primo, falso cuano no es
     */
    public static boolean esPrimo(int numero){
        if (numero < 2){
            return false;
        } else {
            for (int i = numero / 2; i >= 2; i--){
                if (numero % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
    /**
     * Ejercicio 3
     * Devuelve el siguiente numero primo del numero ingresado
     * @param numero numero ingresado
     * @return
     */
    public static int siguientePrimro(int numero){
        //++numero, incrementa el numero antes de enviarlo a la funcion
        //para que no devuelva el mismo numero inicial en el caso de que este sea primo
        while(!esPrimo(++numero)){
            //No ejecutamos nada dentro del bucle, simplemente
            //incrementamos el valor de numero en los argumentos de la funcion
        };
        return numero;
    }
}
