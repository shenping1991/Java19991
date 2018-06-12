
public class Puppy {
	int puppyAge;
	public Puppy(String name){
		System.out.println("dog's name is "+name);
	}
	public void setAge(int age) {
		puppyAge=age;
	}
	public int getAge() {
		System.out.println("dog's name is "+puppyAge);
		return puppyAge;
	}
	public static void main (String []args) {
		Puppy mypuppy=new Puppy("pink");
		mypuppy.setAge(3);
		mypuppy.getAge();
		System.out.println(mypuppy.puppyAge);
	}
}
