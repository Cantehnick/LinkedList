package by.htp.list.run;

import java.util.Iterator;

import by.htp.list.model.Student;
import by.htp.list.model.StudentGroup;

public class MainApp {

	public static <E> void main(String[] args) {

		Student st1 = new Student("Name1", 19, 2018);
		Student st2 = new Student("Name2", 18, 2015);
		Student st3 = new Student("Name3", 24, 2018);
		Student st4 = new Student("Name4", 35, 2015);
		Student st5 = new Student("Name5", 21, 2018);

		StudentGroup<Student> sg = new StudentGroup<>();

		sg.addLast(st1);

		Iterator iterator = sg.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println(sg.getSize());

	}

}
