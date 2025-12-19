namespace Day_4_ClassLib
{
    public class CMath
    {
        public void Add(int x, int y)
        {
            Console.WriteLine($"Add = {x + y}");
        }

        private void Sub(int x, int y)
        {
            Console.WriteLine($"Sub = {x - y}");
        }

        protected void Mult(int x, int y)
        {
            Console.WriteLine($"Mult = {x * y}");
        }

        internal void Div(int x, int y)
        {
            Console.WriteLine($"Div = {x / y}");
        }

        protected internal void Square(int x)
        {
            Console.WriteLine($"Square = {x * x}");
        }
    }

    public class AdvMath : CMath
    {
        public void Adv_math()
        {
            base.Add(2, 5);
            base.Mult(2, 5);
            base.Square(2);
        }
    }
}
