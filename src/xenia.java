package src;

import java.util.Scanner;

public class xenia {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Row : "); String row = scan.nextLine();
        System.out.print("Col : "); String col = scan.nextLine();
        System.out.print("Initial Length : "); String initLength = scan.nextLine();
        System.out.print("Points to grow : "); String points = scan.nextLine();

        SnakeObject snakeInit = new SnakeObject();
        snakeInit.init(row, col, initLength, points);
        snakeInit.drawWall(snakeInit);
        XeniaUtility.showCurrentLevel(snakeInit);
    }
}
