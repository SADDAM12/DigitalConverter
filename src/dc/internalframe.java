package dc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;
public class internalframe extends javax.swing.JInternalFrame {
	String[] model;
    int ch;
	public internalframe(String string, boolean r, boolean c, boolean m, boolean i,String[] model1,int g) {
		setTitle(string);
	    setBackground(new java.awt.Color(51, 255, 51));
	    setVisible(true);
	    setClosable(c);
	    setMaximizable(m);
	    setResizable(r);
	    setIconifiable(i);
	    setLocation(280,100);
	    model=model1;
	    ch=g;
	    initComponents();
	}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        PressMe = new javax.swing.JButton();
        stf = new javax.swing.JTextField();
        ftf = new javax.swing.JTextField();
        sc = new javax.swing.JComboBox();
        fc = new javax.swing.JComboBox();
        tl = new javax.swing.JLabel();


        PressMe.setBackground(new java.awt.Color(153, 0, 0));
        PressMe.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        PressMe.setText("Press ");
        PressMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					PressMeActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        stf.setBackground(new java.awt.Color(102, 255, 255));
        stf.setText(" ");

        ftf.setBackground(new java.awt.Color(102, 255, 255));
        ftf.setText(" ");

        sc.setBackground(new java.awt.Color(0, 204, 51));
        sc.setModel(new javax.swing.DefaultComboBoxModel(model));

        fc.setBackground(new java.awt.Color(0, 204, 51));
        fc.setModel(new javax.swing.DefaultComboBoxModel(model));

        tl.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        tl.setText("Convert ");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tl)
                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(PressMe, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jInternalFrame1Layout.createSequentialGroup()
                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ftf, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(stf, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(sc, 0, 73, Short.MAX_VALUE)
                                .addComponent(fc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(tl)
                .addGap(21, 21, 21)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fc, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftf, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sc, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stf, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(PressMe, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

                pack();
    }// </editor-fold>                        

    private void PressMeActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
    	String name=model[fc.getSelectedIndex()]+model[sc.getSelectedIndex()];
    	Connection connection=null;
    	Statement statement=null;
    	if(connection==null){
    		connection =(Connection) DriverManager.getConnection( "jdbc:mysql://localhost/history", "root", "" );
	        }
    	statement = (Statement) connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
    	statement.execute("INSERT INTO history  VALUES('"+name+"')");
    	
    	
    	if(ch==1){
    		if(name.compareTo("CentimetresKilometres")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())/100000));}
    		if(name.compareTo("CentimetresMetres")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())/100));}
    		if(name.compareTo("CentimetresFeets")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())/30.48));}
    		if(name.compareTo("CentimetresYards")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())/91.44));}
    		if(name.compareTo("CentimetresMiles")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())/160934.4));}
    		if(name.compareTo("MilesKilometres")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*1.60934));}
    		if(name.compareTo("MilesMetres")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*1609.344));}
    		if(name.compareTo("MilesYards")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*1760));}
    		if(name.compareTo("MilesFeets")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*5280));}
    		if(name.compareTo("MilesCentimeters")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*160934.4));}
    		if(name.compareTo("FeetsMetres")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*.3048));}
    		if(name.compareTo("FeetsKilometres")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())/3280.8398));}
    		if(name.compareTo("FeetsCentimetres")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*30.48));}
    		if(name.compareTo("FeetsYards")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())/3));}
    		if(name.compareTo("FeetsMiles")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())/5280));}
    		if(name.compareTo("YardsMeters")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*.9114));}
    		if(name.compareTo("YardsFeets")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*3));}
    		if(name.compareTo("YardsMiles")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())/1760));}
    		if(name.compareTo("Yardscentimeters")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*91.44));}
    		if(name.compareTo("YardsKilometers")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())/1093.6132));}
    		if(name.compareTo("KilometresMiles")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())/1.60934));}
    		if(name.compareTo("KilometresCentimetres")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*100000));}
    		if(name.compareTo("KilometresMetres")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*1000));}
    		if(name.compareTo("KilometresFeets")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*3280.8398));}
    		if(name.compareTo("KilometresYards")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*1093.6132));}
    		if(name.compareTo("MetresKilometres")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())/1000));}
    		if(name.compareTo("MetresCentimetres")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*100));}
    		if(name.compareTo("MetresMiles")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())/1609.344));}
    		if(name.compareTo("MetresYards")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())/.9114));}
    		if(name.compareTo("MetresFeets")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())/.3048));}
    	}
    	if(ch==2){
    		
    		if(name.compareTo("KilogramsGrams")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*1000));}
    		if(name.compareTo("KilogramsTons")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*.001));}
    		if(name.compareTo("KilogramsOunces")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*35.273));}
    		if(name.compareTo("KilogramsPounds")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*2.204));}
    		if(name.compareTo("GramsKilograms")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*.001));}
    		if(name.compareTo("GramsOunces")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*.0352));}
    		if(name.compareTo("GramsPounds")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*.0022));}
    		if(name.compareTo("GramsTons")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*.000001));}
    		if(name.compareTo("TonsKilograms")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*1000));}
    		if(name.compareTo("TonsGrams")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*1000000));}
    		if(name.compareTo("TonsOunces")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*1000000));}
    		if(name.compareTo("TonsPounds")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*2204.622));}
    		if(name.compareTo("PoundsKilograms")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*.4535));}
    		if(name.compareTo("PoundsGrams")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*453.59));}
    		if(name.compareTo("PoundsTons")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*.00045));}
    		if(name.compareTo("PoundsOunces")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*16));}
    		if(name.compareTo("OuncesPounds")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*.0625));}
    		if(name.compareTo("OuncesTons")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*.000028));}
    		if(name.compareTo("OuncesGrams")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*28.349));}
    		if(name.compareTo("OuncesKilograms")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*.02834));}
    		
    		
    	}
    	if(ch==3){
    		
    		if(name.compareTo("LitersCubicmetres")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*.001));}
    		if(name.compareTo("LitersGallons")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*.2199));}
    		if(name.compareTo("LitersCubicfeets")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*.0353));}
    		if(name.compareTo("LitersCubicyards")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*.0013));}
    		if(name.compareTo("CubicmetresLiters")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*1000));}
    		if(name.compareTo("CubicmetresCubicfeets")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*35.314));}
    		if(name.compareTo("CubicmetresGallons")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*219.966));}
    		if(name.compareTo("CubicmetresCubicyards")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*1.3079));}
    		if(name.compareTo("GallonsLiters")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*4.546));}
    		if(name.compareTo("GallonsCubicmetres")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*.0045));}
    		if(name.compareTo("GallonsCubicfeets")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*.1605));}
    		if(name.compareTo("GallonsCubicyards")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*.0059));}
    		if(name.compareTo("CubicfeetsLiters")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*28.312));}
    		if(name.compareTo("CubicfeetsCubicmetres")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*.028));}
    		if(name.compareTo("CubicfeetsGallons")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*6.228));}
    		if(name.compareTo("CubicfeetsCubicyards")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*0.037));}
    		if(name.compareTo("CubicyardsLiters")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*764.554));}
    		if(name.compareTo("CubicyardsCubicmeters")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*0.764));}
    		if(name.compareTo("CubicyardsGallons")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*168.178));}
    		if(name.compareTo("CubicyardsCubicfeets")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*26.999));}
    	}
    	if(ch==4){
    		
    		if(name.compareTo("CelsiusFahrenheit")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*33.80));}
    		if(name.compareTo("CelsiusKelvin")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*273.15));}
    		if(name.compareTo("CelsiusRankine")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*493.47));}
    		if(name.compareTo("FahrenheitCelsius")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*-17.22));}
    		if(name.compareTo("FahrenheitKelvin")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*255.92));}
    		if(name.compareTo("FahrenheitRankine")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*460.67));}
    		if(name.compareTo("KelvineCelsius")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*-272.15));}
    		if(name.compareTo("KelvineFahrenheit")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*-457.87));}
    		if(name.compareTo("KelvineRankine")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*1.8));}
    		if(name.compareTo("RankineCelsius")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*-272.59));}
    		if(name.compareTo("RankineFahrenheit")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*-458.67));}
    		if(name.compareTo("RankineKelvin")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*0.555));}
    		
    	}
    	if(ch==5){
    		if(name.compareTo("AtmosphereBar")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*1.0132));}
    		if(name.compareTo("AtmosphereMm Mercury")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*760.002));}
    		if(name.compareTo("AtmospherePascal")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*101325));}
    		if(name.compareTo("Mm MercuryAtmosphere")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*.00131));}
    		if(name.compareTo("Mm MercuryBar")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*.0013));}
    		if(name.compareTo("Mm MercuryPascal")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*133.322));}
    		if(name.compareTo("BarAtmosphere")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*.9869));}
    		if(name.compareTo("BarMm Mercury")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*750.063));}
    		if(name.compareTo("BarPascal")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*100000));}
    		if(name.compareTo("PascalBar")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*.00001));}
    		if(name.compareTo("PascalMm Mercury")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())*.0075));}
    		if(name.compareTo("PascalAtmosphere")==0){stf.setText(Double.toString(Double.parseDouble(ftf.getText())/101325));}
    	}
    	
        
    }                                       



    // Variables declaration - do not modify                     
    private javax.swing.JButton PressMe;
    private javax.swing.JComboBox fc;
    private javax.swing.JTextField ftf;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JComboBox sc;
    private javax.swing.JTextField stf;
    private javax.swing.JLabel tl;
    // End of variables declaration                   
}
