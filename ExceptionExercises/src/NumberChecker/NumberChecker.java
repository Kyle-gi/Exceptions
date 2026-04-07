package NumberChecker;

import java.util.Scanner;

public class NumberChecker {
    public void isPar(int a) throws ParExceptions, ImparException{
        if (a % 2 == 0) {
            throw new ParExceptions();
        }
        else {
            throw new ImparException();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberChecker checker = new NumberChecker();

        System.out.print("Insert a number: ");
        int number = sc.nextInt();

        try {
            checker.isPar(number);
        }
        catch (ParExceptions e){
            System.out.println(e.getMessage());
        } catch (ImparException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }

}
