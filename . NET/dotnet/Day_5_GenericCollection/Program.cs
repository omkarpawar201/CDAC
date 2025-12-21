namespace Day_5_GenericCollection
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // Create Employee objects with sample data
            Emp emp1 = new Emp();
            emp1.EId = 101;
            emp1.EName = "Hugh Jackman";
            emp1.EAddress = "Sydney, Australia";

            Emp emp2 = new Emp();
            emp2.EId = 102;
            emp2.EName = "Tony Stark";
            emp2.EAddress = "Shivaji Nagar";

            Emp emp3 = new Emp();
            emp3.EId = 103;
            emp3.EName = "Tom Ellis";
            emp3.EAddress = "L.A";

            #region Generic List
            // List<T> is a strongly typed generic collection
            // - Stores elements in order
            // - Allows duplicates
            // - Provides index-based access
            // - Safer than ArrayList because it enforces type safety

            // Create a generic list of Employee objects
            //List<Emp> emps = new List<Emp>();
            //emps.Add(emp1);
            //emps.Add(emp2);
            //emps.Add(emp3);

            // Iterate through the list using foreach
            //foreach (Emp emp in emps)
            //{
            //    Console.WriteLine($"Id: {emp.EId}, Name: {emp.EName}, Address : {emp.EAddress}");
            //}
            #endregion

            #region Dictionary<TKey, TValue>
            // Dictionary<TKey, TValue> is a generic collection of key-value pairs
            // - Keys must be unique
            // - Values can be duplicated
            // - Provides fast lookups by key
            // - Useful when you want to associate data with a unique identifier

            // Create a dictionary with Employee ID as key and Employee object as value
            //Dictionary<int, Emp> empDict = new Dictionary<int, Emp>();
            //empDict.Add(emp1.EId, emp1);
            //empDict.Add(emp2.EId, emp2);
            //empDict.Add(emp3.EId, emp3);

            // Iterate through dictionary using KeyValuePair
            //foreach (KeyValuePair<int, Emp> element in empDict)
            //{
            //    Emp emp = element.Value; // Access value (Employee object)
            //    Console.WriteLine($"Id: {emp.EId}, Name: {emp.EName}, Address : {emp.EAddress}");
            //}

            // Iterate through dictionary keys
            //foreach (int key in empDict.Keys)
            //{
            //    Emp emp = empDict[key] as Emp; // Access value by key
            //    Console.WriteLine($"Key = {key}, Id: {emp.EId}, Name: {emp.EName}, Address : {emp.EAddress}");
            //}

            // Iterate through dictionary values directly
            ////foreach (Emp emp in empDict.Values)
            ////{
            ////    Console.WriteLine($"Id: {emp.EId}, Name: {emp.EName}, Address : {emp.EAddress}");
            ////} 
            #endregion
        }
    }

    // Employee class demonstrating encapsulation
    public class Emp
    {
        // Private fields (cannot be accessed directly outside the class)
        private int _EId;
        private string _EName;
        private string _EAddress;

        // Public property for Employee Address
        public string EAddress
        {
            get { return _EAddress; }   // Getter: returns value of _EAddress
            set { _EAddress = value; }  // Setter: assigns value to _EAddress
        }

        // Public property for Employee Name
        public string EName
        {
            get { return _EName; }   // Getter: returns value of _EName
            set { _EName = value; }  // Setter: assigns value to _EName
        }

        // Public property for Employee ID
        public int EId
        {
            get { return _EId; }   // Getter: returns value of _EId
            set { _EId = value; }  // Setter: assigns value to _EId
        }
    }
}
