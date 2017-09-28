package hillel.hometask.ht22;

public class MyStack {

    private static final char OPENING = '(';
    private static final char CLOSING = ')';
    private int stackPointer;
    private int size;
    private char[] stackChar = new char[size];

    public MyStack(int size, char[] stackChar) {
        this.size = size;
        this.stackChar = stackChar;
    }

    void add(char c) {
        if (stackPointer < size) {
            stackChar[stackPointer++] = c;
        }
    }

    char pop() {
        if (this.stackPointer > 0) {
            return stackChar[--stackPointer];
        }
        return 0;
    }

    boolean isEmpty() {
        return stackPointer == 0;
    }

    public void checkString(String s) {

        if (s.equals("")) {
            System.out.println("String =" + s + "= is empty. Nothing to check.");
        } else if (!s.contains("(") && !s.contains(")")) {
            System.out.println("String =" + s + "= has no brackets. Nothing to check.");
        } else {
            System.out.println("Brackets in =" + s + "= are balanced: " + checkBrackets(s));
        }

    }

    public boolean checkBrackets(String s) {
        int length = s.length();
        MyStack temp = new MyStack(length, stackChar);
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == OPENING) {
                temp.add(OPENING);
            } else if (s.charAt(i) == CLOSING) {
                if (temp.isEmpty()) {
                    return false;
                }
                temp.pop();
            }
        }
        return temp.isEmpty();

    }
}
