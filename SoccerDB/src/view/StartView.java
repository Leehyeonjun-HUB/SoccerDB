package view;

import controller.PlayerController;

public class StartView {

	public static void main(String[] args) {
		
		System.out.println("=====����������=====");
		System.out.println();
		System.out.println("--��� ���� �˻�--");
		PlayerController.request(1);
		System.out.println();
		System.out.println("---���� ���---");
		PlayerController.request(3);
		System.out.println();
		System.out.println("---���� ������ ����---");
		PlayerController.request(5);
		System.out.println();
		System.out.println("--���� �� �� ����--");
		PlayerController.request(1);
		System.out.println();
		System.out.println("--���� ���� �� �� ����--");
		PlayerController.request(4);
		PlayerController.request(1);
		System.out.println();
		System.out.println("--���� �˻�--");
		PlayerController.request(2);
		
	}

}