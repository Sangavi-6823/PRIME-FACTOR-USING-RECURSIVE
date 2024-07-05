import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		System.out.println("Prime factors of " +num+ " are:");
        Primefactor(num);
	}
public static void Primefactor(int num) {
    int i=2;
    if(num==1){
        return;
    }
    while(num%i!=0){
        i=i+1;
    }
    System.out.print(i+" ");
    Primefactor(num/i);
}}
