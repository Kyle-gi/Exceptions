public class ExceptionHandeling {
    public static void main(String[] args) {

        try {
           int myInt = Integer.parseInt("1");
            System.out.println("After parsing pants:");
            return;
        }
        catch (NumberFormatException e){
            System.out.println("Hey dude you cant make an int out here.");
        }
        finally {
            System.out.println("In the finally block");
        }
        System.out.println("End here");
    }

}
