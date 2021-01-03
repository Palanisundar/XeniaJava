package src;

public enum PositionEnum {
    HEAD("0", "0"),
    TAIL("0", "0");

    PositionEnum(String rowPosition, String colPosition) {
        this.rowPosition = rowPosition;
        this.colPosition = colPosition;
    }

    private String rowPosition;
    private String colPosition;

    public String getRowPosition() {
        return rowPosition;
    }

    public void setRowPosition(String rowPosition) {
        this.rowPosition = rowPosition;
    }

    public String getColPosition() {
        return colPosition;
    }

    public void setColPosition(String colPosition) {
        this.colPosition = colPosition;
    }
}
