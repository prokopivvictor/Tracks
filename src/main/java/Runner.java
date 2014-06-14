
import entity.DataStorage;
import entity.Song;

import java.util.Random;


public class Runner {
    public static void main(String[] args) {

        Song asd = new Song(DataStorage.getRandomValue(DataStorage.getTitlesStorage()),DataStorage.getRandomValue(DataStorage.getBandsStorage()),DataStorage.getRandomValue(DataStorage.getAlbumsStorage()),124);
        System.out.println(asd.getBand()+asd.getAlbum()+asd.getTitle());
    }
}
