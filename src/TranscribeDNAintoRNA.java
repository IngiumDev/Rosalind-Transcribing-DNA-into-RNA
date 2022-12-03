public class TranscribeDNAintoRNA {
    public static void main(String[] args) {
        // Sample input
        String dna = "GATGGAACTTGACTACGTAAATT";
        System.out.println(transcriber(dna)); // Output: GAUGGAACUUGACUACGUAAAUU
    }
    // transcriber replaces T with U
    public static String transcriber(String dna) {
        // Create a string builder to hold the RNA. StringBuilder is mutable and more efficient that += operator for Strings
        StringBuilder output = new StringBuilder();
        // Loop through the DNA string
        for (int i = 0; i < dna.length(); i++) {
            // If the character is T, replace it with U. Else, append the current base to the output
            if (dna.charAt(i) == 'T') {
                output.append("U");
            } else {
                output.append(dna.charAt(i));
            }
        }
        // Return the RNA
        return output.toString();
    }
}

