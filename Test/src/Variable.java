
public class Variable {
	public  Variable(String bdcolor) {
		bodycolor=bdcolor;
	}
	static int allClicks=0;//类变量
	String str="hello world";//实例变量
	//类变量
	private static String name;
	public static final String sex="男";
	//实例变量
	public String bodycolor;
	private String legs;
	
	public void method() {
		int i=0;//局部变量//
	}
	public void pupAge() {
		int age=0;//局部变量
		age=age+7;
		System.out.println("年龄："+age);
	}
	public void getlegs(String DogLegs) {
		legs=DogLegs;
	}
	public void printEmp(){
      System.out.println("颜色 : " + bodycolor );
      System.out.println("腿 : " + legs);
   }

	public static void main(String[] args) {
		Variable Dog=new Variable("白色");
		Dog.pupAge();
		name="小白";
		Dog.getlegs("四条腿");
		Dog.printEmp();
		System.out.println(name+"的性别"+sex);
	}
}
