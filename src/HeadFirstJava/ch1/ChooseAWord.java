package HeadFirstJava.ch1;
import java.util.random.RandomGenerator;
public class ChooseAWord {

    public static void main(String[] args) {
        String[] wordListOne = {"a","b","c","d","e"};
        String[] wordListTwo = {"f","g","h","i","j"};
        String[] wordListThree = {"k","l","m","n","o"};

        // find out how many words in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // generate three random numbers
        int rand1 = RandomGenerator.getDefault().nextInt(oneLength);
        int rand2 = RandomGenerator.getDefault().nextInt(twoLength);
        int rand3 = RandomGenerator.getDefault().nextInt(threeLength);

        //building a phrase
        String phrase = wordListOne[rand1]+" "+wordListTwo[rand2]+" "+wordListThree[rand3];

        // print phrase
        System.out.println("what we need is "+phrase);


    }
}
