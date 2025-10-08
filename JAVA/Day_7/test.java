class test1 {

    public test1(){
        System.out.println("constructor called");
    }

    public void show() {
        System.out.println("In test 1");
    }
}

// class test2 extends test1 {
//     public void show() {
//         System.out.println("In test 2");
//     }
// }

// class test3 extends test1 {
//     public void show() {
//         System.out.println("In test 3");
//     }
// }

public class test {
    public static void main(String[] args) {

        test t1 = new test1();
        // t1.show();
        
        // t1 = new test2();
        // t1.show();

        // t1 = new test3();
        // t1.show();

    }
}
