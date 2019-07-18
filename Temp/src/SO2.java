import java.util.Scanner;


public class SO2 {

	private static int i;

    public static void main(String[] args) 
    {
        int n,num1,num3;
        int arr[] = new int[50];

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number you want in array:");
        n = scan.nextInt();
        int a[] = new int[n];
        System.out.println("Enter any number:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int num = i + 1; num < n; num++) 
            {
                if (a[i] > a[num]) 
                {
                    num1 = a[i];
                    a[i] = a[num];
                    a[num] = num1;
                }
            }
        }

        System.out.print("Ascending Order:");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.println(a[n-1]);

        System.out.println("Enter Last number:" );
        num1= scan.nextInt();

        arr = a ;
        System.out.print("New Array Position: ");
        for(i=0; i<n+1; i++)
        {
            System.out.print(arr[i] + " ");

        }
    }
}
	

