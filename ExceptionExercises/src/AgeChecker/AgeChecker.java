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
        try {

        }
        catch (){

        }
    }

}
