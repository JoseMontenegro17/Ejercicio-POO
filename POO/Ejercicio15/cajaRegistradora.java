package Ejercicio15;

import java.util.ArrayList;

public class cajaRegistradora implements iCajaRegistradora {
    private String nombre;
    private ArrayList<Double> tiposDeMoneda;
    private ArrayList<Integer> unidadesPorTipo;

    public cajaRegistradora(String nombre) {
        this.nombre = nombre;
        this.tiposDeMoneda = new ArrayList<>();
        this.unidadesPorTipo = new ArrayList<>();
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getNumTipoMonedas() {
        return tiposDeMoneda.size();
    }

    @Override
    public int getUnidadesTipoMoneda(double tipo) {
        int index = tiposDeMoneda.indexOf(tipo);
        return index >= 0 ? unidadesPorTipo.get(index) : -1;
    }

    @Override
    public boolean meterMonedas(double tipo, int unidades) {
        if (monedaValida(tipo) && unidades > 0) {
            int index = tiposDeMoneda.indexOf(tipo);
            if (index >= 0) {
                unidadesPorTipo.set(index, unidadesPorTipo.get(index) + unidades);
            } else {
                tiposDeMoneda.add(tipo);
                unidadesPorTipo.add(unidades);
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean monedaValida(double tipo) {
        return tipo > 0;
    }

    @Override
    public boolean extraerMonedas(double tipo, int unidades) {
        int index = tiposDeMoneda.indexOf(tipo);
        if (index >= 0 && unidadesPorTipo.get(index) >= unidades) {
            unidadesPorTipo.set(index, unidadesPorTipo.get(index) - unidades);
            if (unidadesPorTipo.get(index) == 0) {
                tiposDeMoneda.remove(index);
                unidadesPorTipo.remove(index);
            }
            return true;
        }
        return false;
    }

    @Override
    public double[] getTiposDeMonedas() {
        double[] tipos = new double[tiposDeMoneda.size()];
        for (int i = 0; i < tiposDeMoneda.size(); i++) {
            tipos[i] = tiposDeMoneda.get(i);
        }
        return tipos;
    }

    @Override
    public double getSaldo() {
        double saldo = 0;
        for (int i = 0; i < tiposDeMoneda.size(); i++) {
            saldo += tiposDeMoneda.get(i) * unidadesPorTipo.get(i);
        }
        return saldo;
    }
}
