public class MainClassWordCount {
    public static void main(String[] args)
    {
        String sentece = "Rahma El-Sheikh and her cat capotshi";
        WordCount obj1 = new WordCount ();
        System.out.println(obj1.getCount(sentece));
    }
}
