package com.var.dao;

import com.var.dto.request.SeatRequest;
import com.var.dto.response.SeatResponse;

import java.util.List;

public interface SeatDAO {
    SeatResponse addSeat(SeatRequest request);
    SeatResponse getSeatById(int seatId);
    List<SeatResponse> getSeatsByScreen(int screenId);
    boolean updateSeatStatus(int seatId, boolean isBooked);
    boolean deleteSeat(int seatId);
}
