package core;

public class DecrementIncrement {
public static void main(String[] args) {
	int a, b=1, c=1;
	a = b+c;
	int i=2;
	i+=i++ + ++i;
	System.out.println(i);
	System.out.println(a);
	
	if (a==c) {
		System.out.println("A равно С");
	}
	
	if ((a==c) || (b==c)) {
		System.out.println("Или А равно С, или Б равно С");
	}
	
}
}
