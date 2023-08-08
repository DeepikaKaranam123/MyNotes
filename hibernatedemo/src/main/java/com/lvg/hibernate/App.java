package com.lvg.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.lvg.hibernate.entity.Student;
import com.lvg.hibernate.entity.Course;
import com.lvg.hibernate.util.HibernateUtil;
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory=HibernateUtil.buildSessionFactory();
        Session session=factory.openSession();
       Course c=session.get(Course.class,"Core Java");
       if(c!=null)
       {
    	   System.out.println(c.getCourseName()+" "+c.getCourseDuration());
    	   System.out.println(c.getCourseFee()+" "+c.getFacultyName());
    	   for(Student s: c.getStudents())
    		   System.out.println(s.getStudentName()+" "+s.getMobileNo()+" "+s.getStudentAddress());
       }
       System.out.println();
       Student s=session.get(Student.class, 8001);
       if(s!=null)
       {
    	   System.out.println(s.getStudentName()+" "+s.getMobileNo()+" "+s.getStudentAddress());
    	   for(Course c1:s.getCourses())
    	   {
    		   System.out.println(c1.getCourseName()+" "+c1.getCourseDuration());
    		   System.out.println(c1.getCourseFee()+" "+c1.getCourseName());
    		   System.out.println();
    	   }
       }
        session.close();
        HibernateUtil.shutdown();

    }
}