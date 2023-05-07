public class UserRegistration {
    public static void cheskLoginParam(String login, String password, String confirmPasswoed)
            throws LoginException, PasswordException{
        if(login.length()>20){
            throw new LoginException("Длинна логина слишком большая");
        }
        if (!(login.matches("[a-zA-Z0-9_]+"))){
            throw new LoginException("Логин должен быть из латинице, цифр и знаков подчеркивания");
        }
        if (password.length() > 20) {
            throw new PasswordException("Длинна пороля слишком большая");
        }
        if (!(password.matches("[a-zA-Z0-9_]+"))){
            throw new PasswordException("Пороль должен быть из латинице, цифр и знаков подчеркивания");
        }
        if(!(password.equals(confirmPasswoed))){
            throw new PasswordException("Пороли не совпадают!");
        }
    }
}
