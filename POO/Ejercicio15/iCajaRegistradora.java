package Ejercicio15;

public interface iCajaRegistradora {
    public String getNombre();
    public int getNumTipoMonedas();
    public int getUnidadesTipoMoneda(double tipo);
    public boolean meterMonedas(double tipo, int unidades);
    public boolean monedaValida(double tipo);
    public boolean extraerMonedas(double tipo, int unidades);
    public double[] getTiposDeMonedas();
    public double getSaldo();
}
