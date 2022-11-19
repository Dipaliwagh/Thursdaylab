package oopsconcept;

class Person4
{
	String name,dateofbirth;
	public Person4(String name, String dateofbirth)
	{
		this.name=name;
		this.dateofbirth=dateofbirth;
			
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getdateofbirth()
	{
		return dateofbirth;
	}
	public void setdateofbirth(String dateofbirth)
	{
		this.dateofbirth=dateofbirth;
	}
}
class Teacher extends Person4
{
	double salary;
	String subject;
	
	public Teacher(String name,String dateofbirth,double salary,String subject)
	{
		super(name,dateofbirth);
		
		this.salary=salary;
		this.subject=subject;
		
	}
	
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public String getSubject()
	{
		return subject;
	}
	public void setSubject(String subject)
	{
		this.subject=subject;
	}
}
class Student4 extends Person4
{
	int studentId;
	public Student4(String name,String dateofbirth,int studentId)
	{
		super(name,dateofbirth);
		this.studentId=studentId;
	}
	public int getStudentId()
	{
		return studentId;
	}
	public void setStudentId(int studentId)
{
		this.studentId=studentId;
		}
}
class College extends Student4
{
	String collegeName,studyingYear;
	public College(String name,String dateofbirth,int studentId,String collegeName,String studyingYear)
	{
		super(name,dateofbirth,studentId);
		this.collegeName=collegeName;
		this.studyingYear=studyingYear;
	}
	public String getCollegeName()
	{
		return collegeName;
	}
	public void setCollegeName(String collegeName)
	{
		this.collegeName=collegeName;
	}
	public String getStudyingYear()
	{
		return studyingYear;
	}
	public void setStudyingYear(String studyingYear)
	{
		this.studyingYear=studyingYear;
	}
}
public class CollegeTest {


	public static void main(String[] args)
	{
		System.out.println("==============================================");
		Person4 p=new Person4("Rucha","27-5-2002");
		System.out.println("Name:"+p.getName()+"\ndate of birth:"+p.getdateofbirth());
		System.out.println("==============================================");
		Teacher t=new Teacher("Prasad","16-12-2006",20000,"Java");
		System.out.println("Name:"+t.getName()+"\ndate of birth:"+t.getdateofbirth()
		+"\nSalary: "+t.getSalary()+"\nTeacher Subject:"+t.getSubject());
		System.out.println("==============================================");
        Student4 s=new Student4("Ajinkya","22-8-1999",100);
        System.out.println("Name:"+s.getName()+"\ndate of birth:"+s.getdateofbirth()+"\nStudent Id: "+s.getStudentId());
        System.out.println("==============================================");
        College c=new College("Sagar","18-8-1994",101,"Avcoe College","fourth");
        System.out.println("Name:"+c.getName()+"\ndate of birth:"+c.getdateofbirth()+"\nStudent Id: "+c.getStudentId()
        +"\nCollege Name:"+c.getCollegeName()+"\nYear:"+c.getStudyingYear());
	}

}
