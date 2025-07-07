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

    /**
     * Ejercicio 4
     * Dada una base y un exponentente, nos devuelve la potencia
     * @param base
     * @param exponente
     * @return
     */
    public static long potencia(int base, int exponente){
        //Si el exponente es 0, siempre devolvemos 1
        if (exponente == 0){
            return 1;
        }

        //En el caso de que exponente sea negativo, llamamaos a esta funcion
        //de manera recursiva
        if (exponente < 0){
            return 1 / potencia(base, -exponente);
        }

        //Inicializamos n como acumulador en 1, para poder multiplicar
        //en cada una de las iteraciones del ciclo.
        int n = 1;
        for (int i = 0; i < Math.abs(exponente); i++){
            n = n * base;
        }

        return n;
        
    }
    /**
     * Ejercicio 5
     * Devuelve como un numero entero, la cantiad de digitos del
     * numero ingresado
     * @param numero numero ingresado
     * @return cantidad de digitos
     */
    public static int digitos(int numero){
        //Si el numero es negativo, lo convertimos a positivo
        if(numero < 0){
            numero = -numero;
        }

        if (numero == 0){
            //retornamos un 1 cuando numero es 0
            //ya que no podemos dividir por 0
            return 1;
        } else {
            int n = 0;
            while (numero > 0){
                numero = numero / 10; // Le quita 1 digito a numero
                n++; //incrementa la cantidad de digitos
            }
            return n;
        }
    }
}
