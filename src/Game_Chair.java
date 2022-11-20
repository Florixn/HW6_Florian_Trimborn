import java.util.Scanner;

public class Game_Chair {
    public Player Computer = new Player();
    public Player Player_2 = new Player();
    private boolean user_selected = true;

    public void Start() {
        Computer.Play();
        Scanner in = new Scanner(System.in);
        String response;
        int counter = 5;
        while(user_selected == true) {
            Player_2.Play();
            counter--;
            System.out.println("------------------------------------------");
            System.out.println("Deine aktuelle Karte ist " + Player_2.getCurrentCard());
            if (counter == 0) {
                System.out.println("------------------------------------------");
                in.close();
                break;
            }
            System.out.println("Noch eine Karte ziehen? (" + counter + " Versuche übrig) (ja/nein)");
            System.out.println("------------------------------------------");
            response = in.next();
            while (!response.equals("ja") && !response.equals("nein")) {
                System.out.println("\nDiese Eingabe ist ungültig. Bitte wähle ja oder nein aus...");
                response = in.next();
            }
            if (response.equals("nein")) {
                System.out.println("------------------------------------------");
                in.close();
                user_selected = false;
            } else if (response.equals("ja")) {
                System.out.println("\nNeue Karte wird vom Stapel gezogen...");
            }
        }
    }
    public Player FindWinner(Player Computer, Player Player_2) {
        if (Computer.getCurrentCard() > Player_2.getCurrentCard()) {
            return Computer;
        } else {
            return Player_2;
        }
    }
}
