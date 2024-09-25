package interesting_problems.david_kopec.ch_02.dna;

import java.util.Comparator;

import static interesting_problems.david_kopec.ch_02.dna.Gene.*;

public class Codon implements Comparable<Codon> {

    public final Nucleotide first, second, third;

    Throwable throwable = new Throwable();
    Exception exception = new Exception();
    RuntimeException runtimeException = new RuntimeException();

    private final Comparator<Codon> comparator =
            Comparator.comparing((Codon codon) -> codon.first)
                    .thenComparing((Codon codon) -> codon.second)
                    .thenComparing((Codon codon) -> codon.third);

    public Codon(String codonStr) {
        first = Nucleotide.valueOf(codonStr.substring(0, 1));
        second = Nucleotide.valueOf(codonStr.substring(1, 2));
        third = Nucleotide.valueOf(codonStr.substring(2, 3));
    }

    @Override
    public int compareTo(Codon other) {
        return comparator.compare(this, other);
    }
}
