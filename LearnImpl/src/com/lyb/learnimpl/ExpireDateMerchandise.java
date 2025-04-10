package com.lyb.learnimpl;

import java.util.Date;

public interface ExpireDateMerchandise {

    boolean notExpireInDays(int days);

    Date getProducedDate();

    public abstract Date getExpiredDate();

    double leftDatePercentage();

    double actualValueNow(double leftDatePercentage);

    default double testDefault(){
        return 999.0;
    }

    public static final int VAL_IN_INTERFACE = 999;

    private int TestPrivateMethod(){
        return 1;
    }
}
