package ecom.model.product.features;

import java.io.Serializable;

public class Television implements Serializable {
	private static final long serialVersionUID = 484441987831065674L;

	private long   id;
	private long   productId;
	private long   sellerId;
	
	private String displaySize;
	private String screenType;
	private String hdmi;
	public long getId() {
		return id;
	}
	public long getProductId() {
		return productId;
	}
	public long getSellerId() {
		return sellerId;
	}
	public String getDisplaySize() {
		return displaySize;
	}
	public String getScreenType() {
		return screenType;
	}
	public String getHdmi() {
		return hdmi;
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
	public void setDisplaySize(String displaySize) {
		this.displaySize = displaySize;
	}
	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}
	public void setHdmi(String hdmi) {
		this.hdmi = hdmi;
	}
	
	
}
