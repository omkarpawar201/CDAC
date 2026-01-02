using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Day_9_AdoLoginSystem.Models;
using Microsoft.Data.SqlClient;

namespace Day_9_AdoLoginSystem.DAL
{
    internal class UserDAL
    {
        static SqlConnection conn = null;

        static UserDAL()
        {
            string connection = "Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=DAC;Integrated Security=True";
            conn = new SqlConnection(connection);
        }

        public User validateUser(string? uname, string? pass)
        {
            string query = $"select * from [dbo].[User] where uname='{uname}' and password='{pass}'";

            SqlCommand cmd = new SqlCommand(query, conn);
            conn.Open();

            SqlDataReader reader = cmd.ExecuteReader();
            User? user = null;

            if (reader.Read())
            {
                user = new User()
                {
                    Id = Convert.ToInt32(reader[0]),
                    UName = reader[1].ToString(),
                    Email = reader[2].ToString(),
                    Password = reader[3].ToString()
                };
                
            }

            conn.Close();

            return user;
        }

        public bool registerUser(string? email, string? uname, string? pass)
        {
            string query = $"insert into [dbo].[User](uname, email, password) values('{uname}', '{email}', '{pass}')";

            SqlCommand cmd = new SqlCommand(query, conn);
            conn.Open();

            int n = cmd.ExecuteNonQuery();

            conn.Close();
            return n > 0;
        }

        public bool updatePassword(string? pass, int id)
        {
            string query = $"update [dbo].[User] set password='{pass}' where id={id}";

            SqlCommand cmd = new SqlCommand(query, conn);
            conn.Open();

            int n = cmd.ExecuteNonQuery();

            conn.Close();
            return n > 0;
        }
    }
}
