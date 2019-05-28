package com.tencent.p177mm.plugin.downloader.p376d;

import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;

/* renamed from: com.tencent.mm.plugin.downloader.d.a */
public final class C27707a {
    public long kLT;
    public Pair<ByteBuffer, Long> kLU;
    public Pair<ByteBuffer, Long> kLV;
    public Pair<ByteBuffer, Long> kLW;
    public Pair<ByteBuffer, Long> kLX;
    public boolean lowMemory = false;

    public final String toString() {
        AppMethodBeat.m2504i(2301);
        String str = "lowMemory : " + this.lowMemory + "\n apkSize : " + this.kLT + "\n contentEntry : " + this.kLU + "\n schemeV2Block : " + this.kLV + "\n centralDir : " + this.kLW + "\n eocd : " + this.kLX;
        AppMethodBeat.m2505o(2301);
        return str;
    }
}
