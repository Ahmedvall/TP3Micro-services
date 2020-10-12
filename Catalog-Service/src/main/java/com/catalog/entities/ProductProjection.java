package com.catalog.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "p", types = {Product.class})
public interface ProductProjection {
	String getPrice();
}
