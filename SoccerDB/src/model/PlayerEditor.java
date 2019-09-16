package model;
 /*
  * player editor
  * �����̸�, ���ȣ, ������, 
  */


import model.domain.Player;
	
public class PlayerEditor{
	
	private static Player[] allData = new Player[7];
	private static int index;

	static {
		allData[0] = new Player("�����", "MF" , 7 );
		allData[1] = new Player("���缺", "MF" , 10);
		allData[2] = new Player("�����", "DF" , 4);
		allData[3] = new Player("��±�", "GK" , 1);
		allData[4] = new Player("Ȳ����", "FW" , 16);
		allData[5] = new Player("������", "GK" , 21);
		index = 6;
	}
	
	//��� ����� �˻�
		public static Player[] getAll() {
			return allData;
		}
	
	//����
	
	public static boolean insert(Player v) {
		if(index < 7) {
			allData[index++] = v;
			return true;
		}else {
			return false;
		}
	}
	//����
	public static boolean delete(String name){
		Player v = null;
		for(int i=0; i < allData.length; i++) {
			v = allData[i];
			if(v!=null && v.getName().equals(name)) {
				allData[i] = null;
				return true;
			}
		}
		return false;
	}
	
	//����
	public static Player update(String name){
		Player v = null;
		for(int i=0; i < allData.length; i++) {
			v = allData[i];
			if(v!=null && v.getName().equals(name)) {
				v.setPosition("MF");
				return v;
			}
		}
		return null;
	}
		
	
	//�ѻ�� ������ �˻�
	public static Player getPosition(String position){
		Player v = null;
		for(int i=0; i < allData.length; i++) {
			v = allData[i];
			if(v!=null && v.getPosition().equals(position)) {
				return v;
			}
		}
		return null;
	}
	
		
}

