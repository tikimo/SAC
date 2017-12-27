package GeneratorEngine.Enums;

public enum FinalParagraph {

    TEXT1("Tämän hienon #korimalli #malli:n löydät liikkeemme pihalta. Tarjoamme myös edullista rahoitusta."),
    TEXT2("Tyylikkään #vari #malli odottaa sinua! Tervetuloa kahvittelemaan ja neuvottelemaan.");

    private final String signature =
            "\n\nSomeron Autokeskus Oy" +
            "\nsomero-autocenter.com" +
            "\n045 667 2920" +
            "\nJoensuuntie 55, Somero 31400";
    private final String name;

    FinalParagraph(String s) {
        name = s;
    }

    @Override
    public String toString() {
        return this.name + signature;
    }

    public static String getRandom() {
        return values()[(int) (Math.random() * values().length)].toString();
    }
}
