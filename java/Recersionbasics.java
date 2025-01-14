public class Recersionbasics 
{
    
    /*public static void printInc(int n)
    {
        if(n==1)
        {
          System.out.println(n);
          return;
        }
        printInc(n-1);
        System.out.println(n);
    }*/
    public static int firstoccurance(int arr[],int key,int i)
    {
        if(i == arr.length)
        {
            return -1;
        }
        if(arr[i] == key)
        {
            return i;
        }
        return firstoccurance(arr, key, ++i );
    }
    public static void main(String[] args) 
    {
        int arr[]={8,3,6,9,5,10,2,5,3};
        System.out.println(firstoccurance(arr,5,0));
    }
}
