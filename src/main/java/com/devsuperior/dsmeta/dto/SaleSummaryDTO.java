package com.devsuperior.dsmeta.dto;

import com.devsuperior.dsmeta.projections.SummaryProjection;

public class SaleSummaryDTO {
	
	private String name;
	private Double salesAmount;
	
	public SaleSummaryDTO(String name, Double salesAmount) {
		this.name = name;
		this.salesAmount = salesAmount;
	}
	
	public SaleSummaryDTO(SummaryProjection projection) {
		name = projection.getName();
		salesAmount = projection.getSalesAmount();
	}

	public String getName() {
		return name;
	}

	public Double getSalesAmount() {
		return salesAmount;
	}
}
