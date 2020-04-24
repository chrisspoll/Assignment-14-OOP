package assignments.assignment_14.Question_14;

import java.util.ArrayList;
import java.util.List;

public class TJMaxx {
	
	private List<Item> regularItems;
	private List<OnSaleItem> onSaleItems;
	
	
	public TJMaxx() {
		this.regularItems = new ArrayList<>();
	}
	
	public void addRegularItem(Item item) {
	    regularItems.add(item);	       
	}
	
	public void addOnSaleItem(OnSaleItem item) {
		onSaleItems.add(item);
	}
	
	public List<Item> getRegularItems(){
		return regularItems;
	}

	public List<OnSaleItem> getOnSaleItems() {
		return onSaleItems;
	}
	
	public int regularItemsCount() {
		return regularItems.size();
	}
	
	public int onSaleItemsCount() {
		return onSaleItems.size();
	}
	
	public List<String> getAllItemNames(){
		List<String> list = null;
		for(int i=0;i<regularItems.size();i++) {
			list.add(regularItems.get(i).getName());
		}
		
		for(int i=0;i<onSaleItems.size();i++) {
			list.add(onSaleItems.get(i).getName());
		}
		
		return list;	
	}
	
	public double getItemPrice(int catalogNumber){
       
		for(int i=0;i<regularItems.size();i++) {
			if(regularItems.get(i).getCatalogNumber() == catalogNumber) {
				return regularItems.get(i).getPrice();
			}
		}
		
		for(int i=0;i<onSaleItems.size();i++) {
			if(onSaleItems.get(i).getCatalogNumber() == catalogNumber) {
				return onSaleItems.get(i).getPrice();
			}
		}
		
        return 0.0;
    }
	
	public OnSaleItem getOnSaleItem(String name) {
		
		for(OnSaleItem obj  : onSaleItems) {
			if(obj.getName().equalsIgnoreCase(name)) {
				return obj;
			}
		}
		return null;
	}
	
	public void removeItem(int catalogNumber) {
		
		for(int i=0;i<regularItems.size();i++) {
			if(regularItems.get(i).getCatalogNumber() == catalogNumber) {
				regularItems.remove(i);
			}
		}
		
		for(int i=0;i<onSaleItems.size();i++) {
			if(onSaleItems.get(i).getCatalogNumber() == catalogNumber) {
				onSaleItems.remove(i);
			}
		}
		
	}
	
	public void buyItem(int catalogNumber) {
	    
		for(int i=0;i<regularItems.size();i++) {
			if(regularItems.get(i).getCatalogNumber() == catalogNumber) {
				regularItems.get(i).setQuantity(regularItems.get(i).getQuantity()-1);
				if(regularItems.get(i).getQuantity() == 0) {
					removeItem(catalogNumber);
				}
			}
		}
		
		for(int i=0;i<onSaleItems.size();i++) {
			if(onSaleItems.get(i).getCatalogNumber() == catalogNumber) {
				onSaleItems.get(i).setQuantity(onSaleItems.get(i).getQuantity()-1);
				if(onSaleItems.get(i).getQuantity() == 0) {
					removeItem(catalogNumber);
				}
			}
		}       
    }		

}
