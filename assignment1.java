import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class Arithmetic {
	int num1, num2;

	abstract int calculate();

	Arithmetic(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

}

class Add extends Arithmetic {
	Add(int a, int b) {
		super(a, b);
	}

	@Override
	int calculate() {
		
		return this.num1 + this.num2;
		// TODO Auto-generated method stub
	}
}

class Sub extends Arithmetic {
	Sub(int a, int b) {
		super(a, b);
	}

	@Override
	int calculate() {
		return this.num1 - this.num2;
		// TODO Auto-generated method stub
	}

}

class Mul extends Arithmetic {

	Mul(int a, int b) {
		super(a, b);
	}

	@Override
	int calculate() {
		return this.num1 * this.num2;
		// TODO Auto-generated method stub
	}
}

class Div extends Arithmetic {

	Div(int a, int b) {
		super(a, b);
	}

	@Override
	int calculate() {
		return this.num1 / this.num2;
		// TODO Auto-generated method stub
	}
}

public class assignment1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 0;
		
		int choice;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two Numbers");
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		Arithmetic A[] = { new Add(a, b), new Sub(a, b), new Mul(a, b), new Div(a, b) };
		System.out.println("Enter choice (1-addtion, 2-sub, 3-mul, 4-div");
		choice = Integer.parseInt(br.readLine());
		System.out.println(A[choice - 1].calculate());

	}

}
