namespace Day_11_GarbageCollector
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //Demo demo = new Demo();
            //demo.SayHi();
            //demo.Dispose();
                                                                              
            using (Demo demo = new Demo())
            {
                demo.SayHi();
            }
        }

        public class Demo : IDisposable
        {
            public void Dispose()
            {
                Console.WriteLine("Dispose method called...");
                GC.SuppressFinalize(this);
            }

            public void SayHi()
            {
                Console.WriteLine("Hi");
            }
        }
    }
}
