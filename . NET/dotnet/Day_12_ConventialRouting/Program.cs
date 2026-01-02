namespace Day_12_ConventialRouting
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);
            builder.Services.AddControllersWithViews();

            var app = builder.Build();

            //app.MapDefaultControllerRoute();

            app.MapControllerRoute(
                name: "home",
                pattern: "/{controller=HomeController}/{action=Index}/{Id?}"
            );

            app.MapControllerRoute(
                name:"test",
                pattern: "/{controller=Test}/{action=Index}"
            );

            app.Run();
        }
    }
}
