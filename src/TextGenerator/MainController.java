package TextGenerator;


import TextGenerator.GeneratorEngine.Generator;
import javafx.scene.control.*;


public class MainController {
    private Generator generator = new Generator();

    public ProgressIndicator progressAnimation;
    public Button saveTabPane;
    public Button generateButton;
    public TextArea generateTextBox;

    public TextField merkki, malli, tkm, vuosimalli, kulutus, hinta;
    public CheckBox ajotietokone, ilmastointi, kattoluukku, keskuslukitus, lohko, nahka, navi, penkinlammitin, lisalammitin, pysakointitutka, sahkoistuimet, sahkoikkunat, sisatilapistoke, urheiluistuimet, vakionopeus;
    public CheckBox aanentoisto, xenon, abs, sumu, turvatyynyt, erikoisvanteet, huoltokirja, invalidi, kahdetRenkaat, turbo, vetokoukku, tuning, ESP, matkapuhelin, audioin, metallivari, renkaidenKunto;
    public TextField vari;
    public ComboBox korimalli, polttoaine, vaihteisto;

    public void saveAllFields() {

        progressAnimation.setVisible(true);
    }

    /**
     * This method is called when "Generate" button is pressed. It takes all properties from all panes.
     * Method then passes parameters to specific text-generators and sums them up in different paragraphs.
     * Text generators are located in GeneratorEngine.Generator, which has a constructor.
     *
     */
    public void generateText() {
        progressAnimation.setVisible(true);

        // Lead paragraph parameters
        String[] leadParagraphParams = new String[] {merkki.getText(), malli.getText(), tkm.getText(), vuosimalli.getText(),
                kulutus.getText(), vari.getText(), String.valueOf(metallivari.isSelected() ? "metalliväri" : "väri"), String.valueOf(korimalli.getValue()).toLowerCase(),
                String.valueOf(polttoaine.getValue()).toLowerCase(), String.valueOf(vaihteisto.getValue()).toLowerCase(), hinta.getText()};

        // Properties paragraph parameters
        CheckBox[] propertiesParams = new CheckBox[] {ajotietokone, ilmastointi, kattoluukku, keskuslukitus, lohko, nahka,
                navi, penkinlammitin, lisalammitin, pysakointitutka, sahkoistuimet, sahkoikkunat, sisatilapistoke, urheiluistuimet, vakionopeus};

        // Addons paragraph parameters
        CheckBox[] addonsParams = new CheckBox[] {aanentoisto, xenon, abs, sumu, turvatyynyt, erikoisvanteet, huoltokirja,
                invalidi, kahdetRenkaat, turbo, vetokoukku, tuning, ESP, matkapuhelin, audioin, metallivari, renkaidenKunto};

        // Final paragraph parameters
        String[] finalParagraphParams = new String[] {vari.getText(), malli.getText(), String.valueOf(korimalli.getValue())};

        // Put it together
        String generatedText =
                generator.generateLeadParagraph(leadParagraphParams) + "\n\n" +
                generator.generateProperties(propertiesParams) + "\n\n" +
                generator.generateAddons(addonsParams) + "\n\n" +
                generator.generateFinalParagraph(finalParagraphParams);

        // Adjust capitalization option
        int indexOfChar = generatedText.indexOf("%CAPS") + 5;
        String charToCaps = generatedText.substring(indexOfChar, indexOfChar + 1);
        generatedText = generatedText.replaceAll("%CAPS" + charToCaps, charToCaps.toUpperCase());

        generateTextBox.setText(generatedText);

        progressAnimation.setVisible(false);
    }
}
