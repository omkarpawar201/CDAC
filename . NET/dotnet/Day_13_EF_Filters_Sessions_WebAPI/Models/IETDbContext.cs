using Microsoft.EntityFrameworkCore;

namespace Day_13_EF_Filters_Sessions_WebAPI.Models
{
    public class IETDbContext : DbContext
    {
        public DbSet<Emp> emps { get; set; }

        public IETDbContext(DbContextOptions options) : base(options)
        {

        }
    }
}
