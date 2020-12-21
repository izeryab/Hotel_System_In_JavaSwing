import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;



public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainPanel frame = new MainPanel();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
class MainPanel extends JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private Font buttonFont;
    private Font labelFont;
    private MainC controller;
    private JButton room;
    private JButton exit;
    private JButton customer;
    private JButton reservation;
    private JButton payment;

    /**
     * Create the frame.
     */
    public MainPanel() {
        this.controller = new MainC(this);
        buttonFont = new Font("Arial", Font.BOLD, 16);
        labelFont = new Font("Arial", Font.BOLD, 36);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 211);
        setTitle("Hotel System");
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        room = new JButton("Room");
        room.setFont(buttonFont);
        room.setBounds(53, 63, 130, 25);
        contentPane.add(room);

        payment = new JButton("Payment");
        payment.setFont(buttonFont);
        payment.setBounds(53, 100, 130, 25);
        contentPane.add(payment);

        exit = new JButton("Exit");
        exit.setFont(buttonFont);
        exit.setBounds(152, 137, 130, 25);
        contentPane.add(exit);

        customer = new JButton("Customer");
        customer.setFont(buttonFont);
        customer.setBounds(247, 100, 130, 25);
        contentPane.add(customer);

        reservation = new JButton("Reservation");
        reservation.setFont(buttonFont);
        reservation.setBounds(247, 63, 130, 25);
        contentPane.add(reservation);

        JLabel mainLabel = new JLabel("Hotel System");
        mainLabel.setFont(labelFont);
        mainLabel.setForeground(Color.WHITE);
        mainLabel.setBounds(105, 15, 242, 37);
        contentPane.add(mainLabel);

        JLabel background = new JLabel("");
        background.setIcon(new ImageIcon("Back.jpg"));
        background.setBounds(0, -12, 450, 263);
        contentPane.add(background);

        room.addActionListener(controller);
        payment.addActionListener(controller);
        reservation.addActionListener(controller);
        customer.addActionListener(controller);
        exit.addActionListener(controller);
    }

    public JButton getCustomer() {
        return customer;
    }

    public JButton getExit() {
        return exit;
    }

    public JButton getReservation() {
        return reservation;
    }

    public JButton getRoom() {
        return room;
    }

    public JButton getPayment() {
        return payment;
    }
}
 class MainC implements ActionListener{
    private MainPanel pan;
    public MainC(MainPanel mainPanel) {
        this.pan=mainPanel;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    	JButton b=(JButton) e.getSource();
        if (b.equals(pan.getExit())){
            System.exit(0);
        }else if(b.equals(pan.getRoom())) {
            RoomPanel view=new RoomPanel();
            view.setVisible(true);
        }else if(b.equals(pan.getPayment())) {
            PaymentPanel view=new PaymentPanel();
            view.setVisible(true);
        }else if(b.equals(pan.getReservation())) {
            ReservationPanel view=new ReservationPanel();
            view.setVisible(true);
        }else if(b.equals(pan.getCustomer())) {
            CustomerPanel view=new CustomerPanel();
            view.setVisible(true);
        }
        pan.dispose();
    }

}
 
 class ReservationPanel extends JFrame {

	    /**
	     * 
	     */
	    private static final long serialVersionUID = 1L;
	    private JPanel contentPane;
	    private Font buttonFont;
	    private Font labelFont;
	    private ReservationC controller;
	    private JTextField nameT;
	    private JTextField phoneT;
	    private JTextField idT;
	    private JTextField durationT;
	    private JTextField noT;
	    private JTextField roomNoT;
	    private JCheckBox mas;
	    private JButton add;
	    private JButton main;
	    private JButton clear;

	    public ReservationPanel() {
	        this.controller = new ReservationC(this);
	        buttonFont = new Font("Arial", Font.BOLD, 16);
	        labelFont = new Font("Arial", Font.BOLD, 36);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(600, 274);
	        setTitle("Hotel System");
	        setLocationRelativeTo(null);
	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	        setContentPane(contentPane);
	        contentPane.setLayout(null);

	        add = new JButton("ADD");
	        add.setBounds(100, 205, 117, 25);
	        contentPane.add(add);

	        main = new JButton("Main Menu");
	        main.setBounds(229, 205, 117, 25);
	        contentPane.add(main);

	        JLabel res = new JLabel("Reservation");
	        res.setFont(labelFont);
	        res.setForeground(Color.WHITE);
	        res.setBounds(190, 5, 236, 30);
	        contentPane.add(res);

	        JLabel name = new JLabel("Name");
	        name.setBounds(20, 47, 70, 15);
	        contentPane.add(name);

	        nameT = new JTextField();
	        nameT.setBounds(100, 40, 150, 25);
	        contentPane.add(nameT);
	        nameT.setColumns(10);

	        JLabel phoneNo = new JLabel("Phone No.");
	        phoneNo.setBounds(10, 87, 100, 15);
	        contentPane.add(phoneNo);

	        phoneT = new JTextField();
	        phoneT.setColumns(10);
	        phoneT.setBounds(100, 80, 150, 25);
	        contentPane.add(phoneT);

	        idT = new JTextField();
	        idT.setColumns(10);
	        idT.setBounds(100, 120, 150, 25);
	        contentPane.add(idT);

	        JLabel idNo = new JLabel("ID No");
	        idNo.setBounds(20, 127, 70, 15);
	        contentPane.add(idNo);

	        durationT = new JTextField();
	        durationT.setColumns(10);
	        durationT.setBounds(373, 80, 150, 25);
	        contentPane.add(durationT);

	        JLabel duration = new JLabel("Duration");
	        duration.setBounds(293, 87, 70, 15);
	        contentPane.add(duration);

	        noT = new JTextField();
	        noT.setColumns(10);
	        noT.setBounds(373, 117, 150, 25);
	        contentPane.add(noT);

	        JLabel noOf = new JLabel("Peoples");
	        noOf.setBounds(293, 124, 84, 15);
	        contentPane.add(noOf);

	        clear = new JButton("clear");
	        clear.setBounds(358, 205, 117, 25);
	        contentPane.add(clear);

	        JLabel roomNo = new JLabel("Room No");
	        roomNo.setBounds(290, 47, 80, 15);
	        contentPane.add(roomNo);

	        roomNoT = new JTextField();
	        roomNoT.setColumns(10);
	        roomNoT.setBounds(373, 40, 150, 25);
	        contentPane.add(roomNoT);

	        mas = new JCheckBox("Massage and Room service");
	        mas.setBounds(20, 160, 250, 23);
	        contentPane.add(mas);

	        JLabel background = new JLabel("");
	        background.setIcon(new ImageIcon("Back.jpg"));
	        background.setBounds(0, 0, 605, 354);
	        contentPane.add(background);

	        name.setForeground(Color.WHITE);
	        phoneNo.setForeground(Color.WHITE);
	        roomNo.setForeground(Color.WHITE);
	        duration.setForeground(Color.WHITE);
	        idNo.setForeground(Color.WHITE);
	        noOf.setForeground(Color.WHITE);
	        mas.setForeground(Color.WHITE);

	        name.setFont(buttonFont);
	        phoneNo.setFont(buttonFont);
	        roomNo.setFont(buttonFont);
	        duration.setFont(buttonFont);
	        idNo.setFont(buttonFont);
	        noOf.setFont(buttonFont);
	        mas.setFont(buttonFont);

	        mas.setOpaque(false);

	        main.addActionListener(controller);
	        clear.addActionListener(controller);
	        add.addActionListener(controller);
	    }

	    public Font getLabelFont() {
	        return labelFont;
	    }

	    public String getName() {
	        return nameT.getText();
	    }

	    public int getPhoneT() {
	        try {
	            return Integer.parseInt(phoneT.getText());
	        } catch (Exception e) {
	            return 0;
	        }
	    }

	    public int getIdT() {
	        try {
	            return Integer.parseInt(idT.getText());
	        } catch (Exception e) {
	            return 0;
	        }
	    }

	    public int getDurationT() {
	        try {
	            return Integer.parseInt(durationT.getText());
	        } catch (Exception e) {
	            return 0;
	        }
	    }

	    public int getNoofPeople() {
	        try {
	            return Integer.parseInt(noT.getText());
	        } catch (Exception e) {
	            return 0;
	        }
	    }

	    public int getRoomNoT() {
	        try {
	            return Integer.parseInt(roomNoT.getText());
	        } catch (Exception e) {
	            return 0;
	        }
	    }

	    public boolean getMas() {
	        return mas.isSelected();
	    }

	    public JButton getAdd() {
	        return add;
	    }

	    public JButton getMain() {
	        return main;
	    }

	    public JButton getClear() {
	        return clear;
	    }

	    public void clear() {
	        roomNoT.setText("");
	        nameT.setText("");
	        phoneT.setText("");
	        idT.setText("");
	        durationT.setText("");
	        noT.setText("");
	        mas.setSelected(false);
	    }
	    
	    public boolean isEmpty() {
	        return roomNoT.getText().equals("") ||
	                nameT.getText().equals("") ||
	                phoneT.getText().equals("")  ||
	                idT.getText().equals("") ||
	                durationT.getText().equals("") ||
	                noT.getText().equals("") ||
	                mas.getText().equals("") ;
	    }
	}
 class PaymentPanel extends JFrame{

	    /**
	     * 
	     */
	    private static final long serialVersionUID = 1L;
	    private JPanel contentPane;
	    private Font mainLabel;
	    private PaymentC controller;
	    private JTable table;
	    
	    public PaymentPanel() {
	        mainLabel = new Font("Arial", Font.BOLD, 34);
	        controller = new PaymentC(this);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(100, 100, 590, 387);
	        setLocationRelativeTo(null);
	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	        setContentPane(contentPane);
	        contentPane.setLayout(null);

	        JLabel csDetails = new JLabel("Customer Details");
	        csDetails.setFont(mainLabel);
	        csDetails.setForeground(Color.WHITE);
	        csDetails.setBounds(150, 5, 300, 30);
	        contentPane.add(csDetails);

	        JScrollPane scrollPane = new JScrollPane();
	        scrollPane.setBounds(30, 40, 530, 263);
	        contentPane.add(scrollPane);

	        table = new JTable();
	        table.setModel(new DefaultTableModel(new Object[][] {},
	                new String[] { "Customer ID No", "Room No", "Total Amount"}));
	        scrollPane.setViewportView(table);
	        controller.setTabel();

	        JButton mainMenu = new JButton("Main Menu");
	        mainMenu.setBounds(223, 315, 117, 25);
	        contentPane.add(mainMenu);

	        JLabel background = new JLabel("");
	        background.setIcon(new ImageIcon("Back.jpg"));
	        background.setBounds(0, 0, 605, 354);
	        contentPane.add(background);

	        mainMenu.addActionListener(controller);
	    }

	    public void setTable() {
	        table.setModel(new DefaultTableModel(new Object[][] {},
	                new String[] { "Customer ID No", "Room No", "Total Amount"}));
	    }

	    public JTable getTable() {
	        return table;
	    }
	}
 class CustomerPanel extends JFrame {
	    /**
	     * 
	     */
	    private static final long serialVersionUID = 1L;
	    private JPanel contentPane;
	    private Font mainLabel;
	    private CustomerC controller;
	    private JTable table;

	    public CustomerPanel() {
	        mainLabel = new Font("Arial", Font.BOLD, 34);
	        controller = new CustomerC(this);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(100, 100, 590, 387);
	        setLocationRelativeTo(null);
	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	        setContentPane(contentPane);
	        contentPane.setLayout(null);

	        JLabel csDetails = new JLabel("Customer Details");
	        csDetails.setFont(mainLabel);
	        csDetails.setForeground(Color.WHITE);
	        csDetails.setBounds(150, 5, 300, 30);
	        contentPane.add(csDetails);

	        JScrollPane scrollPane = new JScrollPane();
	        scrollPane.setBounds(30, 40, 530, 263);
	        contentPane.add(scrollPane);

	        table = new JTable();
	        table.setModel(new DefaultTableModel(new Object[][] {},
	                new String[] { "ID No", "Name", "Phone No", "Duration", "No of Peoples" }));
	        scrollPane.setViewportView(table);
	        controller.setTabel();

	        JButton mainMenu = new JButton("Main Menu");
	        mainMenu.setBounds(223, 315, 117, 25);
	        contentPane.add(mainMenu);

	        JLabel background = new JLabel("");
	        background.setIcon(new ImageIcon("Back.jpg"));
	        background.setBounds(0, 0, 605, 354);
	        contentPane.add(background);

	        mainMenu.addActionListener(controller);
	    }

	    public void setTable() {
	        table.setModel(new DefaultTableModel(new Object[][] {},
	                new String[] { "ID No", "Name", "Phone No", "Duration", "No of Peoples" }));
	    }

	    public JTable getTable() {
	        return table;
	    }
	}
 class RoomPanel extends JFrame {

	    /**
	     * 
	     */
	    private static final long serialVersionUID = 1L;
	    private JPanel contentPane;
	    private JTable table;
	    private JTextField textField;
	    private JButton add;
	    private JRadioButton suitR;
	    private JRadioButton honeyR;
	    private JRadioButton normalR;
	    private Font mainLabel;
	    private Font label;
	    private RoomC controller;
	    private JButton remove;
	    private JButton main;
	    private JLabel warning;

	    /**
	     * Create the frame.
	     */
	    public RoomPanel() {
	        mainLabel = new Font("Arial", Font.BOLD, 34);
	        label = new Font("Arial", Font.BOLD, 14);
	        controller = new RoomC(this);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(100, 100, 590, 387);
	        setLocationRelativeTo(null);
	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	        setContentPane(contentPane);
	        contentPane.setLayout(null);

	        JScrollPane scrollPane = new JScrollPane();
	        scrollPane.setBounds(149, 44, 429, 279);
	        contentPane.add(scrollPane);

	        table = new JTable();
	        table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Sr No.", "Room No", "Status" }));
	        scrollPane.setViewportView(table);
	        controller.setTable();

	        JLabel room = new JLabel("Room");
	        room.setBounds(250, 5, 114, 43);
	        contentPane.add(room);

	        JLabel roomNo = new JLabel("Room No");
	        roomNo.setBounds(0, 45, 70, 15);
	        contentPane.add(roomNo);

	        suitR = new JRadioButton("Suit");
	        suitR.setBounds(10, 105, 149, 23);
	        contentPane.add(suitR);

	        honeyR = new JRadioButton("HoneyMoon");
	        honeyR.setBounds(10, 130, 149, 23);
	        contentPane.add(honeyR);

	        normalR = new JRadioButton("Normal");
	        normalR.setBounds(10, 155, 149, 23);
	        contentPane.add(normalR);

	        add = new JButton("Add Room");
	        add.setBounds(20, 186, 117, 20);
	        contentPane.add(add);

	        remove = new JButton("remove");
	        remove.setBounds(20, 220, 117, 20);
	        contentPane.add(remove);

	        main = new JButton("Main Menu");
	        main.setBounds(20, 250, 117, 20);
	        contentPane.add(main);

	        warning = new JLabel("Wrong Room No");
	        warning.setForeground(Color.YELLOW);
	        warning.setBounds(10, 95, 150, 15);
	        warning.setVisible(false);
	        contentPane.add(warning);

	        textField = new JTextField();
	        textField.setBounds(5, 67, 135, 25);
	        contentPane.add(textField);
	        textField.setColumns(10);

	        JLabel background = new JLabel("");
	        background.setIcon(new ImageIcon("Back.jpg"));
	        background.setBounds(0, 0, 605, 354);
	        contentPane.add(background);

	        suitR.setOpaque(false);
	        normalR.setOpaque(false);
	        honeyR.setOpaque(false);

	        room.setFont(mainLabel);
	        room.setForeground(Color.WHITE);
	        roomNo.setFont(label);
	        roomNo.setForeground(Color.WHITE);
	        suitR.setFont(label);
	        suitR.setForeground(Color.WHITE);
	        honeyR.setFont(label);
	        honeyR.setForeground(Color.WHITE);
	        normalR.setFont(label);
	        normalR.setForeground(Color.WHITE);

	        add.addActionListener(controller);
	        remove.addActionListener(controller);
	        main.addActionListener(controller);

	        honeyR.addActionListener(controller);
	        suitR.addActionListener(controller);
	        normalR.addActionListener(controller);

	    }

	    public JTable getTable() {
	        return table;
	    }

	    public JButton getAdd() {
	        return add;
	    }

	    public JButton getRemove() {
	        return remove;
	    }

	    public JButton getMain() {
	        return main;
	    }

	    public JRadioButton getSuitR() {
	        return suitR;
	    }

	    public JRadioButton getNormalR() {
	        return normalR;
	    }

	    public JRadioButton getHoneyR() {
	        return honeyR;
	    }

	    public int getRoomNo() {
	        int i;
	        try {
	            i = Integer.parseInt(textField.getText());
	            return i;
	        } catch (Exception e) {
	            warning.setVisible(true);
	        }
	        return -1;
	    }

	    public void setTable() {
	        table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Sr No.", "Room No", "Status" }));
	    }

	}
 class CustomerC implements ActionListener{
	    private CustomerPanel custV;

	    public CustomerC(CustomerPanel CustomerPanel) {
	        custV = CustomerPanel;
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        MainPanel panel=new MainPanel();
	        panel.setVisible(true);
	        custV.dispose();
	    }
	    
	    public void setTabel() {
	        ArrayList<Customer> arr=CustomerInfo.getCustomers();
	        custV.setTable();
	        DefaultTableModel model=(DefaultTableModel) custV.getTable().getModel();
	        for(Customer x:arr)
	            model.addRow(new Object[]{x.getIDNo(),x.getNameSurName(),x.getPhoneNo(),x.getDuration(),x.getNoOfPeople()});
	    }

	}
 class PaymentC implements ActionListener {
	    private PaymentPanel pay;

	    public PaymentC(PaymentPanel PaymentPanel) {
	        this.pay=PaymentPanel;
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        MainPanel panel = new MainPanel();
	        panel.setVisible(true);
	        pay.dispose();
	    }

	    public void setTabel() {
	        ArrayList<Reservation> lis = ReservationInfo.getReservation();
	        pay.setTable();
	        DefaultTableModel model = (DefaultTableModel) pay.getTable().getModel();
	        for (Reservation x : lis) {
	            Payment p = x.getPay();
	            model.addRow(new Object[] { p.getCust().getIDNo(), p.getRoom().getRoomNo(),p.calculate()});
	        }
	    }
	}
 class ReservationC implements ActionListener{
	    private ReservationPanel res;
	    private ArrayList<Room> lis;
	    private ReservationInfo reserv;
	    private CustomerInfo cust;
	    public ReservationC(ReservationPanel ReservationPanel) {
	        this.res=ReservationPanel;
	        lis=HotelSys.getRooms();
	        reserv=new ReservationInfo();
	        cust=new CustomerInfo();
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	    	JButton source=(JButton) e.getSource();
	        if(source.equals(res.getAdd()) && !res.isEmpty() ) {
	            int r=res.getRoomNoT();
	            Room ro=null;
	            for(Room x:lis) {
	                if(x.getRoomNo()==r) {
	                    ro=x;
	                    break;
	                }
	            }
	            if(ro==null) {
	                JOptionPane.showMessageDialog(null, "Room Not Available");
	                return;
	            }
	            Customer cu=new Customer(res.getName(),res.getPhoneT(), res.getIdT(), res.getDurationT(), res.getNoofPeople());
	            if(!cust.add(cu))return;
	            cust.save();
	            Extra ex=null;
	            if(res.getMas())ex=new Extra();
	            Payment pay=new Payment(ro, cu, ex);
	            Reservation res=new Reservation(cu, ro, pay);
	            reserv.newReservation(res);
	            reserv.save();
	            JOptionPane.showMessageDialog(null, "Added");
	            this.res.clear();
	        }else if(source.equals(res.getClear())) {
	            res.clear();
	        }else if(source.equals(res.getMain())) {
	            MainPanel frame=new MainPanel();
	            frame.setVisible(true);
	            res.dispose();
	        }
	    }

	}
 class RoomC implements ActionListener {
	    private HotelSys hotel;
	    private RoomPanel room;

	    public RoomC(RoomPanel RoomPanel) {
	        this.room = RoomPanel;
	        hotel = new HotelSys();
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	    	Object source =  e.getSource();
	        if (source instanceof JRadioButton) {
	            room.getNormalR().setSelected(true);
	            room.getSuitR().setSelected(true);
	            room.getHoneyR().setSelected(true);
	            if (source.equals(room.getHoneyR())) {
	                room.getSuitR().setSelected(false);
	                room.getNormalR().setSelected(false);
	            } else if (source.equals(room.getSuitR())) {
	                room.getHoneyR().setSelected(false);
	                room.getNormalR().setSelected(false);
	            } else if (source.equals(room.getNormalR())) {
	                room.getSuitR().setSelected(false);
	                room.getHoneyR().setSelected(false);
	            }
	        }
	        if (source instanceof JButton) {
	            if (source.equals(room.getAdd())) {
	                addRoom();
	            }else if(source.equals(room.getRemove())){
	                removeRoom();
	            }else if(source.equals(room.getMain())) {
	                MainPanel panel=new MainPanel();
	                panel.setVisible(true);
	                room.dispose();
	            }
	        }
	    }

	    private void removeRoom() {
	        hotel.deleteRoom(room.getRoomNo());
	        hotel.save();
	        setTable();
	    }

	    private void addRoom() {
	        if(room.getNormalR().isSelected()){
	            hotel.addRoom(new Normal(room.getRoomNo()));
	        }
	        else if(room.getSuitR().isSelected()){
	            hotel.addRoom(new Normal(room.getRoomNo()));
	        }
	        else if(room.getHoneyR().isSelected()){
	            hotel.addRoom(new Normal(room.getRoomNo()));
	        }
	        hotel.save();
	        setTable();
	    }

	    public void setTable() {
	        ArrayList<Room> list = HotelSys.getRooms();
	        room.setTable();
	        JTable table = room.getTable();
	        DefaultTableModel model = (DefaultTableModel) table.getModel();
	        int i = 1;
	        for (Room x : list) {
	            model.addRow(new Object[] { i++, x.getRoomNo(), x.status() });
	        }
	    }

	}

