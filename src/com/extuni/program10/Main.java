package com.extuni.program10;

enum TransactionState {
    COMPLETE, REJECTED, PENDING;

    public boolean isTransactionComplete() {
        switch (this) {
            case COMPLETE:
                return true;
            case PENDING:
                return true;
            case REJECTED:
                return false;
            default:
                return true;
        }
    }
}

public class Main {

    public static void main(String[] args) {

        TransactionState[] transactionStates = TransactionState.values();

        for (TransactionState state : transactionStates) {
            System.out.println("name: " + state.name() + " isTransactionComplete: " + state.isTransactionComplete());
        }
    }
}
