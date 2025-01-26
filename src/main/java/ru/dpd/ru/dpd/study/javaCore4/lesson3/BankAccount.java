package ru.dpd.ru.dpd.study.javaCore4.lesson3;

import java.math.BigDecimal;

/**
 * @author KiryakovDenis
 * @since 0.0.0.1
 *
 * Класс создан в рамках 3 задачи 5 Урока.
 * Реализованы методы:
 *      - зачисление средств
 *      - списание средств
 *      - получение текущего баланса
 *
 * Для хранения поля с деньгами использовал BigDecimal, поскольку для хранения информации о финансах он предпочтительнее.
 */
public class BankAccount {
    private String accountNumber;
    private BigDecimal balance;

    public BankAccount(String accountNumber, BigDecimal balance) throws Exception {
        this.validateSum(balance);
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount(String accountNumber) throws Exception {
        this(accountNumber, new BigDecimal(0));
    }

    public void deposit(BigDecimal summ) throws Exception {
        this.validate(summ);
        this.balance = this.balance.add(summ);
    }

    private boolean validate(BigDecimal summ) throws Exception {
        return new BigDecimal(0).compareTo(summ) <= 0;
    }

    private void validateSum(BigDecimal sum) throws Exception {
        if (!this.validate(sum)) throw new Exception ("Действия с отрицальными суммами запрещены!");
    }

    private BigDecimal validateBalance(BigDecimal sum) throws Exception {
        BigDecimal result = this.balance.subtract(sum);
        if (!this.validate(result))
            throw new Exception("Операция приводит к отрицательному балансу");
        else
            return result;
    }

    private BigDecimal getBalance(){
        return this.balance;
    }

    public void withdraw(BigDecimal sum) throws Exception {
        this.balance = this.validateBalance(sum);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
