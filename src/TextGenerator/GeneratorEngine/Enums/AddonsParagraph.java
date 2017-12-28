package TextGenerator.GeneratorEngine.Enums;

public enum AddonsParagraph {
    TEXT1("Autoon kuuluvat lisäksi #huoltokirja, #turbo, #turvatyynyt, #aanentoisto, #audioin #xenon, #abs, #sumu, #invalidi, #matkapuhelin, #vetokoukku, #ESP, #erikoisvanteet, #tuning, #metallivari ja #kahdetrenkaat. "),
    TEXT2("Lisävarusteina #turbo, #abs, #ESP, #huoltokirja, #kahdetRenkaat, #xenon, #sumu, #aanentoisto, #audioin, #tuning, #erikoisvanteet, #metallivari, #invalidi, #matkapuhelin, #vetokoukku ja #turvatyynyt."),
    TEXT3("Lisäksi autoa varustavat mm. #huoltokirja, #aanentoisto ja #turvatyynyt. Myös #turbo, #vetokoukku, #ESP, #matkapuhelin, #sumu, #xenon, #metallivari, #tuning, #erikoisvanteet, #audioin, #invalidi, #kahdetRenkaat sekä #abs löytyvät autosta.");

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
