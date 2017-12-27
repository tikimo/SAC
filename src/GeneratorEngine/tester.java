package GeneratorEngine;

import GeneratorEngine.Enums.FinalParagraph;

public class tester {

    public static void main(String[] ar) {
/*
        String salesText = FinalParagraph.getRandom();

        salesText = salesText.replaceAll("#korimalli", "farmari")
                .replaceAll("#malli", "Octavia")
                .replaceAll("#vari", "punainen");
        System.out.println(salesText);
*/

        String test = "Lorem ipsum dolor si amet. @CAPSloremlorem, ipsum ipsum.";
        int index = test.indexOf("@CAPS");
        String toCaps = test.substring(index + 5, index + 6);
        test = test.replaceAll("@CAPS" + toCaps, toCaps.toUpperCase());
        System.out.println(test);
    }
}
