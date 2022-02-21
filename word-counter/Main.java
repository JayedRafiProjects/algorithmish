public class Main {
    public static void main(String[] args){
        //test
        String sentence = "I am a cat. I love to sleep.";
        System.out.println(countWord(sentence));
    }

    //word counter
    //sentence with space
    public static int countWord(String sentence){
        String words[] = sentence.split(" ");
        int counter = words.length;
        return counter;
    }
}
