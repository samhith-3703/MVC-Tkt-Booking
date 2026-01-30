package com.var.service;

import com.var.dto.request.BankDetailsRequest;
import com.var.dto.response.BankDetailsResponse;

public interface BankDetailsService {
    BankDetailsResponse addBankDetails(BankDetailsRequest request);
    BankDetailsResponse getBankDetailsById(int bankId);
    BankDetailsResponse getBankDetailsByUser(int userId);
    boolean updateBankDetails(BankDetailsRequest request, int bankId);
    boolean deleteBankDetails(int bankId);
}
