package view;

public class Log4J {
	
	private static Log4J instance = new Log4J();
	private Log4J() {}
	public static Log4J getInstance() {
		return instance;
	}
	
	public String info() {
		return "�����Ͽ����ϴ�";
	}
	public String warn() {
		return "���� ����.";
	}

}
