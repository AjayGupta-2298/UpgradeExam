import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Array");
		int n = sc.nextInt();
		List<List<Integer>> arrlist = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		for(int i=0 ;i<n;i++)
		{
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    List<Integer> subarr = new ArrayList<>();
		    subarr.add(a);
		    subarr.add(b);
		    arrlist.add(subarr);
		}
		
		for(int i=0;i<n;i++)
		{
		    boolean chk = checkRatio(arrlist.get(i));
		    if(chk == true)
		    {
		        ans.add(arrlist.get(i));
		    }
		}
		
		if(ans.size()>0)
		{
		    System.out.print("Eureka ");
		    for(List<Integer> sub : ans)
		    {
		        System.out.print(sub);
		    }
		}
	}
	
	public static boolean checkRatio(List<Integer>  arr )
	{
	    double ratio = arr.get(0)/(arr.get(1)*1.0);
	    
	    if(ratio >= 1.8 && ratio <= 1.9)
	    {
	        return true;
	        
	    }
	    
	    return false;
	}
}