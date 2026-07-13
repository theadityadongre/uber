package com.project.uber.uberApp.services;

import com.project.uber.uberApp.dto.WalletTransactionDto;
import com.project.uber.uberApp.entities.WalletTransaction;

public interface WalletTransactionService {

    void createNewWalletTransaction(WalletTransaction walletTransaction);

}
