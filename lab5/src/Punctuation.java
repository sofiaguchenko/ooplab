public class Punctuation extends ChlenyPredlozh {
    private String znaks;

    public Punctuation(String symbols) {
        this.znaks = symbols;
    }

    @Override
    public String toString() {
        return znaks;
    }
}
