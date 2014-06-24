
import entity.DataStorage;
import entity.Song;
import entity.Track;
import org.apache.log4j.Logger;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Runner {
    private static Logger logger = Logger.getLogger(Runner.class.getName());
    public static void main(String[] args) {
        ArrayList<Track> playlist = new ArrayList<Track>();
        double totalDuration=0;
        for (int i = 0; i < 15; i++) {
            Song song = new Song(DataStorage.getRandomValue(DataStorage.getTitlesStorage()), DataStorage.getRandomValue(DataStorage.getBandsStorage()), DataStorage.getRandomValue(DataStorage.getAlbumsStorage()), 2000 + (int)(Math.random() * ((2014 - 2000) + 1)));
            song.setDuration(2 + (Math.random() * ((10 - 2) + 1)));
            totalDuration=+totalDuration+song.getDuration();
            playlist.add(song);
            logger.info(song.getAlbum());
            logger.info(song.getBand());
        }
        totalDuration = new BigDecimal(totalDuration).setScale(2, RoundingMode.UP).doubleValue();
        System.out.println("Total duration "+totalDuration);
    }
}
