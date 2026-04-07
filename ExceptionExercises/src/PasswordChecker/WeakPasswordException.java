package PasswordChecker;

class WeakPasswordException extends Exception{

    public WeakPasswordException(){
        super("The password is too short and weak");
    }
}
