import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.io.*;
import java.net.*;
class VIVEK extends JFrame
{
	
		static ServerSocket ss;
		static int jana=0;
		static Socket s=null;
		
		static DataOutputStream dos;
		static DataInputStream dis;
	static JPanel panel,panel2;
        static JButton but[];
		 static JButton but2[];
		static String msgin="";
		static String bs="";
		static int viv=5;
		static JLabel label;
		static JButton play;
		static JButton b1;
		Container c;
  
	 public void sita(){
		 
		Thread t1=new Thread(new Runnable(){
			public void run(){
		try{
		       s=new Socket("localhost",3000);
		
		dos=new DataOutputStream(s.getOutputStream()); 
		dis=new DataInputStream(s.getInputStream());
      while(!msgin.equals("exit")){
	
	try{
	 msgin=dis.readUTF();
      	 if(msgin.equals("I AM READY")&&jana==25)
		  {
			  play.setEnabled(true);
			 
		  }	  
	for(int p=1;p<26;p++)
	 { 
         if(msgin.equals(""+but[p].getText()))
		 { but[p].setEnabled(false);
            but[p].setBackground(Color.PINK);	   
	   }
		 if(but[p].getBackground()!=Color.PINK)
		 { but[p].setEnabled(true);}
     }	
    }catch(Exception dd){}
	  }
	     int q =JOptionPane.showConfirmDialog(null, "YOU LOST THE MATCH", "PRESS OK TO EXIT", JOptionPane.DEFAULT_OPTION);
	   if(q==0)
                   System.exit(0); 
   
		
		}catch(Exception e){}
			}});
       
	   t1.start();			
		 
	 }
	 public void ram(){
			
		Thread ta=new Thread(new Runnable(){
		public void run(){
	try{
		ss=new ServerSocket(3000);
		s=ss.accept();
		dos=new DataOutputStream(s.getOutputStream()); 
		dis=new DataInputStream(s.getInputStream());
     while(!msgin.equals("exit")){
	
	try{
	 msgin=dis.readUTF();
      	 if(msgin.equals("I AM READY")&&jana==25)
		  {
			  play.setEnabled(true);
			 
		  }	  
	for(int p=1;p<26;p++)
	 { 
         if(msgin.equals(""+but[p].getText()))
		 { but[p].setEnabled(false);
            but[p].setBackground(Color.PINK);	   
	   }
		 if(but[p].getBackground()!=Color.PINK)
		 { but[p].setEnabled(true);}
     }	
    }catch(Exception dd){}
	  }
	     int q =JOptionPane.showConfirmDialog(null, "YOU LOST THE MATCH", "PRESS OK TO EXIT", JOptionPane.DEFAULT_OPTION);
	   if(q==0)
                   System.exit(0); 
   
		
		}	catch(Exception dd){}	
			
		}});
			try{
			ta.start();	
			}catch(Exception jfdnls){}
	 }	//ram method of ta

	VIVEK()
	{
				c=this.getContentPane();
			   c.setLayout(null);
       but=new JButton[26];   
 but2=new JButton[26];	  
	  panel=new JPanel();
     label=new JLabel();
	  GridLayout layout=new GridLayout(5,5);
     panel2=new JPanel(); 
        	panel2.setBounds(50,50,500,500); 
	 panel.setBounds(50,50,500,500);	
      panel.setLayout(layout);	
	   panel2.setLayout(layout);	
	 label.setBounds(100,600,450,50);
	 ///
	 
	 Thread tr1=new Thread(new Runnable(){
		 public void run(){
	//		 
	int aot1=0;
	int aot2=0;	int aot3=0;	int aot4=0;	int aot5=0;	int aot6=0;	int aot7=0;	int aot8=0;	int aot9=0;	int aot10=0;	int aot11=0;	int aot12=0;
	 int viv=0;
	 for(int w=1;w<6;w++){
          if(but[w].getBackground()==Color.PINK)
		  {aot1++;}
       }
	
	 for(int w=5;w<10;w++){
          if(but[w+1].getBackground()==Color.PINK)
		  {aot2++;}
        }
	 for(int w=10;w<15;w++){
          if(but[w+1].getBackground()==Color.PINK)
		  {aot3++;}
        }
	 for(int w=15;w<20;w++){
          if(but[1+w].getBackground()==Color.PINK)
		  {aot4++;}
        }
	 for(int w=20;w<25;w++){
          if(but[w+1].getBackground()==Color.PINK)
		  {aot5++;}
        }
	 for(int w=1;w<6;w++){
          if(but[1+(w-1)*5].getBackground()==Color.PINK)
		  {aot6++;}
        }
	 for(int w=1;w<6;w++){
          if(but[2+(w-1)*5].getBackground()==Color.PINK)
		  {aot7++;}
        }
	 for(int w=1;w<6;w++){
          if(but[3+(w-1)*5].getBackground()==Color.PINK)
		  {aot8++;}
        }
	 for(int w=1;w<6;w++){
          if(but[4+(w-1)*5].getBackground()==Color.PINK)
		  {aot9++;}
        }
	 for(int w=1;w<6;w++){
          if(but[w*5].getBackground()==Color.PINK)
		  {aot10++;}
        }
	 for(int w=0;w<5;w++){
          if(but[1+(w*6)].getBackground()==Color.PINK)
		  {aot11++;}
        }
	 for(int w=1;w<6;w++){
          if(but[1+4*w].getBackground()==Color.PINK)
		  {aot12++;}
        }   
	   if(aot1==5)
	   {
		   viv++;
	   }		   
	   if(aot2==5)
	   {
		   viv++;
	   }		   
	   if(aot3==5)
	   {
		   viv++;
	   }		   
	   if(aot4==5)
	   {
		   viv++;
	   }		   
	   if(aot5==5)
	   {
		   viv++;
	   }		   
	   if(aot6==5)
	   {
		   viv++;
	   }		   
	   if(aot7==5)
	   {
		   viv++;
	   }		   
	   if(aot8==5)
	   {
		   viv++;
	   }		   
	   if(aot9==5)
	   {
		   viv++;
	   }		   
	   if(aot10==5)
	   {
		   viv++;
	   }		   
	   if(aot11==5)
	   {
		   viv++;
	   }		   
	   if(aot12==5)
	   {
		   viv++;
	   }		   
	  
		 label.setText(""+viv);
		switch(viv){
        case 5:{	
	   							try{
                     			String msgout="exit";
							dos.writeUTF(msgout);
							
						}
						catch(Exception event){} 
	   int y =JOptionPane.showConfirmDialog(null, "YOU WON THE MATCH", "PRESS OK TO EXIT", JOptionPane.DEFAULT_OPTION);
	   if(y==0)
                   System.exit(0); 
                               
	   }		
		} 
	   
	
//

	}
	 });
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	// play.setBorder(new LineBorder(Color.ORANGE,3));
	 for(int i=1;i<=25;i++)
		{
			but[i]=new JButton("");
	     	panel.add(but[i]);
     		   but[i].setFont(new Font("Arial",Font.PLAIN,30));    
	but[i].setBorder(new LineBorder(Color.RED,1));
		}	
	 
   	 play=new JButton("PLAY");
	 play.setFont(new Font("Arial",Font.PLAIN,28));
	   play.setBounds(600,270,170,80);
	   c.add(play);
       c.add(label);
       c.add(panel);
	   c.add(panel2);
	  c.add(panel); 	
	    
		for(int m=1;m<=25;m++)
		{
			but2[m]=new JButton("");
			 but2[m].setBorder(new LineBorder(Color.RED,2));
		   but2[m].setFont(new Font("Arial",Font.PLAIN,30));
		    panel2.add(but2[m]);
		
		}		
		play.setEnabled(false);
    		       play.addActionListener(new ActionListener(){
		  
		   public void actionPerformed(ActionEvent kewk){
                  if(play.getText()=="PLAY")
				  {
					  try{
					  dos.writeUTF("I AM READY");
                      }catch(Exception jdn){}
					  play.setText("READY");
                      play.setEnabled(false);					  
				}
				 else if(play.getText()=="EXIT")
				 {
					  int y =JOptionPane.showConfirmDialog(null, "ARE YOU SURE TO EXIT ", "PRESS OK TO EXIT", JOptionPane.OK_CANCEL_OPTION);
                	   if(y==JOptionPane.OK_OPTION)
                             System.exit(0); 
                       if(y==JOptionPane.CANCEL_OPTION)
					   {}                
				 }
				 else if(play.getText()=="READY"){
                   try{
					  dos.writeUTF("I AM READY");
                      }catch(Exception jdn){}

				 panel2.removeAll();
		       c.remove(panel2);
               play.setBackground(Color.RED);
				 play.setText("EXIT");}		  
               panel.repaint();                    		     
			 }
	});
	   but2[1].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							jana++;
	                 		but2[1].setText(Integer.toString(jana));		  
                           but[1].setText(Integer.toString(jana));
						   panel2.repaint();
				       	   if(jana==25)
						   {
							   play.setEnabled(true);
						   }
						 but2[1].setEnabled(false);	
					}});
	     but2[2].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							jana++;
							
	                 		but2[2].setText(Integer.toString(jana));	
						   panel2.repaint();
				       	   if(jana==25)
						   {
							   play.setEnabled(true);
						   }                            							
				   	        but[2].setText(Integer.toString(jana));
					        but2[2].setEnabled(false);	
					}});
					  but2[3].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							jana++;
	                 		but2[3].setText(Integer.toString(jana));		  
				   	        but[3].setText(Integer.toString(jana)); 
													   panel2.repaint();
				       	   if(jana==25)
						   {
							   play.setEnabled(true);
						   }
							but2[3].setEnabled(false);	
					}});
					  but2[4].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							jana++;
	                 		but2[4].setText(Integer.toString(jana));		  
									   panel2.repaint();
				       	   if(jana==25)
						   {
							   play.setEnabled(true);
						   }	   	        
							but[4].setText(Integer.toString(jana));
							but2[4].setEnabled(false);	
					}});
					  but2[5].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							jana++;
	                 		but2[5].setText(Integer.toString(jana));		  
				   	        but[5].setText(Integer.toString(jana)); 
						   panel2.repaint();
				       	   if(jana==25)
						   {
							   play.setEnabled(true);
						   }
							but2[5].setEnabled(false);	
					}});
					  but2[6].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							jana++;
	                 		but2[6].setText(Integer.toString(jana));		  
				   	        but[6].setText(Integer.toString(jana)); 
							panel2.repaint();
				       	   if(jana==25)
						   {
							   play.setEnabled(true);
						   }
							but2[6].setEnabled(false);	
					}});
					  but2[7].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							jana++;
	                 		but2[7].setText(Integer.toString(jana));		  
				   	        but[7].setText(Integer.toString(jana));
							panel2.repaint();
				       	   if(jana==25)
						   {
							   play.setEnabled(true);
						   }
							but2[7].setEnabled(false);	
					}});
					  but2[8].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							jana++;
	                 		but2[8].setText(Integer.toString(jana));		  
				   	        but[8].setText(Integer.toString(jana));
							panel2.repaint();
				       	   if(jana==25)
						   {
							   play.setEnabled(true);
						   }
							but2[8].setEnabled(false);	
					}});
					  but2[9].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							jana++;
	                 		but2[9].setText(Integer.toString(jana));		  
				   	        but[9].setText(Integer.toString(jana)); 
							panel2.repaint();
				       	   if(jana==25)
						   {
							   play.setEnabled(true);
						   }
							but2[9].setEnabled(false);	
					}});
					  but2[10].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							jana++;
	                 		but2[10].setText(Integer.toString(jana));		  
				   	        but[10].setText(Integer.toString(jana));  
							panel2.repaint();
				       	   if(jana==25)
						   {
							   play.setEnabled(true);
						   }
							but2[10].setEnabled(false);	
					}});
					  but2[11].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							jana++;
	                 		but2[11].setText(Integer.toString(jana));		  
				   	        but[11].setText(Integer.toString(jana)); 
							panel2.repaint();
				       	   if(jana==25)
						   {
							   play.setEnabled(true);
						   }
							but2[11].setEnabled(false);	
					}});
					  but2[12].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							jana++;
	                 		but2[12].setText(Integer.toString(jana));		  
				   	        but[12].setText(Integer.toString(jana));
							panel2.repaint();
				       	   if(jana==25)
						   {
							   play.setEnabled(true);
						   }
							but2[12].setEnabled(false);	
					}});
					  but2[13].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							jana++;
	                 		but2[13].setText(Integer.toString(jana));		  
				   	        but[13].setText(Integer.toString(jana));
							panel2.repaint();
				       	   if(jana==25)
						   {
							   play.setEnabled(true);
						   }
							but2[13].setEnabled(false);	
					}});
					  but2[14].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							jana++;
	                 		but2[14].setText(Integer.toString(jana));		  
				   	        but[14].setText(Integer.toString(jana));
							panel2.repaint();
				       	   if(jana==25)
						   {
							   play.setEnabled(true);
						   }
							but2[14].setEnabled(false);	
					}});
					  but2[15].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							jana++;
	                 		but2[15].setText(Integer.toString(jana));		  
				   	        but[15].setText(Integer.toString(jana)); 
							panel2.repaint();
				       	   if(jana==25)
						   {
							   play.setEnabled(true);
						   }
							but2[15].setEnabled(false);	
					}});
					  but2[16].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							jana++;
	                 		but2[16].setText(Integer.toString(jana));		  
				   	        but[16].setText(Integer.toString(jana)); 
							panel2.repaint();
				       	   if(jana==25)
						   {
							   play.setEnabled(true);
						   }
							but2[16].setEnabled(false);	
					}});
					  but2[17].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							jana++;
	                 		but2[17].setText(Integer.toString(jana));		  
				   	        but[17].setText(Integer.toString(jana)); 
							panel2.repaint();
				       	   if(jana==25)
						   {
							   play.setEnabled(true);
						   }
							but2[17].setEnabled(false);	
					}});
					  but2[18].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							jana++;
	                 		but2[18].setText(Integer.toString(jana));		  
				   	        but[18].setText(Integer.toString(jana)); 
							panel2.repaint();
				       	   if(jana==25)
						   {
							   play.setEnabled(true);
						   }
							but2[18].setEnabled(false);	
					}});
					  but2[19].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							jana++;
	                 		but2[19].setText(Integer.toString(jana));		  
				   	        but[19].setText(Integer.toString(jana)); 
							panel2.repaint();
				       	   if(jana==25)
						   {
							   play.setEnabled(true);
						   }
							but2[19].setEnabled(false);	
					}});
					  but2[20].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							jana++;
	                 		but2[20].setText(Integer.toString(jana));		  
				   	        but[20].setText(Integer.toString(jana));
							panel2.repaint();
				       	   if(jana==25)
						   {
							   play.setEnabled(true);
						   }
							but2[20].setEnabled(false);	
					}});
					  but2[21].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							jana++;
	                 		but2[21].setText(Integer.toString(jana));		  
				   	        but[21].setText(Integer.toString(jana)); 
							panel2.repaint();
				       	   if(jana==25)
						   {
							   play.setEnabled(true);
						   }
							but2[21].setEnabled(false);	
					}});
					  but2[22].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							jana++;
	                 		but2[22].setText(Integer.toString(jana));		  
				   	        but[22].setText(Integer.toString(jana)); 
							panel2.repaint();
				       	   if(jana==25)
						   {
							   play.setEnabled(true);
						   }
							but2[22].setEnabled(false);	
					}});
					  but2[23].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							jana++;
	                 		but2[23].setText(Integer.toString(jana));		  
				   	        but[23].setText(Integer.toString(jana)); 
							panel2.repaint();
				       	   if(jana==25)
						   {
							   play.setEnabled(true);
						   }
							but2[23].setEnabled(false);	
					}});
					  but2[24].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							jana++;
	                 		but2[24].setText(Integer.toString(jana));		  
				   	        but[24].setText(Integer.toString(jana)); 
							panel2.repaint();
				       	   if(jana==25)
						   {
							   play.setEnabled(true);
						   }
							but2[24].setEnabled(false);	
					}});
	 but2[25].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							jana++;
	                 		but2[25].setText(Integer.toString(jana));		  
				   	        but[25].setText(Integer.toString(jana)); 
							panel2.repaint();
				       	   if(jana==25)
						   {
							   play.setEnabled(true);
						   }
							but2[25].setEnabled(false);
							panel2.repaint();							
					}});

		but[1].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							
	                          but[1].setBackground(Color.PINK);
							try{
                     			String msgout="";
							msgout=but[1].getText();
							dos.writeUTF(msgout);
							
						}
						catch(Exception event){}       
                      but[1].setEnabled(false);
                   for(int p=1;p<26;p++)
	 {
		 but[p].setEnabled(false);
	 }				  
				tr1.start();   	
					}});

				
but[2].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							
	         but[2].setBackground(Color.PINK);
							try{
                     			String msgout="";
							msgout=but[2].getText();
							dos.writeUTF(msgout);
							
						}
						catch(Exception event){}       
                      but[2].setEnabled(false);						
				   	for(int p=1;p<26;p++)
	 {
		 but[p].setEnabled(false);
	 }			tr1.start();  	  
					}});
but[3].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							
	                     but[3].setBackground(Color.PINK);
							try{
                     			String msgout="";
							msgout=but[3].getText();
							dos.writeUTF(msgout);
							
						}
						catch(Exception event){}       
                      but[3].setEnabled(false);						
				   	for(int p=1;p<26;p++)
	 {
		 but[p].setEnabled(false);
	 }				  tr1.start();  
					}});
but[4].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							
	                          but[4].setBackground(Color.PINK);
							try{
                     			String msgout="";
							msgout=but[4].getText();
							dos.writeUTF(msgout);
							
						}
						catch(Exception event){}       
                      but[4].setEnabled(false);						
				   	for(int p=1;p<26;p++)
	 {
		 but[p].setEnabled(false);
	 }				  tr1.start();  
					}});
but[5].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							
	                          but[5].setBackground(Color.PINK);
							try{
                     			String msgout="";
							msgout=but[5].getText();
							dos.writeUTF(msgout);
							
						}
						catch(Exception event){}       
                      but[5].setEnabled(false);						
				   	for(int p=1;p<26;p++)
	 {
		 but[p].setEnabled(false);
	 }				  tr1.start();  
					}});
but[6].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							
	                          but[6].setBackground(Color.PINK);
							try{
                     			String msgout="";
							msgout=but[6].getText();
							dos.writeUTF(msgout);
							
						}
						catch(Exception event){}       
                      but[6].setEnabled(false);						
				   	for(int p=1;p<26;p++)
	 {
		 but[p].setEnabled(false);
	 }				  tr1.start();  
					}});
but[7].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							
	                          but[7].setBackground(Color.PINK);
							try{
                     			String msgout="";
							msgout=but[7].getText();
							dos.writeUTF(msgout);
							
						}
						catch(Exception event){}       
                      but[7].setEnabled(false);						
				   	for(int p=1;p<26;p++)
	 {
		 but[p].setEnabled(false);
	 }				  tr1.start();  
					}});
but[8].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							
	                          but[8].setBackground(Color.PINK);
							try{
                     			String msgout="";
							msgout=but[8].getText();
							dos.writeUTF(msgout);
							
						}
						catch(Exception event){}       
                      but[8].setEnabled(false);						
				   	for(int p=1;p<26;p++)
	 {
		 but[p].setEnabled(false);
	 }				  tr1.start();  
					}});
but[9].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							
	                          but[9].setBackground(Color.PINK);
							try{
                     			String msgout="";
							msgout=but[9].getText();
							dos.writeUTF(msgout);
							
						}
						catch(Exception event){}       
                      but[9].setEnabled(false);						
				   	for(int p=1;p<26;p++)
	 {
		 but[p].setEnabled(false);
	 }				  tr1.start();  
					}});
but[10].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							
	                          but[10].setBackground(Color.PINK);
							try{
                     			String msgout="";
							msgout=but[10].getText();
							dos.writeUTF(msgout);
							
						}
						catch(Exception event){}       
                      but[10].setEnabled(false);						
				   	for(int p=1;p<26;p++)
	 {
		 but[p].setEnabled(false);
	 }				  tr1.start();  
					}});
but[10].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							
	                          but[10].setBackground(Color.PINK);
							try{
                     			String msgout="";
							msgout=but[10].getText();
							dos.writeUTF(msgout);
							
						}
						catch(Exception event){}       
                      but[10].setEnabled(false);						
				   	for(int p=1;p<26;p++)
	 {
		 but[p].setEnabled(false);
	 }				  tr1.start();  
					}});
but[11].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							
	                          but[11].setBackground(Color.PINK);
							try{
                     			String msgout="";
							msgout=but[11].getText();
							dos.writeUTF(msgout);
							
						}
						catch(Exception event){}       
                      but[11].setEnabled(false);						
				   	for(int p=1;p<26;p++)
	 {
		 but[p].setEnabled(false);
	 }				  tr1.start();  
					}});
but[12].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							
	                          but[12].setBackground(Color.PINK);
							try{
                     			String msgout="";
							msgout=but[12].getText();
							dos.writeUTF(msgout);
							
						}
						catch(Exception event){}       
                      but[12].setEnabled(false);						
				   	for(int p=1;p<26;p++)
	 {
		 but[p].setEnabled(false);
	 }				  tr1.start();  
					}});
but[13].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							
	                          but[13].setBackground(Color.PINK);
							try{
                     			String msgout="";
							msgout=but[13].getText();
							dos.writeUTF(msgout);
							
						}
						catch(Exception event){}       
                      but[13].setEnabled(false);						
				   	for(int p=1;p<26;p++)
	 {
		 but[p].setEnabled(false);
	 }				  tr1.start();  
					}});
but[14].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							
	                          but[14].setBackground(Color.PINK);
							try{
                     			String msgout="";
							msgout=but[14].getText();
							dos.writeUTF(msgout);
							
						}
						catch(Exception event){}       
                      but[14].setEnabled(false);						
				   	for(int p=1;p<26;p++)
	 {
		 but[p].setEnabled(false);
	 }				  tr1.start();  
					}});
but[15].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							
	                          but[15].setBackground(Color.PINK);
							try{
                     			String msgout="";
							msgout=but[15].getText();
							dos.writeUTF(msgout);
							
						}
						catch(Exception event){}       
                      but[15].setEnabled(false);						
				   	for(int p=1;p<26;p++)
	 {
		 but[p].setEnabled(false);
	 }				  tr1.start();  
					}});
but[16].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							
	                          but[16].setBackground(Color.PINK);
							try{
                     			String msgout="";
							msgout=but[16].getText();
							dos.writeUTF(msgout);
							
						}
						catch(Exception event){}       
                      but[16].setEnabled(false);						
				   	for(int p=1;p<26;p++)
	 {
		 but[p].setEnabled(false);
	 }				  tr1.start();  
					}});
but[17].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							
	                          but[17].setBackground(Color.PINK);
							try{
                     			String msgout="";
							msgout=but[17].getText();
							dos.writeUTF(msgout);
							
						}
						catch(Exception event){}       
                      but[17].setEnabled(false);						
				   	for(int p=1;p<26;p++)
	 {
		 but[p].setEnabled(false);
	 }				  tr1.start();  
					}});
but[18].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							
	                          but[18].setBackground(Color.PINK);
							try{
                     			String msgout="";
							msgout=but[18].getText();
							dos.writeUTF(msgout);
							
						}
						catch(Exception event){}  
                 but[18].setEnabled(false);						
				   	for(int p=1;p<26;p++)
	 {
		 but[p].setEnabled(false);
	 }				  tr1.start();  
					}});
but[19].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							
	                          but[19].setBackground(Color.PINK);
							try{
                     			String msgout="";
							msgout=but[19].getText();
							dos.writeUTF(msgout);
							
						}
						catch(Exception event){}       
                      but[19].setEnabled(false);						
				   	for(int p=1;p<26;p++)
	 {
		 but[p].setEnabled(false);
	 }				  tr1.start();  
					}});
but[20].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							
	                          but[20].setBackground(Color.PINK);
							try{
                     			String msgout="";
							msgout=but[20].getText();
							dos.writeUTF(msgout);
							
						}
						catch(Exception event){}       
                      but[20].setEnabled(false);						
				   	for(int p=1;p<26;p++)
	 {
		 but[p].setEnabled(false);
	 }				  tr1.start();  
					}});
but[21].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							
	                          but[21].setBackground(Color.PINK);
							try{
                     			String msgout="";
							msgout=but[21].getText();
							dos.writeUTF(msgout);
							
						}
						catch(Exception event){}       
                      but[21].setEnabled(false);						
				   	for(int p=1;p<26;p++)
	 {
		 but[p].setEnabled(false);
	 }				  tr1.start();  
					}});
but[22].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							
	                          but[22].setBackground(Color.PINK);
							try{
                     			String msgout="";
							msgout=but[22].getText();
							dos.writeUTF(msgout);
							
						}
						catch(Exception event){}       
                      but[22].setEnabled(false);						
				   	for(int p=1;p<26;p++)
	 {
		 but[p].setEnabled(false);
	 }				  tr1.start();  
					}});
but[23].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							
	                          but[23].setBackground(Color.PINK);
							try{
                     			String msgout="";
							msgout=but[23].getText();
							dos.writeUTF(msgout);
							
						}
						catch(Exception event){}       
                      but[23].setEnabled(false);						
				   	for(int p=1;p<26;p++)
	 {
		 but[p].setEnabled(false);
	 }				  tr1.start();  
					}});
but[24].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							
	                          but[24].setBackground(Color.PINK);
							try{
                     			String msgout="";
							msgout=but[24].getText();
							dos.writeUTF(msgout);
							
						}
						catch(Exception event){}       
                      but[24].setEnabled(false);						
				   	for(int p=1;p<26;p++)
	 {
		 but[p].setEnabled(false);
	 }				  tr1.start();  
					}});
		
		 but[25].addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
							
	                          but[25].setBackground(Color.PINK);
							try{
                     			String msgout="";
							msgout=but[25].getText();
							dos.writeUTF(msgout);
							
						}
						catch(Exception event){}       
                      but[25].setEnabled(false);						
				   	for(int p=1;p<26;p++)
	 {
		 but[p].setEnabled(false);
	 }				  tr1.start();  
					}});
		
	}
	public int check1()
 {
  	 int count=0;
	 for(int w=1;w<6;w++){
          if(but[w].getBackground()==Color.PINK)
		  {count++;}
        }
		if(count==5)
			return 1;
		else 
			return 0;}
	 public int check2()
 {
  	 int count=0;
	 for(int w=5;w<10;w++){
          if(but[w+1].getBackground()==Color.PINK)
		  {count++;}
        }
		if(count==5)
			return 1;
		else 
			return 0;} 
 public int check3()
 {
  	 int count=0;
	 for(int w=10;w<15;w++){
          if(but[w+1].getBackground()==Color.PINK)
		  {count++;}
        }
		if(count==5)
			return 1;
		else 
			return 0;} 
 public int check4()
 {
  	 int count=0;
	 for(int w=15;w<20;w++){
          if(but[1+w].getBackground()==Color.PINK)
		  {count++;}
        }
		if(count==5)
			return 1;
		else 
			return 0;}
 public int check5()
 {
  	 int count=0;
	 for(int w=20;w<25;w++){
          if(but[w+1].getBackground()==Color.PINK)
		  {count++;}
        }
		if(count==5)
			return 1;
		else 
			return 0;
 } 
 public int check6()
 {
    	 int count=0;
	 for(int w=1;w<6;w++){
          if(but[1+(w-1)*5].getBackground()==Color.PINK)
		  {count++;}
        }
		if(count==5)
			return 1;
		else 
			return 0;
 }		
 	
 public int check7()
 {
    	 int count=0;
	 for(int w=1;w<6;w++){
          if(but[2+(w-1)*5].getBackground()==Color.PINK)
		  {count++;}
        }
		if(count==5)
			return 1;
		else 
			return 0;
 }		
 
 public int check8()
 {
    	 int count=0;
	 for(int w=1;w<6;w++){
          if(but[3+(w-1)*5].getBackground()==Color.PINK)
		  {count++;}
        }
		if(count==5)
			return 1;
		else 
			return 0;
 }		
 
 public int check9()
 {
    	 int count=0;
	 for(int w=1;w<6;w++){
          if(but[4+(w-1)*5].getBackground()==Color.PINK)
		  {count++;}
        }
		if(count==5)
			return 1;
		else 
			return 0;
 }		
 
 public int check10()
 {
    	 int count=0;
	 for(int w=1;w<6;w++){
          if(but[w*5].getBackground()==Color.PINK)
		  {count++;}
        }
		if(count==5)
			return 1;
		else 
			return 0;
 }		
 
 public int check11()
 {
    	 int count=0;
	 for(int w=0;w<5;w++){
          if(but[1+(w*6)].getBackground()==Color.PINK)
		  {count++;}
        }
		if(count==5)
			return 1;
		else 
			return 0;
 }		
 
 public int check12()
 {
    	 int count=0;
	 for(int w=1;w<6;w++){
          if(but[1+4*w].getBackground()==Color.PINK)
		  {count++;}
        }
		if(count==5)
			return 1;
		else 
			return 0;
 }
	public static void main(String args[])
	{
		
	JFrame fra=new JFrame();
	fra.setVisible(true);
	fra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	fra.setBounds(200,100,300,300);
	Container c=fra.getContentPane();
	 c.setBackground(Color.GRAY);
	fra.setResizable(false);
	JButton host=new JButton("HOST");
	JButton join=new JButton("JOIN");
	fra.setLayout(null);
	 host.setBackground(Color.ORANGE);
	  join.setBackground(Color.ORANGE);
	host.setBorder(new LineBorder(Color.CYAN,2));
	join.setBorder(new LineBorder(Color.CYAN,2));
	host.setBounds(100,50,100,50);
	join.setBounds(100,150,100,50);
	c.add(host);
	c.add(join);

	
	    VIVEK frame=new VIVEK();
		frame.setVisible(false);
		frame.setTitle("VKS BINGO");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(10,20,800,700);

		frame.setResizable(true);
		frame.setBackground(Color.PINK);
		 
		 
     
		Thread th1=new Thread(new Runnable(){
		 public void run(){
			 int vivek=0;
			 while(true){
     vivek=frame.check1();   
	 vivek=vivek+frame.check2();vivek=vivek+frame.check3();vivek=vivek+frame.check4();vivek=vivek+frame.check5();vivek=vivek+frame.check6();vivek=vivek+frame.check7();vivek=vivek+frame.check8();
	 vivek=vivek+frame.check9();vivek=vivek+frame.check10();vivek=vivek+frame.check11();vivek=vivek+frame.check12();
           
        label.setText(""+vivek);
		switch(vivek){
        case 5:{	
	   							try{
                     			String msgout="exit";
							dos.writeUTF(msgout);
							
						}
						catch(Exception event){} 
	   int y =JOptionPane.showConfirmDialog(frame, "YOU WON THE MATCH", "PRESS OK TO EXIT", JOptionPane.DEFAULT_OPTION);
	   if(y==0)
                   System.exit(0); 
                               
	   }		
		}
		}
   
		 }
	 });

try{

	   th1.start();
   }catch(Exception df){}
		
		
		
		
		
		
		
		
		
		
		
		
		host.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		fra.setVisible(false);	
		frame.setVisible(true);
		

		frame.ram();
		
		
		
		}
		
	});
	
						
					
join.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		
		fra.setVisible(false);
		frame.setVisible(true);
	    frame.sita();
}});
		
				 
		 
	   
	
	
	}
}