import java.text.DecimalFormat;

public class java_p377_DecimalFormat_ex10_6 {

    public static void main(String[] args) {
        double number = 1234567.89;
        String[] pattern = {
                "0",
                "#",
                "0.0",
                "#.#",
                "0000000.0000",
                "#######.####",
                "#.#-",
                "-#.#",
                "#,###.##",
                "#,####.##",
                "#E0",
                "0E0",
                "##E0",
                "00E0",
                "####E0",
                "#.#E0",
                "0.0E0",
                "0.00000000E0",
                "00.0000000E0",
                "000.000000E0",
                "#.########E0",
                "##.#######E0",
                "###.######E0",
                "#,###.##+;#,###.##-",
                "#.#%",
                "#.#\u2030",
                "\u00A4 #,###",
                "'#'#,###",
                "''#,###",
        };

        for (int i = 0; i < pattern.length; i++) {
            DecimalFormat df = new DecimalFormat(pattern[i]);
            System.out.printf("%19s : %s\n", pattern[i], df.format(number));
        }
    }

}
