package hillel.hometask.ht18;

public enum Calendar {
    One("January"), Two("February"), Three("March"),
    Four("April"), Five("May"), Six("June"), Seven("July"),
    Eight("August"), Nine("September"), Ten("October"),
    Eleven("November"), Twelve("December");

    private String month;

    Calendar(String s) {
        month = s;
    }

    public String getMonth() {
        return month;
    }
}


