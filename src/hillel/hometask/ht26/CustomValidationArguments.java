package hillel.hometask.ht26;

/*Check exception:
    Имя класса: CustomValidationArguments
    Message: “Not enough input arguments to proceed.”
*/

public class CustomValidationArguments extends Exception{

    public CustomValidationArguments(String message) {
        super(message);
    }
}
