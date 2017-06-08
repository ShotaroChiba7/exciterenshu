import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class hiraku{
	public static void main(String args[]){
		try{
			File file = new File("C:\\jsa\\p.txt");
					
			if(checkBeforeReadfile(file)){
				BufferedReader br = new BufferedReader(new FileReader(file));
				
				String str;
				while((str = br.readLine()) != null){
					System.out.println(str);
				}
				
				br.close();
			
			}else{
				System.out.println("ファイルが見つからないもしくは開けません");
			}
		}catch(FileNotFoundException e){
			System.out.println(e);
		}catch(IOException e){
			System.out.println(e);
		}
		
	}
	
	
	private static boolean checkBeforeReadfile(File file){
		if (file.exists()){
			if (file.isFile() && file.canRead()){
				return true;
			}
		}
		
		return false;
	}
}

