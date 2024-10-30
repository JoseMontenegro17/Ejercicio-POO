package EjercicioOnce;

public class Main {
    public static void main(String[] args) {
       
        ProductoFresco fresco1 = new ProductoFresco("2024-12-01", "F001", "2023-11-01", "España");
        ProductoFresco fresco2 = new ProductoFresco("2024-11-01", "F002", "2023-10-01", "Italia");

        
        ProductoRefrigerado refrigerado1 = new ProductoRefrigerado("2024-12-01", "R001", "1234", "2023-11-01", "4°C", "España");
        ProductoRefrigerado refrigerado2 = new ProductoRefrigerado("2024-11-01", "R002", "5678", "2023-10-01", "5°C", "Francia");
        ProductoRefrigerado refrigerado3 = new ProductoRefrigerado("2024-10-01", "R003", "9012", "2023-09-01", "6°C", "Alemania");

   
        ProductoCongeladoPorAire congeladoAire1 = new ProductoCongeladoPorAire("2024-12-01", "CA001", "2023-11-01", "España", "-20°C", "80% N2, 15% O2, 3% CO2, 2% H2O");
        ProductoCongeladoPorAire congeladoAire2 = new ProductoCongeladoPorAire("2024-11-01", "CA002", "2023-10-01", "Italia", "-20°C", "75% N2, 20% O2, 3% CO2, 2% H2O");
        ProductoCongeladoPorAgua congeladoAgua1 = new ProductoCongeladoPorAgua("2024-12-01", "CA003", "2023-11-01", "España", "-20°C", 5.0);
        ProductoCongeladoPorAgua congeladoAgua2 = new ProductoCongeladoPorAgua("2024-11-01", "CA004", "2023-10-01", "Italia", "-20°C", 6.0);
        ProductoCongeladoPorNitrogeno congeladoNitrogeno1 = new ProductoCongeladoPorNitrogeno("2024-12-01", "CN001", "2023-11-01", "España", "-20°C", "Criogenización", 30);

        
        System.out.println(fresco1.mostrarInfo());
        System.out.println(fresco2.mostrarInfo());
        System.out.println(refrigerado1.mostrarInfo());
        System.out.println(refrigerado2.mostrarInfo());
        System.out.println(refrigerado3.mostrarInfo());
        System.out.println(congeladoAire1.mostrarInfo());
        System.out.println(congeladoAire2.mostrarInfo());
        System.out.println(congeladoAgua1.mostrarInfo());
        System.out.println(congeladoAgua2.mostrarInfo());
        System.out.println(congeladoNitrogeno1.mostrarInfo());
    }
}