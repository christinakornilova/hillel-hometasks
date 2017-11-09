package hillel.hometask.ht26;

public class CustomInvalidOperation extends NumberFormatException{
    /*
    Unchecked exception:
    Имя класса: CustomInvalidOperation
    Message: “This operation doesn’t allow here.”*/

    public CustomInvalidOperation() {
        super("This operation doesn't allow here.");
    }

}
