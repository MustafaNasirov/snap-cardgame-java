import java.util.Scanner;

public class Snap extends CardGame {
    CardGame snapGame = new CardGame();
    private String previousCardSymbol = "";

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter to deal");

        while (!previousCardSymbol.equals(snapGame.dealCard().getSymbol())) {
            scanner.nextLine();
            previousCardSymbol = snapGame.dealCard().getSymbol();
            System.out.println(snapGame.dealCard().toString());
            snapGame.shuffleDeck();
        }
        System.out.println(snapGame.dealCard().toString());
        System.out.println("Snap!");
    }

    public static void main(String[] args) {
        Snap snap = new Snap();
        snap.playGame();
    }
}