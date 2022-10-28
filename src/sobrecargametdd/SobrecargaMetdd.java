package sobrecargametdd;
public class SobrecargaMetdd {
    
    public static void main(String[] args) {
        // Calcule a area dos três quadrilateros notáveis
        /* criar metodos com o mesmo nome, o java sabe qual utilizar por base
        de parâmetros passados */
        double areaQuad = area(3);
        System.out.println("Área do quadrado: " + areaQuad);
        double areaRet = area(4, 9);
        System.out.println("Área do retângulo: " + areaRet);
        double areaTrap = area(10, 5, 3);
        System.out.println("Área do trapézio: " + areaTrap);
                
//      código de sobrecarga
//
//        area(3);
//        area(4, 9);
//        area(10, 5, 3);
//    
    }
    //Codigo dos metodos com retorno
    public static double area (double lado){
        
        return lado*lado;
    }
    
    public static double area (double lado1, double lado2){
             
        return (lado1 * lado2);      
    }
    public static double area (double bsMaior, double bsMenor, double altura){
      
        return ((bsMaior + bsMenor)*altura/2);
    }      
//    Codigo dos metodos de sobrecarga
//    
//    public static void area (double lado){
//        System.out.println("Área do quadrado: " + (lado * lado));
//    }
//    
//    public static void area (double lado1, double lado2){
//        System.out.println("Área do retângulo: " + (lado1 * lado2));
//        
//    }
//    public static void area (double bsMaior, double bsMenor, double altura){
//        System.out.println("Área do trapézio: " + (((bsMaior + bsMenor)*altura)/2));
//        
//    }
}
