package family;
import java.util.Scanner;
public class father {
	String surname;
	String name;
	String sex;
	double height;
	void display() {
		System.out.println("����"+":"+surname);
		System.out.println("����"+":"+name);
		System.out.println("�Ա�"+":"+sex);
		System.out.println("���"+":"+height);
	}
	void get() {
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.println("����������");
		this.surname=input.nextLine();
		System.out.println("����������");
		this.name=input.nextLine();
		System.out.println("�������Ա�");
		this.sex=input.nextLine();
		System.out.println("���������");
		this.height=input.nextDouble();
	}
}
class son extends father{
	public static void main(String[]args) {
		son s =new son();
		s.get();
		s.display();
	}
}