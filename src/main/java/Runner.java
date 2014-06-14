
import entity.DataStorage;
import entity.Song;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Song> playlist = new ArrayList<Song>();
        double totalDuration=0;
        for (int i = 0; i < 15; i++) {
            Song song = new Song(DataStorage.getRandomValue(DataStorage.getTitlesStorage()), DataStorage.getRandomValue(DataStorage.getBandsStorage()), DataStorage.getRandomValue(DataStorage.getAlbumsStorage()), 2000 + (int)(Math.random() * ((2014 - 2000) + 1)));
            playlist.add(song);
            song.setDuration(2 + (Math.random() * ((10 - 2) + 1)));
            System.out.println(playlist.get(i).getTitle()+" "+playlist.get(i).getBand()+" "+playlist.get(i).getAlbum()+" "+playlist.get(i).getYear());
            totalDuration+=song.getDuration();
        }
        totalDuration = new BigDecimal(totalDuration).setScale(2, RoundingMode.UP).doubleValue();
        System.out.println("Total duration "+totalDuration);

        // Song asd = new Song(DataStorage.getRandomValue(DataStorage.getTitlesStorage()),DataStorage.getRandomValue(DataStorage.getBandsStorage()),DataStorage.getRandomValue(DataStorage.getAlbumsStorage()),124);
        // System.out.println(asd.getBand()+asd.getAlbum()+asd.getTitle()+asd.getYear());
    }
}
