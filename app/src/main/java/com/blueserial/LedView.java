package com.blueserial;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by user on 14.04.2017.
 */

public class LedView extends ImageView {

    private int state=0;
    private String code="";

    public LedView(Context context) {
        super(context);
    }

    public LedView(Context ctx, AttributeSet as) {
        super(ctx,as);
    }

    public LedView(Context ctx, AttributeSet as, int defstyle) {
        super(ctx,as,defstyle);
    }

    public void toggle() {
        if (state==0) {
            setImageResource(R.drawable.led_yellow);
            state=1;
        } else {
            setImageResource(R.drawable.led_grey);
            state=0;
        }
    }

    public void setCode(String c){
        code=c;
    }

    public String getCode() {
        return code;
    }

    public int getState() {
        return state;
    }
}
