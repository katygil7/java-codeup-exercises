package Arrays;

import java.util.Random;

public class ServerNameGenerator {
    private Random rand = new Random();

    public static String [] adjectives = {"cosmic", "thicc"};
    public static String [] nouns = {"tesla", "cello", "adobe"};

    public static void main(String[] args) {
        String randomAdjective = getRandomStringFromArray(adjectives);
        String randonNoun = getRandomStringFromArray(nouns);
        System.out.println(randomAdjective);
        System.out.println(randonNoun);
    }

    private static String getRandomStringFromArray(String[] strings) {
//        Generate a random index from 0 to last element in strings
        int rand = (int) (Math.random() * strings.length);

//        return the element at the random index in strings
        return strings[rand];
//
    }
}
