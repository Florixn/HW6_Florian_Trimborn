public class Main {
    public static void main(String[] args) {

        Game_Chair g = new Game_Chair();
        g.Start();

        Player Winner = g.FindWinner(g.Computer, g.Player_2);

        if (g.Computer.getCurrentCard() == g.Player_2.getCurrentCard()) {
            System.out.println("Unentschieden!");
            System.out.println("Ihr habt beide die Nummer " + g.Computer.getCurrentCard());
        } else if (Winner == g.Player_2) {
            System.out.println("GEWONNEN!");
            System.out.println("Der Computer hat die Nummer " + g.Computer.getCurrentCard());
        } else {
            System.out.println("Verloren!");
            System.out.println("Der Computer hat die Nummer " + g.Computer.getCurrentCard());
        }

    }
}