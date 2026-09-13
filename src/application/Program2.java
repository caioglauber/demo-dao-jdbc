package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		
		System.out.println("=== Teste 1 - department findById === ");
		Department department = departmentDao.findById(1);
		System.out.println(department);
		
		System.out.println("\n=== Test 2: insert department ===");
		Department dep = new Department(null, "Finance");
		departmentDao.insert(dep);
		System.out.println("Done! New Department Id: " + dep.getId());
		
		System.out.println("\n=== Test 3: update department ===");
		department.setName("Clothers");
		departmentDao.update(department);
		System.out.println("Update Complete");
		
		
		System.out.println("\n=== Test 4: delete department ===");
		departmentDao.deleteById(16);
		System.out.println("Done!: Deleted!"  );
		
		
		System.out.println("\n=== Test 5: findAll department ===");
		List<Department> list = departmentDao.findAll();
		for(Department d : list) {
			System.out.println(d);
		}
		
	}

}
