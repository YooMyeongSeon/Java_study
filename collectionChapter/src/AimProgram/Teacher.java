package AimProgram;

public class Teacher extends Member{
	String subject;
	
	public Teacher(String name, String id, String pw, String subject) {
		super(name, id, pw);
		this.subject = subject;
	}
	
	@Override
	public void work() {
		System.out.println("���Ǹ� �մϴ�.");
	}

	@Override
	public void test() {
		System.out.println("ä���� �մϴ�.");
	}

}