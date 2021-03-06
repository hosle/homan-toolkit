package com.hosle.toolkit.service

import android.content.Context

/**
 * Created by tanjiahao on 2018/11/28
 * Original Project HoToolKit
 */


fun dp2px(context: Context, dpValue: Float): Int {
    val scale = context.resources.displayMetrics.density
    return (dpValue * scale + 0.5f).toInt()
}

fun px2dp(context: Context, pxValue: Float): Int {
    val scale = context.resources.displayMetrics.density
    return (pxValue / scale + 0.5f).toInt()
}