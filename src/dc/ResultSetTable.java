package dc;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.table.AbstractTableModel;

public class ResultSetTable extends AbstractTableModel{
	
	Connection connection=null;
	Statement statement=null;
	ResultSet resultset=null;
	ResultSetMetaData metaData;
	int numberOfRows;
	
	public ResultSetTable(String q)
	{
		try{
			connection =(Connection) DriverManager.getConnection( "jdbc:mysql://localhost/history", "root", "" );
	        statement = (Statement) connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
	        resultset=statement.executeQuery(q);
	        metaData = resultset.getMetaData();
	        resultset.last(); 
	        numberOfRows = resultset.getRow();
	        fireTableStructureChanged();
	        //close();
		}
		catch(Exception e){
			System.err.println(e);
		}
		
	}
	public ResultSetTable()
	{
		
	}
	
	public Class getColumnClass( int column ) throws IllegalStateException{
	// ensure database connection is available
	if ( connection==null )
	throw new IllegalStateException( "Not Connected to Database" );
	try{
		String className = metaData.getColumnClassName( column + 1 );
		return Class.forName( className );
	}
	catch ( Exception exception )
	 {
	 exception.printStackTrace();
	} 
	return Object.class;
}
	
	@Override
	public int getColumnCount() throws IllegalStateException
	{
		if ( connection==null )
		throw new IllegalStateException( "Not Connected to Database" );
		 try
			 {
			 return metaData.getColumnCount();
			 } 
			 catch ( SQLException sqlException )
			 {
			 sqlException.printStackTrace();
			 } 	
		return 0;
	}
	
	public String getColumnName( int column ) throws IllegalStateException{
		if ( connection==null )
			 throw new IllegalStateException( "Not Connected to Database" );
			 try
			 {
			 return metaData.getColumnName( column + 1 );
			 } // end try
			 catch ( SQLException sqlException )
			 {
			 sqlException.printStackTrace();
			 } return "";
	}
	
	@Override
	public int getRowCount() throws IllegalStateException {
		// ensure database connection is available
		if ( connection==null )
		throw new IllegalStateException( "Not Connected to Database" );
	    return numberOfRows;
		
	}
	
	@Override
	public Object getValueAt(int row, int column) throws IllegalStateException{
		if ( connection==null )
			 throw new IllegalStateException( "Not Connected to Database" );
		try{
			resultset.absolute( row + 1 );
			return resultset.getObject( column + 1 );
		}
		catch ( SQLException sqlException )
		 {
		sqlException.printStackTrace();
		}
		return "";
	}
	
	public void update() throws SQLException{
		if(connection==null)
		{
			connection =(Connection) DriverManager.getConnection( "jdbc:mysql://localhost/history", "root", "" );
	       
		}
		 statement = (Statement) connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
	        resultset=statement.executeQuery("SELECT * FROM history");
	        metaData = resultset.getMetaData();
	        resultset.last(); 
	        numberOfRows = resultset.getRow();
	        fireTableStructureChanged();
	}

}
