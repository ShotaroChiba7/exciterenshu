class CTtest{
  public static void main(String args[]){
    Pan ichigo = new Pan();
    Pan jam = new Pan();
//�܂��p�������

    ichigo.setKosu(5);
    //�������p���̌���5�ɐݒ�
    jam.setKosu(8);
//�W�����̌���8��
    ichigo.setAzi("������");
    jam.setAzi("�W����");
//���ꂼ�ꖡ������
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
    System.out.println(azi + "�p���� " +  kosu + " ����܂�\n" + "������ " + ashita + " ���܂�");
  }
}