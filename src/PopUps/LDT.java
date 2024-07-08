package PopUps;

import java.time.LocalDateTime;

public class LDT {
public static void main(String[] args) {
	LocalDateTime ldt=LocalDateTime.now();//as date keeps changing
	System.out.println(ldt);
	int date=ldt.getDayOfMonth();//return type is int so store in int  ref variable
	System.out.println(date);
	String month=ldt.getMonth().toString().toLowerCase();
	System.out.println(month);
	month=month.replace(month.charAt(0), (char)(month.charAt(0)-32));
	//typecasting as converting from char to string
	//as we are converting from lowercase to uppercase so -32 else +32
	//converting char to string with the help of ascii value 'a'-'A'=97-65=32
	System.out.println(month);
}
}
