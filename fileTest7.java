import java.io.File;

class fileTest7{
	public static void main(String args[]){
		File newfile = new File("C:\\jsa\\sub\\bf\\mk");
		
			if(newfile.mkdirs()){
				System.out.println("ディレクトリの作成に成功しました");
			}else{
				System.out.println("ディレクトリの作成に失敗しました");
			}
		
	}
}
