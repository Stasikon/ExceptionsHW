
public class Main {
    public static void main(String[] args) {
        try {
            UserRegistration.cheskLoginParam("Stasikon_com"
                    , "Stasikon_S2"
                    , "Stasikon_S2");
        } catch (LoginException | PasswordException exception) {
            System.out.println(exception.getMessage());
        }
    }
    }
