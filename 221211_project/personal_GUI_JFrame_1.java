
// 한 GUI에 여러 테이블이 나오게 하기 위한 코드1
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class personal_GUI_JFrame_1 {
    JFrame jf = new JFrame("JTable test");

    String columnNames[] = { "상품번호", "상품이름", "상품가격", "상품설명" };

    Object rowData[][] = {
            { 1, "맛동산", 1000, "오리온" },
            { 2, "아폴로", 200, "불량식품" },
            { 3, "고구마 스낵", 1500, "건강식품" }
    };

    JTable jt = new JTable(rowData, columnNames);
    JScrollPane js = new JScrollPane(jt);

    public personal_GUI_JFrame_1() {
        jf.add(js);
        jf.setSize(400, 300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new personal_GUI_JFrame_1();

        Dimension dim = new Dimension(400, 150);
        JFrame jf = new JFrame("JFrame test");
        jf.setLocation(200, 400);
        jf.setPreferredSize(dim);

        String header[] = { "학생이름", "국어", "영어", "수학" };
        String contents[][] = {
                { "영희", "40", "60", "40" },
                { "영수", "40", "50", "80" },
                { "철수", "50", "70", "90" }
        };

        JTable table = new JTable(contents, header);
        JScrollPane sp = new JScrollPane(table);
        jf.add(sp);
        jf.pack();
        jf.setVisible(true);

    }

}
