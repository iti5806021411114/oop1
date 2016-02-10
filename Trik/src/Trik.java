import java.util.Scanner;
public class Trik {
	
	public static void main(String[] args) {
	int l=1,c=0,r=0,t,j;
	String sw;
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter Value : ");
	sw = scan.next();
	for(j=0;j<sw.length();j++){
	if(sw.charAt(j) == 'A' || sw.charAt(j) == 'a'){
	t=l;
	l=c;
	c=t;
	}else if(sw.charAt(j) == 'B' || sw.charAt(j) == 'b'){
	t=c;
	c=r;
	r=t;
	}else{
	t=l;
	l=r;
	r=t;
	}
	}
	if(l == 1) System.out.println("Left glass");
	else if(c == 1) System.out.println("Center glass");
	else System.out.println("Right glass");
	}
}
