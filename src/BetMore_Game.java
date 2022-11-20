public class BetMore_Game {

    public int pick_card() {
        Shuffle shuffle = new Shuffle();
        return shuffle.getNumber();
    }

}
