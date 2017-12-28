package TextGenerator.GeneratorEngine.Enums;

public enum LeadParagraph {
    TEXT1("Siisti #merkki #malli, jolla on hintaa ainoastaan #hinta!");


    private final String name;

    LeadParagraph(String s) {
        name = s;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public static String getRandom() {
        return values()[(int) (Math.random() * values().length)].toString();
    }

}
