public class Player {
    private int currentCard;
    public void Play() {
        BetMore_Game BetM = new BetMore_Game();
        currentCard = BetM.pick_card();
    }
    public int getCurrentCard() {
        return currentCard;
    }
}
