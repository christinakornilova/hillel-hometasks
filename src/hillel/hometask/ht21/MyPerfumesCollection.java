package hillel.hometask.ht21;

import static hillel.hometask.ht21.Perfume.copyPerfume;

//import java.util.Arrays;


public class MyPerfumesCollection {
    private Perfume[] perfumesArray;
    private int size = 5;
    private int tail = 0;

    MyPerfumesCollection() {
        perfumesArray = new Perfume[size];
    }

    private static void copyPerfumesArray(Perfume[] original, Perfume[] copy) {
        for (int i = 0; i < original.length; i++) {
            copy[i] = copyPerfume(original[i]);
        }
    }

    int getSize(){
        return this.size;
    }

    boolean isEmpty(){
        if (perfumesArray.length == 0) {
            return true;
        } else {
            for (int i = 0; i < perfumesArray.length; i++) {
                if(perfumesArray[i]!=null){
                        return false;
                }
            }
                return true;
            }
    }

    public boolean equals(MyPerfumesCollection newPerfumesArray) {
        if (tail != newPerfumesArray.tail) {
            return false;
        }
        for (int i = 0; i < tail; i++) {
            if (perfumesArray[i].equals(newPerfumesArray.perfumesArray[i])) {
                return true;
            }
        }
        return true;
    }

    int indexOf(Perfume scent) {
        for (int i = 0; i < tail; i++) {
            if (perfumesArray[i].equals(scent)) {
                return i;
            }
        }
        return -1;
    }


    void resize() {
        Perfume[] newPerfumesArray = new Perfume[(int) (size * 1.5)];
        copyPerfumesArray(perfumesArray, newPerfumesArray);
        perfumesArray = newPerfumesArray;
        size = newPerfumesArray.length;
    }

    void resize(int newSize) {
        Perfume[] newPerfumesArray = new Perfume[size];
        copyPerfumesArray(perfumesArray, newPerfumesArray);
        size = newSize;
    }

    void add(Perfume scent) {
        if (tail == perfumesArray.length){
            this.resize();
        }
        this.perfumesArray[tail] = scent;
        tail++;
    }

    void copy(MyPerfumesCollection originalCollection) {
        if (perfumesArray.length < originalCollection.tail) {
            Perfume[] newArray = new Perfume[perfumesArray.length];
            perfumesArray = newArray;
        }
        copyPerfumesArray(originalCollection.perfumesArray, perfumesArray);
        size = originalCollection.size;
        tail = originalCollection.tail;
    }

    MyPerfumesCollection removeElement(Perfume scent){
        MyPerfumesCollection result = new MyPerfumesCollection();

        if (this.indexOf(scent) < 0 || this.indexOf(scent) > tail){
            System.out.println("Nothing to remove.");
            return this;
        } else { for (int i = 0; i < tail; i++){
            if(!scent.equals(this.getElement(i)))
                result.add(this.getElement(i));
        }
        this.removeAll();
            this.copy(result);
        }
        return this;
    }

    Perfume getElement(int i) {
        if (i < 0 || i >= tail) {
            return null;
        }
        return perfumesArray[i];
    }


    void addAll(MyPerfumesCollection additionalCollection) {
        int newSize = tail + additionalCollection.tail;
        if (newSize > perfumesArray.length * 1.5) {
            this.resize(newSize);
        }
        for (int i = 0; i < additionalCollection.tail; i++) {
            this.add(additionalCollection.getElement(i));
        }
    }


    void removeAll() {
        for (int i = 0; i < tail; i++) {
            perfumesArray[i] = null;
        }
    }

    //public void retainAll(MyPerfumesCollection collection){}

//    boolean containsAll(MyPerfumesCollection collection) {
//        return Arrays.asList(this).containsAll(Arrays.asList(collection));
//
//    }

    boolean containsAll(MyPerfumesCollection collection) {
        int maxTail;
        if(this.tail > collection.tail){
            maxTail = this.tail;
        } else maxTail = collection.tail;

        for (int i = 0; i < maxTail; i++){
            if (collection.getElement(i) == null && this.getElement(i) != null) return true;
            if (collection.getElement(i) != null && this.getElement(i) == null) return false;
            if (!this.contains(collection.getElement(i))) return false;
        }
        return true;
    }

    boolean contains(Perfume scent) {
        return indexOf(scent) != -1;
    }


    void showAll() {
        for (int i = 0; i < tail; i++) {
            System.out.println(perfumesArray[i].toString());
        }
    }

}
