package ecom.model.product.features;

import java.io.Serializable;

public class Refrigerator implements Serializable {
	private static final long serialVersionUID = 4104880165823394512L;

	private long   id;
	private long   productId;
	private long   sellerId;
	
	private String capacity;
	private String color;
	private String numberOfDoor;
	public long getId() {
		return id;
	}
	public long getProductId() {
		return productId;
	}
	public long getSellerId() {
		return sellerId;
	}
	public String getCapacity() {
		return capacity;
	}
	public String getColor() {
		return color;
	}
	public String getNumberOfDoor() {
		return numberOfDoor;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public void setSellerId(long sellerId) {
		this.sellerId = sellerId;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setNumberOfDoor(String numberOfDoor) {
		this.numberOfDoor = numberOfDoor;
	}
	
	
	
}
