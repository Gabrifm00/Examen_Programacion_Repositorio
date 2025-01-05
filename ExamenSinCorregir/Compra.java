package fernandezGabriel20241213;

public class Compra {
    public static void main(String[] args) {
        /*Debería pedir 5 valores pero no sé pedirlos por pantalla, azul: \u001B[34m.  Rojo: \u001B[31m*/
        String elemento1 = "Bacon";
        String elemento2 = "Huevos";
        String elemento3 = "Pan";
        String elemento4 = "Pollo";
        String elemento5 = "Aceite";
        /* String elemento6 = System.in.read("Escribe un primer elemento de la lista"); */
        /*Debería mostrar en azul 4 y el 5 en rojo */
        System.out.println("El primer elemento de la lista es el: " + elemento1 + "\nEl segundo elemento de la lista es el: " + elemento2 + "\nEl tercero elemento de la lista es el: " + elemento3 + "\nEl cuarto elemento de la lista es el: " + elemento4 + "\nEl quinto elemento de la lista es el: " + elemento5);
        System.out.println("Le deseo una feliz compra!");
    }
}
