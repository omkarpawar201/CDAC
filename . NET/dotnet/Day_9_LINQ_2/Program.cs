namespace Day_9_LINQ_2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region LINQ on array
            // Example 1: Using LINQ on a simple array of integers
            //int[] arr = { 1, 6, 3, 9, 5, 3 };

            //// Ascending order
            ////var result = (from element in arr
            ////              orderby element
            ////              select element);

            // Descending order
            //var result = (from element in arr
            //              orderby element descending
            //              select element);

            //foreach (var item in result)
            //{
            //    Console.WriteLine(item); // Prints sorted elements
            //}
            #endregion

            // Example dataset: A list of Employee objects
            List<Employee> list = new List<Employee>() {
                new Employee(){Id = 1, Name = "abc", Role = "UI"},
                new Employee(){Id = 2, Name = "dfe", Role = "UI"},
                new Employee(){Id = 3, Name = "xyz", Role = "UX"},
                new Employee(){Id = 4, Name = "fgh", Role = "UX"},
                new Employee(){Id = 5, Name = "hjk", Role = "UI"}
            };

            #region LINQ : LAZY Loading
            // Demonstrates deferred (lazy) execution in LINQ
            //Console.WriteLine("Enter the role : ");
            //string role = Console.ReadLine().ToLower();

            // Query is defined but not executed yet
            //var employees = (from emp in list
            //                 where emp.Role.ToLower().Equals(role)
            //                 select emp);

            // Adding a new employee AFTER query definition
            //list.Add(new Employee() { Id = 6, Name = "dfg", Role = "DA" });

            // Query executes here during iteration
            //foreach (var item in employees)
            //{
            //    Console.WriteLine($"Id : {item.Id}, Name : {item.Name}, Role : {item.Role}");
            //}
            // NOTE: Because of lazy loading, the newly added employee is also considered
            #endregion

            #region LINQ with .ToList() Extension method
            // Demonstrates immediate execution by forcing query results into a List
            //Console.WriteLine("Enter the role : ");
            //string role = Console.ReadLine().ToLower();

            // Query executes immediately because of .ToList()
            //var employees = (from emp in list
            //                 where emp.Role.ToLower().Equals(role)
            //                 select emp).ToList();

            // Adding a new employee AFTER query execution
            //list.Add(new Employee() { Id = 6, Name = "dfg", Role = "DA" });

            //foreach (var item in employees)
            //{
            //    Console.WriteLine($"Id : {item.Id}, Name : {item.Name}, Role : {item.Role}");
            //}
            // NOTE: The new employee will NOT appear because the query was already executed
            #endregion

            #region LINQ with Tuple syntax
            // Demonstrates projecting results into a tuple instead of full objects
            //Console.WriteLine("Enter the role : ");
            //string role = Console.ReadLine().ToLower();

            // Select only Name and Role into a tuple
            //var employees = (from emp in list
            //                 where emp.Role.ToLower().Equals(role)
            //                 select (emp.Name, emp.Role)).ToList();

            //foreach (var item in employees)
            //{
            //    Console.WriteLine($"Name : {item.Name}, Role : {item.Role}");
            //}
            // NOTE: Tuples are lightweight and useful when you don’t need the full object
            #endregion
        }

        // Employee class definition
        public class Employee
        {
            public int Id { get; set; }       // Unique identifier for employee
            public string? Name { get; set; } // Employee name
            public string? Role { get; set; } // Employee role (UI/UX/DA etc.)
        }
    }
}
