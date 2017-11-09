package hillel.hometask.ht26;

public class SimpleTest {

    public static void main(String[] args) {
        String s = "X";
        switch (s){
            case "w": s="w";
            case "x": s="x";
            default: s="";
        }

        try {
            compareNotEmptyStrings("not null", s);
        } catch (CustomValidationArguments e) {
            e.printStackTrace();
        }
        parseInt("123abc");
    }

    public static boolean compareNotEmptyStrings(String s1, String s2) throws CustomValidationArguments {
        if (s1.equals("") || s2.equals("")) throw new CustomValidationArguments("Not enough input arguments to proceed.");

        if (s1.equals(s2)){
            return true;
        } else return false;
    }

    public static int parseInt(String s) throws CustomInvalidOperation {
        try{
            return Integer.parseInt(s);
        } catch (Exception e){
            throw new CustomInvalidOperation();
        }
    }
}
