/* crud�� ��� ��û�� �ް� ��û ó�� ���� �� ������� EndView���� ��� �����ϴ� ����
 * �ϳ��� �޼ҵ忡�� if �б⹮���� ���� ����
 * StartView.java���� Controller���� ��û��
 * �б⹮�� ���� �� �����ͷ� ��û
 * 1-��� �˻�, 2-���� �˻�, 3-�߰�(����), 4-����, 5-����(name�� �������� position ����)
 * 
 */

package controller;

import model.PlayerEditor;
import model.domain.Player;
import view.EndView;
import view.Log4J;

public class PlayerController {
	static Log4J log = Log4J.getInstance();
	
	public static void request(int reqNumber) {
		
		if(reqNumber == 1) {
			System.out.println(log.info());
			System.out.println();
			
			EndView.printAll(PlayerEditor.getAll());
			
		}else if(reqNumber == 2) {
		
			EndView.printselect(PlayerEditor.getPosition("DF"));
			
		}else if(reqNumber == 3) {
			
			boolean r = PlayerEditor.insert(new Player("������", "FW", 25));
			if(r) {
				EndView.printAll(PlayerEditor.getAll());
				EndView.printSuccess("���� ����� �Ǿ����ϴ�");
			}else {
				EndView.printFail("��� ����");
			}
		}else if(reqNumber == 4) {
			PlayerEditor.delete("������");
		
		}else if(reqNumber == 5) {
			
			EndView.printupdate(PlayerEditor.update ("������"));
			
		}else{
			EndView.printFail("��û�Ͻ� ������ ���� �� �� �����ϴ�.");
		}	
			
	}
}