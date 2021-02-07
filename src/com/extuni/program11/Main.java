package com.extuni.program11;

enum TransactionState {
    COMPLETE {
        @Override
        public boolean isTransactionComplete() {
            return true;
        }
    }, REJECTED {
        @Override
        public boolean isTransactionComplete() {
            return true;
        }
    }, PENDING {
        @Override
        public boolean isTransactionComplete() {
            return false;
        }
    }, AWAITING_APPROVAL {
        @Override
        public boolean isTransactionComplete() {
            return false;
        }
    };

    public abstract boolean isTransactionComplete();
}

public class Main {

    public static void main(String[] args) {

        TransactionState[] transactionStates = TransactionState.values();

        for (TransactionState state : transactionStates) {
            System.out.println("name: " + state.name() + " isTransactionComplete: " + state.isTransactionComplete());
        }
    }
}
