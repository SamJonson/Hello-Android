package custom;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/**
 * author: gonson.li
 * data: 2016/10/24
 * package: custom
 * func:
 * desc:
 */

public class SelfTestView extends FrameLayout {
    public SelfTestView(Context context) {
        super(context);
    }

    public SelfTestView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SelfTestView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public SelfTestView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        this(context, attrs, defStyleAttr);
    }
}
