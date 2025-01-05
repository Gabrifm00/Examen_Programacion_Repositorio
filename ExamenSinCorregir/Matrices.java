package fernandezGabriel20241213;

import java.lang.reflect.Array;

public class Matrices {
    public static void main(Array[] args) {
        /*int ncolum = System.in.read("Escribe el número de columnas desadas: "); */
        /*int nfila = System.in.read("Escribe el número de filas deseadas: "); */
        int ncolum = 2;
        int nfila = 2;
        int cont = 1;/*Creo un contador que me servirá para darle valor a las celdas de la matriz a continuación */
        array matriz = (nfila,ncolum);/*Aquí quería crear la matriz con el número de columas y filas proporcionadas por el usuario */
        for (int i = 0; i < ncolum; i++) {/*Con este for quiero que paso por todas las columnas del array */
            int suma = 0;/*Con esto declaro la variable de suma que me pide el ejercicio y al incluirla en el for se reseteará sola cada vez que pase de columna */
            for (int index = 0; index < nfila; index++) {/*Con este for dentro del anterior pasará por todas las posiciones de la columna por la que vaya según el anterior for */
                Array[i,index] = cont;/*Aquí asigno el valor de cont a la posición de la matriz por la que vaya mi doble bucle */
                cont ++;/*Con esto consigo que por cada posición del contador de un número más que la anterior celda como me pide el ejercicio */
                suma = suma + array(i,index);/*Aquí aprovecho el doble bucle para ir sumando los valores de cada posición de las columnas como me pide el 3er punto */
            }
            System.out.println("La columna " + i + "suma en total: " + suma);
        }
        for (int i = 0; i < nfila; i++) {
            int suma = 0;
            for (int index = 0; index < ncolum; index++) {/*Con este doble for igual que el anterior pero pasando por todas las posiciones de las filas en vez de las columnas busco mostrar la suma de todas las filas */
                suma = suma + array(i,index);
            }
            System.out.println("La fila " + i + "suma en total: " + suma);/*Con este print se debería mostrar la suma de cada una de las filas */
        }
    }
}
