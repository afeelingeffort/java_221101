import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class google_GUI_JTabble_1 extends JFrame {
    String[] columns = {
            "이름", "전화번호", "주소"
    };

    String[][] data = {
            { "짱구", "01012345678", "부산광역시 사상구" },
            { "철수", "01087654321", "대한민국 어딘가" },
            { "맹구", "01055553245", "일본 어딘가" },
            { "훈이", "01042153014", "외국 어딘가" }
    };

    public google_GUI_JTabble_1() {
        this.setBounds(100, 100, 400, 400);
        this.setTitle("연락처");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        DefaultTableModel model = new DefaultTableModel(data, columns);

        JTable table = new JTable(model);
        table.setModel(model);

        JScrollPane sp = new JScrollPane(table);
        add(sp);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new google_GUI_JTabble_1();
    }

}
