package examples.bookTrading;

import java.io.Serializable;

public class Proposition implements Serializable {

	public Proposition(String title, float price) {
		super();
		this.title = title;
		this.price = price;
	}

	private String title;
	private float price;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
