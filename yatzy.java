import java.util.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import javax.swing.JComponent;

class yatzy
{
  ArrayList<ArrayList<Integer>> brett = new ArrayList<ArrayList<Integer>>();
  ArrayList <String> navn = new ArrayList <String>();
  ArrayList <String> felt = new ArrayList <String>();

  public static void main (String [] args)
  {

    yatzy y = new yatzy();
    y.spill();

  }

  public void spill ()
  {
    HashMap hm = new HashMap();
    int antallSpillere = 0;
    Scanner sc = new Scanner (System.in);

    System.out.println("Skriv inn navn på spillere:");
    System.out.println("Skriv ferdig når alle spillere er registrert");
    String input2 = sc.nextLine();
    while (!input2.equals("ferdig"))
    {
      navn.add(input2);
      input2 = sc.nextLine();
    }

    tabell();

    System.out.println("Exit to exit");
    String input3 = sc.nextLine();
    while (!input3.equals("exit"))
    {
      //System.out.println();
    }
    System.exit(0);
  }

  public void tabell()
  {

    String [] col = new String [navn.size()];
    for (int i = 0; i < navn.size(); i++)
    {
      col[i] = navn.get(i);
    }

    JFrame f = new JFrame ("Yatzy");
    Container innhold = f.getContentPane();
    DefaultTableModel tableModel = new DefaultTableModel(col, 18);
    //Object[] objs = {1, 2, 3};
    //tableModel.addRow(objs);

    Scanner sc2 = new Scanner (System.in);
    String input8 = sc2.nextLine();
    tableModel.setValueAt(input8, 0, 1);
    JTable table = new JTable (tableModel);
    JScrollPane scrollPane = new JScrollPane(table);

    JTable radTabell = new RowNumberTable(table);
    scrollPane.setRowHeaderView(radTabell);
    scrollPane.setCorner(JScrollPane.UPPER_LEFT_CORNER, radTabell.getTableHeader());
    innhold.add(scrollPane, BorderLayout.CENTER);

    f.setSize(300,200);
    f.setVisible(true);
    
  }

  public void fyllFelt()
  {
    felt.add("Enere");
    felt.add("Toere");
    felt.add("Treere");
    felt.add("Firere");
    felt.add("Femmere");
    felt.add("Seksere");
    felt.add("Sum");
    felt.add("Bonus");
    felt.add("1 par");
    felt.add("2 par");
    felt.add("3 like");
    felt.add("4 like");
    felt.add("Liten straight");
    felt.add("Stor straight");
    felt.add("Hus");
    felt.add("Sjanse");
    felt.add("Yatzy");
    felt.add("Totalsum");
  }
}
