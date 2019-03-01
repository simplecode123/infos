import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class substitution {
public static void main(String args[]) throws IOException
{
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter Text :");
	String msg=bf.readLine();
	String sc="";
	char c[]={'G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','A','B','C','D','E','F'};
	for(int i=0;i<msg.length();i++)
	{
		sc+=c[(msg.charAt(i)-65)%26];
	}
	System.out.println("SUBST CIPHER:"+sc);
}
}
