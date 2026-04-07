package AgeChecker;

import java.util.Scanner;

public class AgeChecker {
    public void isOlder(int age) throws TooOldException, TooYoungException{
        if (age > 18){
            throw new TooOldException();
        }
        else {
            throw new TooYoungException();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        AgeChecker age = new AgeChecker();

        System.out.println("Enter your age: ");
        int edad = sc.nextInt();

        try {
            age.isOlder(edad);
        }
        catch (TooOldException e){
            System.out.println(e.getMessage());
        }
        catch (TooYoungException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }

}
