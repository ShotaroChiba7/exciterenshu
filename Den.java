//入力した値以上の素数の最小値を表示するプログラム

import java.util.Scanner;

class Den{
	public static void main(String args[]){


    Scanner scan = new Scanner(System.in);


    System.out.println("2以上の数値を入力して下さい。");

    

    int val = scan.nextInt();
    int hozon = val;
    int i = 2;//valが素数か否か判断する繰り返し変数i
    int j = 0;//jが2ならループを抜ける
    //まずvalが素数か調べる
    //２で割った余り、3で割った余り、、、、と続けて0になったらそれがvalと一致するか
    //一致しなければvalに1を足す
    
    //入力された値のチェック
    if (val < 2){
    System.out.println("2以下の数値です");
    }else{
    do{
           	if (val % i == 0){//valをiで割った余りが0ならば
        	
    			if (val == i){//valとiが一致すれば
    			j = 2;//素数とみなす2
    			}
    			else{
	    		//今調べているvalが素数ではないのでvalに1を足してiを初期化する
	    		val = val + 1;
	    		i = 1;
	    		}
    		}
    i = i + 1;
    }while(j != 2);
    
 	if (hozon == val){
 	System.out.println("入力された" + val + "は素数です。");
 	}else{
    System.out.println(hozon + "以上の整数で最初にくる素数は"+ val);    
	}
	}


		
	}
}