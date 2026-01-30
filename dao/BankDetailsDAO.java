package com.var.dao;

import com.var.dto.request.BankDetailsRequest;
import com.var.dto.response.BankDetailsResponse;

import java.util.List;

public interface BankDetailsDAO {
    BankDetailsResponse addBankDetails(BankDetailsRequest request);
    BankDetailsResponse getBankDetailsById(int bankId);
    BankDetailsResponse getBankDetailsByUser(int userId);
    boolean updateBankDetails(BankDetailsRequest request, int bankId);
    boolean deleteBankDetails(int bankId);
}
