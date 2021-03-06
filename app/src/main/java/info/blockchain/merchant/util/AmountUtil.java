package info.blockchain.merchant.util;

import android.content.Context;

import com.bitcoin.merchant.app.currency.CurrencyExchange;

import info.blockchain.merchant.tabsswipe.PaymentFragment;

public class AmountUtil {
    public static String getCurrencySymbol(Context ctx) {
        String strCurrencySymbol = "$";
        String value = AppUtil.getCurrency(ctx);
        String currencySymbol = CurrencyExchange.getInstance(ctx).getCurrencySymbol(value);
        if (currencySymbol != null) {
            strCurrencySymbol = currencySymbol.substring(0, 1);
        }
        return strCurrencySymbol;
    }

    public static String formatFiat(Context ctx, double amountFiat) {
        return getCurrencySymbol(ctx) + " " + MonetaryUtil.getInstance().getFiatDecimalFormat().format(amountFiat);
    }

    public static String formatBch(Context ctx, double amountBtc) {
        return MonetaryUtil.getInstance().getBTCDecimalFormat().format(amountBtc) + " " + PaymentFragment.DEFAULT_CURRENCY_BCH;
    }
}
