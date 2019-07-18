
public class Student {

	private int no;
	private String name;
	private int num;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + no;
		result = prime * result + num;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (no != other.no)
			return false;
		if (num != other.num)
			return false;
		return true;
	}


	public Student(int no, String name, int num) {
		super();
		this.no = no;
		this.name = name;
		this.num = num;
	}


	public int getNo() {
		return no;
	}


	public String getName() {
		return name;
	}


	public int getNum() {
		return num;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setNum(int num) {
		this.num = num;
	}
	
	
	
	
}
