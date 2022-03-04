package ex01.jdbc;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.table.AbstractTableModel;

public class MyModel extends AbstractTableModel {

	Object[][] data;
	String[] columnName;
	int rows, cols; // ���ڵ� ��� ���� ������ �����ϴ� ����
			
	@Override
	public int getColumnCount() { // �ʵ�(��)�� ����
		
		return 0;
	}

	@Override
	public int getRowCount() { // ���ڵ� ���� �˾Ƴ���
		return 0;
	}
	
	// ���ڵ� ���� �˾Ƴ��� - user method
	public void getRowCount(ResultSet rsScroll) {
		try {
			rsScroll.last(); // ���ڵ��� ������ ������ Ŀ�� �̵�
			rows = rsScroll.getRow();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) { 
		return data[rowIndex][columnIndex];
	}
	
	// DB�� ����� ������ ä��
	public void setData(ResultSet rs) {
		try {
			String title;
			// �����Ϳ� ���� ���� ����
			ResultSetMetaData rsmd = rs.getMetaData();
			cols = rsmd.getColumnCount(); // ���� ���� ����
			columnName = new String[cols];
			
			for (int i=0; i<cols; i++) {
				columnName[i] = rsmd.getColumnName(i+1); // �ʵ� ��ȣ�� 1���� ������
			}
			
			data = new Object[rows][cols];
			int r = 0;
			
			while(rs.next()) {
				for (int i=0; i<cols; i++) {
					if (i!=1) data[r][i] = rs.getObject(i+1); // number type
					else data[r][i] = rs.getObject(i+1); // varchar2 type
				} // for end
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
