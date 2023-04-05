package employeDBMS;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import com.Employe;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class EmployeManagementSystemImpl implements EmployeManagementSystem {
	Scanner scan = new Scanner(System.in);

//	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Tom");
//	EntityManager em=emf.createEntityManager();
//	EntityTransaction et=em.getTransaction();

	Map<String, Employe> map = new LinkedHashMap<String, Employe>();
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("tom");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public void addEmployeTODatabase() {
		System.out.println("enter name:");
		String name = scan.next();
		System.out.println("enter age:");
		int age = scan.nextInt();
		System.out.println("enter salary:");
		double sal = scan.nextDouble();

		Employe emp = new Employe(name, age, sal);

		et.begin();
		em.persist(emp);
		et.commit();

	}

	public void updateEmployeFromDatabase() {
		System.out.println("enter name:");
		String name = scan.next();
		System.out.println("enter age:");
		int age = scan.nextInt();
		System.out.println("enter salary:");
		double sal = scan.nextDouble();

		Employe emp = new Employe(name, age, sal);
		emp.setId(emp.getId());
		emp.setAge(age);
		emp.setName(name);
		emp.setSal(sal);
		et.begin();

		em.merge(emp);

		et.commit();

	}

	public void deleteEmployeFromDatabase() {
		Employe e=em.find(Employe.class, em);
            em.remove(e);
	}

	public void displayEmployeFromDatabase() {
		et.begin();
		
		Query q=em.createQuery("select e from Employe e");

		Employe employe=em.find(Employe.class, q);
		System.out.println(employe.getId());
		System.out.println(employe.getAge());
		System.out.println(employe.getName());
		System.out.println(employe.getSal());
		
		
	}

	public void countEmploye() {
		System.out.println("number of employe present: " + map.size());
	}

}
