package TextGenerator.GeneratorEngine.Enums;

public enum LeadParagraph {
    TEXT1("Siisti #merkki #malli, jolla on hintaa ainoastaan #hinta! Kulkuvälineessä on kaunis #vari #metallivari. Vuosimallin #vuosimalli #korimalli:lla ajettu vain #tkm. %CAPS#polttoaine on kulkupeliin käyvä polttoaine, jota se kuluttaa #kulutus. Ajotekniikaltaan #vaihteisto."),
    TEXT2("Upea #vari #merkki #malli, nyt vain #hinta! Vuosimallia #vuosimalli, jolla ajettu #tkm. Korimalliltaan #korimalli. Näppärä #vaihteisto, jossa #polttoaine-kone, kulutukseltaan ainoastaan #kulutus!"),
    TEXT3("#merkki #malli, jonka #vari #metallivari miellyttää silmää! Näppärä vuoden #vuosimalli #korimalli. Ajettu vain #tkm! Moottoria pyörittää #polttoaine, jota se kuluttaa #kulutus. Tämä #vaihteisto hintaan #hinta!");

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
