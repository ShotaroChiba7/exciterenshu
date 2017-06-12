class CTtest{
  public static void main(String args[]){
    Pan ichigo = new Pan();
    Pan jam = new Pan();
//まずパンを作る

    ichigo.setKosu(5);
    //いちごパンの個数を5つに設定
    jam.setKosu(8);
//ジャムの個数を8に
    ichigo.setAzi("いちご");
    jam.setAzi("ジャム");
//それぞれ味を決定
	ichigo.setashita(10);
	jam.setashita(120);
	
	
    ichigo.dispPan();
    jam.dispPan();
  }
}

class Pan{
  int kosu;
  String azi;
  int ashita;
	
	
	void setashita(int op){
	ashita = op;
	}
	
  void setKosu(int newKosu){
    kosu = newKosu;
  }

  void setAzi(String newAzi){
    azi = newAzi;
  }

  void dispPan(){
    System.out.println(azi + "パンが " +  kosu + " 個あります\n" + "明日は " + ashita + " 個作ります");
  }
}