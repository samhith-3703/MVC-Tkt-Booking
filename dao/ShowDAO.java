package com.var.dao;

import com.var.dto.request.ShowRequest;
import com.var.dto.response.ShowResponse;

import java.util.List;

public interface ShowDAO {
    ShowResponse addShow(ShowRequest request);
    ShowResponse getShowById(int showId);
    List<ShowResponse> getShowsByMovie(int movieId);
    List<ShowResponse> getShowsByTheatre(int theatreId);
    List<ShowResponse> getShowsByScreen(int screenId);
    boolean updateShow(ShowRequest request, int showId);
    boolean deleteShow(int showId);
}
