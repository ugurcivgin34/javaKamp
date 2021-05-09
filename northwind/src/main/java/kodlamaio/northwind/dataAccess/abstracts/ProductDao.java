package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entitites.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> { //Entity de product ile ilişkilendir, id integer olduğu için ıngeter olarak belirttik

}
