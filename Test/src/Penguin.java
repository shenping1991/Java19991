
public class Penguin {
	private String name; 
    private int id; 
    public Penguin(String myName, int  myid) { 
        name = myName; 
        id = myid; 
    } 
    public Penguin() { 
    } 
    
    public void eat(){ 
        System.out.println(name+"正在吃"); 
    }
    public void sleep(){
        System.out.println(name+"正在睡");
    }
    public void introduction() { 
        System.out.println("大家好！我是"         + id + "号" + name + "."); 
    } 
      
    public static void main(String[] args) {
		  Penguin a = new Penguin();
		  a.eat();
	  }   
}

