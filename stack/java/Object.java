import java.util.Scanner;

public class Object {
	public static void main(String a[]) {
		 myStack s = new myStack();
		 Scanner sc = new Scanner(System.in);
		 for(;;){
			 
			 System.out.print("Choose[1.Push, 2.Pop, 3.Peep, 4.Display] :");
			 int op = sc.nextInt();
			 
			 switch(op) {
		
			 case 1:s.Push();break;
			 case 2:s.Pop();break;
			 case 3:s.Peep();break;
			 case 4:s.Display();break;
			 case 5:System.out.println("Program terminated");
				 	System.exit(0);
			 default:System.out.println("Wrong Input");break;
			 
			 }
		 }
	}
}