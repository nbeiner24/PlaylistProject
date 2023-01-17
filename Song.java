/**
 * File for a Song class to be used in the Playlist Project
 * @author Nicolas Beiner
 * @version 1/17/2023
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
     
     /**
       * Returns the name of the song
       * 
       * @return name of the song
       */
    public String getName()
    {
        return name;
    }
    
     /**
       * Returns the artist of the song
       * 
       * @return artist of the song
       */
    public String getArtist()
    {
        return artist;
    }
    
     /**
       * Returns the duration of the song in seconds
       * 
       * @return duration of the song
       */
    public int getTime()
    {
        return time;
    }
    
     /**
       * Returns the duration of the song in minutes and seconds
       * 
       * @return duration of the song
       */
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
    
     /**
       * Returns the liked status of a song
       * 
       * @return liked status
       */
    public boolean getLike()
    {
        return liked;
    }
    
     /**
       * Updates the status of an unliked song to liked
       * 
       */
    public void like()
    {
        liked=true;
    }
    
     /**
       * Combines the name, artist, song length, and liked status into a String display.
       * 
       * @return String display of the song and song information
       */
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
