class mozihikaku{
	public static void main(String args[]){
		String str1 = "あいう";
		String str2 = "あいう";
		String str3 = "あい";
		str3 = str3 + "う";
		
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);
		System.out.println("str1 == str2");
		
		if (str1 == str2){
			System.out.println("等しい");
		}else{
			System.out.println("等しくない");
		}
		System.out.println("str1 == str3");
		
		if (str1 == str3){
			System.out.println("等しい");
		}else{
			System.out.println("等しくない");
		}
		
		System.out.println("str1.equals(str3)");
		
		if (str1.equals(str3)){
			System.out.println("等しい");
		}else{
			System.out.println("等しくない");
		}


		}
}