class Car1{
	public int gass;
	
	
	
	void setgass(int gass1){
	this.gass = this.gass + gass1;
	System.out.println("�K�\������" + gass1 + "�⋋����");
	}
	
	void usegass(int gass1){
	if((gass - gass1) >= 0){
	this.gass = gass - gass1;
	System.out.println(gass1 + "����܂���");
	}else{
	System.out.println("�K�\����������܂���" + gass1 + "���K�\�����͂���܂���B\n���݃K�\������" + this.gass + "�����c���Ă��܂��B");
	}
	}
	void showgass(){
	System.out.println("�c��K�\������" + this.gass);
	}
	
	boolean hantei(){
		if(this.gass > 0){
		return true;
		}else{
		System.out.println("�K�X�����܂���");
		return false;
		}
	}
	

	
}