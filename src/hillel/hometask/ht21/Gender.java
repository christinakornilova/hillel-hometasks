package hillel.hometask.ht21;

public enum Gender {
    M("Male"),
    F("Female"),
    U("Unisex")
    ;

    private final String text;


    Gender(final String text) {
        this.text = text;
    }


    @Override
    public String toString() {
        return text;
    }
}
