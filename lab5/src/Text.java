public class Text {
    private Predlozhenie[] predlozhens;

    public Text(String pred) {
        String[] strings = pred.split("(?<=[?!.]) ");
        predlozhens = new Predlozhenie[strings.length];
        for (int i = 0; i < strings.length; i++) {
            predlozhens[i] = new Predlozhenie(strings[i]);
        }
    }
    public Slovo findLongestPalindrome() {
        for (Predlozhenie predlozhen : predlozhens) {
            predlozhen.findLongestPalindrome();
        }
        return Slovo.longestPalindrome;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Predlozhenie predlozhen : predlozhens) {
            sb.append(predlozhen.toString());

        }
        return sb.toString();
    }
}
