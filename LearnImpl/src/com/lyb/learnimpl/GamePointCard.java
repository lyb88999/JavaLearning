package com.lyb.learnimpl;

import java.util.Date;

public class GamePointCard extends Merchandise implements ExpireDateMerchandise, VirtualMerchandise {

    private Date produceDate;

    private Date expirationDate;

    public GamePointCard(String name, String id, double price, int stock, Date produceDate, Date expirationDate) {
        super(name, id, price, stock);
        this.produceDate = produceDate;
        this.expirationDate = expirationDate;
    }

    @Override
    public boolean notExpireInDays(int days) {
        return daysBeforeExpire() > days;
    }

    @Override
    public Date getProducedDate() {
        return produceDate;
    }

    @Override
    public Date getExpiredDate() {
        return expirationDate;
    }

    @Override
    public double leftDatePercentage() {
        return 1.0 * daysBeforeExpire() / (this.getExpiredDate().getTime() - this.getProducedDate().getTime());
    }

    @Override
    public double actualValueNow(double leftDatePercentage) {
        return getPrice();
    }

    private long daysBeforeExpire() {
        long expireMS = expirationDate.getTime();
        long left = System.currentTimeMillis() - expireMS;
        if (left < 0) {
            return -1;
        }
        return left / (24 * 3600 * 1000);
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Date getProduceDate() {
        return produceDate;
    }

    public void setProduceDate(Date produceDate) {
        this.produceDate = produceDate;
    }
}
