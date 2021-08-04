package gof_singleton;

public class Registro {

    public static void insert() {

        Account account = Account.getInstance();
        Usuario user = account.getUser();

        Personal administrativo = new Personal("P001", "9789700406237", "Luis Lopez", "Administrativo");
        Personal laboratorista = new Personal("P002", "9781777837563", "Luis Lopez", "Laboratorista");
        Personal docente1 = new Personal("P003", "9783374707270", "Prof. Sabina Stark MD", "Docente");
        Personal docente2 = new Personal("P004", "9791791181023", "Prof. Ella Goodwin", "Docente");
        Personal docente3 = new Personal("P005", "9782504150177", "Dr. Virginia Treutel", "Docente");
        Personal docente4 = new Personal("P006", "9784317326237", "Prof. Otilia Hagenes V", "Docente");
        Personal estudiante1 = new Personal("P007", "9795340777323", "Glen O'Kon MD", "Estudiante");
        Personal estudiante2 = new Personal("P008", "9784655664718", "Edwin Moen", "Estudiante");
        Personal estudiante3 = new Personal("P009", "9782057056056", "Soledad Cormier", "Estudiante");
        Personal estudiante4 = new Personal("P010", "9799319550856", "Elinor O'Kon", "Estudiante");
        Personal estudiante5 = new Personal("P011", "9791399988802", "Lavinia Daniel", "Estudiante");
        Personal estudiante6 = new Personal("P012", "9790082785681", "Miller Reichert", "Estudiante");
        user.getPersonal().add(administrativo);
        user.getPersonal().add(laboratorista);
        user.getPersonal().add(docente1);
        user.getPersonal().add(docente2);
        user.getPersonal().add(docente3);
        user.getPersonal().add(docente4);
        user.getPersonal().add(estudiante1);
        user.getPersonal().add(estudiante2);
        user.getPersonal().add(estudiante3);
        user.getPersonal().add(estudiante4);
        user.getPersonal().add(estudiante5);
        user.getPersonal().add(estudiante6);

        AulaLaboratorio aula1 = new AulaLaboratorio("A001", "Audiovisuales", 5, 20, "3° Piso");
        AulaLaboratorio aula2 = new AulaLaboratorio("A002", "Sistemas", 30, 30, "1° Piso");
        AulaLaboratorio aula3 = new AulaLaboratorio("A003", "Electronica", 15, 10, "1° Piso");
        AulaLaboratorio aula4 = new AulaLaboratorio("A004", "Arte", 12, 30, "2° Piso");
        user.getAula().add(aula1);
        user.getAula().add(aula2);
        user.getAula().add(aula3);
        user.getAula().add(aula4);
    }
}
