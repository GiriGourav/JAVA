import java.util.Scanner;

/*class basics
{
    public static void main(String[] args)
     { 
        Scanner sc = new Scanner(System.in);
        int ch= sc.nextInt();
        switch (ch)
        {
            case 1: System.out.println("*");
            break;
            case 2: System.out.println("**");
            break;
            case 3: System.out.println("***");
            break;
            default : System.out.println("in valid choice");
        }
        
        
    }
}
class loops
{
    public static void main(String[] args) 
    {  int i=1;
       while (i<11)
       {
          System.out.println(i);
          i++;
       }   
    }
}
class doloop
{
    public static void main(String[] args) {
        int i=0;
        do{
            System.out.println(i);
            i++;
        }
        while(i<10);
    }
}
class table
{
    public static void main(String[] args)
     {
        Scanner sc =new Scanner (System.in);
        int n=sc.nextInt();
        for (int i=1;i<=10;i++)
        {
            int pro =1;
            pro=n*i;
            System.out.println(pro);
        }
    }
}*/class basics
{
    public static void main(String[] args) 
    {
        for(int i=1;i<=5;i++)
        {
            for (int j=5;j>i;j--)
            {
               System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*class paterns
{
    public static void main(String[] args) 
    {   
        for(int i=1;i<=5;i++)
        {
            for (int j=1;j<=i;j++)
            { 
                if((i+j)%2==0)
                {
                   System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }  
            System.out.println();
        }
    }
}
class Buterfly
{
    public static void main(String[] args)
    {
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int k=2*(4-i);k>=1;k--)
            {
                System.out.print(" ");
            }
            for(int f=1;f<=i;f++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=4;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int k=2*(4-i);k>=1;k--)
            {
                System.out.print(" ");
            }
            for(int f=1;f<=i;f++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/
/*class basics
{//parallelogram
    public static void main(String[] args) 
    {
      for(int i=1;i<=5;i++)
      {
        for(int j=4;j>=i;j--)
        {
            System.out.print(" ");
        }
        for (int k=1;k<=i;k++)
        {
            System.out.print("*");
        }
        for (int l=1;l<i;l++)
        {
            System.out.print("*");
        }
        System.out.println();
      }  
    }
}*/
/*class number pyramid
{
    public static void main(String[] args)
    {   
        int k=1;
        for(int i=1;i<=5;i++)
        {   
            for(int j=5;j>=i;j--)
            {
                System.out.print(" ");
            }
            for (int f=1;f<=i;f++)   
            {
                    System.out.print(k+" ");
            }  
            System.out.println();
           k++;
        }
    }
}*/
/*class Palindrom_pattern
{
    public static void main(String[] args) 
    {
        int f=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=4;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=i ;k>=1;k--)
            {
                System.out.print(k);
            }
            for (int l=2;l<=i;l++)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}*/
/*class Diamond_pattern
{
    public static void main(String[] args) {
        for(int i=1;i<=4;i++)
        {
            for(int k=3;k>=i;k--)
            {
               System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=4;i>=1;i--)
        {
            for(int k=3;k>=i;k--)
            {
               System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }        

    }
}*/
/*class basics
{// palindrom patern
 public static void main(String[] args) 
 {
    for(int i=1;i<=5;i++)
    {
        for(int j=4;j>=i;j--)
        {
            System.out.print(" ");
        }
        for(int k=i;k>=1;k--)
        {
            System.out.print(k);
        }
        for(int l=2;l<=i;l++)
        {
            System.out.print(l);
        }
        System.out.println();
    }
 }
}*/
/*class basics 
//Function
{
    public static void printMyName(String name)
    {
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String name=sc.nextLine();
        printMyName(name);
    }
}*/
/*class basics
//factorial_function
{
    public static int Factorial(int n) 
    {
        int fact=1;
        for(int nn=1;nn<=n;nn++)
        {
            fact=fact*nn;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int fac=Factorial(n);
        System.out.println(fac);
    }
}class basics
//find_number_in_array
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int []num=new int[6];
        for(int i=0;i<=5;i++)
        {
            num[i]=sc.nextInt();
        }
        for(int j=0;j<=5;j++)
        {
            System.out.println(num[j]);
        }
        System.out.println("enter the element to search:");
        int find=sc.nextInt();
        for(int j=0;j<=5;j++)
        {
            if (num[j]==find)
            {
               System.out.println(j);
            }
            else
            {
                System.out.println("num not found");
            }
        }


    }
}*/
/*class basics
//swaptwo numbers without using 3rd variable
{
        public static void main(String[] args) 
        {
           Scanner sc =new Scanner(System.in);
           int row=sc.nextInt();
           int col=sc.nextInt();
           row=row+col;
           col=row-col;
           row=row-col;
           System.out.println(row+"&"+col);

    }
}*/
/*class basics
//2Darray
{
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int ele[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
               ele[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
               System.out.print(ele[i][j]+" ");
            }
            System.out.println();
        }
    }
}*/
/*class basics
//armstrongfor 3digit number
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        double ou=Math.pow((n/100),3);
        double t=Math.pow(((n%100)/10),3);
        double k=Math.pow(((n%100)%10),3);
        if((ou+t+k)==n)
        {
            System.out.println(n+"is armstrong");
        }
        else
        {
            System.out.println(n+"is not armstrong");
        }
    }
}*/
/*public class basics 
{   
    public static void main(String[] args)
    {
       /*Scanner sc =new Scanner (System.in);
       System.out.println("enter the no elements:");
       int size = sc.nextInt();
       int aray[]= new int [size];
       for (int i=0;i<size;i++)
       {
          System.out.println("enter the elements:");
          aray[i]=sc.nextInt();
       }
       int k;
       for (k=0;k<size;k++);
       {
         System.out.print(aray[k]+" ");
       }*/

 /*      for(int i=5;i>=1;i--)
        {
           for(int j=1;j<=i;j++)
           {
            System.out.print(j);
           }
           System.out.println();
        }
    }
}*/

/*class basics
{
    //revers an array without using another array
    public static void main (String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
           System.out.println("enter the element:");
           arr[i]=sc.nextInt();
        }
        System.out.println("array:");
        for(int j=0;j<n;j++)
        {
           System.out.println(arr[j]);
        }
        int start=0;
        int last=n-1;
        while(start<last)
        {
            int temp=arr[start];
            arr[start]=arr[last];
            arr[last]=temp;
            start++;
            last--;
        }
        System.out.println("array after reversing:");
        for(int k=0;k<n;k++)
        {  
           System.out.print(arr[k]);
        }
    }
}*/
/*class basics
{
    //pairs in array
    public static void main (String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
           System.out.println("enter the element:");
           arr[i]=sc.nextInt();
        }
        System.out.println("array:");
        for(int j=0;j<n;j++)
        {
           System.out.println(arr[j]);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
    }
}*/
/*class basics
{
    //print sub array
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
           System.out.println("enter the element:");
           arr[i]=sc.nextInt();
        }
        int start=0;
        int end=0;
        for(int j=0;j<n;j++)
        {
            start=j;
            for(int k=0;k<n;k++)
            {
                end=k;
                for(int s=start;s<=end;s++)
                {
                    System.out.print(arr[s]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}*/
/*public class basics
{
    //print max sub array sum
     public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
           System.out.println("enter the element:");
           arr[i]=sc.nextInt();
        }
        int start=0;
        int end=0;
        int max= Integer.MIN_VALUE;
        int csum=0;
        for(int j=0;j<n;j++)
        {
            start=j;
            for(int k=0;k<n;k++)
            {
                end=k;
                csum=0;
                for(int s=start;s<=end;s++)
                {
                    csum=csum+arr[s];
                    System.out.println(csum);
                }
                if(max<csum)
                {
                    max=csum;
                }
                System.out.println();
            }
        }
        System.out.println("Max sum="+max);
     }
    
}*/
/*public class basics 
{
    //armstrong number
    public static void main(String[] args) 
    {
     for(int i=1;i<=10000;i++)
     {
        int orig=i;
        int t = orig;
        int digi=0;
        while(t>0)
        {
            digi++;
           t=t/10;
           
        }
        t=orig;
        int rem=0;
        int sum=0;
        while (t>0) 
        {
           rem=t%10;
           sum=sum+(int)(Math.pow(rem , digi)); 
           t=t/10;
        }
        if (sum==orig)
        {
            System.out.println(orig);
        }
     }
    }
}
*/
/*public class basics 
{
    //prifix subarray sum using prefixsum
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
           System.out.println("enter the element:");
           arr[i]=sc.nextInt();
        }
        int prefix[]=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            prefix[i]=prefix[i-1]+arr[i];
        }

        int maxsum=Integer.MIN_VALUE;
        for(int j=0;j<n;j++)
        {
            for(int k=j;k<n;k++)
            {
                int cursum=j==0?prefix[k]:prefix[k]-prefix[j-1];
                if(maxsum<cursum)
                {
                    maxsum=cursum;
                }
            }
        }
        System.out.println("max sum="+maxsum);
    }
}*/
/*public class basics 
{
    //kaidans algorithm
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
           System.out.println("enter the element:");
           arr[i]=sc.nextInt();
        }   
        int cursum=0;
        int ms =0;
        for(int i=0;i<n;i++)
        {
            cursum=cursum+arr[i];
            if(cursum<0)
            {
                cursum=0;
            }
            ms=Math.max(cursum, ms);
        }
        System.out.println(ms);

    }
}*/
/*public class basics 
{   
    //   trapping rain water
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
           System.out.println("enter the element:");
           arr[i]=sc.nextInt();
        }   
        int lm[]=new int[n];
        int rm[]=new int[n];
        lm[0]=arr[0];
        rm[n-1]=arr[n-1];
        for(int i=1;i<n;i++)
        {
           if(lm[i-1]>arr[i])
           {
            lm[i]=lm[i-1];
           }
           else
           {
            lm[i]=arr[i];
           }
        }
        for(int i=n-2;i>=0;i--)
        {
           if(rm[i+1]>arr[i])
           {
            rm[i]=rm[i+1];
           }
           else
           {
            rm[i]=arr[i];
           }
        }
        int he[]=new int[n];
        int trap_water=0;
        for(int j=0;j<n;j++)
        {
            he[j]=Math.min(lm[j],rm[j]);
            trap_water=trap_water+(he[j]-arr[j]);
        }
        System.out.println("trapwater="+trap_water);
    }
    
}*/
/*public class basics 
{
    //best time to buy & sell stocks
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int price[]=new int[n];
        for(int i=0;i<n;i++)
        {
           System.out.println("enter the element:");
           price[i]=sc.nextInt();
        }   
        int BP=Integer.MAX_VALUE;
        int mpro=0;
        for(int j=0;j<n;j++)
        {
            if(BP>price[j])
            {
                BP=price[j];
            }
            else
            {
                int profit=price[j]-BP;
                mpro=Integer.max(mpro,profit);
            }
        }
        System.out.println(mpro);

    }
    
}*/
/*public class basics 
{//bubble sort
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
           System.out.println("enter the element:");
           arr[i]=sc.nextInt();
        }   
        for(int j =0;j<arr.length-1;j++)
        {
            for(int k=0;k<arr.length-1-j;k++)
            {  if(arr[k]>arr[k+1])
               {
                  int temp=arr[k];
                  arr[k]=arr[k+1];
                  arr[k+1]=temp;
               }
            }
        }
        for(int l=0;l<arr.length;l++)
        {
            System.out.print(arr[l]);
        }

        System.out.println();
    }
    
}*/
/*class basics
{
    //selection sort
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
           System.out.println("enter the element:");
           arr[i]=sc.nextInt();
        }   
        for(int i=0;i<n-1;i++)
        {   int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[min]>arr[j])
                {
                     min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        for(int l=0;l<arr.length;l++)
        {
            System.out.print(arr[l]);
        }
    }
}*/
/*public class basics 
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
           System.out.println("enter the element:");
           arr[i]=sc.nextInt();
        } 
        for(int j=1;j<n;j++)
        {
             for(int k=j-1;k>=0;k--)
             {
                if(arr[j]>arr[k])
                {
                    int temp=arr[j];
                    arr[j]=arr[k];
                    arr[k]=temp;
                }
            
             }
        }
        for(int l=n-1;l>=0;l--)
        {
            System.out.print(arr[l]);
        }
    }
}*/

/*public class basics 
{
    //insertion sort
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
           System.out.println("enter the element:");
           arr[i]=sc.nextInt();
        } 
        for(int j=1;j<n;j++)
        {
            int cr=j;
            int pr=j-1;
            while(pr>=0 &&arr[pr]>arr[cr])
            {
                arr[pr+1]=arr[pr];
                pr--;
            }
            arr[pr+1]=arr[cr];
        }
        
        for(int l=0;l<n;l++)
        {
            System.out.print(arr[l]);
        }
        
    }
}


class basics
{
    public static void main (String[] args)
    {
       Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
       String ARR[]=new String[n];
       for(int i=0;i<n;i++)
       {
          ARR[i]=sc.next();
       }
       for (int i=0;i<n;i++)
       {   String k=ARR[i];
           if(k.length()>=8 && k.length()<=30 )
           {
               if( Character.isLetterOrDigit(k.charAt(i)))  
               {
                  if(Character.isDigit(k.charAt(0)))
                  {
                    System.out.println("Valid");
                  }
                  else
                  {
                    System.out.println("Invalid");
                  }
               }
               else
               {
                 System.out.println("Invalid");
               }
           }
           else
           {
               System.out.println("Invalid");
           }
       }
    }
    
}
#
class REcursionb
{ 
    public static int Fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int fnm1=Fact(n-1);
        int F=n*Fact(n-1);
        return F;
    }
    public static void main (String[] args)
    {
        int n=5;
        System.out.println(Fact(n));
    }
}*/