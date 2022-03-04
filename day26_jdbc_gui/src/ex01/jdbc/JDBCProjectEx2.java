package ex01.jdbc;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import connUtil.DBConnection;

public class JDBCProjectEx2 extends JFrame implements ActionListener{
	//component ��ü ����
	JPanel panWest, panSouth;  //�����ؽ�Ʈ�ʵ�, �Ʒ��� ��ư
	JPanel p1,p2,p3,p4,p5; 
	JTextField txtNo, txtName, txtEmail, txtPhone;
	JButton  btnTotal, btnAdd, btnDel, btnSearch, btnCancel;
	
	JTable table; //�˻��� ��ü ���⸦ ���� ���̺� ��ü ����
	//���º�ȭ�� ���� ���� ����
	private static final int NONE = 0;
	private static final int ADD = 1;
	private static final int DELETE = 2;
	private static final int SEARCH = 3;
	private static final int TOTAL = 4;
	int cmd = NONE;
	
	MyModel model; // user class
	
	public JDBCProjectEx2(){
		//component ���
		panWest = new JPanel(new GridLayout(5, 0));
		p1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p1.add(new JLabel("��    ȣ"));
		p1.add(txtNo = new JTextField(12));
		panWest.add(p1);
		
		p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p2.add(new JLabel("��    ��"));
		p2.add(txtName = new JTextField(12));
		panWest.add(p2);
		
		p3 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p3.add(new JLabel("��  ��  ��"));
		p3.add(txtEmail = new JTextField(12));
		panWest.add(p3);
		
		p4 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p4.add(new JLabel("��ȭ��ȣ"));
		p4.add(txtPhone = new JTextField(12));
		panWest.add(p4);
		
		p5 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p5.add(new JLabel(""));
		panWest.add(p5);
		
		add(panWest, "West");
		
		//button ȭ�� �Ʒ� ���
		panSouth = new JPanel();
		panSouth.add(btnTotal= new JButton("��ü����")); 
		panSouth.add(btnAdd= new JButton("��     ��"));
		panSouth.add(btnDel= new JButton("��     ��"));
		panSouth.add(btnSearch= new JButton("��     ��"));
		panSouth.add(btnCancel= new JButton("��     ��"));
		add(panSouth, "South");
		
		//event ó��
		btnTotal.addActionListener(this);
		btnAdd.addActionListener(this);
		btnDel.addActionListener(this);
		btnSearch.addActionListener(this);
		btnCancel.addActionListener(this);
		
		//���̺� ��ü ����
		add(new JScrollPane(table = new JTable()), "Center");
		//close
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//���� â ���
		setBounds(100, 100, 700, 300); //setSize(W,H);   pack(); 
		setVisible(true);		
		
		dbConnect();
		total();
		search();
	} //constuctor end
	
	/////// db setting ///////////////
	Connection conn;
	Statement stmt;
	PreparedStatement pstmtInsert, pstmtDelete;
	PreparedStatement pstmtTotal, pstmtTotalScroll;
	PreparedStatement pstmtSearch, pstmtSearchScroll;
	
	private String sqlInsert = "INSERT INTO CUSTOMERS VALUES(?,?,?,?)";
	private String sqlDelete = "DELETE FROM CUSTOMERS WHERE CODE = ?";
	private String sqlSelect = "SELECT * FROM CUSTOMERS";
	private String sqlSearch = "SELECT * FROM CUSTOMERS WHERE NAME = ?";
	
	public void dbConnect() {
		try {
			conn = DBConnection.getConnection(); // DB ����
			
			pstmtInsert = conn.prepareStatement(sqlInsert);
			pstmtDelete = conn.prepareStatement(sqlDelete);
			pstmtTotal = conn.prepareStatement(sqlSelect);
			pstmtSearch = conn.prepareStatement(sqlSearch);
			
			pstmtTotalScroll = conn.prepareCall(sqlSelect,
								ResultSet.TYPE_SCROLL_SENSITIVE, // Ŀ�� �̵��� �����Ӱ� �ϰ� ������Ʈ ������ �ݿ�
								ResultSet.CONCUR_UPDATABLE); // resultset object�� ������ ���� <=> CONCUR_READ_ONLY (�б⸸ ����)
			
			pstmtSearchScroll = conn.prepareCall(sqlSearch,
									ResultSet.TYPE_SCROLL_SENSITIVE,
									ResultSet.CONCUR_UPDATABLE);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/////////////////////////////////
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if( obj == btnAdd ){
			if( cmd != ADD ){
				setText(ADD);  //user method
				return;
			} //if in
			setTitle(e.getActionCommand());
			add(); // �߰�
			
		}else if( obj == btnDel ){
			if( cmd != DELETE ){
				setText(DELETE);  //user method
				return;
			} //if in
			setTitle(e.getActionCommand());
			del();  // ����
			
		}else if( obj == btnSearch ){
			if( cmd != SEARCH ){
				setText(SEARCH);  //user method
				return;
			} //if in
			setTitle(e.getActionCommand());
			search();  // �˻�
			
		}else if( obj == btnTotal ){
			setTitle(e.getActionCommand());
			total();  // ��ü����
		}
		setText(NONE);
		init(); //�ʱ�ȭ �޼ҵ�, user method
	}// actionPerformed end
	
	private void init() {  //�ʱ�ȭ �޼ҵ�
		txtNo.setText("1");			txtNo.setEditable(false);
		txtName.setText("hun");		txtName.setEditable(false);
		txtEmail.setText("kosa@gmail.com");		txtEmail.setEditable(false);
		txtPhone.setText("010-1111-2222");		txtPhone.setEditable(false);
	}// init() end
	
	
	/////////////// Button Event //////////////////////
	public void add() {
		try {
			String strNo = txtNo.getText();
			String strName = txtName.getText();
			String strMail = txtEmail.getText();
			String strPhone = txtPhone.getText();
			
//			System.out.println(strNo + "," + strName + "," + strPhone); // �ܼ� ��� Ȯ�ο�
		
//			if (strNo.length() < 1 || strName.length() < 1 ) { // �ƹ��͵� �ȳ־��ٸ�
//				JOptionPane.showMessageDialog(null, "��ȣ�� �̸��� �ʼ� �����Դϴ�. �Է��� �ּ���."); // no, name�� pk�� not null �̹Ƿ� �ۼ��� ���� // show~ �޼ҵ� ��û ����
//				return;
//			}
			
			switch(JOptionPane.showConfirmDialog(null,
							"("+strNo+","+strName+","+strMail+","+strPhone+")",
							"�߰��Ͻðڽ��ϱ�?",
							JOptionPane.YES_NO_OPTION) ) {
			
				case 0: // Ȯ��
					break;
				case 1:	// �ƴϿ�
					return;
			} // switch end
				
			// ĳ�ÿ� ����
			pstmtInsert.setInt(1, Integer.parseInt(strNo));
			pstmtInsert.setNString(2, strName);
			pstmtInsert.setNString(3, strMail);
			pstmtInsert.setNString(4, strPhone);
			
			pstmtInsert.executeUpdate(); // ������Ʈ
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("�߰� �۾� �Ϸ�");
		
	} //add() end
	
	public void del() {
		total();
		
		String strNo = txtNo.getText();
		
		if(strNo.length() < 1) {
			JOptionPane.showConfirmDialog(null, "��ȣ�� �ʼ��� �Է� �ؾ� �մϴ�.");
			return;
		}
		
		try {
			
			
			
			pstmtDelete.setInt(1, Integer.parseInt(strNo));
			pstmtDelete.executeQuery();
			
			switch(JOptionPane.showConfirmDialog(null,"�� ��ȣ("+strNo+")��",
					"�����Ͻðڽ��ϱ�?",
					JOptionPane.YES_NO_OPTION) ) {
	
					case 0: // Ȯ��
						break;
					case 1:	// �ƴϿ�
						return;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	} //del() end
	
	public void search() {
		String strName = txtName.getText();
		
		if(strName.length() < 1) {
			JOptionPane.showConfirmDialog(null, "�̸��� �ʼ��� �Է� �ؾ� �մϴ�.");
			return;
		}
		
		try {
			pstmtSearchScroll.setString(1, strName);
			ResultSet rsScroll = pstmtSearchScroll.executeQuery();
			pstmtSearch.setNString(1, strName);
			ResultSet rs = pstmtSearch.executeQuery();
			
			if(model == null) model = new MyModel();
			model.getRowCount(rsScroll);
			model.setData(rs);
			table.setModel(model);
			table.updateUI();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} //search() end
	
	public void total() { // ��ü����(select) ��ư �̺�Ʈ ó�� �Լ�
	      try {
	         ResultSet rsScroll = pstmtTotalScroll.executeQuery();
	         ResultSet rs = pstmtTotal.executeQuery();
	         
	         if(model == null) model = new MyModel();
	         model.getRowCount(rsScroll);
	         model.setData(rs);
	         
//	         table.setModel(model);
	         table.setModel(new DefaultTableModel(model.data, model.columnName));
	         table.updateUI();
	         
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      
	   }
	

	private void setText(int command) {
		switch(command){
			case ADD :
				txtNo.setEditable(true);
				txtName.setEditable(true);
				txtEmail.setEditable(true);
				txtPhone.setEditable(true);
				break;
			case DELETE :
				txtNo.setEditable(true); // �ڵ�� �����ϰڴ� �߾���. �ڵ� ���� �κи� gui Ȱ��ȭ
				break;
			case SEARCH :
				txtName.setEditable(true);
				break;
		}//switch end
		
		setButton(command);  //user method
	}// setText() end

	private void setButton(int command) {
		//cancel button �����ϰ� � ��ư�� �������� ��� ��ư�� ��Ȱ��ȭ
		btnTotal.setEnabled(false);
		btnAdd.setEnabled(false);
		btnDel.setEnabled(false);
		btnSearch.setEnabled(false);
		
		switch(command){
			case ADD :
				btnAdd.setEnabled(true);
				cmd = ADD;
				break;
			case DELETE :
				btnDel.setEnabled(true);
				cmd = DELETE;
				break;
				
			case SEARCH :
				btnSearch.setEnabled(true);
				cmd = SEARCH;
				break;
			case TOTAL :
				btnTotal.setEnabled(true);
				cmd = TOTAL;
				break;
			case NONE :
				btnTotal.setEnabled(true);
				btnAdd.setEnabled(true);
				btnDel.setEnabled(true);
				btnSearch.setEnabled(true);
				btnCancel.setEnabled(true);  //
				cmd = NONE;
				break;
		}//switch end	
	}//setButton end

	public static void main(String[] args) {
		new JDBCProjectEx2();
	}
}




