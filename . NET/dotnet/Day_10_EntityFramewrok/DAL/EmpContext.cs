using Day_10_EntityFramewrok.Models;
using Microsoft.EntityFrameworkCore;
using Microsoft.Extensions.Configuration;

namespace Day_10_EntityFramewrok.DAL
{
    public class EmpContext : DbContext
    {
        public DbSet<Emp> emps { get; set; }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            var builder = new ConfigurationBuilder();
                        
            builder.SetBasePath(Directory.GetCurrentDirectory());

            builder.AddJsonFile("appsettings.json");

            IConfiguration config = builder.Build();

            optionsBuilder.UseSqlServer(config.GetConnectionString("DAC"));
        }
    }
}
