package com.tencent.p177mm.boot.svg.p708a.p709a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.p177mm.svg.C5163c;
import com.tencent.p177mm.svg.WeChatSVGRenderC2Java;
import com.tencent.smtt.sdk.WebView;

/* renamed from: com.tencent.mm.boot.svg.a.a.bap */
public final class bap extends C5163c {
    private final int height = 24;
    private final int width = 24;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 24;
            case 1:
                return 24;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                C5163c.m7881h(looper);
                C5163c.m7880g(looper);
                Paint k = C5163c.m7883k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = C5163c.m7883k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                C5163c.m7876a(k2, looper).setStrokeWidth(1.0f);
                canvas.save();
                Paint a = C5163c.m7876a(k, looper);
                a.setColor(WebView.NIGHT_MODE_COLOR);
                Path l = C5163c.m7884l(looper);
                l.moveTo(1.75f, 7.75f);
                l.lineTo(22.25f, 7.75f);
                l.cubicTo(22.664213f, 7.75f, 23.0f, 8.085787f, 23.0f, 8.5f);
                l.cubicTo(23.0f, 8.914213f, 22.664213f, 9.25f, 22.25f, 9.25f);
                l.lineTo(1.75f, 9.25f);
                l.cubicTo(1.3357865f, 9.25f, 1.0f, 8.914213f, 1.0f, 8.5f);
                l.cubicTo(1.0f, 8.085787f, 1.3357865f, 7.75f, 1.75f, 7.75f);
                l.close();
                l.moveTo(1.75f, 11.25f);
                l.lineTo(22.25f, 11.25f);
                l.cubicTo(22.664213f, 11.25f, 23.0f, 11.585787f, 23.0f, 12.0f);
                l.cubicTo(23.0f, 12.414213f, 22.664213f, 12.75f, 22.25f, 12.75f);
                l.lineTo(1.75f, 12.75f);
                l.cubicTo(1.3357865f, 12.75f, 1.0f, 12.414213f, 1.0f, 12.0f);
                l.cubicTo(1.0f, 11.585787f, 1.3357865f, 11.25f, 1.75f, 11.25f);
                l.close();
                l.moveTo(1.75f, 14.75f);
                l.lineTo(22.25f, 14.75f);
                l.cubicTo(22.664213f, 14.75f, 23.0f, 15.085787f, 23.0f, 15.5f);
                l.cubicTo(23.0f, 15.914213f, 22.664213f, 16.25f, 22.25f, 16.25f);
                l.lineTo(1.75f, 16.25f);
                l.cubicTo(1.3357865f, 16.25f, 1.0f, 15.914213f, 1.0f, 15.5f);
                l.cubicTo(1.0f, 15.085787f, 1.3357865f, 14.75f, 1.75f, 14.75f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
