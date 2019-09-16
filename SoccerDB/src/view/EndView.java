package view;

import model.domain.Player;

public class EndView {

	public static void printAll(Player[] all) {
		for(Player v : all) {
			if(v != null) {
				System.out.println(v.toString());
			}
		}
	}

	public static void printSuccess(String msg) {
		System.out.println(msg);
	}

	public static void printFail(String msg) {
		System.out.println(msg);
	}
	
	public static void printupdate(Player update) {
		if(update != null){
			System.out.println(update.toString());
		}else{
			System.out.println("���� �õ��ϰ��� �ϴ� �����Ͱ� �����ϴ�");
		}
	}
	
	public static void printselect(Player Position) {
		if(Position != null) {
			System.out.println(Position.toString());
		}
		
	}
	
}
