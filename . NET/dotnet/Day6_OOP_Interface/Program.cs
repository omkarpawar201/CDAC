namespace Day6_OOP_Interface
{
    //System.out.println("Hello World!");
    // S.O.L.I.D Princliples 
    // Interfaces are for:
    // 1. Achieving Abstraction
    // 2. Achieving Multiple Inheritance
    // 3. Loose Coupling
    // 4. Open Contracts
    // 5. Templated Programming
    // 6. No need for Type casting
    // Factory Design Pattern : Object creation logic is separated from the main program logic.
    internal class Program
    {
        static void Main(string[] args)
        {
            // Commented out: Original tight-coupled approach (BAD)
            #region Demo 01 - Tight Coupling (Avoid This)
            //InsertInMySqlServer();
            //UpdateInMySqlServer();
            //DeleteInMySqlServer();
            //MySqlServer mysql = new MySqlServer();  // Direct instantiation - violates DIP
            //mysql.Insert();
            //mysql.Update();
            //mysql.Delete(); 
            #endregion

            // Factory Pattern Approach (GOOD) - Loose Coupling
            Console.WriteLine("Enter your Db choice. 1. SqlServer, 2. MySql Server, 3. Oracle Server");
            int dbChoice = Convert.ToInt32(Console.ReadLine());

            // Factory creates database objects based on user choice
            // Main program doesn't know concrete class types - only IDatabase interface
            DataBaseFactory factory = new DataBaseFactory();
            IDatabase someDatabaseObject = factory.GetSomeDatabase(dbChoice);

            Console.WriteLine("Enter db operation choice : 1. Insert, 2. Update, 3. Delete");
            int opChoice = Convert.ToInt32(Console.ReadLine());

            // Polymorphism: Same method calls work for any database type
            switch (opChoice)
            {
                case 1:
                    someDatabaseObject.Insert();
                    break;
                case 2:
                    someDatabaseObject.Update();
                    break;
                case 3:
                    someDatabaseObject.Delete();
                    break;
                default:
                    Console.WriteLine("Invalid Db operation Choice");
                    break;

            }
        }
    }

    /// <summary>
    /// Interface defines contract for all database operations
    /// Benefits: Abstraction, Multiple Inheritance, Loose Coupling, Open Contracts
    /// </summary>
    public interface IDatabase
    {
        /// <summary>
        /// Inserts a record into the database
        /// </summary>
        void Insert();

        /// <summary>
        /// Updates an existing record in the database
        /// </summary>
        void Update();

        /// <summary>
        /// Deletes a record from the database
        /// </summary>
        void Delete();
    }

    /// <summary>
    /// Factory Design Pattern: Centralizes object creation logic
    /// Separates object creation from client code (Main method)
    /// Easy to extend: Add new database types without changing client code
    /// </summary>
    public class DataBaseFactory
    {
        // Factory method returns interface reference (not concrete types)
        // Client code works with abstraction, not implementation details
        public IDatabase GetSomeDatabase(int dbChoice)
        {
            IDatabase db = null;
            switch (dbChoice)
            {
                case 1:
                    db = new SqlServer();      // Returns SqlServer as IDatabase
                    break;
                case 2:
                    db = new MySqlServer();    // Returns MySqlServer as IDatabase
                    break;
                case 3:
                    db = new OracleServer();   // Returns OracleServer as IDatabase
                    break;
                default:
                    db = null;
                    Console.WriteLine("Invalid database choice");
                    break;
            }
            return db;
        }
    }

    /// <summary>
    /// Concrete implementation for MySQL Server
    /// Implements IDatabase interface (achieves abstraction)
    /// </summary>
    public class MySqlServer : IDatabase
    {
        public void Insert()
        {
            Console.WriteLine("Record Inserted in MySql Successfully");
        }

        public void Update()
        {
            Console.WriteLine("Record Updated in MySql Successfully");
        }

        public void Delete()
        {
            Console.WriteLine("Record Deleted from MySql Successfully");
        }
    }

    /// <summary>
    /// Concrete implementation for SQL Server
    /// Multiple classes implement same interface (Multiple Inheritance effect)
    /// </summary>
    public class SqlServer : IDatabase
    {
        public void Insert()
        {
            Console.WriteLine("Record Inserted in SqlServer Successfully");
        }

        public void Update()
        {
            Console.WriteLine("Record Updated in SqlServer Successfully");
        }

        public void Delete()
        {
            Console.WriteLine("Record Deleted from SqlServer Successfully");
        }
    }

    /// <summary>
    /// Concrete implementation for Oracle Server
    /// Easy to add new database types - just implement IDatabase
    /// No type casting needed - works directly with interface
    /// </summary>
    public class OracleServer : IDatabase
    {
        public void Insert()
        {
            Console.WriteLine("Record Inserted in OracleServer Successfully");
        }

        public void Update()
        {
            Console.WriteLine("Record Updated in OracleServer Successfully");
        }

        public void Delete()
        {
            Console.WriteLine("Record Deleted from OracleServer Successfully");
        }
    }
}
