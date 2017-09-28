package hillel.hometask.ht22;

public class Main {

    public static void main(String[] args) {
        final String str1 = "(())";
        final String str2 = "))((";
        final String str3 = "(()))";
        final String str4 = "((()))";
        final String str5 = "(()()())";
        final String str6 = "";
        final String str7 = System.getProperty("java.version");

        char[] array = new char[str1.length()];

        MyStack st1 = new MyStack(str1.length(), array);
        MyStack st2 = new MyStack(str2.length(), array);
        MyStack st3 = new MyStack(str3.length(), array);
        MyStack st4 = new MyStack(str4.length(), array);
        MyStack st5 = new MyStack(str5.length(), array);
        MyStack st6 = new MyStack(str6.length(), array);
        MyStack st7 = new MyStack(str7.length(), array);

        st1.checkString(str1);
        st2.checkString(str2);
        st3.checkString(str3);
        st4.checkString(str4);
        st5.checkString(str5);
        st6.checkString(str6);
        st7.checkString(str7);
    }


}
