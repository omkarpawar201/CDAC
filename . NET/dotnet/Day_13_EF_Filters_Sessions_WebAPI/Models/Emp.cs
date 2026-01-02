using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace Day_13_EF_Filters_Sessions_WebAPI.Models
{
    [Table("Emp")]
    public class Emp
    {
        [Key]
        [Column("id", TypeName = "int")]
        public int Id { get; set; }

        [Column("name", TypeName = "varchar(50)")]
        public string? Name { get; set; }

        [Column("address", TypeName = "varchar(50)")]
        public string? Address { get; set; }
    }
}
