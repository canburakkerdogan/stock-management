/**
 * @author Yasin Dogukan Hekim
 * @see ydhekim.github.io
 * Nov 1, 2018
 */
package io.github.ydhekim.model;

public class DeparmentAttendant extends Employee implements IAccountOperations {

	public DeparmentAttendant() {
	}

	public DeparmentAttendant(int id, int password, String firstName, String lastName, Department department) {
		super(id, password, firstName, lastName, department);
	}

	public void placeOrder() {
	}

	public void showOrderStatus() {
	}

	//TODO department attendant login/logout
	public boolean login(int id, int password) {
		return false;
	}

	public boolean logout() {
		return false;
	}

}
