package com.epam.project1.mobileconnection.Corporation;

import com.epam.project1.mobileconnection.Corporation.Prepaid;

public class InternetAccess extends Prepaid {

    private int amountOfInternet;
    private int sms;
    private int minutesOnAnotherProviders;

    private enum TypeOfTariff{

        Cheap(2000, 50, 50, 50), Middle(4000, 100, 100, 100), High(6000, 150, 150, 150), Ultra(20000, 500, 500, 500);

        private int amountOfInternet;
        private int sms;
        private int minutesOnAnotherProviders;
        private int packageOfServicePrice;

        TypeOfTariff(int amountOfInternet, int sms, int minutesOnAnotherProviders, int packageOfServicePrice) {
            this.amountOfInternet = amountOfInternet;
            this.sms = sms;
            this.minutesOnAnotherProviders = minutesOnAnotherProviders;
            this.packageOfServicePrice = packageOfServicePrice;
        }
    }

     InternetAccess(int subscriptionFee, String type) {
        super(subscriptionFee);
            boolean flag = true;
            for (TypeOfTariff x : TypeOfTariff.values()) {
                if (x.name().equalsIgnoreCase(type)){
                    this.packageOfServicePrice = x.packageOfServicePrice;
                    this.amountOfInternet = x.amountOfInternet;
                    this.sms = x.sms;
                    this.minutesOnAnotherProviders = x.minutesOnAnotherProviders;
                    break;
                }
            }
}

    public int getAmountOfInternet() {
        return amountOfInternet;
    }

    public int getSms() {
        return sms;
    }

    public int getMinutesOnAnotherProviders() {
        return minutesOnAnotherProviders;
    }

    @Override
    public String toString() {
        return "InternetAccess{" +
                "subscriptionFee=" + subscriptionFee +
                ", packageOfServicePrice=" + packageOfServicePrice +
                ", amountOfInternet=" + amountOfInternet +
                ", amountOfMoney=" + amountOfMoney +
                ", sms=" + sms +
                ", minutesOnAnotherProviders=" + minutesOnAnotherProviders +
                ", packageOfSevices=" + packageOfSevices +
                '}';
    }
}
