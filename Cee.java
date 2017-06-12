class Cee{
	public static void main(String args[]){
		System.out.println("abc");
		
		int result[] = new int[2];
		
		result[0] = 85;
		result[1] = 70;
		
		try{
			for (int i = 0; i < 10; i++){
				System.out.println(result[i]);
			}
		
		
		}
		
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("”z—ñ‚Ì”ÍˆÍ‚ð’´‚¦‚Ä‚¢‚Ü‚·");
		}
	}
}