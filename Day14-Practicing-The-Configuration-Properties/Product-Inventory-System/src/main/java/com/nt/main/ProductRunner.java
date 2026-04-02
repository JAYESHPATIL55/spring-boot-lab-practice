package com.nt.main;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Component
@ConfigurationProperties("info.product")
public class ProductRunner {
		private int id;
		private String name;
		private double price;
		private String[] features;
		private List<String> categories;
		private Set<String> tags;
		private Map<String,Integer> stock;
		private  Supplier supplier;

}
