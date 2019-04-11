/*
 *Name       :Chaitanya Singh
 *RollNo     :01050402017
 *Topic      :Inheritance
 *Question 19:Use interface college in Q15. Interface College  consist of college code and location data members and two methods Course_material and conduct classes.
*/

interface College 
{
		String ccode = "NULL";
		String loc = "NULL";
		
		void course_material();
		
		void college_code();
}
		
	public class A19_College implements College
		{
		public void course_material()
		{
			System.out.println(ccode);
		}
		public void college_code()
		{
			System.out.println(loc);
		}
		
		public static void main(String args[])
		{
			A19_College a=new A19_College();
			a.course_material();
			a.college_code();
		}
}


