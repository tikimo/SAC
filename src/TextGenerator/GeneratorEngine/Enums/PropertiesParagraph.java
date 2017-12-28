package TextGenerator.GeneratorEngine.Enums;

public enum PropertiesParagraph {
    TEXT1("Varustuksina muun muassa #ilmastointi, #urheiluistuimet, #sahkoistuimet, #nahka, #sahkoikkunat, #keskuslukitus, #navi, #kattoluukku, #pysakointitutka ja #ajotietokone. Lisäksi #lohko, #lisalammitin, #sisatilapistoke, #kattoluukku, #vakionopeus ja #penkinlammitin. "),
    TEXT2("Kulkuvälineestä löytyy #ajotietokone, #ilmastointi ja #lohko. Niiden lisäksi varusteina ovat #sisatilapistoke, #sahkoikkunat, #vakionopeus, #urheiluistuimet, #nahka, #sahkoistuimet, #kattoluukku, #pysakointitutka, #navi, #lisalammitin, #penkinlammitin ja #keskuslukitus. "),
    TEXT3("Autosta löytyy #ajotietokone, #keskuslukitus, #sahkoikkunat, #sahkoistuimet, #kattoluukku #pysakointitutka, #vakionopeus, #sisatilapistoke ja #lohko. Myös #ilmastointi, #penkinlammitin, #lisalammitin, #navi, #urheiluistuimet ja #nahka kuuluvat varustuksiin.");

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
