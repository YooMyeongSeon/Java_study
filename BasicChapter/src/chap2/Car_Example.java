package chap2;

public class Car_Example {

	public static void main(String[] args) {
		//��ü ����
		Car myCar = new Car();
		
		//�ʵ尪 �б�
		System.out.println("����ȸ�� : "+myCar.company);
		System.out.println("�𵨸� : "+myCar.model);
		System.out.println("���� : "+myCar.color);
		System.out.println("�ְ��ӷ� : "+myCar.maxSpeed);
		System.out.println("����ӵ� : "+myCar.speed);
		
		//�ʵ尪 ����
		myCar.speed = 60;
		System.out.println("������ �ӵ� : "+myCar.speed);
	}
}