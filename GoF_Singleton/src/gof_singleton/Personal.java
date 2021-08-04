package gof_singleton;

public class Personal {
    
    private String per_codigo;
    private String per_cedula;
    private String per_nombre;
    private String tipo;

    public Personal(String per_codigo, String per_cedula, String per_nombre, String tipo) {
        this.per_codigo = per_codigo;
        this.per_cedula = per_cedula;
        this.per_nombre = per_nombre;
        this.tipo = tipo;
    }

    public String getPer_codigo() {
        return per_codigo;
    }

    public void setPer_codigo(String per_codigo) {
        this.per_codigo = per_codigo;
    }

    public String getPer_cedula() {
        return per_cedula;
    }

    public void setPer_cedula(String per_cedula) {
        this.per_cedula = per_cedula;
    }

    public String getPer_nombre() {
        return per_nombre;
    }

    public void setPer_nombre(String per_nombre) {
        this.per_nombre = per_nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
