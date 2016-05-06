package ecom.model.product.features;

import java.io.Serializable;

public class Speaker implements Serializable {
	private static final long serialVersionUID = -6708134822217330517L;

	private long   id;
	private long   productId;
	private long   sellerId;
	
	private String subWoofer;
	private String powerOutput;
	public long getId() {
		return id;
	}
	public long getProductId() {
		return productId;
	}
	public long getSellerId() {
		return sellerId;
	}
	public String getSubWoofer() {
		return subWoofer;
	}
	public String getPowerOutput() {
		return powerOutput;
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
	public void setSubWoofer(String subWoofer) {
		this.subWoofer = subWoofer;
	}
	public void setPowerOutput(String powerOutput) {
		this.powerOutput = powerOutput;
	}
	
}
