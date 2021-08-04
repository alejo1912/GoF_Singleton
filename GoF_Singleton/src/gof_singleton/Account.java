package gof_singleton;

public class Account {

    private static Account instance;

    public static Account getInstance() {
        if (instance == null) {
            instance = new Account();
        }
        return instance;
    }

    private Account() {
    }

    private Usuario user;

    public void signIn(String name) {
        user = new Usuario(name);
    }

    public Usuario getUser() {
        return user;
    }
}
