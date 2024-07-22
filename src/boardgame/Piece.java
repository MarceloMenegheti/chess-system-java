package boardgame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    //only class in the same packeage can access or subclass
    protected Board getBoard() {
        return board;
    }


}
