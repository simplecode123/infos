import java.util.Scanner;

	public class Sdes {
		public static void main(String args[])
		{
			System.out.println("Enter the key: ");
			Scanner sc=new Scanner(System.in);
			String key=sc.nextLine();
			String P10="2416390875";
			String P8="52637498";
			String K="";
			for(int i=0;i<10;i++){
				int a=(P10.charAt(i)-48);
				K=K+key.charAt(a);
			}
			System.out.println(K);
			int p1[]=new int[5];
			int p2[]=new int[5];
			for(int i=0;i<5;i++){
				p1[i]=K.charAt(i)-48;
			}
			for(int i=0;i<5;i++){
				p2[i]=K.charAt(i+5)-48;
			}
			int p11[]=new int[5];
			int p12[]=new int[5];
			int l=p1[0];
			
			for(int i=1,j=0;i<5;i++){
				p11[j]=p1[i];
				j++;
				}
			p11[4]=l;
			String S="";
			for(int i=0;i<5;i++) {
				S=S+(p11[i]);
			}

			int h=p2[0];
			for(int i=1,j=0;i<5;i++){
				p12[j]=p2[i];
				j++;
				}
			p12[4]=h;
			for(int i=0;i<5;i++) {
				S=S+(p12[i]);
			}
			String k1="";
			for(int i=0;i<8;i++){
				int a=(P8.charAt(i)-48);
				k1=k1+S.charAt(a);
			}
			System.out.println(k1);			
	}

}
