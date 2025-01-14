import java.util.Scanner;

public class Spiralmatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array R & C:");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int matrix[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        int startrow=0;
        int endrow=n-1;

        int startcol=0;
        int endcol=m-1;
        while(startrow <= endrow && startcol<=endcol)
        {
            //top
            for(int i=startcol;i<=endcol;i++)
            {
                System.out.println(matrix[startrow][i]);
            }
            //Right
            for(int j=startrow+1;j<=endrow;j++)
            {
                System.out.println(matrix[j][endcol]);
            }
            //bottom
            for(int i=endcol-1;i>=startcol;i--)
            {
                if(startrow==endrow)
                {
                    break;
                }
                System.out.println(matrix[endrow][i]);
            }
            //left
            for(int j=endrow-1;j>=startrow+1;j--)
            {   
                if(startcol==endcol)
                {
                    break;
                }
                System.out.println(matrix[j][startcol]);
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
        System.out.println();
    }
}
