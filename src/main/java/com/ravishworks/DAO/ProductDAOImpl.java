package com.ravishworks.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ravishworks.Entity.Product;

@Repository(value = "dao")
public class ProductDAOImpl implements ProductDAO {

	private static final String SELECTQUERY = "SELECT * FROM PRODUCTS WHERE productId = ?";
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	Product product;
	
	
	public Integer save(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	public Product selectProductById(Integer productId) {
		
		Product product = new Product();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			if(connection!=null) {
				preparedStatement = connection.prepareStatement(SELECTQUERY);
				if(preparedStatement!=null) {
					preparedStatement.setInt(1,productId);
					resultSet = preparedStatement.executeQuery();
					
					if(resultSet!=null) {
						
						while(resultSet.next()) {
								product.setProductId(resultSet.getInt(1));
								product.setProductName(resultSet.getString(2));
								product.setProductPrice(resultSet.getDouble(3));
								product.setProductCompany(resultSet.getString(4));
					
						}
						
					}
				}
			}	
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		if(connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(preparedStatement!=null) {
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(resultSet!=null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return product;
	}

	
	
	public Product updateProductById(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer deleteProductById(Integer productId) {
		// TODO Auto-generated method stub
		return null;
	}

}
