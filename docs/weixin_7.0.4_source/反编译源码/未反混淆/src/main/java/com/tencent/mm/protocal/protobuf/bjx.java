package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class bjx extends bsr {
    public String pcU;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(56913);
        b bVar;
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.pcU == null) {
                bVar = new b("Not all required fields were included: Transid");
                AppMethodBeat.o(56913);
                throw bVar;
            }
            if (this.BaseRequest != null) {
                aVar.iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            if (this.pcU != null) {
                aVar.e(2, this.pcU);
            }
            AppMethodBeat.o(56913);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.pcU != null) {
                ix += e.a.a.b.b.a.f(2, this.pcU);
            }
            AppMethodBeat.o(56913);
            return ix;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            if (this.pcU == null) {
                bVar = new b("Not all required fields were included: Transid");
                AppMethodBeat.o(56913);
                throw bVar;
            }
            AppMethodBeat.o(56913);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            bjx bjx = (bjx) objArr[1];
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
                        bjx.BaseRequest = hlVar;
                    }
                    AppMethodBeat.o(56913);
                    return 0;
                case 2:
                    bjx.pcU = aVar3.BTU.readString();
                    AppMethodBeat.o(56913);
                    return 0;
                default:
                    AppMethodBeat.o(56913);
                    return -1;
            }
        } else {
            AppMethodBeat.o(56913);
            return -1;
        }
    }
}
