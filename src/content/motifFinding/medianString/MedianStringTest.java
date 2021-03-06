package content.motifFinding.medianString;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class MedianStringTest {

    List<String> sequences;
    int k = 7;

    @BeforeEach
    void setUp() {
        sequences = new ArrayList<>();
        String data = "GCAATCGTGCCTGGATAACAAAATCTCTGTCCTCCGAAGATC\n" +
                "CATAATCGAGGCGATACGGTGAACGGCTACTTTGTATACCTT\n" +
                "TAATTGTCTTCTCTTACTACTTTCCAGAATGACGTTCAGAGT\n" +
                "CCGAGGCAGAATTCTGGAACGGAGTATTGGGCGGAGGGACTT\n" +
                "AATAATAGTAATTCCGACAAACGCATTCGATATGGCCATAAT\n" +
                "AGCTATAAGCCCAATTTGGTCAGCCACAATGTCGGAGACAGC\n" +
                "GAGGTCTCCACCGCGGAGTGGTTCGGTGCCCAGAATGTCTCG\n" +
                "ACTGAATAGGCATCCCAAAGCAAGATGGGTTGCTCACATAAT\n" +
                "TTACCTTGACAGACTCGGCAAAATCGTTGTGCTGCATTTTCG\n" +
                "CTAGGGAGCCTAGTGTAGCGGTCCTGCCACTGTTAGCAAAAT";
        sequences.addAll(List.of(data.split("\n")));

        data = "CTCGATGAGTAGGAAAGTAGTTTCACTGGGCGAACCACCCCGGCGCTAATCCTAGTGCCC\n" +
                "GCAATCCTACCCGAGGCCACATATCAGTAGGAACTAGAACCACCACGGGTGGCTAGTTTC\n" +
                "GGTGTTGAACCACGGGGTTAGTTTCATCTATTGTAGGAATCGGCTTCAAATCCTACACAG";
        sequences.addAll(List.of(data.split("\n")));
    }

    @Test
    void findMotif() {
        String medianString = MedianString.findMedianString(sequences, k);
        System.out.println(medianString);
    }
}