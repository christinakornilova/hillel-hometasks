package hillel.hometask.ht19;

public class IntegerContainer{

    private int current_index;
    private int[] array;
    private int length;


    public IntegerContainer(){
        this.array = new int[20];
        this.current_index = 0;
        this.length = array.length;
    }

    public IntegerContainer(int length){
        this.array = new int[length];
        this.current_index = 0;
        this.length = length;
    }

    public int[] getArray() {
        return array;
    }

    private void setArray(int value, int index) {
        array[index] = value;
    }


    //Will add an element to array
    public void addElement(int num) {
        array[current_index] = num;
        current_index+=1;
        if (current_index > this.length) {
            concatArrays();
        }
    }

    private int[] concatArrays() {
        int newLength = length * 2;
        int[] doubleSizedArray = new int[newLength];
        System.arraycopy(this.array, 0, doubleSizedArray, 0, this.length);
        length = newLength;
        array = doubleSizedArray;
        return array;
    }

    public int getTailElement() {
        return array[length-1];
    }

    //Will get element by its index
    public int getValue(int index) {
        if ((index < 0) || (index > this.length)) {
            System.out.println("Given array has no such index.");
            return -1;
        } else {
            return array[index];
        }
    }

    //Will check that element contains in the array
    public void contains(int e){
        if (containsElement(e)){
            System.out.println("Array contains element " + e);
        } else{
            System.out.println("Array contains no such element " + e);
        }
    }

    private boolean containsElement(int e) {
        for (int i = 0; i < this.length; i++){
            if (e == this.getValue(i)){
                return true;
            }
        }
        return false;
    }

    //addAll
    public void copyAllElements(IntegerContainer array2){
        int oldSize = this.getSize();
        int newSize = this.getSize() + array2.getSize();
        if (newSize >= this.array.length * 2) {
            this.concatArrays();
        }

        for (int i = 0; i < oldSize; i++) {
            this.addElement(array2.getValue(i));

        }
    }

    //equals
    public boolean equals(IntegerContainer arr){
        if (this.length != arr.getSize()) {
            return false;
        }
        for (int i = 0; i < this.length; i++) {
            if (this.getValue(i) != arr.getValue(i)) {
                return false;
            }
        }
        return true;
    }
    public void compare (IntegerContainer arr2){
        if (this.equals(arr2)){
            System.out.println("Arrays are equal");
        }else {
            System.out.println("Arrays are not equal");
        }
    }

    //clear
    public void clear(){
        for (int i = 0; i < this.length; i++) {
            setArray(0, i);
        }
    }

    //find or indexOf
    private int getIndexOf(int number){
        for (int i = 0; i <array.length-1; i++) {
            if (number == this.getValue(i)) {
                return i;
            }
        }
        return -1;
    }

    public void getIndex(int number){
        int index = this.getIndexOf(number);
        if (index >= 0){
            System.out.println("Index is "+index);
        } else {
            System.out.println("Error getting index. No such value in this array.");
        }
    }

    //getSize
    public int getSize() {

        return this.getArray().length;
    }

    //sort
    public int[] sortArray(){
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) {
                    int t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                }
            }
        }
        return array;
    }


    public void showAllElements() {
        for (int el : array) {
            System.out.print(el + "; ");
        }
        System.out.println();
    }

}
