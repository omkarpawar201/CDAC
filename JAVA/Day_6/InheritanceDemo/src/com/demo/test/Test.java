package Test;

//abstract class test1 {
//    abstract public void show();
//}

//class test2 extends test1 {
//    public void show() {
//        System.out.println("In test 2");
//    }
//}
//
//class test3 extends test1 {
//    public void show() {
//        System.out.println("In test 3");
//    }
//}

class test1 {
	static int count = 0;
    public test1() {
    	System.out.println("constructor called");
    	count ++;
    	System.out.println(count);
    }
}

public class Test {

	public static void main(String[] args) {
		
		test1[] t1 = new test1[10];
		t1[0] = new test1();
		t1[1] = new test1();
		t1[2] = new test1();
		
	}

}
