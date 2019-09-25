public class ServerNameGenerator {

    static String[] adjectives = {"Shiny", "Befuddled", "Outraged", "Hallucinating", "Morose", "Burning", "Microscopic", "Flying", "Frozen", "Sweaty"};
    static String[] nouns = {"Lemur", "Doctor", "Knight", "Hippo", "Comrad", "Monk", "Rogue", "Clown", "Goat", "Astronaut"};



    public static void main(String[] args) {

        int firstRandom = (int)(Math.random() * 10);
        int secondRandom = (int)(Math.random() * 10);
        String randomAdjective = adjectives[firstRandom];
        String randomNoun = nouns[secondRandom];

        System.out.format("Here is your servername:\n%s %s\nI'm sorry about this.", randomAdjective, randomNoun);

    }

}
