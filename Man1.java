class Man1 extends Car1{
	String name;//name��錾
	int age;//age��錾
	static int count = 0;
	static int ashi = 2;
		
		
		
		@Override //����@Override�͂Ȃ��Ă����v�Ȃ̂�������Ə㏑�����Ă����Ƃ������Ƃ𖾎�����̂Ŕ��ɂ킩��₷��
		void showgass(){
		System.out.println("�I�[�o�[���C�h���ꂽ�K�\�����ʂ̕\��" + gass);
		}
		
		Man1(){
		name = "���O���ݒ�";
		age = 10000;
		count++;
		System.out.println(count + "�Ԗڂ̐l�Ԃł��B");		
		}
		Man1(String n,int p){
		name = n;
		age = p;
		count++;
		System.out.println(count + "�Ԗڂ̐l�Ԃł��B");
		}
		
		void setname(String n){//viod�͖߂�l���Ȃ��ꍇ
		this.name = n;
		}
		
		void setage(int p){
		this.age = p;
		}
		
		void showman(){
		System.out.println(this.name + "�͂���" + this.age + "�΂̖��ł�" + "���̐���" + ashi);
		}
		
		void ride(int r){
		
		System.out.println(this.name + "��" + r + "�L������܂����B");
		this.age = this.age - r * 10;
		if (this.age < 1){
		System.out.println(this.name + "�͎��������܂���");
		}else{
		System.out.println(this.name + "�̎����͂���" + this.age + "�N�ł��B");
		}
		}
		
		
	
}