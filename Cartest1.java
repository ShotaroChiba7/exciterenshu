import java.util.Scanner;

public class Cartest1{
	public static void main(String args[]){
		System.out.println("ガソリンの初期値を設定してください");
		Scanner scan = new Scanner(System.in);
		int syokigass = scan.nextInt();
		//syokigassにガスが入る
		System.out.println(syokigass + "のガソリンが入りました");
		
		Car1 kuruma = new Car1();
		kuruma.setgass(syokigass);
		
		System.out.println("ガソリンを使う場合は1、残量をみる場合は2を入力してください");
		
		do{
		Scanner scan2 = new Scanner(System.in);
		int gassdousuru = scan.nextInt();
			if (gassdousuru == 1){
			System.out.println("使用するガソリンの量を入力してください");
			Scanner scan3 = new Scanner(System.in);
			int gassuse = scan.nextInt();
			kuruma.usegass(gassuse);
			}else{
			kuruma.showgass();
			}
		}while(kuruma.hantei());
		
	
		
		Man1 hito = new Man1();
		hito.setname("マリオさん");
		hito.setage(46);
		hito.showman();
		hito.ride(4);
		hito.ride(1);
		
		hito.setgass(21);
		hito.showgass();
		
		Man1 otosiyori = new Man1();
		otosiyori.showman();
		
		System.out.println("現在の人間の数は" + Man1.count + "人です。");
		
		Man1 ningen = new Man1("人間",21);
		ningen.showman();

	}
}
