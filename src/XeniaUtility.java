package src;

public class XeniaUtility {

    public static void displayStatus (SnakeObject obj) {
    }

    public static void showCurrentLevel (SnakeObject obj) {
        String board = obj.getBoard();
        String[] rows = board.split("=");
        for (String row : rows) {
            System.out.println(row);
        }
    }
}
