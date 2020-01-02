package com.deloitte.serialisation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeFile {

	public static void main(String[] args) throws Exception {
		FileOutputStream fout = null;
		ObjectOutputStream oos = null;

		FileInputStream fin = null;
		ObjectInputStream ois = null;
		// TODO Auto-generated method stub
		try {
			Employee emp = new Employee(101, "Aseef", 50000);
			fout = new FileOutputStream("emp.txt");
			oos = new ObjectOutputStream(fout);

			oos.writeObject(emp);

		} catch (Exception ex) {
			System.out.println(ex);
		} finally {
			oos.close();
			fout.close();
		}

		try {
			fin = new FileInputStream("emp.txt");
			ois = new ObjectInputStream(fin);
			Employee emp = (Employee) ois.readObject();
			System.out.println(emp);
		} catch (Exception ex) {
			System.out.println(ex);
		} finally {
			ois.close();
			fin.close();
		}
	}

}
