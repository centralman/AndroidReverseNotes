package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.c.a;
import java.util.LinkedList;

public final class r extends bsr {
    public int scene;
    public String vzL;
    public String vzM;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(56686);
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseRequest != null) {
                aVar.iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            if (this.vzL != null) {
                aVar.e(2, this.vzL);
            }
            if (this.vzM != null) {
                aVar.e(3, this.vzM);
            }
            aVar.iz(4, this.scene);
            AppMethodBeat.o(56686);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.vzL != null) {
                ix += e.a.a.b.b.a.f(2, this.vzL);
            }
            if (this.vzM != null) {
                ix += e.a.a.b.b.a.f(3, this.vzM);
            }
            int bs = ix + e.a.a.b.b.a.bs(4, this.scene);
            AppMethodBeat.o(56686);
            return bs;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(56686);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            r rVar = (r) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList Vh = aVar3.Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) Vh.get(intValue);
                        hl hlVar = new hl();
                        e.a.a.a.a aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = hlVar.populateBuilderWithField(aVar4, hlVar, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        rVar.BaseRequest = hlVar;
                    }
                    AppMethodBeat.o(56686);
                    return 0;
                case 2:
                    rVar.vzL = aVar3.BTU.readString();
                    AppMethodBeat.o(56686);
                    return 0;
                case 3:
                    rVar.vzM = aVar3.BTU.readString();
                    AppMethodBeat.o(56686);
                    return 0;
                case 4:
                    rVar.scene = aVar3.BTU.vd();
                    AppMethodBeat.o(56686);
                    return 0;
                default:
                    AppMethodBeat.o(56686);
                    return -1;
            }
        } else {
            AppMethodBeat.o(56686);
            return -1;
        }
    }
}
