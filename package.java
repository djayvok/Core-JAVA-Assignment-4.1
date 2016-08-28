package p1;
public class One {
	protected void display(){
		System.out.println("Accessing protected method through inheritance");
	}
}

package p2;
import p1.One;
public class Two extends One {
	public void display2(){
		display();
	}
	}

package p3;
import p2.Two;
public class Three {
    public static void main(String[] args) {
    	Two obj=new Two();
    	obj.display2();
}
}
