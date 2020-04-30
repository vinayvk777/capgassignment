package vinay.cg.gla.spring.service;

import java.util.List;

import vinay.cg.gla.spring.entity.Product;
import vinay.cg.gla.spring.entity.ProductOld;


public interface ProductServiceInterface {
	
	public Product save(Product product);

	public List<ProductOld> reterive();
	public List<Product> reterivev1();

}
