import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 * @author Nicolas Beiner
 * @version 1/15/2023
 */
public class Playlist
{
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    private ArrayList<Song> playlist;
    private int totalTime;

     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
    public Playlist()
    {
        playlist = new ArrayList<Song>();
        totalTime=0;
    }

      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */
    public void add(Song music)
    {
        playlist.add(music);
    }
    
    public void like(int position)
    {
        if (playlist.get(position).getLike()==false)
        {
            playlist.get(position).like();
        }
        else
        {
            System.out.println("This song is already liked...");
        }
    }
    
    public void delete(int position)
    {
        playlist.remove(playlist.get(position));
    }
    
    public void allSongs()
    {
        for (int i=0; i<playlist.size();i++)
        {
            System.out.println(playlist.get(i).toString());
        }
    }
    
    public void allLikedSongs()
    {
        for (int i=0; i<playlist.size();i++)
        {
            if (playlist.get(i).getLike()==true)
            {
                System.out.println(playlist.get(i).toString());
            }
        }
    }
    
    public void totalDuration()
    {
        for (int i=0; i<playlist.size(); i++)
        {
            totalTime+=playlist.get(i).getTime();
        }
        int minutes=((totalTime%86400)%3600)/60;
        int seconds=((totalTime%86400)%3600)%60;
        String totalLength = String.valueOf(minutes)+":"+String.valueOf(seconds);
        System.out.println(totalLength);
    }
    
    public void removeUnliked()
    {
        for (int i=0; i<playlist.size();i++)
        {
            if (playlist.get(i).getLike()==false)
            {
                System.out.print(i);
            }
        }
    }
}
