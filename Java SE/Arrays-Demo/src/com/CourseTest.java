package com;

public class CourseTest {

	public static void main(String[] args) {

		Course[] courseList = new Course[4];

		courseList[0] = new Course(10, "Abc", 100, 1500, 50, 100); // 50 => -50 > 10 - No
		courseList[1] = new Course(11, "Xyz", 200, 1200, 50, 10); // 30 => 30 > 10 - Yes
		courseList[2] = new Course(12, "Abj", 300, 1100, 100, 90); // 10 => 10 > 10 - NO
		courseList[3] = new Course(13, "Kjy", 900, 1600, 30, 5); // 25 => 25 > 10 - Yes

		
		System.out.println("COURSE DETAILS");
		for(int i=0;i<courseList.length;i++) {
			courseList[i].display();
		}
		

		System.out.println("------------------------");

		Course[] couseResults = CourseDetails.findCourses(courseList, 1000);

		for (Course foundCourse : couseResults) {
			
			//if(foundCourse==null)
			//	continue;
				System.out.println(foundCourse.getCourseId());
				System.out.println(foundCourse.getCourseName());
				System.out.println("--------------------------------");
		}

	}

}