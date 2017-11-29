package dc;
import java.awt.event.ActionEvent;

import javax.swing.*;
public class DigitalConvererFrame extends JFrame {
	
	String[] length={"Kilometres","Metres","Centimetres","Miles","Feets","Yards"};
	String[] volume={"Liters","Cubicmetres","Gallons","Cubicfeets","Cubicyards"};
	String[] temperature={"Celsius","Fahrenheit","Kelvin","Rankine"};
	String[] pressure={"Pascal","Atmosphere","Bar","Mm Mercury"};
	String[] weight={"Kilograms","Grams","Tons","Ounces","Pounds"};
	JMenuItem history =new JMenuItem("HISTORY");


   
    public DigitalConvererFrame() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
                            
    private void initComponents() {

        jMenuBar1 = new JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu("History");
        jMenu2 = new javax.swing.JMenu();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        Length = new javax.swing.JButton();
        Weight = new javax.swing.JButton();
        Volume = new javax.swing.JButton();
        Temparature = new javax.swing.JButton();
        Pressure = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        About = new javax.swing.JMenu();

        
        jMenuBar2.add(jMenu3);
        jMenu3.add(history);
        
         history.addActionListener(new java.awt.event.ActionListener(){

			
			public void actionPerformed(ActionEvent ae) {
				HistoryFrame hf=new HistoryFrame(true, true, true, true);
		    	//hf.setVisible(true);
		    	jDesktopPane1.add(hf);
				
			}
        	 
         });
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 600));
        setVisible(true); 
        jDesktopPane1.setBackground(new java.awt.Color(51,255,102));
        jDesktopPane1.setBorder(new javax.swing.border.MatteBorder(null));
        jDesktopPane1.setForeground(new java.awt.Color(255, 0, 0));

        Length.setBackground(new java.awt.Color(0, 255, 153));
        Length.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        Length.setText("Length");
        Length.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        Length.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LengthActionPerformed(evt);
            }
        });

        Weight.setBackground(new java.awt.Color(0, 255, 153));
        Weight.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        Weight.setText("Weight");
        Weight.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        Weight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WeightActionPerformed(evt);
            }
        });

        Volume.setBackground(new java.awt.Color(0, 255, 153));
        Volume.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        Volume.setText("Volume");
        Volume.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        Volume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolumeActionPerformed(evt);
            }
        });

        Temparature.setBackground(new java.awt.Color(0, 255, 153));
        Temparature.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        Temparature.setText("Temparature");
        Temparature.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        Temparature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TemparatureActionPerformed(evt);
            }
        });

        Pressure.setBackground(new java.awt.Color(0, 255, 153));
        Pressure.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        Pressure.setText("Pressure");
        Pressure.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        Pressure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PressureActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Temparature, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(Length, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Weight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Volume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pressure, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(Length, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Weight, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Volume, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Temparature, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Pressure, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1.setLayer(Length, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Weight, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Volume, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Temparature, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Pressure, javax.swing.JLayeredPane.DEFAULT_LAYER);

        About.setText("About");
        jMenuBar2.add(About);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    } 
    
	
    private void LengthActionPerformed(java.awt.event.ActionEvent evt) { 
    	internalframe v=new internalframe("LENGTH",true,true,true,true,length,1);
    	jDesktopPane1.add(v);
    	
    }                                      

    private void WeightActionPerformed(java.awt.event.ActionEvent evt) {                                       
    	internalframe v=new internalframe("WEIGHT",true,true,true,true,weight,2);
    	jDesktopPane1.add(v);
    }                                      

    private void VolumeActionPerformed(java.awt.event.ActionEvent evt) {                                       
    	internalframe v=new internalframe("VOLUME",true,true,true,true,volume,3);
    	jDesktopPane1.add(v);
    }                                      

    private void TemparatureActionPerformed(java.awt.event.ActionEvent evt) {                                            
    	internalframe v=new internalframe("TEMPERATURE",true,true,true,true,temperature,4);
    	jDesktopPane1.add(v);
    }                                           

    private void PressureActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	internalframe v=new internalframe("PRESSURE",true,true,true,true,pressure,5);
    	jDesktopPane1.add(v);
    } 
    
    private javax.swing.JMenu About;
    private javax.swing.JButton Length;
    private javax.swing.JButton Pressure;
    private javax.swing.JButton Temparature;
    private javax.swing.JButton Volume;
    private javax.swing.JButton Weight;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    // End of variables declaration                   



}
