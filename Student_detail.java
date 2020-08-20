class Student_detail
{
 public static void main(String[] a)
  {
    String Reg_id,Name;
    float english=55.6f,maths=50.4f,science=6.0f,total,Average;
    total= english+maths+science; 
    Average=total/3; 
    char grade;
	if (Average>=85)
	{
	 grade='A';
	 System.out.println("Overall grade is:"+grade);
	}
	else if ((Average>=75)&&(Average<85))
	{
	 grade='B';
	 System.out.println("Overall grade is:"+grade);
	}
	else if ((Average>=65)&& (Average<75))
	{
	 grade='C';
	 System.out.println("Overall grade is:"+grade);
	}
	else if(Average<65)
	{
	 grade='D';
	 System.out.println("Overall grade is:"+grade);
	}
	else 
	{
	 grade='F';
	 System.out.println("Overall grade is:"+grade);
	}
   }
 }
