/*
Crear una clase Coche, a traves de la cual se pueda conocer el color del
coche, la marca, el modelo, el numero de caballos, el numero de puertas
y la matrıcula. Crear el constructor del coche, ası como los metodos que
considere necesarios.
Crear una clase PruebaCoche que instancie varios coches, cambiandole el
color a lo largo de la vida a algunos de ellos y mostrandolo por pantalla.
*/
package pruebacoche;

public class PruebaCoche {

    public static void main(String[] args) {
        //////Creamos los objetos
        Coche coche1 = new Coche("Blanco","Citroen","C3","1234-ABC",90,5);
        Coche coche2 = new Coche("Azul","Peugeot","206","4545-ABC",80,3);
        Coche coche3 = new Coche("Negro","Mecedes","220","5656-CBA",205,5);
        //////Mandamos a los objetos que se muestren en pantalla
        coche1.mostrarCoche();
        coche2.mostrarCoche();
        coche3.mostrarCoche();
        /////Cambiamos de color a un coche
        System.out.println("El Citroen ha cambiado de color despues de 1 año.");
        System.out.println("");
        
        coche1.cambiarColor("Rojo");
        /////Mostramos de nuevo el coche que hemos cambiado de color
        coche1.mostrarCoche();
    }
    
}
