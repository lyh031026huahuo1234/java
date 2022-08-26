package dome;

public class CD extends Item{
    
    private String artist;
    private int numofTracks;
    
    public boolean equals(Object obj){
        CD cc = (CD) obj;
        return artist.equals(cc.artist);
    }

    public CD(String title, String artist,int numofTracks,int playingTime,String comment){
        super(title,playingTime,false,comment);
        //this.title = title;
        this.artist = artist;
        this.numofTracks = numofTracks;
        // this.playingTime = playingTime;
        // this.comment = comment;
    }

    public static void main(String[] args){
        CD a = new CD("a","b",2,2,"...");
        CD b = new CD("a","b",2,2,"...");
        System.out.println(a.equals(b));
    }

    public void print(){
        System.out.println("CD:"+title+":"+artist);
    }


}