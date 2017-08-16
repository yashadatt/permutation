import java.io.*;
import java.util.*;
class HelloWorld 
{   
    // TreeSet<String> s=new TreeSet<String>(); you can directly use Treeset to add permutation instead of printing @line17  and then print treeset
     HashMap<String , String> hm =new HashMap<String,String>();//this will be efficeint check before 
     public void StringPermutation(String input)
    {
        StringPermutation("", input);
    }
     
    private  void StringPermutation(String permutation, String input)
    {    
        if(input.length() == 0)
        {
        	System.out.println(permutation);
        	//s.add(permutation);
        }
        else
        {
            for (int i = 0; i < input.length(); i++)
            {	String per=permutation+input.charAt(i);
            	String ip=input.substring(0, i)+input.substring(i+1, input.length());
            	//System.out.println(hm.containsKey(per));
            	//System.out.println(hm.containsValue(ip));
            	 if(!(hm.containsKey(per)&&hm.containsValue(ip)) )
                    {	hm.put(per,ip);
                	    StringPermutation(per,ip );
                    }
            }
        }
    }
     
    public  static void main(String[] args) 
    {
    	HelloWorld  p=new HelloWorld();
    	Scanner sc=new Scanner(System.in);
    	String ips=sc.next();
        p.StringPermutation(ips);
        //System.out.println(p.hm);
        
        
        
    }    
}

