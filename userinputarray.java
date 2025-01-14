import java.util.Scanner;

class userinputarray{
public static void main(String [] args) {
Scanner sc=new Scanner(System.in);
int a[]=new int [10];
System.out.println("Enter Element into array:");
for( int i=0;i<a.length;i++) {
a[i]=sc.nextInt();
sc.close();
}
}