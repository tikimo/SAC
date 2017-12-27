package TextGenerator.GeneratorEngine.Enums;

public enum AddonsParagraph {
    TEXT1("");


    private final String name;

    AddonsParagraph(String s) {
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
