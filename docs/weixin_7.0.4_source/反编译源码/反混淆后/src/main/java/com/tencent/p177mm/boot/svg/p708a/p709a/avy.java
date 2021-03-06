package com.tencent.p177mm.boot.svg.p708a.p709a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.p177mm.svg.C5163c;
import com.tencent.p177mm.svg.WeChatSVGRenderC2Java;
import com.tencent.smtt.sdk.WebView;

/* renamed from: com.tencent.mm.boot.svg.a.a.avy */
public final class avy extends C5163c {
    private final int height = 60;
    private final int width = 60;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 60;
            case 1:
                return 60;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix h = C5163c.m7881h(looper);
                float[] g = C5163c.m7880g(looper);
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
                Paint a = C5163c.m7876a(k, looper);
                a.setColor(-16384);
                canvas.save();
                g = C5163c.m7878a(g, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 3.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a2 = C5163c.m7876a(a, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(26.87f, 0.42f);
                l.cubicTo(28.24f, 1.13f, 33.563488f, 13.02894f, 35.87f, 18.42f);
                l.cubicTo(41.73349f, 18.56894f, 48.16f, 18.15f, 53.87f, 19.42f);
                l.cubicTo(50.37f, 25.09f, 45.03f, 29.01f, 40.87f, 33.42f);
                l.cubicTo(42.32f, 40.56f, 44.71f, 47.31f, 45.87f, 54.42f);
                l.cubicTo(43.24f, 54.42f, 31.38f, 45.55f, 27.87f, 42.42f);
                l.cubicTo(23.65f, 45.43f, 12.0f, 54.43f, 8.87f, 54.42f);
                l.cubicTo(10.3f, 47.31f, 12.76f, 40.59f, 14.87f, 33.42f);
                l.cubicTo(9.97f, 29.01f, 4.64f, 25.09f, 0.87f, 19.42f);
                l.cubicTo(6.83f, 18.15f, 13.348559f, 18.55894f, 18.87f, 18.42f);
                l.cubicTo(22.098558f, 12.01894f, 23.88f, 6.36f, 26.87f, 0.42f);
                l.lineTo(26.87f, 0.42f);
                l.lineTo(26.87f, 0.42f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
