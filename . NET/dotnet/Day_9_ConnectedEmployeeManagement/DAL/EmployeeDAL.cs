using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;
using Day_9_ConnectedEmployeeManagement.Models;
using Microsoft.Data.SqlClient;

namespace Day_9_ConnectedEmployeeManagement.DAL
{
    
    internal class EmployeeDAL
    {
        static SqlConnection conn = null;

        static EmployeeDAL()
        {
            string connection = "Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=DAC;Integrated Security=True";
            conn = new SqlConnection(connection);
        }

        public List<Employee> displayALL()
        {
            string query = "select * from employee";

            List<Employee> list = new List<Employee>();

            SqlCommand cmd = new SqlCommand(query, conn);
            conn.Open();

            SqlDataReader reader = cmd.ExecuteReader();

            while (reader.Read())
            {
                int id = Convert.ToInt32(reader[0]);
                string? name = Convert.ToString(reader[1]);
                string? address = Convert.ToString(reader[2]);

                list.Add(
                    new Employee()
                    {
                        Id = id,
                        Name = name,
                        Address = address
                    });
            }

            conn.Close();
            return list;
        }

        public bool addNewEmployee()
        {
            Console.WriteLine("Enter Id : ");
            int id = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter Name : ");
            string? name = Console.ReadLine();
            Console.WriteLine("Enter Address : ");
            string? address = Console.ReadLine();

            string query = $"insert into employee values('{id}','{name}','{address}')";

            SqlCommand cmd = new SqlCommand(query, conn);
            conn.Open();

            int n = cmd.ExecuteNonQuery();

            conn.Close();

            return n > 0;
        }

        public Employee searchById(int id)
        {
            string query = $"select * from employee where id = {id}";

            SqlCommand cmd = new SqlCommand(query, conn);
            conn.Open();

            SqlDataReader reader = cmd.ExecuteReader();

            Employee emp = null;

            if (reader.Read()) { 
                emp = new Employee() 
                { 
                    Id = Convert.ToInt32(reader[0]),
                    Name = Convert.ToString(reader[1]),
                    Address = Convert.ToString(reader[2])
                };
            }

            conn.Close( );

            return emp;
        }

        public bool updateEmployee(int id)
        {
            Console.WriteLine("Enter Name : ");
            string? name = Console.ReadLine();
            Console.WriteLine("Enter Address : ");
            string? address = Console.ReadLine();

            string query = $"update employee set name='{name}', address='{address}' where id={id}";

            SqlCommand cmd = new SqlCommand(query, conn);
            conn.Open();

            int n = cmd.ExecuteNonQuery( );

            conn.Close();

            return n > 0;
        }

        public bool deleteEmployee(int id)
        {
            string query = $"delete from employee where id={id}";

            SqlCommand cmd = new SqlCommand(query, conn);
            conn.Open();

            int n = cmd.ExecuteNonQuery();

            conn.Close();
            return n > 0;
        }
    }
}
