/**
 * @author Yasin Dogukan Hekim
 * @see ydhekim.github.io
 * Nov 1, 2018
 */
package io.github.ydhekim.model;

public class Supplier {

	private int id;
	private String name;
	private Product product;

	public Supplier() {
	}

	public Supplier(int id, String name, Product product) {
		super();
		this.id = 0;
		this.name = null;
		this.product = null;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
