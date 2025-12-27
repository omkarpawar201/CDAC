using System.Reflection;
using Day_7_CustomAttributes;

namespace Day_7_TestORM
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string path = @"C:\\Users\\IET\\Desktop\\CoreNet\\CoreNet\\Day_7_EmpLib\\bin\\Debug\\net8.0\\Day_7_EmpLib.dll";

            Assembly assembly = Assembly.LoadFrom(path);
            Type[] alltype = assembly.GetTypes();

            for (int i = 0; i < alltype.Length; i++)
            {
                Type type = alltype[i];

                string createTableQuery = "CREATE TABLE ";

                Attribute[] allAttributes = type.GetCustomAttributes().ToArray();

                for (int j = 0; j < allAttributes.Length; j++)
                {
                    Attribute attr = allAttributes[j];
                    if (attr is TableAttribute)
                    {
                        TableAttribute tableAttr = attr as TableAttribute;
                        createTableQuery = createTableQuery + tableAttr.TableName + " ( ";
                        // CREATE TABLE Employee ( 
                    }

                    PropertyInfo[] allPeroperties = type.GetProperties();
                    for (int k = 0; k < allPeroperties.Length; k++)
                    {
                        PropertyInfo prop = allPeroperties[k];
                        Attribute[] propAttr = prop.GetCustomAttributes().ToArray();

                        for (int l = 0; l < propAttr.Length; l++)
                        {
                            Attribute pAttr = propAttr[l];
                            if (pAttr is ColumnAttribute)
                            {
                                ColumnAttribute col = pAttr as ColumnAttribute;
                                // CREATE TABLE Employee ( 
                                createTableQuery = createTableQuery + col.ColumnName + " " + col.ColumnType + ",";
                            }
                            // CREATE TABLE Employee ( EId int, EName varchar(50), EAddress varchar(50) )
                        }

                        createTableQuery = createTableQuery.TrimEnd(',') + " )";
                        Console.WriteLine(createTableQuery);

                        string filePath = @"C:\Users\IET\Desktop\CoreNet\CoreNet\Day_7_TestORM\SQLQuery\CreateTableQueries.txt";

                        File.WriteAllText(filePath, createTableQuery);

                        Console.WriteLine("Done.");
                    }
                }
            }
        }
    }
}
