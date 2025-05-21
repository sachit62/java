// interface implementation

public class interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("queen moves");
    }
}

class king implements ChessPlayer{
    public void moves(){
        System.out.println("king moves");
    }
}