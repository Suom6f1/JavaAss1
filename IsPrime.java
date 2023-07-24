package week2.day2;

public class IsPrime {
public static void main(String[] args) {
	int n=86;
	boolean a=false;
	for(int i=2;i<=n-2;++i) {
		if(n% i==0) {
			a = true;
		}
	}
	if(a)
		System.out.println("non-prime");
	else
		System.out.println("prime-number");
}
}
