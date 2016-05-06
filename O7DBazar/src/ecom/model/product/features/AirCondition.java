package ecom.model.product.features;

import java.io.Serializable;

public class AirCondition implements Serializable {
	private static final long serialVersionUID = 3513229389869969401L;

	private long   id;
	private long   productId;
	private long   sellerId;
	
	private String type;
	private String capacity;
	private String remoteControl;
	private String compressor;
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
	public String getRemoteControl() {
		return remoteControl;
	}
	public String getCompressor() {
		return compressor;
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
	public void setRemoteControl(String remoteControl) {
		this.remoteControl = remoteControl;
	}
	public void setCompressor(String compressor) {
		this.compressor = compressor;
	}
	
	
}
