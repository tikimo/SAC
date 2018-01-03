package TextGenerator.GeneratorEngine.Enums;

public enum FinalParagraph {

    TEXT1("Tämän hienon #korimalli #malli:n löydät liikkeemme pihalta. Tarjoamme myös edullista rahoitusta."),
    TEXT2("Tyylikkään #vari #malli odottaa sinua! Tervetuloa kahvittelemaan ja neuvottelemaan."),
    TEXT3("Tervetuloa koeajamaan tämä upea #korimalli #malli liikkeeseemme! Palveluihimme kuuluu lisäksi muun muassa halpa rahoitus ja edulliset renkaat. ");

    private final String name;

    FinalParagraph(String s) {
        name = s;
    }

    @Override
    public String toString() {
        String signature = "\n\nSomeron Autokeskus Oy" +
                "\nsomero-autocenter.com" +
                "\n045 667 2920" +
                "\nJoensuuntie 55, Somero 31400";
        return this.name + signature;
    }

    public static String getRandom() {
        return values()[(int) (Math.random() * values().length)].toString();
    }
}
