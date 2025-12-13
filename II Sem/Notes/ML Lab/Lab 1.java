public class lab1 {
	public static void main(String args[]) {
		int i, big, x;
		big= Integer.parseInt(args[0]);
		for(i=1;i<args.length;i++) {
			x=Integer.parseInt(args[i]);
			System.out.println( big);
			if(x>big) {
				big =x;
				
			}
		}
		System.out.println("Biggest : "+ big);
	}

