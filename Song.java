/**
 * File for a Song class to be used in the Playlist Project
 * @author Nicolas Beiner
 * @version 1/15/2023
 */
public class Song
{
    //Fields-- what information do we want each Song to store?
    private boolean liked;
    private String name;
    private String artist;
    private String length;
    private int minutes;
    private int seconds;
    private int time;

    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song(String name, String artist, int time)
    {
        liked=false;
        this.name = name;
        this.artist = artist;
        this.time = time;
    }

     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */
    public String getName()
    {
        return name;
    }
    
    public String getArtist()
    {
        return artist;
    }
    
    public int getTime()
    {
        return time;
    }
    
    public String getLength()
    {
        minutes=time/60;
        seconds=time%60;
        if (String.valueOf(seconds).length()==1)
        {
            length = String.valueOf(minutes)+":0"+String.valueOf(seconds);
        }
        else
        {
            length = String.valueOf(minutes)+":"+String.valueOf(seconds);
        }
        return length;
    }
    
    public boolean getLike()
    {
        return liked;
    }
    
    public void like()
    {
        liked=true;
    }
    
    public String toString()
    {
        String toString = "";
        if (liked==true)
        {
            toString= name+" by "+artist+" ("+getLength()+") -- liked";
        }
        else
        {
            toString= name+" by "+artist+" ("+getLength()+")";
        }
        return toString;
    }

}
