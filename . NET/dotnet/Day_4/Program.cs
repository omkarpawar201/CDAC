// Namespace to logically group related classes
namespace Day_4
{
    // Internal Program class (accessible only within this assembly)
    internal class Program
    {
        // Entry point of the program
        static void Main(string[] args)
        {
            // Create an instance of Person class
            Person person = new Person();

            // Set values using properties (encapsulation in action)
            person.pid = 101;
            person.name = "Test";

            // Retrieve values using properties
            int id = person.pid;
            string name = person.name;

            // Display values on console
            Console.WriteLine($"Name : {name}, ID : {id}");
        }

        // Person class demonstrating encapsulation with private fields and public properties
        public class Person
        {
            // Private fields (cannot be accessed directly outside the class)
            private int _pid;
            private string _name;

            #region Getter Setter
            // Public property for pid
            // Provides controlled access to private field _pid
            public int pid
            {
                set { _pid = value; }   // Setter: assigns value to _pid
                get { return _pid; }    // Getter: returns value of _pid
            }

            // Public property for name
            // Provides controlled access to private field _name
            public string name
            {
                set { _name = value; }  // Setter: assigns value to _name
                get { return _name; }   // Getter: returns value of _name
            }
            #endregion
