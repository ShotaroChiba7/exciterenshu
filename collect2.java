import java.util.ArrayList;

class collect2{
	public static void main(String args[]){
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("日本");
		array.add("ブラジル");
		array.add("abcde");
		
		String country = array.get(2);
		System.out.println(country);
		System.out.println(array.size());
	}
}