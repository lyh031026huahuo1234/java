package castle;

public class Handler{
    protected Game game;

    public Handler(Game game){
        this.game = game;
    }
    public boolean isBye(){
        return false;
    }
    public void doCmd(String word){

    }
}