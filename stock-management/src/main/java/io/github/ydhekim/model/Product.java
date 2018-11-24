/**
 * @author Yasin Dogukan Hekim
 * @see ydhekim.github.io
 * Nov 1, 2018
 */
package io.github.ydhekim.model;

public class Product {

	private int id;
	private int amount;
	private String name;
	private String type;

	public Product() {
	}

	public Product(int id, int amount, String name, String type) {
		super();
		this.id = 0;
		this.amount = 0;
		this.name = null;
		this.type = null;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
