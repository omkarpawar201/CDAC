using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace Day_13_EF_Filters_Sessions_WebAPI.Migrations
{
    /// <inheritdoc />
    public partial class empmigAddedArea : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.AddColumn<string>(
                name: "area",
                table: "Emp",
                type: "varchar(50)",
                nullable: true);
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropColumn(
                name: "area",
                table: "Emp");
        }
    }
}
