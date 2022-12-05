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
				String o=br.readLine();
				if(o==null)break;
				String[] p=o.split(",");
				System.out.println(p[0]+" "+p[1]);
				String[] a=p[0].split("-");
				String[] b=p[1].split("-");
				int a1=Integer.parseInt(a[0]);
				int a2=Integer.parseInt(a[1]);
				int a3=Integer.parseInt(b[0]);
				int a4=Integer.parseInt(b[1]);
				if(a1<=a3 && a4<=a2)sum+=1;
				else if(a3<=a1 && a2<=a4)sum+=1;
				//System.out.println(a[0]+" "+a[1]+" "+b[0]+" "+b[1]);
				//break;
				System.out.println("sum is:"+sum);
			}
			
			br.close();
			bw.close();
		}
		catch(Exception ex)
		{
			System.out.println("exception is:"+ex);
			return;
		}
	}
}
