package com.cgi.course;

import java.util.List;
import java.util.Iterator;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.cgi.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		Main obj = new Main();
		
		List<Course> list=obj.getAllCourses();
		
		for(Course c:list)
		{
			System.out.println(c.getCourseId()+" : "+c.getCourseName());
		
		}
		
		//Long courseId1 = obj.saveCourse("Dotnet");
		//System.out.println("course inserted with course id="+courseId1);
		
	/*	Long courseId2 = obj.saveCourse("Chemistry");
		Long courseId3 = obj.saveCourse("Maths");
		/*
		 * 
		 */
		//obj.listCourse();
		
		// obj.updateCourse(1L, "Mathematics");
		
		//obj.deleteCourse(1L);
		/*
		obj.listCourse();
		*/
	}
	
	public List<Course> getAllCourses()
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query<Course> query=session.createQuery("FROM Course");
		return query.list();		
	}
	
	
	
	
	public Long saveCourse(String courseName)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		Long courseId = null;
		try {
			transaction = session.beginTransaction();
			Course course = new Course();
			course.setCourseName(courseName);
			//course.setCourseId(101);
			courseId = (Long) session.save(course);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return courseId;
	}
	
	public void listCourse()
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			List<Course> courses = session.createQuery("from Course").list();
			for (Iterator<Course> iterator = courses.iterator(); iterator.hasNext();)
			{
				Course course = iterator.next();
				System.out.println(course.getCourseId());
				System.out.println(course.getCourseName());
			}
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	public void updateCourse(Long courseId, String courseName)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Course course = session.get(Course.class, courseId);
			course.setCourseName(courseName);
			
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	public void deleteCourse(Long courseId)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Course course = session.get(Course.class, courseId);
			session.delete(course);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
