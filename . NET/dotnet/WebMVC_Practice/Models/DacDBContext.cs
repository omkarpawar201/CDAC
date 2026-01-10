using Microsoft.EntityFrameworkCore;

namespace WebMVC_Practice.Models
{
    public class DacDBContext : DbContext
    {
        public DbSet<Emp> emps { get; set; }
        public DbSet<User> users { get; set; }
        public DacDBContext(DbContextOptions options) : base(options)
        {
        }

    }
}
