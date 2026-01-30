package com.var.service;

import com.var.dto.request.BookingRequest;
import com.var.dto.response.BookingResponse;

import java.util.List;

public interface BookingService {
    BookingResponse createBooking(BookingRequest request);
    BookingResponse getBookingById(int bookingId);
    List<BookingResponse> getBookingsByUser(int userId);
    List<BookingResponse> getBookingsByShow(int showId);
    boolean cancelBooking(int bookingId);
    BookingResponse generateTicket(int bookingId);

}

