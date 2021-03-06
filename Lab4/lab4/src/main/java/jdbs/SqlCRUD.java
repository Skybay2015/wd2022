package jdbs;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bed.Bed;
import servlets.LabCRUDInterface;

public class SqlCRUD implements LabCRUDInterface<Bed> {

Connection connection;
	
	
	public SqlCRUD() {
		
		this.connection = new Connect().getCon();
		
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void create(Bed t) {
		// TODO Auto-generated method stub
		try (PreparedStatement st = connection.prepareStatement("INSERT INTO bed (\"title\",\"picture\",\"desc\") " + "VALUES (?,?,?)")) {
			st.setString(1, t.getTitle());
			st.setString(2, t.getPicture());
			st.setString(3, t.getDesc());
			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Bed> read() {
		List<Bed> list = new ArrayList<>();

		try (Statement st = connection.createStatement(); 
				ResultSet rs = st.executeQuery("SELECT * FROM bed;");) {
			while (rs.next()) {
				list.add(new Bed(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public void update(int id, Bed t) {
		try (PreparedStatement st = connection
				.prepareStatement("UPDATE bed " + "SET \"title\"=?, \"picture\"=?, \"desc\"=? WHERE id=?;")) {
			st.setString(1, t.getTitle());
			st.setString(2, t.getPicture());
			st.setString(3, t.getDesc());
			st.setInt(4, id);
			st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		try (PreparedStatement st = connection
				.prepareStatement("DELETE FROM bed WHERE id=?;")) {
			st.setInt(1, id);			
			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
