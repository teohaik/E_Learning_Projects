
public class Student {

    private String name;
	
	private String code;

    public Student(String aName){
        name = aName;
    }
	
	public Student(String aName, String aCode){
		name = aName;
		code = aCode;
	}
	
	public String toString(){
		return "Student "+name+" - "+code;
	}


}
