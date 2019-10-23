package com.xj.pojo;

import com.xj.pojo.Commodity;

/**
 * 封装了购物车中的商品, 包含对商品的引用以及购物车中该商品的数量
 *
 */
public class ShoppingCartItem {
	private long id;
	private long comm_id;
	private Commodity commodity;
	private long  commnumber;
	private float subtotalprice;
	private long shoppingcar_id;
	
	public ShoppingCartItem(Commodity commodity) {
		this.commodity = commodity;
		this.commnumber = 1;
	}
	
	public Commodity getCommodity() {
		return commodity;
	}
	
	
	
	public long getCommnumber() {
		return commnumber;
	}

	public void setCommnumber(long commnumber) {
		this.commnumber = commnumber;
	}

	/**
	 * 返回该商品在购物车中的钱
	 * 
	 */
	public float getSubtotalprice(){
		return commodity.getCommprice() * commnumber;
	}
	
	/**
	 * 使商品数量 + 1
	 */
	public void increment(){
		commnumber++;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getComm_id() {
		return comm_id;
	}

	public void setComm_id(long comm_id) {
		this.comm_id = comm_id;
	}

	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}

	public long getShoppingcar_id() {
		return shoppingcar_id;
	}

	public void setShoppingcar_id(long shoppingcar_id) {
		this.shoppingcar_id = shoppingcar_id;
	}
	
	
	
}
