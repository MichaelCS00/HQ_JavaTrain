public class Father {
     private String surname;
     public String name;
     String sex;
     double height;

   public void Get(){
	    Scanner input = new Scanner(System.in);
		System.out.println("����������:");
		this.surname = input.nextLine();
		System.out.println("����������:");
		this.name = input.nextLine();
		System.out.println("�������Ա�:");
		this.sex = input.nextLine();
		System.out.println("���������:");
		this.height = input.nextDouble();
		
   }
    void Display(){
			System.out.println("����:" + surname);
			System.out.println("����:" + name);
			System.out.println("�Ա�:" + sex);
			System.out.println("���:" + height);
		}
   
}
class Son extends Father{
	public static void main(String[]args) {
		Son s = new Son();
		s.Get();
		s.Display();
	}
}
