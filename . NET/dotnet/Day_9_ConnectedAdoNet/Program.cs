using Microsoft.Data.SqlClient;

namespace Day_9_ConnectedAdoNet
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string connection = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=DAC;Integrated Security=True";

            #region Select query
            //SqlConnection conn = new SqlConnection(connection);

            //string query = "select * from Employee";

            //SqlCommand cmd = new SqlCommand();
            //cmd.CommandType = System.Data.CommandType.Text;
            //cmd.CommandText = query;
            //cmd.Connection = conn;

            //conn.Open();

            //SqlDataReader reader = cmd.ExecuteReader();

            //while (reader.Read())
            //{
            //    int id = Convert.ToInt32(reader[0]);
            //    string? name = reader[1].ToString();
            //    string? address = reader[2].ToString();

            //    Console.WriteLine($"id : {id}, name : {name}, address : {address}");
            //}

            //conn.Close(); 
            #endregion

            #region Insert query
            //SqlConnection conn = new SqlConnection(connection);

            //Console.WriteLine("Enter Id : ");
            //int id = Convert.ToInt32(Console.ReadLine());

            //Console.WriteLine("Enter Name : ");
            //string? name = Console.ReadLine();

            //Console.WriteLine("Enter Address : ");
            //string? address = Console.ReadLine();

            //string query = $"insert into employee values('{id}', '{name}', '{address}')";

            //SqlCommand cmd = new SqlCommand();
            //cmd.CommandType = System.Data.CommandType.Text;
            //cmd.CommandText = query;
            //cmd.Connection = conn;

            //conn.Open();

            //int n = cmd.ExecuteNonQuery();

            //if (n > 0) Console.WriteLine("Record inserted successfully!!");
            //else Console.WriteLine("Record not inserted!!");

            //conn.Close(); 
            #endregion

            #region Update query
            //SqlConnection conn = new SqlConnection(connection);

            //Console.WriteLine("Enter Id to update : ");
            //int id = Convert.ToInt32(Console.ReadLine());

            //Console.WriteLine("Enter Name : ");
            //string? name = Console.ReadLine();

            //Console.WriteLine("Enter Address : ");
            //string? address = Console.ReadLine();

            //string query = $"update employee set name='{name}', address='{address}' where id={id}";

            //SqlCommand cmd = new SqlCommand(query, conn);

            //conn.Open();

            //int n = cmd.ExecuteNonQuery();

            //if (n > 0) Console.WriteLine("Record updated successfully!!");
            //else Console.WriteLine("Record not updated!!");

            //conn.Close(); 
            #endregion

            #region Delete query

            //SqlConnection conn = new SqlConnection(connection);

            //Console.WriteLine("Enter Id to delete : ");
            //int id = Convert.ToInt32(Console.ReadLine());

            //string query = $"delete from employee where id={id}";

            //SqlCommand cmd = new SqlCommand(query, conn);

            //conn.Open();

            //int n = cmd.ExecuteNonQuery();

            //if (n > 0) Console.WriteLine("Record deleted successfully!!");
            //else Console.WriteLine("Record not deleted!!");

            //conn.Close();

            #endregion
        }
    }
}
