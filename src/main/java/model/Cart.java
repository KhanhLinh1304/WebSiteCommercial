package model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private List<Item> items;
	public Cart() {
		items = new ArrayList<>();
	}
	public Cart(List<Item> items) {
		super();
		this.items = items;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	//lấy item ra từ danh sách các items-> duyệt item
	public Item getItemById(int id) {
		for(Item item : items) {
			if(item != null) {
				if(item.getProduct().getIdP() == id) {
					return item;
				}
			}
		}
		return null;
	}
	public void AddItem(Item i) {
		if(getItemById(i.getProduct().getIdP()) != null) {
			Item item = getItemById(i.getProduct().getIdP());
			item.setQuantity(i.getQuantity()+item.getQuantity());
		}else {
			items.add(i);
		}
	}
	public void DeleteItem(int id) {
		if(getItemById(id) != null) {
			items.remove(getItemById(id));
		}
	}
	//duyệt qua item để lấy giá
	public float getPriceItem() {
		int total = 0;
		for(Item i : items) {
			total+=i.getQuantity()* i.getPrice();
		}
		return total;
	}
	public int getTotalQuantity() {
		int totalQ = 0;
		for(Item it: items) {
			totalQ += it.getQuantity();
		}
		return totalQ;
	}
}
