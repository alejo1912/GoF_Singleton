package gof_singleton;

public class Prestar {
    
    public static void prestar() {
        
        Account account = Account.getInstance();

        Usuario user = account.getUser();
        for (Prestamo pres : user.getPrestamos()) {
            System.out.printf(
                "Se a realizado el prestamo ", pres.getPre_codigo(), pres.getAula().getAu_nombre(), pres.getPersona().getPer_nombre()
            );
        }
    }
}
