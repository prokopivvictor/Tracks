
import com.epam.vp.entity.*;
import org.apache.log4j.Logger;


public class Runner {

    private static Logger logger = Logger.getLogger(Runner.class);

    public static void main(String[] args) {
        Playlist MyPlaylist = new Playlist();
        MyPlaylist.generatePlaylist(10);
        for (int i = 0; i < MyPlaylist.getDefaultPlaylist().size(); i++) {
            logger.info(MyPlaylist.getDefaultPlaylist().get(i).getClass());
        }
        logger.info("__________________________");
        MyPlaylist.sortPlaylist(MyPlaylist.getDefaultPlaylist());
        for (int i = 0; i < MyPlaylist.getSortedPlaylist().size(); i++) {
            logger.info(MyPlaylist.getSortedPlaylist().get(i).getClass());
        }
        logger.info("__________________________");
        logger.info(MyPlaylist.getTotalDuration(MyPlaylist.getSortedPlaylist())+" мин");
    }
}


