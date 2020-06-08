public class Bucva {
    private char bucva;

    public Bucva(char bucva){
        this.bucva = bucva;
    }

    @Override
    public String toString() {
        return String.valueOf(bucva);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Bucva) {
            return String.valueOf(bucva).equalsIgnoreCase(String.valueOf(obj));
        }
        return false;
    }
}
