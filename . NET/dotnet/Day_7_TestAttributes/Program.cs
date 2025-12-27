using System.Reflection;
using Day_7_BVSLib;

namespace Day_7_TestAttributes
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string dllPath = @"C:\\Users\\IET\\Desktop\\CoreNet\\CoreNet\\Day_7_EmpLib\\bin\\Debug\\net8.0\\Day_7_EmpLib.dll";

            Assembly assembly = Assembly.LoadFrom(dllPath);
            Type[] allType = assembly.GetTypes();

            for (int i = 0; i < allType.Length; i++)
            {
                Type type = allType[i];

                Console.WriteLine(type.Name);

                Attribute[] attributes = type.GetCustomAttributes().ToArray();

                for (int j = 0; j < attributes.Length; j++)
                {
                    Attribute attribute = attributes[j];

                    Type type1 = attribute.GetType();
                    Console.WriteLine(type1.Name);

                    if (attribute is BVS)
                    {
                        BVS bvsAttr = attribute as BVS;

                        Console.WriteLine($"Class {type.Name} is developed by {bvsAttr.founder} of (c) {bvsAttr.cName}");
                    }
                    if (attribute is SerializableAttribute)
                    {
                        Console.WriteLine($"Class {type.Name} is marked as Serializable");
                    }
                }
            }
        }
    }
}
