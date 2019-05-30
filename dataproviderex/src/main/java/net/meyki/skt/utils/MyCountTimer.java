package net.meyki.skt.utils;


import meyki.dataprovider.R;

import android.content.Context;
import android.os.CountDownTimer;
import android.widget.TextView;

public class MyCountTimer extends CountDownTimer {
    public static final int TIME_COUNT = 61000;// 时间防止从119s开始显示（以倒计时120s为例子）
    private TextView btn;
    private String endStr;
    private Context context;

    /**
     * 参数 millisInFuture 倒计时总时间（如60S，120s等） 参数 countDownInterval 渐变时间（每次倒计1s）
     * 参数 btn 点击的按钮(因为Button是TextView子类，为了通用我的参数设置为TextView）
     * 参数 endStr 倒计时结束后，按钮对应显示的文字
     */
    public MyCountTimer(Context context, long millisInFuture, long countDownInterval,
                        TextView btn, String endStr) {
        super(millisInFuture, countDownInterval);
        this.context = context;
        this.btn = btn;
        this.endStr = endStr;
    }

    // 计时完毕时触发
    @Override
    public void onFinish() {
        btn.setText(endStr);
        btn.setEnabled(true);
        btn.setTextColor(context.getResources().getColor(R.color.dark_gray));
    }

    // 计时过程显示
    @Override
    public void onTick(long millisUntilFinished) {
        btn.setTextColor(context.getResources().getColor(R.color.gray_line));
        btn.setEnabled(false);
//		btn.setText("重新获取 "+millisUntilFinished / 1000 + "s");
        btn.setText(millisUntilFinished / 1000 + "秒");
    }

}
