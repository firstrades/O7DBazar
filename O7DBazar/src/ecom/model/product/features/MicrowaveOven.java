package ecom.model.product.features;

import java.io.Serializable;

public class MicrowaveOven implements Serializable {
	private static final long serialVersionUID = 6792999184617648031L;

	private long   id;
	private long   productId;
	private long   sellerId;
	
	private String type;
	private String capacity;
	public long getId() {
		return id;
	}
	public long getProductId() {
		return productId;
	}
	public long getSellerId() {
		return sellerId;
	}
	public String getType() {
		return type;
	}
	public String getCapacity() {
		return capacity;
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
	public void setType(String type) {
		this.type = type;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	
}
