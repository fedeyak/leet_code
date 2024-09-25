package interesting_problems.david_kopec.ch_02.dna;

import java.util.ArrayList;

public class Gene {

    public enum Nucleotide{
        A, C, G, T
    }

    private ArrayList<Codon> codons = new ArrayList<>();

    public Gene(String geneStr) {
        for (int i = 0; i < geneStr.length() - 3; i+=3){
            codons.add(new Codon(geneStr.substring(i, i+3)));
        }
    }

}
