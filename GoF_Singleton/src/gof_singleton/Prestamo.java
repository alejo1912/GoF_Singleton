package gof_singleton;

public class Prestamo {
    
    private String pre_codigo;
    private Personal persona;
    private AulaLaboratorio aula;

    public Prestamo(String pre_codigo, Personal persona, AulaLaboratorio aula) {
        this.pre_codigo = pre_codigo;
        this.persona = persona;
        this.aula = aula;
    }

    public String getPre_codigo() {
        return pre_codigo;
    }

    public void setPre_codigo(String pre_codigo) {
        this.pre_codigo = pre_codigo;
    }

    public Personal getPersona() {
        return persona;
    }

    public void setPersona(Personal persona) {
        this.persona = persona;
    }

    public AulaLaboratorio getAula() {
        return aula;
    }

    public void setAula(AulaLaboratorio aula) {
        this.aula = aula;
    }
    
    
}
