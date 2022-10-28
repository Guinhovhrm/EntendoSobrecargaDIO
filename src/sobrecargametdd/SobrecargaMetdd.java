package sobrecargametdd;
public class SobrecargaMetdd {
    
    public static void main(String[] args) {
        // Calcule a area dos três quadrilateros notáveis
        /* criar metodos com o mesmo nome, o java sabe qual utilizar por base
        de parâmetros passados */
        area(3);
        area(4, 9);
        area(10, 5, 3);
    
    }
    public static void area (double lado){
        System.out.println("Área do quadrado: " + (lado * lado));
    }
    
    public static void area (double lado1, double lado2){
        System.out.println("Área do retângulo: " + (lado1 * lado2));
        
    }
    public static void area (double bsMaior, double bsMenor, double altura){
        System.out.println("Área do trapézio: " + (((bsMaior + bsMenor)*altura)/2));
        
    }      
}
