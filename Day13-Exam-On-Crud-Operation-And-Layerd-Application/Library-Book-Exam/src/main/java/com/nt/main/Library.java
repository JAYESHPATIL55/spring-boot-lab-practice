package com.nt.main;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
@ConfigurationProperties("info.books")
public class Library {
private List<Books> books;
}
