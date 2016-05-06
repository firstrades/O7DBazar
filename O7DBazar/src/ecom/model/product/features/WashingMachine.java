package ecom.model.product.features;

import java.io.Serializable;

public class WashingMachine implements Serializable {
	private static final long serialVersionUID = 1540590994867647632L;

	private long   id;
	private long   productId;
	private long   sellerId;
	
	private String capacity;
	private String inBuiltHeater;
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
	public String getInBuiltHeater() {
		return inBuiltHeater;
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
	public void setInBuiltHeater(String inBuiltHeater) {
		this.inBuiltHeater = inBuiltHeater;
	}
	
}
