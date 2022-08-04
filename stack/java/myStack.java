import java.util.Scanner;

public class myStack {
	
	int[] stk = new int[5];
	int top;
	myStack(){
		top = -1;
	}
	void Push(){
		
		if(top==4) {
			System.out.println("Stack overflow");
		}
		else {
			Scanner sc = new Scanner(System.in);
				System.out.print("Enter value :");
				int x = sc.nextInt();
				top++;
				stk[top]=x;
		}
	}
	void Pop() {
		if(top==-1) {
			System.out.println("Stack underflow");
		}
		else {
			int y = stk[top];
			top--;
			System.out.println("Deleted value : " + y);
		}
	}
	void Peep() {
		System.out.println("Value in top of the stack :" + stk[top]);
	}
	void Display() {
		if(top==-1)
		{
			System.out.println("Empty Stack");
		}
		else
		{
		int i =0;
		System.out.println("\nStacked values");
		for(i=top;i>=0;i--) {
			System.out.println(stk[i]);
		}
		}
	}
	
}