package PasswordChecker;

class EmptyPasswordException extends Exception{
    public EmptyPasswordException(){
        super("The password is weak");
    }
}
