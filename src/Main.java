public class Main {
    public static void main(String[] args) {

        Game_Chair game = new Game_Chair();
        game.Start();

        Player Winner = game.FindWinner(game.Computer, game.Player_2);

        if (game.Computer.getCurrentCard() == game.Player_2.getCurrentCard()) {
            System.out.println("It's a draw!");
            System.out.println("You both got " + game.Computer.getCurrentCard());
        } else if (Winner == game.Computer) {
            System.out.println("You lost :(");
            System.out.println("The computer got " + game.Computer.getCurrentCard());
        } else {
            System.out.println("You won! :)");
            System.out.println("The computer got " + game.Computer.getCurrentCard());
        }

    }
}