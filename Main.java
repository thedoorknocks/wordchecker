import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("an");
        words.add("band");
        words.add("and");
        words.add("abandon");

        WordChecker checker = new WordChecker(words);

        System.out.println("Is word chain: " + checker.isWordChain());

        ArrayList<String> resultList = checker.createList("an");
        System.out.println("Words starting with 'an': " + resultList);
    }
}