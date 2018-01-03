package TextGenerator.GeneratorEngine;

import TextGenerator.GeneratorEngine.Enums.AddonsParagraph;
import TextGenerator.GeneratorEngine.Enums.FinalParagraph;
import TextGenerator.GeneratorEngine.Enums.LeadParagraph;
import TextGenerator.GeneratorEngine.Enums.PropertiesParagraph;
import javafx.scene.control.CheckBox;

public class Generator {

    public String generateLeadParagraph(String[] params) {
        return LeadParagraph.getRandom()
                .replaceAll("#merkki", params[0])
                .replaceAll("#malli", params[1])
                .replaceAll("#tkm", params[2] + " tkm")
                .replaceAll("#vuosimalli", params[3])
                .replaceAll("#kulutus", params[4]+" l/100km")
                .replaceAll("#vari", params[5] )
                .replaceAll("#metallivari", params[6])
                .replaceAll("#korimalli", params[7])
                .replaceAll("#polttoaine", params[8])
                .replaceAll("#vaihteisto", params[9])
                .replaceAll("#hinta", params[10]+" €")
                ;
    }

    public String generateProperties(CheckBox[] params) {
        return PropertiesParagraph.getRandom()
                .replaceAll("#ajotietokone", params[0].isSelected() ? "ajotietokone" : "")
                .replaceAll("#ilmastointi", params[1].isSelected() ? "ilmastointi" : "")
                .replaceAll("#kattoluukku", params[2].isSelected() ? "kattoluukku" : "")
                .replaceAll("#keskuslukitus", params[3].isSelected() ? "keskuslukitus" : "")
                .replaceAll("#lohko", params[4].isSelected() ? "lohkolämmitin" : "")
                .replaceAll("#nahka", params[5].isSelected() ? "nahkasisusta" : "")
                .replaceAll("#navi", params[6].isSelected() ? "navigaattori" : "")
                .replaceAll("#penkinlammitin", params[7].isSelected() ? "penkinlämmittimet" : "")
                .replaceAll("#lisalammitin", params[8].isSelected() ? "lisälämmitin" : "")
                .replaceAll("#pysakointitutka", params[9].isSelected() ? "pysäköintitutka" : "")
                .replaceAll("#sahkoistuimet", params[10].isSelected() ? "sähköistuimet" : "")
                .replaceAll("#sahkoikkunat", params[11].isSelected() ? "sähköikkunat" : "")
                .replaceAll("#sisatilapistoke", params[12].isSelected() ? "sisätilapistoke" : "")
                .replaceAll("#urheiluistuimet", params[13].isSelected() ? "urheiluistuimet" : "")
                .replaceAll("#vakionopeus", params[14].isSelected() ? "vakionopeudensäädin" : "")
                ;
    }

    public String generateAddons(CheckBox[] params) {
        return AddonsParagraph.getRandom()
                .replaceAll("#aanentoisto", params[0].isSelected() ? "hieno äänentoistojärjestelmä" : "")
                .replaceAll("#xenon", params[1].isSelected() ? "Xenon-valot" : "")
                .replaceAll("#abs", params[2].isSelected() ? "ABS (lukkiutumattomat jarrut)" : "")
                .replaceAll("#sumu", params[3].isSelected() ? "sumuvalot" : "")
                .replaceAll("#turvatyynyt", params[4].isSelected() ? "turvatyynyt" : "")
                .replaceAll("#erikoisvanteet", params[5].isSelected() ? "erikoisvanteet" : "")
                .replaceAll("#huoltokirja", params[6].isSelected() ? "huoltokirja" : "")
                .replaceAll("#invalidi", params[7].isSelected() ? "invalidi-varustus" : "")
                .replaceAll("#kahdetRenkaat", params[8].isSelected() ? (params[16].isSelected() ? "kahdet erinomaiset renkaat" : "kahdet renkaat") : "")
                .replaceAll("#turbo", params[9].isSelected() ? "turbo" : "")
                .replaceAll("#vetokoukku", params[10].isSelected() ? "vetokoukku" : "")
                .replaceAll("#tuning", params[11].isSelected() ? "tuning-varustus" : "")
                .replaceAll("#ESP", params[12].isSelected() ? "ajonvakausjärjestelmä" : "")
                .replaceAll("#matkapuhelin", params[13].isSelected() ? "matkapuhelinvarustus" : "")
                .replaceAll("#audioin", params[14].isSelected() ? "audio sisääntulo" : "")
                .replaceAll("#metallivari", params[15].isSelected() ? "metalliväri" : "")
                ;
    }

    public String generateFinalParagraph(String[] params) {

        return FinalParagraph.getRandom()
                .replaceAll("#vari", params[0].toLowerCase())
                .replaceAll("#malli", params[1])
                .replaceAll("#korimalli", params[2].toLowerCase());
    }
}
