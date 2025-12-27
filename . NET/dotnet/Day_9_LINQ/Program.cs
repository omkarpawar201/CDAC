namespace Day_9_LINQ
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // Step 1: Create a list of Employee objects with sample data
            // Each Employee has Id, Name, and Role properties
            List<Employee> list = new List<Employee>() {
                new Employee(){Id = 1, Name = "abc", Role = "UI"},
                new Employee(){Id = 2, Name = "dfe", Role = "UI"},
                new Employee(){Id = 3, Name = "xyz", Role = "UX"},
                new Employee(){Id = 4, Name = "fgh", Role = "UX"},
                new Employee(){Id = 5, Name = "hjk", Role = "UI"}
            };

            // Step 2: Ask the user to enter a role (UI or UX)
            Console.WriteLine("Enter the role : ");
            string role = Console.ReadLine().ToLower();
            // Convert input to lowercase for case-insensitive comparison

            #region C# Syntax (Traditional Approach)
            // This is the old-school way of filtering data using loops and conditions
            //var employees = new List<Employee>();

            //foreach (var emp in list)
            //{
            //    // Compare role in lowercase to make it case-insensitive
            //    if (emp.Role.ToLower().Equals(role))
            //    {
            //        employees.Add(emp); // Add matching employee to the new list
            //    }
            //}

            //foreach (var emp in employees)
            //{
            //    Console.WriteLine($"Id : {emp.Id}, Name : {emp.Name}, Role : {emp.Role}");
            //}
            #endregion

            #region LINQ Query Syntax (Select All)
            // LINQ allows querying collections with SQL-like syntax
            // This example selects all employees without filtering
            //var employees = (from emp in list select emp);

            //foreach (var item in employees)
            //{
            //    Console.WriteLine($"Id : {item.Id}, Name : {item.Name}, Role : {item.Role}");
            //}
            #endregion

            #region LINQ Query Syntax (Filter with WHERE)
            // LINQ query to filter employees based on the role entered by the user
            var employees = (from emp in list
                             where emp.Role.ToLower().Equals(role) // Filter condition
                             select emp); // Select matching employees

            // Iterate through the filtered employees and print their details
            foreach (var item in employees)
            {
                Console.WriteLine($"Id : {item.Id}, Name : {item.Name}, Role : {item.Role}");
            }
            #endregion
                 
        }

        // Employee class with properties Id, Name, and Role
        public class Employee
        {
            public int Id { get; set; }       // Unique identifier for employee
            public string? Name { get; set; } // Employee name
            public string? Role { get; set; } // Employee role (UI/UX)
        }
    }
}
