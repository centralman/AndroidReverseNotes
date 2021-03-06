package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.C6092b;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.aph */
public final class aph extends btd {
    public int wti;
    public String wtj;
    public int wtk;
    public String wtl;
    public int wtm;
    public LinkedList<bts> wtn = new LinkedList();
    public String wto;
    public int wtp;
    public String wtq;
    public int wtr;
    public SKBuiltinBuffer_t wts;

    public aph() {
        AppMethodBeat.m2504i(80102);
        AppMethodBeat.m2505o(80102);
    }

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(80103);
        C6092b c6092b;
        int ix;
        byte[] bArr;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.BaseResponse == null) {
                c6092b = new C6092b("Not all required fields were included: BaseResponse");
                AppMethodBeat.m2505o(80103);
                throw c6092b;
            }
            if (this.BaseResponse != null) {
                c6093a.mo13479iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(c6093a);
            }
            c6093a.mo13480iz(2, this.wti);
            if (this.wtj != null) {
                c6093a.mo13475e(3, this.wtj);
            }
            c6093a.mo13480iz(4, this.wtk);
            if (this.wtl != null) {
                c6093a.mo13475e(5, this.wtl);
            }
            c6093a.mo13480iz(6, this.wtm);
            c6093a.mo13474e(7, 8, this.wtn);
            if (this.wto != null) {
                c6093a.mo13475e(8, this.wto);
            }
            c6093a.mo13480iz(9, this.wtp);
            if (this.wtq != null) {
                c6093a.mo13475e(10, this.wtq);
            }
            c6093a.mo13480iz(11, this.wtr);
            if (this.wts != null) {
                c6093a.mo13479iy(12, this.wts.computeSize());
                this.wts.writeFields(c6093a);
            }
            AppMethodBeat.m2505o(80103);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = C6087a.m9557ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            ix += C6091a.m9572bs(2, this.wti);
            if (this.wtj != null) {
                ix += C6091a.m9575f(3, this.wtj);
            }
            ix += C6091a.m9572bs(4, this.wtk);
            if (this.wtl != null) {
                ix += C6091a.m9575f(5, this.wtl);
            }
            ix = (ix + C6091a.m9572bs(6, this.wtm)) + C6087a.m9552c(7, 8, this.wtn);
            if (this.wto != null) {
                ix += C6091a.m9575f(8, this.wto);
            }
            ix += C6091a.m9572bs(9, this.wtp);
            if (this.wtq != null) {
                ix += C6091a.m9575f(10, this.wtq);
            }
            ix += C6091a.m9572bs(11, this.wtr);
            if (this.wts != null) {
                ix += C6087a.m9557ix(12, this.wts.computeSize());
            }
            AppMethodBeat.m2505o(80103);
            return ix;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.wtn.clear();
            C6086a c6086a = new C6086a(bArr, unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            if (this.BaseResponse == null) {
                c6092b = new C6092b("Not all required fields were included: BaseResponse");
                AppMethodBeat.m2505o(80103);
                throw c6092b;
            }
            AppMethodBeat.m2505o(80103);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            aph aph = (aph) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            C6086a c6086a3;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        BaseResponse baseResponse = new BaseResponse();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = baseResponse.populateBuilderWithField(c6086a3, baseResponse, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        aph.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.m2505o(80103);
                    return 0;
                case 2:
                    aph.wti = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(80103);
                    return 0;
                case 3:
                    aph.wtj = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(80103);
                    return 0;
                case 4:
                    aph.wtk = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(80103);
                    return 0;
                case 5:
                    aph.wtl = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(80103);
                    return 0;
                case 6:
                    aph.wtm = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(80103);
                    return 0;
                case 7:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        bts bts = new bts();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = bts.populateBuilderWithField(c6086a3, bts, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        aph.wtn.add(bts);
                    }
                    AppMethodBeat.m2505o(80103);
                    return 0;
                case 8:
                    aph.wto = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(80103);
                    return 0;
                case 9:
                    aph.wtp = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(80103);
                    return 0;
                case 10:
                    aph.wtq = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(80103);
                    return 0;
                case 11:
                    aph.wtr = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(80103);
                    return 0;
                case 12:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        SKBuiltinBuffer_t sKBuiltinBuffer_t = new SKBuiltinBuffer_t();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = sKBuiltinBuffer_t.populateBuilderWithField(c6086a3, sKBuiltinBuffer_t, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        aph.wts = sKBuiltinBuffer_t;
                    }
                    AppMethodBeat.m2505o(80103);
                    return 0;
                default:
                    AppMethodBeat.m2505o(80103);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(80103);
            return -1;
        }
    }
}
