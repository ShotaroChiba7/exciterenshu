import java.util.Scanner;

public class Cartest1{
	public static void main(String args[]){
		System.out.println("�K�\�����̏����l��ݒ肵�Ă�������");
		Scanner scan = new Scanner(System.in);
		int syokigass = scan.nextInt();
		//syokigass�ɃK�X������
		System.out.println(syokigass + "�̃K�\����������܂���");
		
		Car1 kuruma = new Car1();
		kuruma.setgass(syokigass);
		
		System.out.println("�K�\�������g���ꍇ��1�A�c�ʂ��݂�ꍇ��2����͂��Ă�������");
		
		do{
		Scanner scan2 = new Scanner(System.in);
		int gassdousuru = scan.nextInt();
			if (gassdousuru == 1){
			System.out.println("�g�p����K�\�����̗ʂ���͂��Ă�������");
			Scanner scan3 = new Scanner(System.in);
			int gassuse = scan.nextInt();
			kuruma.usegass(gassuse);
			}else{
			kuruma.showgass();
			}
		}while(kuruma.hantei());
		
	
		
		Man1 hito = new Man1();
		hito.setname("�}���I����");
		hito.setage(46);
		hito.showman();
		hito.ride(4);
		hito.ride(1);
		
		hito.setgass(21);
		hito.showgass();
		
		Man1 otosiyori = new Man1();
		otosiyori.showman();
		
		System.out.println("���݂̐l�Ԃ̐���" + Man1.count + "�l�ł��B");
		
		Man1 ningen = new Man1("�l��",21);
		ningen.showman();

	}
}
