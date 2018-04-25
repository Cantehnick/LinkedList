package by.htp.list.model;

public class Student {

	private String name;
	private int year;
	private int age;


	public Student() {
		super();

	}

	@Override
	public String toString() {
		return  getName() + "  " + getAge() + "  " + getYear();
	}                                            

	public Student(String name, int age, int year) {
		super();
		this.name = name;
		this.year = year;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setYear(int year) {
		this.year = year;
	}

























}
