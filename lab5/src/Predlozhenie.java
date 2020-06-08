public class Predlozhenie {
    private static final String rozdilovy = ",.!?;";
    private ChlenyPredlozh[] chlenyPredlozhs;

    public Predlozhenie(String pred){
        pred = pred.replaceAll(" +", " ");
        String[] sentenceElementsStrings = pred.split("(?=[" + rozdilovy + " ])|\\s");
        chlenyPredlozhs = new ChlenyPredlozh[sentenceElementsStrings.length];
        for (int i = 0; i < sentenceElementsStrings.length; i++) {
            if (rozdilovy.contains(sentenceElementsStrings[i])) {
                chlenyPredlozhs[i] = new Punctuation(sentenceElementsStrings[i]);
            } else {
                chlenyPredlozhs[i] = new Slovo(sentenceElementsStrings[i]);
            }
        }
    }
    public void findLongestPalindrome() {
        for (ChlenyPredlozh chlenyPredlozhs : chlenyPredlozhs) {
            if (chlenyPredlozhs instanceof Slovo) {
                ((Slovo)chlenyPredlozhs).isLongestPalindrome();
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (ChlenyPredlozh chlenyPredlozhs : chlenyPredlozhs) {
            sb.append(chlenyPredlozhs.toString());
        }
        return sb.toString();
    }
}
