package it.unibo.oop.lab05.ex3;


import java.util.LinkedHashSet;
import java.util.Set;

public class WarehouseImpl implements Warehouse{

	private Set<Product> mainSet = new LinkedHashSet<Product>();
	
	@Override
	public void addProduct(Product p) {
		this.mainSet.add(p);
	}

	@Override
	public Set<String> allNames() {
		 Set<String> name = new LinkedHashSet<String>();
        for (Product p : this.mainSet) {
            name.add(p.getName());
        }
		
	return name;
	}

	@Override
	public Set<Product> allProducts() {
		
		Set<Product> products = new LinkedHashSet<Product>(mainSet);
		
		return products;
	}

	@Override
	public boolean containsProduct(Product p) {
		
		
		return mainSet.contains(p);
	}

	@Override
	public double getQuantity(String name) {
		
		 for (Product p : this.mainSet) {
	            if (p.getName().equals(name)) {
	                return p.getQuantity();
	            }
	        }
	        return 0;
	}

}
