import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 * @author Nicolas Beiner
 * @version 1/17/2023
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
      
      /**
       * Adds a Song object to the playlist.
       * 
       * @param Any song object
       */
    public void add(Song music)
    {
        playlist.add(music);
    }
    
    /**
       * Likes a Song at a certain position in the playlist.
       * 
       * @param Any position in the playlist
       */
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
    
    /**
       * Deletes a Song at a certain position in the playlist.
       * 
       * @param Any position in the playlist
       */
    public void delete(int position)
    {
        playlist.remove(playlist.get(position));
    }
    
    /**
       * Displays all songs on the playlist.
       * 
       */
    public void allSongs()
    {
        for (int i=0; i<playlist.size();i++)
        {
            System.out.println(playlist.get(i).toString());
        }
    }
    
    /**
       * Displays all liked songs on the playlist.
       * 
       */
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
    
    /**
       * Calculates and displays the total duration of the playlist.
       * 
       */
    public void totalDuration()
    {
        for (int i=0; i<playlist.size(); i++)
        {
            totalTime+=playlist.get(i).getTime();
        }
        int minutes=totalTime/60;
        int seconds=totalTime%60;
        String totalLength = String.valueOf(minutes)+":"+String.valueOf(seconds);
        System.out.println(totalLength);
    }
    
    /**
       * Removes all unliked songs from the playlist.
       * 
       */
    public void removeUnliked()
    {
        for (int i=playlist.size()-1; i>=0;i--)
        {
            if (playlist.get(i).getLike()==false)
            {
                playlist.remove(i);
            }
        }
    }
}
