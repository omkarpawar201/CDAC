// Namespace to logically group related classes
namespace Day_4_Delegates
{
    // Delegate declaration: points to methods with no parameters and no return value
    public delegate void HelloDelegate();

    // Delegate declaration: points to methods that take two integers and return an integer
    public delegate int AddDelegate(int a, int b);

    internal class Program
    {
        // Entry point of the program
        static void Main(string[] args)
        {
            #region Normal call
            // Direct method calls without delegates
            //Hello(); // Calls static Hello method
            //MyClass obj = new MyClass();
            //obj.Hello(); // Calls instance Hello method
            #endregion

            // Using delegate to call static Hello method
            HelloDelegate hello = new HelloDelegate(Program.Hello);
            hello.Invoke(); // Executes Program.Hello()

            // Create object of MyClass
            MyClass obj = new MyClass();

            // Using delegate to call instance Add method
            AddDelegate add = new AddDelegate(obj.Add);
            int addition = add.Invoke(5, 2); // Executes obj.Add(5, 2)

            // Print result of addition
            Console.WriteLine(addition);
        }

        // Static method that matches HelloDelegate signature (void, no parameters)
        static void Hello()
        {
            Console.WriteLine("Static Hello");
        }

        // Class containing instance methods
        public class MyClass
        {
            // Instance method that matches HelloDelegate signature
            public void Hello()
            {
                Console.WriteLine("Hello");
            }

            // Instance method that matches AddDelegate signature (int return, two int parameters)
            public int Add(int a, int b)
            {
                // Return sum of two integers
                return a + b;
            }
        }
    }
}
