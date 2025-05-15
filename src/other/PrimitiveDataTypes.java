package other;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        /* Type = Integral */
        // Size = 8-bit; Default = 0 (2^8 = 256; -128 -> 127)
        byte by = 100;
        // Size = 16-bit; Default = 0 (2^16 = 65.536; -32.768 -> 32.767 )
        short s = 10000;
        // Size = 32-bit; Default = 0 (2^32 = 4.294.967.296; -2^31 -> 2^31 -1)
        int i = 100000; //
        // Size = 64-bit; Default = 0L (2^64 = 18.446.744.073.709.551.616; -2^63 -> 2^63 -1)
        long l = 9999999;

        /* Type = Floating point */
        // Size = 32-bit; Default = 0.0f (max 7 decimals digits)
        float f = 123.f;
        // Size = 64-bit; Default = 0.0d (max 16 decimals digits)
        double d = 12.4; //

        /* Type = Boolean; Size = 1-bit; Default = FALSE */
        // true = 1; false = 0
        boolean bo = true;

        /* Type = Character; Size = 16-bit; Default = '\u0000' */
        char c = 'C';
    }
}
