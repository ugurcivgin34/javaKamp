package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import kodlamaio.northwind.entitites.concretes.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> { // Entity de product ile ilişkilendir, id integer
																		// olduğu için ıngeter olarak belirttik
	Product getByProductName(String productName);

	Product getByProductNameAndCategoryId(String productName, int categoryId);
	
	List<Product> getByProductNameOrCategoryId(String productName,int categoryId);
	
	List<Product> getByCategoryIdIn(List<Integer>categories);
	
	List<Product> getByProductNameContains(String productName);
	
	List<Product> getByProductNameStartsWith(String productName);
	
	@Query("From Product where productName=:productName and categoryId=:categoryId")
	List<Product> getByNameAndCategory(String productName,int categoryId);
	
	//select * from products where product_name=bisey and categoryId=bisey
}
