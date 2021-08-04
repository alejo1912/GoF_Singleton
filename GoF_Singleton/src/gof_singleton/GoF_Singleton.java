package gof_singleton;

public class GoF_Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Account account = Account.getInstance();
        account.signIn("Bobby");

        Usuario user = account.getUser();
        System.out.printf("Hola ", user.getName());

        Registro.insert();

        Prestar.prestar();
    }
    
}
