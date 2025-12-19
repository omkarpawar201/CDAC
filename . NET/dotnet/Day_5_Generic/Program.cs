namespace Day_5_Generic
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Swap using Normal Method
            // Example of swapping values using overloaded methods (specific to int and string)

            //int a = 10;
            //int b = 20;

            //Console.WriteLine($"Before Swap a : {a}, b = {b} ");
            ////swap(ref a, ref b); // Calls int-specific swap
            //Console.WriteLine($"After Swap a : {a}, b = {b} ");

            //string str1 = "Hello";
            //string str2 = "World";

            //Console.WriteLine($"Before Swap str1 : {str1}, str2 = {str2} ");
            //swap(ref str1, ref str2); // Calls string-specific swap
            //Console.WriteLine($"After Swap str1 : {str1}, str2 = {str2} ");
            #endregion

            #region Swap using generic method
            // Example of swapping values using a single generic method

            int a = 10;
            int b = 20;

            Console.WriteLine($"Before Swap a : {a}, b = {b} ");
            swap(ref a, ref b); // Calls generic swap<T> with T = int
            Console.WriteLine($"After Swap a : {a}, b = {b} ");

            string str1 = "Hello";
            string str2 = "World";

            Console.WriteLine($"Before Swap str1 : {str1}, str2 = {str2} ");
            swap(ref str1, ref str2); // Calls generic swap<T> with T = string
            Console.WriteLine($"After Swap str1 : {str1}, str2 = {str2} ");
            #endregion
        }

        #region Call by reference (non-generic overloads)
        // Overloaded methods for specific types (int and string)
        // These are repetitive and not scalable for other types

        //static void swap(ref int m, ref int n)
        //{
        //    int temp = m;
        //    m = n;
        //    n = temp;
        //} 

        //static void swap(ref string m, ref string n)
        //{
        //    string temp = m;
        //    m = n;
        //    n = temp;
        //}
        #endregion

        #region Generic Swap method
        // Generic method: works for any type T (int, string, double, custom classes, etc.)
        // Eliminates the need for multiple overloads

        static void swap<T>(ref T m, ref T n)
        {
            T temp = m;
            m = n;
            n = temp;
        }
        #endregion
    }
}
