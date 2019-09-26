public class ServerNameGenerator {

    static String[] adjectives = {"Shiny", "Befuddled", "Outraged", "Hallucinating", "Morose", "Burning", "Microscopic", "Flying", "Frozen", "Sweaty"};
    static String[] nouns = {"Lemur", "Doctor", "Knight", "Hippo", "Comrad", "Monk", "Rogue", "Clown", "Goat", "Astronaut"};

    public static String returnRandom(String[] arr){
        return arr[(int)(Math.random() * arr.length)];
    }

    public static void main(String[] args) {

        for(int i = 0; i < 100; i++) {
            System.out.format("Here is your servername:\n%s %s\nI'm sorry about this.\n", returnRandom(adjectives), returnRandom(nouns));
        }

    }

}
