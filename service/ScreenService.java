package com.var.service;

import com.var.dto.request.ScreenRequest;
import com.var.dto.response.ScreenResponse;

import java.util.List;

public interface ScreenService {
    ScreenResponse addScreen(ScreenRequest request);
    ScreenResponse getScreenById(int screenId);
    List<ScreenResponse> getScreensByTheatre(int theatreId);
    boolean updateScreen(ScreenRequest request, int screenId);
    boolean deleteScreen(int screenId);
}
