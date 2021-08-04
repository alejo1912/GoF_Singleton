package gof_singleton;

public class AulaLaboratorio {
    
    private String au_codigo;
    private String au_nombre;
    private int au_num_equipos;
    private int au_capacidad;
    private String au_ubicacion;

    public AulaLaboratorio(String au_codigo, String au_nombre, int au_num_equipos, int au_capacidad, 
            String au_ubicacion) {
        this.au_codigo = au_codigo;
        this.au_nombre = au_nombre;
        this.au_num_equipos = au_num_equipos;
        this.au_capacidad = au_capacidad;
        this.au_ubicacion = au_ubicacion;
    }

    public String getAu_codigo() {
        return au_codigo;
    }

    public void setAu_codigo(String au_codigo) {
        this.au_codigo = au_codigo;
    }

    public String getAu_nombre() {
        return au_nombre;
    }

    public void setAu_nombre(String au_nombre) {
        this.au_nombre = au_nombre;
    }

    public int getAu_num_equipos() {
        return au_num_equipos;
    }

    public void setAu_num_equipos(int au_num_equipos) {
        this.au_num_equipos = au_num_equipos;
    }

    public int getAu_capacidad() {
        return au_capacidad;
    }

    public void setAu_capacidad(int au_capacidad) {
        this.au_capacidad = au_capacidad;
    }

    public String getAu_ubicacion() {
        return au_ubicacion;
    }

    public void setAu_ubicacion(String au_ubicacion) {
        this.au_ubicacion = au_ubicacion;
    }

}
