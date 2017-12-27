package GeneratorEngine.Enums;

public enum PropertiesParagraph {
    TEXT1("");


    private final String name;

    PropertiesParagraph(String s) {
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
