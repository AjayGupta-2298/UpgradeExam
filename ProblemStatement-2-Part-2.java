import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    System.out.println("Possible Dice throw for player 1 at cell 88 to reach destination(100) in exactly  4 steps : ");
	    recursion(88,100,0,new ArrayList<>());
	    
	    System.out.println("Possible Dice throw for player 2 at cell 87 to reach destination(100) in exactly  4 steps : ");
		recursion(87,100,0,new ArrayList<>());
	}
	
	public static void recursion(int sum,int target,int cnt,ArrayList<Integer> ans)
	{
	    if(sum > 100 || sum == 98 || cnt > 4)
	    {
	        return;
	    }
	    
	    if(sum == 100 && cnt == 4)
	    {
	        System.out.println(ans);
	        return;
	    }
	    
	    
	    
	    for(int i = 1;i <=6;i++)
	    {
	        ans.add(i);
	        recursion(sum+i,target,cnt+1,ans);
	        ans.remove(ans.size()-1);
	    }
	}
}