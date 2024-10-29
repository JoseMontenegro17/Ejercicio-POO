public class pruebTriangulo {
    public class Prueba {
        public static void main(String[] args) {
          
            Triangulo t1 = new Triangulo(10, 8);
            Triangulo t2 = new Triangulo(5, 12);
    
            System.out.println("Triángulo 1 - Base: " + t1.getBase() + ", Altura: " + t1.getAltura());
            System.out.println("Triángulo 2 - Base: " + t2.getBase() + ", Altura: " + t2.getAltura());
    
            System.out.println("Área del Triángulo 1: " + t1.calcularArea());
            System.out.println("Área del Triángulo 2: " + t2.calcularArea());
    
            t1.setBase(15);
            t1.setAltura(10);
            t2.setBase(7);
            t2.setAltura(14);
    
            
            System.out.println("\nDespués de cambiar los valores:");
            System.out.println("Triángulo 1 - Base: " + t1.getBase() + ", Altura: " + t1.getAltura());
            System.out.println("Área del Triángulo 1: " + t1.calcularArea());
    
            System.out.println("Triángulo 2 - Base: " + t2.getBase() + ", Altura: " + t2.getAltura());
            System.out.println("Área del Triángulo 2: " + t2.calcularArea());
        }
    }
    
}
