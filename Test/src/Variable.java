
public class Variable {
	public  Variable(String bdcolor) {
		bodycolor=bdcolor;
	}
	static int allClicks=0;//�����
	String str="hello world";//ʵ������
	//�����
	private static String name;
	public static final String sex="��";
	//ʵ������
	public String bodycolor;
	private String legs;
	
	public void method() {
		int i=0;//�ֲ�����//
	}
	public void pupAge() {
		int age=0;//�ֲ�����
		age=age+7;
		System.out.println("���䣺"+age);
	}
	public void getlegs(String DogLegs) {
		legs=DogLegs;
	}
	public void printEmp(){
      System.out.println("��ɫ : " + bodycolor );
      System.out.println("�� : " + legs);
   }

	public static void main(String[] args) {
		Variable Dog=new Variable("��ɫ");
		Dog.pupAge();
		name="С��";
		Dog.getlegs("������");
		Dog.printEmp();
		System.out.println(name+"���Ա�"+sex);
	}
}
