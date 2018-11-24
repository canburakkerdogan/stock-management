/**
 * @author Yasin Dogukan Hekim
 * @see ydhekim.github.io
 * Nov 1, 2018
 */
package io.github.ydhekim.model;

import java.util.Date;

public class Order {

	private int id;
	private int orderAmount;
	private boolean isConfirmed;
	private Date orderDate;
	private Employee employee;
	private Supplier supplier;

	public Order() {
	}

	public Order(int id, int orderAmount, boolean isConfirmed, Date orderDate, Employee employee, Supplier supplier) {
		super();
		this.id = 0;
		this.orderAmount = 0;
		this.isConfirmed = false;
		this.orderDate = null;
		this.employee = null;
		this.supplier = null;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}

	public boolean isConfirmed() {
		return isConfirmed;
	}

	public void setConfirmed(boolean isConfirmed) {
		this.isConfirmed = isConfirmed;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

}
