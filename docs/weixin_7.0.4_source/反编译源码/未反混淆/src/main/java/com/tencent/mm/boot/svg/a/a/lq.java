package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class lq extends c {
    private final int height = 96;
    private final int width = 96;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 96;
            case 1:
                return 96;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix h = c.h(looper);
                float[] g = c.g(looper);
                Paint k = c.k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = c.k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                c.a(k2, looper).setStrokeWidth(1.0f);
                canvas.save();
                Paint a = c.a(k, looper);
                a.setColor(-1);
                g = c.a(g, 1.0f, 0.0f, 16.0f, 0.0f, 1.0f, 15.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.saveLayerAlpha(null, 128, 4);
                canvas.save();
                Paint a2 = c.a(a, looper);
                Path l = c.l(looper);
                l.moveTo(0.98f, 33.0f);
                l.cubicTo(11.64f, 22.32f, 22.32f, 11.64f, 33.0f, 0.98f);
                l.cubicTo(34.9f, 2.86f, 36.8f, 4.76f, 38.68f, 6.66f);
                l.cubicTo(31.25f, 14.11f, 23.8f, 21.54f, 16.37f, 28.99f);
                l.cubicTo(32.58f, 29.01f, 48.79f, 28.99f, 65.0f, 29.0f);
                l.cubicTo(65.0f, 31.69f, 65.0f, 34.37f, 64.99f, 37.06f);
                l.cubicTo(48.81f, 37.08f, 32.62f, 37.05f, 16.43f, 37.07f);
                l.cubicTo(23.84f, 44.5f, 31.27f, 51.91f, 38.68f, 59.34f);
                l.cubicTo(36.8f, 61.24f, 34.9f, 63.14f, 33.0f, 65.02f);
                l.cubicTo(22.32f, 54.36f, 11.64f, 43.68f, 0.98f, 33.0f);
                l.lineTo(0.98f, 33.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
