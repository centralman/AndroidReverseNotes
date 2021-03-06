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

/* renamed from: com.tencent.mm.boot.svg.a.a.f */
public final class C9108f extends C5163c {
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
                canvas.save();
                Paint a = C5163c.m7876a(k, looper);
                a.setColor(-1);
                g = C5163c.m7878a(g, 1.0f, 0.0f, 19.0f, 0.0f, 1.0f, 24.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a2 = C5163c.m7876a(a, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(0.9975446f, 38.0f);
                l.cubicTo(0.446616f, 38.0f, 0.0f, 38.446312f, 0.0f, 38.997543f);
                l.lineTo(0.0f, 46.002457f);
                l.cubicTo(0.0f, 46.553383f, 0.4463114f, 47.0f, 0.9975446f, 47.0f);
                l.lineTo(8.002456f, 47.0f);
                l.cubicTo(8.553384f, 47.0f, 9.0f, 46.553688f, 9.0f, 46.002457f);
                l.lineTo(9.0f, 38.997543f);
                l.cubicTo(9.0f, 38.446617f, 8.553689f, 38.0f, 8.002456f, 38.0f);
                l.lineTo(0.9975446f, 38.0f);
                l.lineTo(0.9975446f, 38.0f);
                l.close();
                l.moveTo(0.9975446f, 19.0f);
                l.cubicTo(0.446616f, 19.0f, 0.0f, 19.446312f, 0.0f, 19.997545f);
                l.lineTo(0.0f, 27.002455f);
                l.cubicTo(0.0f, 27.553385f, 0.4463114f, 28.0f, 0.9975446f, 28.0f);
                l.lineTo(8.002456f, 28.0f);
                l.cubicTo(8.553384f, 28.0f, 9.0f, 27.553688f, 9.0f, 27.002455f);
                l.lineTo(9.0f, 19.997545f);
                l.cubicTo(9.0f, 19.446615f, 8.553689f, 19.0f, 8.002456f, 19.0f);
                l.lineTo(0.9975446f, 19.0f);
                l.lineTo(0.9975446f, 19.0f);
                l.close();
                l.moveTo(17.993174f, 38.0f);
                l.cubicTo(17.444658f, 38.0f, 17.0f, 38.446312f, 17.0f, 38.997543f);
                l.lineTo(17.0f, 46.002457f);
                l.cubicTo(17.0f, 46.553383f, 17.446476f, 47.0f, 17.993174f, 47.0f);
                l.lineTo(57.006824f, 47.0f);
                l.cubicTo(57.55534f, 47.0f, 58.0f, 46.553688f, 58.0f, 46.002457f);
                l.lineTo(58.0f, 38.997543f);
                l.cubicTo(58.0f, 38.446617f, 57.553524f, 38.0f, 57.006824f, 38.0f);
                l.lineTo(17.993174f, 38.0f);
                l.lineTo(17.993174f, 38.0f);
                l.close();
                l.moveTo(17.993174f, 19.0f);
                l.cubicTo(17.444658f, 19.0f, 17.0f, 19.446312f, 17.0f, 19.997545f);
                l.lineTo(17.0f, 27.002455f);
                l.cubicTo(17.0f, 27.553385f, 17.446476f, 28.0f, 17.993174f, 28.0f);
                l.lineTo(57.006824f, 28.0f);
                l.cubicTo(57.55534f, 28.0f, 58.0f, 27.553688f, 58.0f, 27.002455f);
                l.lineTo(58.0f, 19.997545f);
                l.cubicTo(58.0f, 19.446615f, 57.553524f, 19.0f, 57.006824f, 19.0f);
                l.lineTo(17.993174f, 19.0f);
                l.lineTo(17.993174f, 19.0f);
                l.close();
                l.moveTo(17.993174f, 0.0f);
                l.cubicTo(17.444658f, 0.0f, 17.0f, 0.4463114f, 17.0f, 0.9975446f);
                l.lineTo(17.0f, 8.002456f);
                l.cubicTo(17.0f, 8.553384f, 17.446476f, 9.0f, 17.993174f, 9.0f);
                l.lineTo(57.006824f, 9.0f);
                l.cubicTo(57.55534f, 9.0f, 58.0f, 8.553689f, 58.0f, 8.002456f);
                l.lineTo(58.0f, 0.9975446f);
                l.cubicTo(58.0f, 0.446616f, 57.553524f, 0.0f, 57.006824f, 0.0f);
                l.lineTo(17.993174f, 0.0f);
                l.lineTo(17.993174f, 0.0f);
                l.close();
                l.moveTo(0.9975446f, 0.0f);
                l.cubicTo(0.446616f, 0.0f, 0.0f, 0.4463114f, 0.0f, 0.9975446f);
                l.lineTo(0.0f, 8.002456f);
                l.cubicTo(0.0f, 8.553384f, 0.4463114f, 9.0f, 0.9975446f, 9.0f);
                l.lineTo(8.002456f, 9.0f);
                l.cubicTo(8.553384f, 9.0f, 9.0f, 8.553689f, 9.0f, 8.002456f);
                l.lineTo(9.0f, 0.9975446f);
                l.cubicTo(9.0f, 0.446616f, 8.553689f, 0.0f, 8.002456f, 0.0f);
                l.lineTo(0.9975446f, 0.0f);
                l.lineTo(0.9975446f, 0.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                a2 = C5163c.m7876a(a, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(0.9975446f, 38.0f);
                l.cubicTo(0.446616f, 38.0f, 0.0f, 38.446312f, 0.0f, 38.997543f);
                l.lineTo(0.0f, 46.002457f);
                l.cubicTo(0.0f, 46.553383f, 0.4463114f, 47.0f, 0.9975446f, 47.0f);
                l.lineTo(8.002456f, 47.0f);
                l.cubicTo(8.553384f, 47.0f, 9.0f, 46.553688f, 9.0f, 46.002457f);
                l.lineTo(9.0f, 38.997543f);
                l.cubicTo(9.0f, 38.446617f, 8.553689f, 38.0f, 8.002456f, 38.0f);
                l.lineTo(0.9975446f, 38.0f);
                l.lineTo(0.9975446f, 38.0f);
                l.close();
                l.moveTo(0.9975446f, 19.0f);
                l.cubicTo(0.446616f, 19.0f, 0.0f, 19.446312f, 0.0f, 19.997545f);
                l.lineTo(0.0f, 27.002455f);
                l.cubicTo(0.0f, 27.553385f, 0.4463114f, 28.0f, 0.9975446f, 28.0f);
                l.lineTo(8.002456f, 28.0f);
                l.cubicTo(8.553384f, 28.0f, 9.0f, 27.553688f, 9.0f, 27.002455f);
                l.lineTo(9.0f, 19.997545f);
                l.cubicTo(9.0f, 19.446615f, 8.553689f, 19.0f, 8.002456f, 19.0f);
                l.lineTo(0.9975446f, 19.0f);
                l.lineTo(0.9975446f, 19.0f);
                l.close();
                l.moveTo(17.993174f, 38.0f);
                l.cubicTo(17.444658f, 38.0f, 17.0f, 38.446312f, 17.0f, 38.997543f);
                l.lineTo(17.0f, 46.002457f);
                l.cubicTo(17.0f, 46.553383f, 17.446476f, 47.0f, 17.993174f, 47.0f);
                l.lineTo(57.006824f, 47.0f);
                l.cubicTo(57.55534f, 47.0f, 58.0f, 46.553688f, 58.0f, 46.002457f);
                l.lineTo(58.0f, 38.997543f);
                l.cubicTo(58.0f, 38.446617f, 57.553524f, 38.0f, 57.006824f, 38.0f);
                l.lineTo(17.993174f, 38.0f);
                l.lineTo(17.993174f, 38.0f);
                l.close();
                l.moveTo(17.993174f, 19.0f);
                l.cubicTo(17.444658f, 19.0f, 17.0f, 19.446312f, 17.0f, 19.997545f);
                l.lineTo(17.0f, 27.002455f);
                l.cubicTo(17.0f, 27.553385f, 17.446476f, 28.0f, 17.993174f, 28.0f);
                l.lineTo(57.006824f, 28.0f);
                l.cubicTo(57.55534f, 28.0f, 58.0f, 27.553688f, 58.0f, 27.002455f);
                l.lineTo(58.0f, 19.997545f);
                l.cubicTo(58.0f, 19.446615f, 57.553524f, 19.0f, 57.006824f, 19.0f);
                l.lineTo(17.993174f, 19.0f);
                l.lineTo(17.993174f, 19.0f);
                l.close();
                l.moveTo(17.993174f, 0.0f);
                l.cubicTo(17.444658f, 0.0f, 17.0f, 0.4463114f, 17.0f, 0.9975446f);
                l.lineTo(17.0f, 8.002456f);
                l.cubicTo(17.0f, 8.553384f, 17.446476f, 9.0f, 17.993174f, 9.0f);
                l.lineTo(57.006824f, 9.0f);
                l.cubicTo(57.55534f, 9.0f, 58.0f, 8.553689f, 58.0f, 8.002456f);
                l.lineTo(58.0f, 0.9975446f);
                l.cubicTo(58.0f, 0.446616f, 57.553524f, 0.0f, 57.006824f, 0.0f);
                l.lineTo(17.993174f, 0.0f);
                l.lineTo(17.993174f, 0.0f);
                l.close();
                l.moveTo(0.9975446f, 0.0f);
                l.cubicTo(0.446616f, 0.0f, 0.0f, 0.4463114f, 0.0f, 0.9975446f);
                l.lineTo(0.0f, 8.002456f);
                l.cubicTo(0.0f, 8.553384f, 0.4463114f, 9.0f, 0.9975446f, 9.0f);
                l.lineTo(8.002456f, 9.0f);
                l.cubicTo(8.553384f, 9.0f, 9.0f, 8.553689f, 9.0f, 8.002456f);
                l.lineTo(9.0f, 0.9975446f);
                l.cubicTo(9.0f, 0.446616f, 8.553689f, 0.0f, 8.002456f, 0.0f);
                l.lineTo(0.9975446f, 0.0f);
                l.lineTo(0.9975446f, 0.0f);
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
