class aaa{
	public static void main(String args[]){
		int a = 0;
		int b = 0;
		try{
		
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		}catch(NumberFormatException e){
			System.out.println("数値ではない何かが入力されています。");
			System.exit(0);
		}
		
		tasu(a,b);
		a = bai(a);
		b = bai(b);
		System.out.println(a);
		System.out.println(b);
		
	}


	private static void tasu(int a, int b){
	System.out.println("たすと");
	System.out.print(a+b);
		return;
	}
	
	private static int bai(int a){
	System.out.println("倍にします");
	return a * 2;
	}
}


	