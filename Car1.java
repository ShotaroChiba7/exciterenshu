class Car1{
	public int gass;
	
	
	
	void setgass(int gass1){
	this.gass = this.gass + gass1;
	System.out.println("ガソリンを" + gass1 + "補給した");
	}
	
	void usegass(int gass1){
	if((gass - gass1) >= 0){
	this.gass = gass - gass1;
	System.out.println(gass1 + "走りました");
	}else{
	System.out.println("ガソリンが足りません" + gass1 + "もガソリンはありません。\n現在ガソリンは" + this.gass + "だけ残っています。");
	}
	}
	void showgass(){
	System.out.println("残りガソリン量" + this.gass);
	}
	
	boolean hantei(){
		if(this.gass > 0){
		return true;
		}else{
		System.out.println("ガスがつきました");
		return false;
		}
	}
	

	
}