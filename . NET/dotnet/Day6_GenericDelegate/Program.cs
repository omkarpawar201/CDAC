namespace Day6_GenericDelegate
{
    public delegate void MyDelegate();

    // Generic delegate with 1 parameter of type T
    public delegate void MyDelegate2<T>(T para);

    // Generic delegate with 2 parameters of types T1, T2
    public delegate void MyDelegate3<T1, T2>(T1 para1, T2 para2);

    // Predicate delegate - returns bool (common for filtering/conditions)
    public delegate bool PredicateDelegate<T>(T para);

    // Func delegate - input T, output R (like Func<T,R> in System)
    public delegate R FuncDelegate<T, R>(T para);
    internal class Program
    {
        static void Main(string[] args)
        {

            //Demo demo = new Demo();
            //MyDelegate del1 = demo.SayHi;
            //del1();

            //MyDelegate2<string> del2 = demo.SayHello;
            //del2("Hugh Jackman");

            //MyDelegate2<int> del3 = demo.Display;
            //del3(42);

            //MyDelegate3<string,string> del4 = demo.Greet;
            //del4("Hugh Jackman", "The movie was really good!!");

            //PredicateDelegate<int> pred1 = demo.CheckEven;
            //bool isEven = pred1(11);
            //Console.WriteLine($"isEven = {isEven} for number = 11");

            //PredicateDelegate<int> pred2 = demo.CheckOdd;
            //bool isOdd = pred2(7);
            //Console.WriteLine($"isOdd = {isOdd} for number = 7");

            Demo demo = new Demo();
            MyMath math = new MyMath();

            // Create delegate instance matching Greet method signature
            MyDelegate3<string, string> delGreet = demo.Greet;

            // Pass delegate + parameters to generic method
            // Note: T3,T4 become string via inference, dynamic handles type conversion
            math.Test<string, string, string, string>(delGreet, "Tom Ellis", "Good Morning!");
            // Output: "Hey ! Tom Ellis, Good Morning!"
        }
    }

    // Demo class contains target methods for delegates
    public class Demo
    {
        // Matches MyDelegate (no params)
        public void SayHi()
        {
            Console.WriteLine("Hi there!");
        }

        // Matches MyDelegate2<string>
        public void SayHello(string name)
        {
            Console.WriteLine($"Hello, {name}");
        }

        // Matches MyDelegate3<string,string> - used in Main
        public void Greet(string name, string msg)
        {
            Console.WriteLine($"Hey ! {name}, {msg}");
        }

        // Matches MyDelegate2<int>
        public void Display(int number)
        {
            Console.WriteLine($"Number is: {number}");
        }

        // Matches PredicateDelegate<int>
        public bool CheckEven(int number)
        {
            return number % 2 == 0;
        }

        // Matches PredicateDelegate<int>
        public bool CheckOdd(int number)
        {
            return number % 2 != 0;
        }

        // Example of Func-like method (not used in delegates here)
        public int Add(int[] numbers)
        {
            int sum = 0;
            foreach (var num in numbers)
            {
                sum += num;
            }
            return sum;
        }

        // Out parameter example (not used in delegates)
        public void Add(int n1, int n2, int n3, out int sum)
        {
            sum = n1 + n2 + n3;
        }
    }

    // Helper class demonstrating dynamic delegate invocation
    public class MyMath
    {
        // Generic method: accepts any delegate + 2 extra generic params
        // Uses 'dynamic' to bypass strict compile-time type checking
        public void Test<T1, T2, T3, T4>(MyDelegate3<T1, T2> del, T3 para1, T4 para2)
        {
            dynamic p1 = para1;  // Runtime type conversion
            dynamic p2 = para2;  // Runtime type conversion
            del.Invoke(p1, p2);  // Calls target method (Greet)
        }
    }
}
