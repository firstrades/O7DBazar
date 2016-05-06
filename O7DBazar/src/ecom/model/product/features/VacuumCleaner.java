package ecom.model.product.features;

import java.io.Serializable;

public class VacuumCleaner implements Serializable {
	private static final long serialVersionUID = -1057102997086426009L;

	private long   id;
	private long   productId;
	private long   sellerId;
	
	private String consumption;
	private String type;
	private String blower;
	public long getId() {
		return id;
	}
	public long getProductId() {
		return productId;
	}
	public long getSellerId() {
		return sellerId;
	}
	public String getConsumption() {
		return consumption;
	}
	public String getType() {
		return type;
	}
	public String getBlower() {
		return blower;
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
	public void setConsumption(String consumption) {
		this.consumption = consumption;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setBlower(String blower) {
		this.blower = blower;
	}
	
}
