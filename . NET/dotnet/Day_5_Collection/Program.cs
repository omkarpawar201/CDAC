using System.Collections;

namespace Day_5_Collection
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Employee Basic Array
            // Example of using a strongly typed array of Employee objects
            //Employee employee = new Employee();
            //employee.Eid = 1;
            //employee.Ename = "Test";

            //Employee employee2 = new Employee();
            //employee2.Eid = 2;
            //employee2.Ename = "Test2";

            //Employee[] employees = new Employee[2]; // Fixed-size array

            //employees[0] = employee;
            //employees[1] = employee2;

            // Loop through array and print employee details
            //for (int i = 0; i < employees.Length; i++)
            //{
            //    Employee employee1 = employees[i];
            //    Console.WriteLine($"ID : {employee1.Eid} Name : {employee1.Ename}");
            //} 
            #endregion

            // Create an Employee object
            Employee employee = new Employee();
            employee.Eid = 1;
            employee.Ename = "Test";

            // Object array can store heterogeneous data types
            Object[] objects = new Object[5];
            objects[0] = 10;        // int // Boxing
            objects[1] = "Hello";   // string
            objects[2] = employee;  // Employee object

            #region Old Syntax
            // Example of type checking using GetType()
            //for (int i = 0; i < objects.Length; i++)
            //{
            //    Object obj = objects[i];
            //    Type type = obj.GetType();

            //    if (type.ToString() == "System.Int32") Console.WriteLine(Convert.ToInt32(obj));
            //    if (type.ToString() == "System.String") Console.WriteLine(obj.ToString());

            //    if (type.ToString().Equals("Day_5_Collection.Program+Employee"))
            //    {
            //        Employee employee3 = (Employee) obj; // Explicit cast
            //        Console.WriteLine(employee3.Ename); 
            //    }
            //} 
            #endregion

            #region New Syntax
            // Modern type checking using 'is' and 'as'
            //for (int i = 0; i < objects.Length; i++)
            //{
            //    Object obj = objects[i];

            //    if (obj is int) Console.WriteLine(Convert.ToInt32(obj));
            //    if (obj is string) Console.WriteLine(obj.ToString());

            //    if (obj is Employee)
            //    {
            //        Employee employee3 = obj as Employee; // Safe cast
            //        Console.WriteLine(employee3.Ename);
            //    }
            //} 
            #endregion

            #region Array List
            // Non-generic collection that can store heterogeneous objects
            //ArrayList arrayList = new ArrayList();
            //arrayList.Add(10);
            //arrayList.Add("Hello");
            //arrayList.Add(employee);

            // Iterate through ArrayList
            //for (int i = 0; i < arrayList.Count; i++)
            //{
            //    Object obj = arrayList[i];

            //    if (obj is int) Console.WriteLine(Convert.ToInt32(obj));
            //    if (obj is string) Console.WriteLine(obj.ToString());

            //    if (obj is Employee)
            //    {
            //        Employee employee3 = obj as Employee;
            //        Console.WriteLine(employee3.Ename);
            //    }
            //}
            #endregion

            #region Hash Table
            // Key-value pair collection (non-generic)
            //Hashtable hashtable = new Hashtable();

            //hashtable.Add(1, 10);
            //hashtable.Add(2, "Hello");
            //hashtable.Add(3, employee);

            // Print all keys
            //foreach (Object item in hashtable.Keys)
            //{
            //    Console.WriteLine(item);
            //}

            // Print all values with type checking
            //foreach (Object item in hashtable.Values)
            //{
            //    if (item is int) Console.WriteLine(Convert.ToInt32(item));
            //    if (item is string) Console.WriteLine(item.ToString());

            //    if (item is Employee)
            //    {
            //        Employee employee3 = item as Employee;
            //        Console.WriteLine(employee3.Ename);
            //    }
            //}
            #endregion

            #region Generic List
            // Strongly typed generic collection
            //List<int> numbers = new List<int>();

            //numbers.Add(10);
            //numbers.Add(20);
            //numbers.Add(30);

            //for (int i = 0; i < numbers.Count; i++)
            //{
            //    Console.WriteLine(numbers[i]);
            //}
            #endregion

            #region Tuple
            // Tuple returned from Employee.display()
            //var emp = employee.display();
            //Console.WriteLine($"{emp.id}, {emp.name}");
            #endregion

            #region Stack
            // Stack (LIFO - Last In First Out)
            //Stack<int> stack = new Stack<int>();

            //stack.Push(1);
            //stack.Push(2);
            //stack.Push(3);

            //Console.WriteLine($"Top : {stack.Peek()}"); // Peek returns top element
            //stack.Pop(); // Removes top element
            //Console.WriteLine($"Top : {stack.Peek()}");
            //stack.Pop();
            //Console.WriteLine($"Top : {stack.Peek()}");
            //stack.Pop();
            #endregion

            #region Queue
            // Queue (FIFO - First In First Out)
            //Queue<int> queue = new Queue<int>();

            //queue.Enqueue(1);
            //queue.Enqueue(2);
            //queue.Enqueue(3);

            //Console.WriteLine($"Front : {queue.Peek()}"); // Peek returns front element
            //queue.Dequeue(); // Removes front element
            //Console.WriteLine($"Front : {queue.Peek()}");
            //queue.Dequeue();
            //Console.WriteLine($"Front : {queue.Peek()}");
            //queue.Dequeue();
            #endregion
        }

        // Employee class with encapsulation and tuple return
        public class Employee
        {
            private int _Eid;
            private string _Ename;

            public string Ename
            {
                get { return _Ename; }
                set { _Ename = value; }
            }

            public int Eid
            {
                get { return _Eid; }
                set { _Eid = value; }
            }

            // Method returning a tuple (id, name)
            public (int id, string name) display()
            {
                return (_Eid, _Ename);
            }
        }
    }
}
