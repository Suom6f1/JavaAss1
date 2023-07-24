package week2.day2;

public class Fibbinocci {
	public static void main(String[] args) {
		int fiN=0, seC=1, nextN=0, lastN=56;
		
		for(int i=0;i<11;i++) {
			if(fiN<=lastN) {
				System.out.println(fiN+"");
				nextN=fiN+seC;
				fiN=seC;
				seC=nextN;
				
			}
		}
	}

}
