import java.util.ArrayList;

public class Slovo extends ChlenyPredlozh {
    private ArrayList<Bucva> bucvs;
    static Slovo longestPalindrome = new Slovo("");

    public Slovo(String s) {
        bucvs = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            bucvs.add(new Bucva(s.charAt(i)));
        }
    }

    public boolean checker() {
        ArrayList<Bucva> tempCopy = new ArrayList<>(bucvs);
        tempCopy.remove(new Bucva(' '));
        int temp = tempCopy.size() / 2;
        for (int i = 0; i < temp;i++ ){
            if (!tempCopy.get(i).equals(tempCopy.get(tempCopy.size()-i-1))){
                return false;
            }
        }
        return true;
    }

    public void isLongestPalindrome(){
        ArrayList<Bucva> tempCopy = new ArrayList<>(bucvs);
        tempCopy.remove(new Bucva(' '));
        if (this.checker()){
            if (tempCopy.size() > longestPalindrome.bucvs.size()){
                longestPalindrome = this;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Bucva bucv : bucvs) {
            sb.append(bucv.toString());
        }
        return sb.toString();
    }
}
