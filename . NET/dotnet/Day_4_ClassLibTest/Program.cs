using Day_4_ClassLib;

namespace Day_4_ClassLibTest
{
    internal class Program
    {
        static void Main(string[] args)
        {
            CMath cMath = new CMath();
            //cMath.Add(5, 2);

            AdvMath advMath = new AdvMath();
            advMath.Adv_math();
        }
    }
}
