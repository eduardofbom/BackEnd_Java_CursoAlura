package br.com.www.models;

import br.com.www.interfaces.BankingAction;

public abstract class BankingOperation implements BankingAction {

    protected double value;

    public BankingOperation(double value) {
        this.value = value;
    }

    @Override
    public abstract void execute();
}
