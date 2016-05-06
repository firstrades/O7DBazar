package ecom.model.product.features;

import java.io.Serializable;

public class Camera implements Serializable {
	private static final long serialVersionUID = 2428241853284703721L;

	private long   id;
	private long   productId;
	private long   sellerId;
	
	private String type;
	private String color;
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
	public String getColor() {
		return color;
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
	public void setColor(String color) {
		this.color = color;
	}
	
}
