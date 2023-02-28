public class WordCount {
    int getCount(String sentence)
    {
        int count = 0;
        String[] arr = sentence.split(" ");
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i].equals("Rahma"))
            {
                count++;
            }    
        }
        return count;
        
    }
}
