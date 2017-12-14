package JavaLab;

public class RegularExpression {
    public static void main(String[] arg) {
        String s = "I am a strange String, I am here to test the regular expression, hahahahaha, aaaabbc";
        String[] words = s.split(",? ");//， 和 拆分
        for(String word : words) {
            if(word.matches("a.*c|S.*g")) // this is find all words start with 'a' end with 'c'
                System.out.println(word);
        }
    }
}
