
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
        System.out.println(name+"���ڳ�"); 
    }
    public void sleep(){
        System.out.println(name+"����˯");
    }
    public void introduction() { 
        System.out.println("��Һã�����"         + id + "��" + name + "."); 
    } 
      
    public static void main(String[] args) {
		  Penguin a = new Penguin();
		  a.eat();
	  }   
}

