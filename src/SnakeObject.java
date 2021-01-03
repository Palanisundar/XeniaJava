package src;

public class SnakeObject {

    private String row;
    private String col;
    private String length;
    private String points;
    private StringBuilder board;

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getBoard() {
        return this.board.toString();
    }

    public void init(String row, String col, String length, String points) {
        this.setRow(row);
        this.setCol(col);
        this.setLength(length);
        this.setPoints(points);
    }

    public void initSnake(SnakeObject obj) {
        int length = Integer.parseInt(obj.getLength());
        PositionEnum.HEAD.setRowPosition("0");
        PositionEnum.HEAD.setColPosition("");
    }

    public void drawWall(SnakeObject obj) {
        this.board = new StringBuilder();
        int row = Integer.parseInt(obj.getRow());
        int col = Integer.parseInt(obj.getCol());
        for (int rowItr = 0; rowItr <= (row + 1); rowItr++) {
            for (int colItr = 0; colItr <= (col + 1); colItr++) {
                if (rowItr == 0 || rowItr == (row + 1)) {
                    this.board.append("-");
                }
                else if (colItr == 0 || colItr == (col + 1)) {
                    this.board.append("|");
                }
                else {
                    this.board.append(" ");
                }
            }
            this.board.append("=");
        }
    }

    public void drawSnake(SnakeObject obj) {
    }

}
