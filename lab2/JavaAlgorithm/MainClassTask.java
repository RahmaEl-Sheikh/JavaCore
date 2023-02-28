public class MainClassTask {
    public static void main(String[] args)
    {
        int[] arrInt = new int[1000];
        BinarySearch binSearchObj = new BinarySearch();
        for (int i = 0; i < 1000; i++)
        {
            arrInt[i] = i*2;
           
        }
       
        int x = binSearchObj.binSearch(arrInt, 60);
        System.out.println(x);
        
    }
}
