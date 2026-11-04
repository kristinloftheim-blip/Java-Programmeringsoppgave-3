package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

    private Innlegg[] innleggtabell;
    private int nesteledig;

    public Blogg() {
        innleggtabell = new Innlegg[20];
        nesteledig = 0;
    }

    public Blogg(int lengde) {
        innleggtabell = new Innlegg[lengde];
        nesteledig = 0;
    }

    public int getAntall() {
        return nesteledig;
    }

    public Innlegg[] getSamling() {
        return innleggtabell;
    }

    public int finnInnlegg(Innlegg innlegg) {

        for (int pos = 0; pos < nesteledig; pos++) {
            if (innleggtabell[pos].erLik(innlegg)) {
                return pos;
            }
        }
        return -1;
    }

    public boolean finnes(Innlegg innlegg) {
        return (finnInnlegg(innlegg) != -1);
    }

    public boolean ledigPlass() {
        return nesteledig < innleggtabell.length;
    }

    public boolean leggTil(Innlegg innlegg) {
        if (ledigPlass() && !finnes(innlegg)) {
            innleggtabell[nesteledig] = innlegg;
            nesteledig++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String data = nesteledig + "\n";
        for (int i = 0; i < nesteledig; i++) {
            data += innleggtabell[i].toString();
        }
        return data;
    }

    // valgfrie oppgaver nedenfor

    public void utvid() {
        throw new UnsupportedOperationException(TODO.method());
    }

    public boolean leggTilUtvid(Innlegg innlegg) {

        throw new UnsupportedOperationException(TODO.method());

    }

    public boolean slett(Innlegg innlegg) {

        throw new UnsupportedOperationException(TODO.method());
    }

    public int[] search(String keyword) {

        throw new UnsupportedOperationException(TODO.method());

    }
}