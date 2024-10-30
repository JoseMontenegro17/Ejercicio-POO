class Triangulo {
    private int base;
    private int altura;

 
    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

   
    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public double calcularArea() {
        return (base * altura) / 2.0;
    }
}

