package com.epam.vp.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DataStorage {
    public static Random random = new Random();
    private static List<String> bandsStorage = new ArrayList<String>(Arrays.asList("Jack White", "Dead Weather", "White Stripes", "The Racounters"));
    private static List<String> albumsStorage = new ArrayList<String>(Arrays.asList("The White Stripes", "De Stijl", "White Blood Cells", "Elephant", "Get Behind Me Satan", "Icky Thump", "Broken Boy Soldiers", "Consolers of the Lonely", "Horehound",
            "Sea of Cowards", "Blunderbuss", "Lazaretto"));
    private static List<String> titlesStorage = new ArrayList<String>(Arrays.asList("Missing Pieces", "Sixteen Saltines", "Freedom at 21", "Love Interruption", "Blunderbuss", "Hypocritical Kiss",
            "Weep Themselves to Sleep", "I'm Shakin'", "Trash Tongue Talker", "Hip (Eponymous) Poor Boy", "I Guess I Should Go to Sleep", "On and On and On", "Take Me with You When You Go",
            "Three Women", "Lazaretto", "Temporary Ground", "Would You Fight For My Love?", "High Ball Stepper", "Just One Drink", "Alone In My Home", "Alone In My Home", "Alone In My Home",
            "Entitlement", "That Black Bat Licorice", "I Think I Found The Culprit", "Want And Able", "60 Feet Tall", "Hang You from the Heavens", "I Cut Like a Buffalo", "So Far from Your Weapon",
            "Treat Me Like Your Mother", "Rocking Horse", "New Pony", "Bone House", "3 Birds [Instrumental]", "No Hassle Night", "Will There Be Enough Water?"));

    public static List<String> getBandsStorage() {
        return bandsStorage;
    }

    public static List<String> getAlbumsStorage() {
        return albumsStorage;
    }

    public static List<String> getTitlesStorage() {
        return titlesStorage;
    }

    public static String getRandomValue(List<String> Storage) {
        return Storage.toArray()[random.nextInt(Storage.size())].toString();
    }
}
