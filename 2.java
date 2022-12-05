import java.util.*;
import java.io.*;

public class Main {
	public static Scanner obj = new Scanner(System.in);
	public static PrintWriter out = new PrintWriter(System.out);
    public static int i(String s)
    {
    	return Integer.parseInt(s);
    }
	public static void main(String[] args) {
		try
		{
			BufferedReader br=new BufferedReader(new FileReader("src//input.txt"));
			BufferedWriter bw=new BufferedWriter(new FileWriter("src//output.txt"));
			long sum=0;
			while(true)
			{
				String p=br.readLine();
				if(p==null)break;
				char a=p.charAt(0),k=p.charAt(2);
				
				
				
				if(k=='X')sum+=1;
				else if(k=='Y')sum+=2;
				else if(k=='Z')sum+=3;
				
				if(a=='A' ) { //rock
					if(k=='Y')sum+=6;
					else if(k=='X')sum+=3;
				}
				else if(a=='B') //paper
				{
					if(k=='Z')sum+=6;
					else if(k=='Y')sum+=3;
				}
				else //scicoor
				{
					if(k=='X')sum+=6;
					else if(k=='Z')sum+=3;
				}
				System.out.println(p);
			}
			System.out.println(sum);
			
		}
		catch(Exception ex)
		{
			System.out.println("exception is:"+ex);
			return;
		}
	}
}
