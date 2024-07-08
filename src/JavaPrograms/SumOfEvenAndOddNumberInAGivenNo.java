package JavaPrograms;

public class SumOfEvenAndOddNumberInAGivenNo {
public static void main(String[] args) {
	int num=12345678;
	int sum1=0;
	int sum2=0;
	while(num!=0) 
	{
		int d=num%10;
		if(d%2==0)
		{
			sum1+=d;
		}
		else
		{
		 sum2+=d;	
		}
		num=num/10;
	}
	System.out.println(sum1);
	System.out.println(sum2);
}
}
