/*
Crear una clase Coche, a traves de la cual se pueda conocer el color del
coche, la marca, el modelo, el numero de caballos, el numero de puertas
y la matrıcula. Crear el constructor del coche, ası como los metodos que
considere necesarios.
Crear una clase PruebaCoche que instancie varios coches, cambiandole el
color a lo largo de la vida a algunos de ellos y mostrandolo por pantalla.
 */
package pruebacoche;

public class Coche {
    
//Atributos del coche    
    
    String color, marca, modelo, matricula;
    int caballos, puertas;
//Creamos el constructor del coche
    public Coche(String color, String marca, String modelo, String matricula, int caballos, int puertas) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.caballos = caballos;
        this.puertas = puertas;
    }
//Geteers
    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getCaballos() {
        return caballos;
    }

    public int getPuertas() {
        return puertas;
    }
//Metodo para cambiar de color    
    public void cambiarColor(String color) {
        
        this.color=color;
        
    }
/////Metodo para mostrar el coche en pantalla    
    public void mostrarCoche() {
        System.out.println("CARACTERISIRICAS DEL COCHE:");
        System.out.println("COLOR: "+color);
        System.out.println("MARCA: "+marca);
        System.out.println("MODELO: "+modelo);
        System.out.println("MATRICULA: "+matricula);
        System.out.println("CABALLOS: "+caballos);
        System.out.println("PUERTAS: "+puertas);
        System.out.println("-------------------------------------------------");
                
    }


    
 
}
