package ecom.model.product.features;

import java.io.Serializable;

public class Tablet implements Serializable {
	private static final long serialVersionUID = 7581017921293796007L;

	private long   id;
	private long   productId;
	private long   sellerId;
	
	private String inTheBox;
	private String graphics;
	private String processor;
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
	public String getInTheBox() {
		return inTheBox;
	}
	public String getGraphics() {
		return graphics;
	}
	public String getProcessor() {
		return processor;
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
	public void setInTheBox(String inTheBox) {
		this.inTheBox = inTheBox;
	}
	public void setGraphics(String graphics) {
		this.graphics = graphics;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
