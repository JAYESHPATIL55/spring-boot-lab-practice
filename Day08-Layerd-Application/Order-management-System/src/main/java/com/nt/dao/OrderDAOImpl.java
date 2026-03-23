package com.nt.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.model.Order;

@Repository
public class OrderDAOImpl implements IOrderDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertOrder(Order order) {
		String sql = "INSERT INTO ORDERS VALUES(?,?,?,?)";
		jdbcTemplate.update(sql, order.getOrderId(), order.getDate(), order.getCustomerName(), order.getTotalAmount());
		System.out.println("Order Added Successfully.");
	}

	@Override
	public List<Order> getAllOrder() {
		String sql = "SELECT * FROM ORDERS";
		return jdbcTemplate.query(sql, (rs, rowNum) -> {
			Order b = new Order();
			b.setOrderId(rs.getInt("ORDERID"));
			b.setDate(rs.getString("DATE"));
			b.setCustomerName(rs.getString("CUSTOMERNAME"));
			b.setTotalAmount(rs.getDouble("TOTALAMOUNT"));
			return b;
		});
	}

	@Override
	public void deleteOrder(int orderId) {
		String sql = "DELETE FROM ORDERS WHERE orderId = ?";
		jdbcTemplate.update(sql, orderId);
		System.out.println("Order Deleted Successfully.");
	}

	@Override
	public void updateOrder(Order order) {
		String sql = "UPDATE ORDERS SET date = ? , customerName = ? , totalAmount = ? WHERE OrderId = ?";
		jdbcTemplate.update(sql,
				order.getDate(),
				order.getCustomerName(),
				order.getTotalAmount(),
				order.getOrderId()
				);
	}

}
