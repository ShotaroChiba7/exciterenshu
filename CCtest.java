class CCtest{
  public static void main(String args[]){
    Television tv1 = new Television();
    Television tv2 = new Television();

    tv1.setPlace("����");
    tv2.setPlace("�Q��");

    tv1.setChannel(1);
    tv2.setChannel(8);

    tv1.dispChannel();
    tv2.dispChannel();
  }
}

class Television{
  int channelNo;
  String place;

  void setChannel(int newChannelNo){
    channelNo = newChannelNo;
  }

  void setPlace(String newPlace){
    place = newPlace;
  }

  void dispChannel(){
    System.out.println(place + "�ɂ���e���r�̌��݂̃`�����l���� " +  channelNo + " �ł�");
  }
}