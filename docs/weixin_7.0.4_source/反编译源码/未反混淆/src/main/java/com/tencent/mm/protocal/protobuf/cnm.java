package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class cnm extends bsr {
    public SKBuiltinBuffer_t vLz;
    public int wTs;
    public int wTu;
    public String wuc;
    public cob xkT;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(28699);
        b bVar;
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.xkT == null) {
                bVar = new b("Not all required fields were included: Piece");
                AppMethodBeat.o(28699);
                throw bVar;
            } else if (this.vLz == null) {
                bVar = new b("Not all required fields were included: RandomEncryKey");
                AppMethodBeat.o(28699);
                throw bVar;
            } else {
                if (this.BaseRequest != null) {
                    aVar.iy(1, this.BaseRequest.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                if (this.xkT != null) {
                    aVar.iy(2, this.xkT.computeSize());
                    this.xkT.writeFields(aVar);
                }
                aVar.iz(3, this.wTs);
                aVar.iz(4, this.wTu);
                if (this.wuc != null) {
                    aVar.e(5, this.wuc);
                }
                if (this.vLz != null) {
                    aVar.iy(6, this.vLz.computeSize());
                    this.vLz.writeFields(aVar);
                }
                AppMethodBeat.o(28699);
                return 0;
            }
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.xkT != null) {
                ix += e.a.a.a.ix(2, this.xkT.computeSize());
            }
            ix = (ix + e.a.a.b.b.a.bs(3, this.wTs)) + e.a.a.b.b.a.bs(4, this.wTu);
            if (this.wuc != null) {
                ix += e.a.a.b.b.a.f(5, this.wuc);
            }
            if (this.vLz != null) {
                ix += e.a.a.a.ix(6, this.vLz.computeSize());
            }
            AppMethodBeat.o(28699);
            return ix;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            if (this.xkT == null) {
                bVar = new b("Not all required fields were included: Piece");
                AppMethodBeat.o(28699);
                throw bVar;
            } else if (this.vLz == null) {
                bVar = new b("Not all required fields were included: RandomEncryKey");
                AppMethodBeat.o(28699);
                throw bVar;
            } else {
                AppMethodBeat.o(28699);
                return 0;
            }
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            cnm cnm = (cnm) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            byte[] bArr;
            e.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        hl hlVar = new hl();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = hlVar.populateBuilderWithField(aVar4, hlVar, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        cnm.BaseRequest = hlVar;
                    }
                    AppMethodBeat.o(28699);
                    return 0;
                case 2:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        cob cob = new cob();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = cob.populateBuilderWithField(aVar4, cob, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        cnm.xkT = cob;
                    }
                    AppMethodBeat.o(28699);
                    return 0;
                case 3:
                    cnm.wTs = aVar3.BTU.vd();
                    AppMethodBeat.o(28699);
                    return 0;
                case 4:
                    cnm.wTu = aVar3.BTU.vd();
                    AppMethodBeat.o(28699);
                    return 0;
                case 5:
                    cnm.wuc = aVar3.BTU.readString();
                    AppMethodBeat.o(28699);
                    return 0;
                case 6:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        SKBuiltinBuffer_t sKBuiltinBuffer_t = new SKBuiltinBuffer_t();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = sKBuiltinBuffer_t.populateBuilderWithField(aVar4, sKBuiltinBuffer_t, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        cnm.vLz = sKBuiltinBuffer_t;
                    }
                    AppMethodBeat.o(28699);
                    return 0;
                default:
                    AppMethodBeat.o(28699);
                    return -1;
            }
        } else {
            AppMethodBeat.o(28699);
            return -1;
        }
    }
}
