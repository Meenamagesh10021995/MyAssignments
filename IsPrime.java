package assignment1;

public class IsPrime {
public static void main(String[] args) {
	
		int n=6;
		
		boolean flag = false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				System.out.println("Non Prime");
				flag = true;
				break;
			}
		}
		if(!flag)
			System.out.println("Prime");
	}
}




		  
