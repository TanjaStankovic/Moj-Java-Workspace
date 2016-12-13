		 class Student {
			String jmbg;
			 String ime;
			 String prezime;
			
		}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1;
		student1= new Student();
		student1.jmbg="0703988";
		student1.ime="tanja";
		student1.prezime="stankovic";
	System.out.println(student1.ime + " " + student1.prezime +" "+ student1.jmbg);
	
	
	Student student2;
	student2= new Student();
	student2.jmbg="0703988";
	student2.ime="vanja";
	student2.prezime="stankovic";
System.out.println(student2.ime + " " + student2.prezime +" "+ student2.jmbg);
	}

}
