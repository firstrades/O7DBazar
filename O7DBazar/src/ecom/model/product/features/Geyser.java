package ecom.model.product.features;

import java.io.Serializable;

public class Geyser implements Serializable {
	private static final long serialVersionUID = -210495688847841135L;

	private long   id;
	private long   productId;
	private long   sellerId;
	
	private String mountType;
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
	public String getMountType() {
		return mountType;
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
	public void setMountType(String mountType) {
		this.mountType = mountType;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	
}
