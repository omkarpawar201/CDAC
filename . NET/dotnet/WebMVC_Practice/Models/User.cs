using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace WebMVC_Practice.Models
{
    [Table("User")]
    public class User
    {
        [Key]
        [Column("Id", TypeName = "int")]
        public int Id { get; set; }

        [Column("UserName", TypeName = "varchar(50)")]
        public string? UserName { get; set; }

        [Column("Password", TypeName = "varchar(50)")]
        public string? Password { get; set; }
    }
}
