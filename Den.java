//���͂����l�ȏ�̑f���̍ŏ��l��\������v���O����

import java.util.Scanner;

class Den{
	public static void main(String args[]){


    Scanner scan = new Scanner(System.in);


    System.out.println("2�ȏ�̐��l����͂��ĉ������B");

    

    int val = scan.nextInt();
    int hozon = val;
    int i = 2;//val���f�����ۂ����f����J��Ԃ��ϐ�i
    int j = 0;//j��2�Ȃ烋�[�v�𔲂���
    //�܂�val���f�������ׂ�
    //�Q�Ŋ������]��A3�Ŋ������]��A�A�A�A�Ƒ�����0�ɂȂ����炻�ꂪval�ƈ�v���邩
    //��v���Ȃ����val��1�𑫂�
    
    //���͂��ꂽ�l�̃`�F�b�N
    if (val < 2){
    System.out.println("2�ȉ��̐��l�ł�");
    }else{
    do{
           	if (val % i == 0){//val��i�Ŋ������]�肪0�Ȃ��
        	
    			if (val == i){//val��i����v�����
    			j = 2;//�f���Ƃ݂Ȃ�2
    			}
    			else{
	    		//�����ׂĂ���val���f���ł͂Ȃ��̂�val��1�𑫂���i������������
	    		val = val + 1;
	    		i = 1;
	    		}
    		}
    i = i + 1;
    }while(j != 2);
    
 	if (hozon == val){
 	System.out.println("���͂��ꂽ" + val + "�͑f���ł��B");
 	}else{
    System.out.println(hozon + "�ȏ�̐����ōŏ��ɂ���f����"+ val);    
	}
	}


		
	}
}