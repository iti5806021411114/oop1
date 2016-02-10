import java.util.Scanner;
public class Seven_Dwarves {
	
	public static void main(String[] args) {
		int n1,n2,n3,n4,n5,n6,n7,n8,n9;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number1");
		n1 = scan.nextInt();
		System.out.print("Enter number2");
		n2 = scan.nextInt();
		System.out.print("Enter number3");
		n3 = scan.nextInt();
		System.out.print("Enter number4");
		n4 = scan.nextInt();
		System.out.print("Enter number5");
		n5 = scan.nextInt();
		System.out.print("Enter number6");
		n6 = scan.nextInt();
		System.out.print("Enter number7");
		n7 = scan.nextInt();
		System.out.print("Enter number8");
		n8 = scan.nextInt();
		System.out.print("Enter number9");
		n9 = scan.nextInt();
		System.out.println();
		
		if(n2+n3+n4+n5+n6+n7+n8==100)
			System.out.print("fake is N1 & N9");
		if(n2+n3+n4+n5+n6+n7+n9==100)
			System.out.print("fake is N1 & N8");
		if(n2+n3+n4+n5+n6+n8+n9==100)
			System.out.print("fake is N1 & N7");
		if(n2+n3+n4+n5+n7+n8+n9==100)
			System.out.print("fake is N1 & N6");
		if(n2+n3+n4+n6+n7+n8+n9==100)
			System.out.print("fake is N1 & N5");
		if(n2+n3+n5+n6+n7+n8+n9==100)
			System.out.print("fake is N1 & N4");
		if(n2+n4+n5+n6+n7+n8+n9==100)
			System.out.print("fake is N1 & N3");
		if(n3+n4+n5+n6+n7+n8+n9==100)
			System.out.print("fake is N1 & N2");
		if(n1+n3+n4+n5+n6+n7+n8==100)
			System.out.print("fake is N2 & N9");
		if(n1+n3+n4+n5+n6+n7+n9==100)
			System.out.print("fake is N2 & N8");
		if(n1+n3+n4+n5+n6+n8+n9==100)
			System.out.print("fake is N2 & N7");
		if(n1+n3+n4+n5+n7+n8+n9==100)
			System.out.print("fake is N2 & N6");
		if(n1+n3+n4+n6+n7+n8+n9==100)
			System.out.print("fake is N2 & N5");
		if(n1+n3+n5+n6+n7+n8+n9==100)
			System.out.print("fake is N2 & N4");
		if(n1+n4+n5+n6+n7+n8+n9==100)
			System.out.print("fake is N2 & N3");
		if(n1+n2+n4+n5+n6+n7+n8==100)
			System.out.print("fake is N3 & N9");
		if(n1+n2+n4+n5+n6+n7+n9==100)
			System.out.print("fake is N3 & N8");
		if(n1+n2+n4+n5+n6+n8+n9==100)
			System.out.print("fake is N3 & N7");
		if(n1+n2+n4+n5+n7+n8+n9==100)
			System.out.print("fake is N3 & N6");
		if(n1+n2+n4+n6+n7+n8+n9==100)
			System.out.print("fake is N3 & N5");
		if(n1+n2+n5+n6+n7+n8+n9==100)
			System.out.print("fake is N3 & N4");
		if(n1+n2+n3+n5+n6+n7+n8==100)
			System.out.print("fake is N4 & N9");
		if(n1+n2+n3+n5+n6+n7+n9==100)
			System.out.print("fake is N4 & N8");
		if(n1+n2+n3+n5+n6+n8+n9==100)
			System.out.print("fake is N4 & N7");
		if(n1+n2+n3+n5+n7+n8+n9==100)
			System.out.print("fake is N4 & N6");
		if(n1+n2+n3+n6+n7+n8+n9==100)
			System.out.print("fake is N4 & N5");
		if(n1+n2+n3+n4+n6+n7+n8==100)
			System.out.print("fake is N5 & N9");
		if(n1+n2+n3+n4+n6+n7+n9==100)
			System.out.print("fake is N5 & N8");
		if(n1+n2+n3+n4+n6+n8+n9==100)
			System.out.print("fake is N5 & N7");
		if(n1+n2+n3+n4+n7+n8+n9==100)
			System.out.print("fake is N5 & N6");
		if(n1+n2+n3+n4+n5+n7+n8==100)
			System.out.print("fake is N6 & N9");
		if(n1+n2+n3+n4+n5+n7+n9==100)
			System.out.print("fake is N6 & N8");
		if(n1+n2+n3+n4+n5+n8+n9==100)
			System.out.print("fake is N6 & N7");
		if(n1+n2+n3+n4+n5+n6+n8==100)
			System.out.print("fake is N7 & N9");
		if(n1+n2+n3+n4+n5+n6+n9==100)
			System.out.print("fake is N7 & N8");
		if(n1+n2+n3+n4+n5+n6+n7==100)
			System.out.print("fake is N8 & N9");
	}

}
