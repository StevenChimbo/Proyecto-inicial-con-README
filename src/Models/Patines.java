package Models;

public class Patines {
    private String marca;
    private String talla;
    private String ruedas;

    public Patines(String marca, String ruedas, String talla) {
        this.marca = marca;
        this.ruedas = ruedas;
        this.talla = talla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getRuedas() {
        return ruedas;
    }

    public void setRuedas(String ruedas) {
        this.ruedas = ruedas;
    }

}
