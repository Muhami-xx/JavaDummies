public class DummiesAccount{
    public static void main(String[] args) {/* public: The method is accessible from anywhere.
static: It can be run without creating an object of the class.
void: It does not return any value.
String[] args: It takes an array of strings as arguments (for command-line input).*/
    double amountInAccount;
    amountInAccount=50.22;
    amountInAccount= amountInAccount+ 1_000_000.00;
    System.out.print("You have $");
    System.out.print(amountInAccount);
    System.out.println(" in your account.");
}
}