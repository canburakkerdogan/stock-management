/**
 * @author Yasin Dogukan Hekim
 * @see ydhekim.github.io
 * Nov 1, 2018
 */
package io.github.ydhekim.model;

public class Manager extends Employee implements IAccountOperations {

	public Manager() {
	}

	public Manager(int id, int password, String firstName, String lastName, Department department) {
		super(id, password, firstName, lastName, department);
	}

	public void addWarehouseAttendant() {
	}

	public void deleteWarehouseAttendant() {
	}

	public void updateWarehouseAttendant() {
	}

	public void showWarehouseAttendantList() {
	}

	public void addDepartment() {
	}

	public void deleteDepartment() {
	}

	public void updateDepartment() {
	}

	public void showDepartmentList() {
	}

	public void addSupplier() {
	}

	public void deleteSupplier() {
	}

	public void updateSupplier() {
	}

	public void showSupplierList() {
	}

	public void receiveReport() {
	}

	//TODO manager login/logout
	public boolean login(int id, int password) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean logout() {
		// TODO Auto-generated method stub
		return false;
	}

}
