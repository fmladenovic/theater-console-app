package domain;

public class Seat {
    private int row;
    private int number;

    public Seat() {}
    public Seat(int row, int number) {
        this.row = row;
        this.number = number;
    }

    public int getRow() {
        return this.row;
    }
    public void setRow(int row) {
        this.row = row;
    }

    public int getNumber() {
        return this.number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
}
