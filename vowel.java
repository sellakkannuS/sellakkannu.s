package sellam;
import java.util.Scanner;
public class vowel {
	public static void main(String[]args){
		char a;
		System.out.println("enter the letter");
		Scanner sc=new Scanner(System.in);
		a=sc.next().charAt(0);
		String s=String.valueOf(a).toLowerCase();
		if(s.charAt(0)>96&&s.charAt(0)<123){
			if(s.equals("a")||s.equals("e")||s.equals("i")||s.equals("o")||s.equals("u")){
				System.out.println("vowel");
			}
			else
			{
				System.out.println("constont");
			}
					}
		else System.out.println("invalid");

	}
	
			}
		
