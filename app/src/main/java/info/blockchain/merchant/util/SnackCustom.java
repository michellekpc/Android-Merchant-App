package info.blockchain.merchant.util;

import android.content.Context;
import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.view.View;

import com.bitcoin.merchant.app.R;

public class SnackCustom {
    public static void make(final Context context, final View view, final CharSequence text, String action, View.OnClickListener listener) {
        Snackbar snack = Snackbar.make(view, text, Snackbar.LENGTH_LONG).setAction(action, listener);
        View sview = snack.getView();
        sview.setBackgroundColor(Color.parseColor("#C00000"));
        snack.setActionTextColor(context.getResources().getColor(R.color.accent_material_dark));
        snack.show();
    }
}
