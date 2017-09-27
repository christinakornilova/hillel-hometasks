package hillel.hometask.ht21;


public enum Type {
        EDP("Eau De Parfum"),
        EDT("Eau De Toilette"),
        EDC("Eau De Cologne"),
        PERF("Perfume")
        ;

        private final String text;


        Type(final String text) {
            this.text = text;
        }


        @Override
        public String toString() {
            return text;
        }
}
