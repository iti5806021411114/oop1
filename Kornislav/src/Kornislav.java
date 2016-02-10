import java.util.Scanner;
public class Kornislav {

	public static void main(String[] args) {

		int v1,v2,v3,v4,t;
		Scanner scan = new Scanner(System.in);
		System.out.print("Input V1 : ");
		v1=scan.nextInt();
		System.out.print("Input V2 : ");
		v2=scan.nextInt();
		System.out.print("Input V3 : ");
		v3=scan.nextInt();
		System.out.print("Input V4 : ");
		v4=scan.nextInt();
		if(v1>v2){
		t=v1;
		v1=v2;
		v2=t;
		}
		if(v1>v3){
		t=v1;
		v1=v3;
		v3=t;
		}
		if(v1>v4){
		t=v1;
		v1=v4;
		v4=t;
		}
		if(v2>v3){
		t=v2;
		v2=v3;
		v3=t;
		}
		if(v2>v4){
		t=v2;
		v2=v4;
		v4=t;
		}
		if(v3>v4){
		t=v3;
		v3=v4;
		v4=t;
		}
		System.out.print("\nRectangle Area = : "+""+v3+""+" * "+v1+" = "+v3*v1);
	}

}
