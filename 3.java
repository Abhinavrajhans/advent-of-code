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
				String s=br.readLine();
			if(s==null)break;
			HashMap<Character,Integer> map=new HashMap<>();
			for(int i=0;i<s.length()/2;i++) map.put(s.charAt(i), 1);
			
			for(int i=s.length()/2;i<s.length();i++)
			{
				if(map.containsKey(s.charAt(i)))map.put(s.charAt(i), 2);
			}
			  StringBuffer sb=new StringBuffer();
			  for(Map.Entry<Character, Integer> m:map.entrySet())
			  {
				  if(m.getValue()>1) {
					  if(m.getKey()>='a' && m.getKey()<='z') sum+=m.getKey()-'a'+1;
					  else sum+=m.getKey()-'A'+27;
					  sb.append(m.getKey());
				  }
			  }
			  System.out.println(sum);
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
