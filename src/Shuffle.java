public class Shuffle {
    private int number;
    public Shuffle() {
        number = (int) (Math.random() * 101);
    }
    public int getNumber() {
        return number;
    }
}
