package gof_singleton;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String name;
    private List<Personal> personal;
    private List<AulaLaboratorio> aula;
    private List<Prestamo> prestamos;
    
    public Usuario(String name) {
        this.name = name;
        this.personal = new ArrayList<>();
        this.aula = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Personal> getPersonal() {
        return personal;
    }

    public void setPersonal(List<Personal> personal) {
        this.personal = personal;
    }

    public List<AulaLaboratorio> getAula() {
        return aula;
    }

    public void setAula(List<AulaLaboratorio> aula) {
        this.aula = aula;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
    
    
}
