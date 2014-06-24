
import com.epam.vp.entity.DataStorage;
import com.epam.vp.entity.Lecture;
import com.epam.vp.entity.Song;
import com.epam.vp.entity.Track;
import org.apache.log4j.Logger;

import java.util.ArrayList;

public class Runner {
    private static Logger logger = Logger.getLogger(Runner.class.getName());

    public static void main(String[] args) {
        Song asd = new Song.Builder(DataStorage.getRandomValue(DataStorage.getTitlesStorage()), DataStorage.getRandomValue(DataStorage.getBandsStorage())).build();
        logger.info(String.format("%s - %s", asd.getBand(), asd.getTitle()));
        Lecture dsa = new Lecture.Builder("TBalashow","Java").build();
        logger.info(String.format("%s - %s", dsa.getAuthor(), dsa.getTopic()));
    }
}
