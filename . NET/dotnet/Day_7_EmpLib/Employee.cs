using Day_7_BVSLib;
using Day_7_CustomAttributes;

namespace Day_7_EmpLib
{
	//[BVS(cName ="ABC", founder ="XYZ")]
	//[Serializable]

	[Table(TableName ="Employee")]
    public class Employee
    {
		private int _id;
		private String _ename;
		private string _address;

		[Column(ColumnName ="id", ColumnType ="int")]
		public string address
		{
			get { return _address; }
			set { _address = value; }
		}

		[Column(ColumnName ="ename", ColumnType ="varchar(20)")]
		public String ename
		{
			get { return _ename; }
			set { _ename = value; }
		}

		[Column(ColumnName ="address", ColumnType ="varchar(20)")]
		public int id
		{
			get { return _id; }
			set { _id = value; }
		}

	}
}
