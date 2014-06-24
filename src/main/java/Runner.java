
import com.epam.vp.entity.DataStorage;
import com.epam.vp.entity.Song;
import com.epam.vp.entity.Track;
import org.apache.log4j.Logger;

import java.util.ArrayList;

public class Runner {
    private static Logger logger = Logger.getLogger(Runner.class.getName());
    public static void main(String[] args) {
        /*ArrayList<Track> playlist = new ArrayList<Track>();
        for (int i = 0; i < 5; i++) {
            Song.createRandomSong(playlist);
        }*/
        Song asd = new Song.Builder(DataStorage.getRandomValue(DataStorage.getTitlesStorage()),DataStorage.getRandomValue(DataStorage.getBandsStorage())).build();
        logger.info(asd.getBand()+" - "+asd.getTitle());
    }
}
