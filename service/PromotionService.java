package com.var.service;

import com.var.dto.request.PromotionRequest;
import com.var.dto.response.PromotionResponse;

import java.util.List;

public interface PromotionService {
    PromotionResponse addPromotion(PromotionRequest request);
    PromotionResponse getPromotionById(int promotionId);
    PromotionResponse getPromotionByCode(String code);
    List<PromotionResponse> getAllPromotions();
    boolean updatePromotion(PromotionRequest request, int promotionId);
    boolean deletePromotion(int promotionId);
}
