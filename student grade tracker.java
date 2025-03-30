//student grade tracker
import java.util.InputMismatchException;
import java.util.Scanner;

public class task1{
    static int max(int a[],int len){
        int m=0;
        for(int i = 0 ;i<len ;i++){
            if(a[i] > m){
                m=a[i];
            }
        }
        return m;
    }
    static int min(int a[],int len){
        int m =a[0];
        for(int i = 0 ;i<len ;i++){
            if(a[i] < m){
                m=a[i];
            }
        }
        return m;
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{  
            int op =  0;
            do{
               System.out.print("enter the number of subjects whose marks you want to enter: ");
               int n = sc.nextInt();
               int a[] = new int[n];
               for(int i=0 ;i < a.length;i++){
                   System.out.print("enter the marks of subject "+(i+1)+": ");
                   a[i]=sc.nextInt();
               }
               int sum=0;
               for(int j = 0 ; j<a.length ; j++){
                   sum=sum+a[j];
               }
               int average = sum/a.length;
               System.out.println("the average of this student's marks is: "+(average));
               System.out.println("the maximum marks of the student is: "+(max(a,a.length)));
               System.out.println("the minimum marks of the student is: "+(min(a,a.length)));
               System.out.print("do you want to calculate for another set of marks? press 1 for yes or 0 for no : ");
               op=sc.nextInt();
            }while(op!=0);   

           System.out.println("thanks for using!");
        }
        catch(InputMismatchException e){
                  System.out.println("invalid input!");
           }
    }
       



}