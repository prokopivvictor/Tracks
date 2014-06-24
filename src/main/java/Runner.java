
import com.epam.vp.entity.DataStorage;
import com.epam.vp.entity.Lecture;
import com.epam.vp.entity.Song;
import com.epam.vp.entity.Track;
import org.apache.log4j.Logger;

public class Runner {


    public static void main(String[] args) {
        Song asd = new Song.Builder(DataStorage.getRandomValue(DataStorage.getTitlesStorage()), DataStorage.getRandomValue(DataStorage.getBandsStorage())).build();


    }
}
