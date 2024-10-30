package EjercicioTrece;

public class mainPrinMath {
    
        public static void main(String[] args) {
            math2 math2 = new math2();
          
            int[] intArray = {3, 5, 1, 4, 2};
            double[] doubleArray = {2.5, 3.1, 1.4, 4.8, 3.3};
    
            System.out.println("Mínimo en intArray: " + math2.min(intArray));
            System.out.println("Máximo en intArray: " + math2.max(intArray));
    
          //met doubles
            System.out.println("Mínimo en doubleArray: " + math2.min(doubleArray));
            System.out.println("Máximo en doubleArray: " + math2.max(doubleArray));
        }
    }
    

