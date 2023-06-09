package com.juaracoding.strategies;

import com.juaracoding.pages.utils.Constants;

public class DriverStrategyImplementor {
    public static DriverStrategy chooseStrategy(String strategy) {
        switch (strategy) {
            case Constants.CHROME:
                return new Chrome();
            case Constants.FIREFOX:
                return new Firefox();
            default:
                return null;
        }
    }
}
