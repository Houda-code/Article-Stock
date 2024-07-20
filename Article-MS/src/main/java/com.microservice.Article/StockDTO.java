package com.microservice.Article;

import lombok.Builder;

@Builder
public record StockDTO(String stockId, String zone) {
}
