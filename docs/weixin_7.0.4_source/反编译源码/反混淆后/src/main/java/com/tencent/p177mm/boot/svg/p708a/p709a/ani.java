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

/* renamed from: com.tencent.mm.boot.svg.a.a.ani */
public final class ani extends C5163c {
    private final int height = 96;
    private final int width = 96;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 96;
            case 1:
                return 96;
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
                k = C5163c.m7876a(k, looper);
                k.setColor(-1);
                canvas.save();
                Paint a = C5163c.m7876a(k, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(57.0f, 48.0f);
                l.cubicTo(57.0f, 50.762f, 59.238f, 53.0f, 62.0f, 53.0f);
                l.cubicTo(64.762f, 53.0f, 67.0f, 50.762f, 67.0f, 48.0f);
                l.cubicTo(67.0f, 45.239f, 64.762f, 43.0f, 62.0f, 43.0f);
                l.cubicTo(59.238f, 43.0f, 57.0f, 45.239f, 57.0f, 48.0f);
                l.close();
                l.moveTo(77.0f, 25.0f);
                l.lineTo(19.0f, 25.0f);
                l.cubicTo(17.344f, 25.0f, 16.0f, 26.343f, 16.0f, 28.0f);
                l.lineTo(16.0f, 68.0f);
                l.cubicTo(16.0f, 69.657f, 17.344f, 71.0f, 19.0f, 71.0f);
                l.lineTo(77.0f, 71.0f);
                l.cubicTo(78.656f, 71.0f, 80.0f, 69.657f, 80.0f, 68.0f);
                l.lineTo(80.0f, 58.0f);
                l.lineTo(62.0f, 58.0f);
                l.cubicTo(56.477f, 58.0f, 52.0f, 53.523f, 52.0f, 48.0f);
                l.cubicTo(52.0f, 42.478f, 56.477f, 38.0f, 62.0f, 38.0f);
                l.lineTo(80.0f, 38.0f);
                l.lineTo(80.0f, 28.0f);
                l.cubicTo(80.0f, 26.344f, 78.656f, 25.0f, 77.0f, 25.0f);
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
