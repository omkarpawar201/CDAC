namespace Day_11_WebMVCDemo1
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);

            builder.Services.AddControllersWithViews();

            var app = builder.Build();

            app.MapDefaultControllerRoute();

            app.Run();
        }
    }
}
