/**
 * @author Yasin Dogukan Hekim
 * @see ydhekim.github.io
 * Nov 1, 2018
 */
package io.github.ydhekim.model;

public class WarehouseAttendant extends Employee implements IAccountOperations {

	public WarehouseAttendant() {
	}

	public WarehouseAttendant(int id, int password, String firstName, String lastName, Department department) {
		super(id, password, firstName, lastName, department);
	}

	public void confirmOrder() {
	}

	public void addProduct() {
	}

	//TODO warehouse attendant login/logout
	public boolean login(int id, int password) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean logout() {
		// TODO Auto-generated method stub
		return false;
	}
}
