package PasswordChecker;

import java.util.Scanner;

public class PasswordChecker {
    public void isStrong(String password) throws EmptyPasswordException, WeakPasswordException {
        if (password == null || password.isEmpty()) {
            throw new EmptyPasswordException();
        }
        if (password.length() < 8){
            throw new WeakPasswordException();
        }
        if (!password.matches(".*\\d.*")){
            throw new WeakPasswordException();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PasswordChecker pass = new PasswordChecker();

        System.out.println("Create a password: ");
        String p = scanner.nextLine();

        try {
            pass.isStrong(p);
            System.out.println("Password is valid");
        }
        catch (WeakPasswordException e){
            System.out.println(e.getMessage());
        }
        catch (EmptyPasswordException e){
            System.out.printf(e.getMessage());
        }
        scanner.close();
    }
}
