using Microsoft.Data.SqlClient;

namespace Day_10_StoredProcedures
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string connection = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=DAC;Integrated Security=True";

            //insertDepartment(connection, "UX");

            //insertEmployee(connection, "def", 3);
            //insertEmployee(connection, "ghj", 2);
            //insertEmployee(connection, "tyu", 2);
            //insertEmployee(connection, "asd", 4);

            findEmployee(connection, 1);

            Console.WriteLine("done...");
        }

        public static void insertDepartment(string? connection, string? department) 
        { 
            SqlConnection conn = new SqlConnection(connection);
            conn.Open();

            SqlCommand cmd = new SqlCommand();
            cmd.CommandType = System.Data.CommandType.StoredProcedure;
            cmd.CommandText = "InsertDepartment";
            cmd.Connection = conn;
            cmd.Parameters.AddWithValue("@DepartmentName", department);

            cmd.ExecuteNonQuery();

            conn.Close();
        }

        public static void insertEmployee(string? connection, string? ename, int deptId)
        {
            SqlConnection conn = new SqlConnection(connection);
            conn.Open();

            SqlCommand cmd = new SqlCommand();
            cmd.CommandType = System.Data.CommandType.StoredProcedure;
            cmd.CommandText = "InsertEmployee";
            cmd.Connection = conn;
            cmd.Parameters.AddWithValue("@EmployeeName", ename);
            cmd.Parameters.AddWithValue("@DepartmentId", deptId);

            cmd.ExecuteNonQuery();

            conn.Close();
        }

        public static void findEmployee(string? connection, int eId)
        {
            SqlConnection conn = new SqlConnection(connection);
            conn.Open();

            SqlCommand cmd = new SqlCommand();
            cmd.CommandType = System.Data.CommandType.StoredProcedure;
            cmd.CommandText = "GetEmployeeByDepartment";
            cmd.Connection = conn;
            cmd.Parameters.AddWithValue("@DepartmentId", eId);

            SqlDataReader reader = cmd.ExecuteReader();

            if (reader.Read())
            {
                Console.WriteLine($"Id: {reader["EmployeeId"]}, Name: {reader["EmployeeName"]}");
            }

            conn.Close();
        }
    }
}
