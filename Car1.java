class Car1{
	public int gass;
	
	
	
	void setgass(int gass1){
	this.gass = this.gass + gass1;
	System.out.println("ƒKƒ\ƒŠƒ“‚ğ" + gass1 + "•â‹‹‚µ‚½");
	}
	
	void usegass(int gass1){
	if((gass - gass1) >= 0){
	this.gass = gass - gass1;
	System.out.println(gass1 + "‘–‚è‚Ü‚µ‚½");
	}else{
	System.out.println("ƒKƒ\ƒŠƒ“‚ª‘«‚è‚Ü‚¹‚ñ" + gass1 + "‚àƒKƒ\ƒŠƒ“‚Í‚ ‚è‚Ü‚¹‚ñB\nŒ»İƒKƒ\ƒŠƒ“‚Í" + this.gass + "‚¾‚¯c‚Á‚Ä‚¢‚Ü‚·B");
	}
	}
	void showgass(){
	System.out.println("c‚èƒKƒ\ƒŠƒ“—Ê" + this.gass);
	}
	
	boolean hantei(){
		if(this.gass > 0){
		return true;
		}else{
		System.out.println("ƒKƒX‚ª‚Â‚«‚Ü‚µ‚½");
		return false;
		}
	}
	

	
}