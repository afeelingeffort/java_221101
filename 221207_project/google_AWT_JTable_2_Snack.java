import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class google_AWT_JTable_2_Snack {
    JFrame jf = new JFrame("JTable 예제");

    String columnNames[] = { "상품번호", "상품이름", "상품가격", "상품설명" };

    Object rowData[][] = {
            { 1, "맛동산", 100, "오리온" },
            { 2, "아폴로", 200, "불량식품" },
            { 3, "칸쵸", 300, "" }
    };

    JTable jTable = new JTable(rowData, columnNames);
    JScrollPane jsp = new JScrollPane(jTable);

    public google_AWT_JTable_2_Snack() {
        jf.add(jsp);

        jf.setSize(400, 300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new google_AWT_JTable_2_Snack();
    }

}
