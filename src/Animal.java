
public class Animal {
	
	private int age;
	private String name;
	private boolean isAlive ;
		

	public Animal() {
	}

	public Animal(int age, String name, boolean isAlive) {
		this.age = age;
		this.name = name;
		this.isAlive = isAlive;
	}



	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	@Override
	public String toString() {
		return "Animal [age=" + age + ", name=" + name + ", isAlive=" + isAlive + "]";
	}
	
	
	
	
	
	
}
