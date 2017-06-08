package program;

public class countdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int	n=Integer.parseInt(args[0]);
	int count=0;
		while(n!=0)
		{
			int a=n/10;
			count++;
			n=a;
		}
System.out.println(count);
	
	}

}
