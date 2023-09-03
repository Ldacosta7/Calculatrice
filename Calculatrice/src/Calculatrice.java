import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calculatrice extends JFrame implements ActionListener   {

	//on declare des données pour les boutons
	int height = 70 ;
	int width = 100 ; 
	int espacement = 20;
	//la variable pour stocker la premiere valeur
	float temp = (float) 0;
	//la variable pour stocker le symbole de l'opération
	String operation = "";

	// on déclare les boutons
	private JLabel lbTitre = new JLabel ("Ma Calculatrice 2023 CFA Insta");
	private JButton btZero = new JButton ("0");
	private JButton btUn = new JButton ("1");
	private JButton btDeux = new JButton ("2");
	private JButton btTrois = new JButton ("3");
	private JButton btQuatre = new JButton ("4");
	private JButton btCinq = new JButton ("5");
	private JButton btSix = new JButton ("6");
	private JButton btSept = new JButton ("7");
	private JButton btHuit = new JButton ("8");
	private JButton btNeuf = new JButton ("9");
	private JButton btCarre = new JButton ("x^2");
	private JButton btRacine = new JButton ("Racine");
	private JButton btAddition = new JButton ("+");
	private JButton btSoustraction = new JButton ("-");
	private JButton btDiviser = new JButton ("÷");
	private JButton btMultiplier = new JButton ("x");
	private JButton btDecimale = new JButton (",");
	private JButton btSupp = new JButton ("Supp");
	private JButton btModulo = new JButton ("%");
	private JButton btEgal = new JButton ("=");
	private JButton btPlusouMoins = new JButton ("±");
	private JButton btCE = new JButton ("CE");
	private JButton btC = new JButton ("C");
	private JButton btFraction = new JButton ("1/X");
	private JTextField Resultat = new JTextField();


	public Calculatrice () {

		// on design la fenetre de la calculatrice
		this.setTitle("Ma calculatrice 2023");
		this.setBounds(500, 200, width * 4 + espacement * 3, height * 8 + espacement * 8);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.DARK_GRAY);
		this.setResizable(false);
		this.setLayout(null);
		this.Resultat.setHorizontalAlignment(JTextField.RIGHT);
		this.Resultat.setFont(new Font("Roboto", Font.BOLD, 30));

		//placement des objets graphiques
		this.lbTitre.setBounds((width * 4 + espacement * 3)/4, 10, 200, 20);
		this.add(lbTitre);
		this.btPlusouMoins.setBounds(espacement , height * 8, width, height);
		this.add(btPlusouMoins);
		this.btZero.setBounds(width + espacement, height * 8, width, height);
		this.add(btZero);
		this.btDecimale.setBounds(width * 2 + espacement, height * 8, width, height);
		this.add(btDecimale);
		this.btEgal.setBounds(width * 3 + espacement, height * 8, width, height);
		this.add(btEgal);
		this.btSept.setBounds( espacement, height * 7, width, height);
		this.add(btSept);
		this.btHuit.setBounds(width + espacement, height * 7, width, height);
		this.add(btHuit);
		this.btNeuf.setBounds(width * 2 + espacement, height * 7, width, height);
		this.add(btNeuf);
		this.btAddition.setBounds(width * 3 + espacement, height * 7, width, height);
		this.add(btAddition);
		this.btQuatre.setBounds( espacement, height * 6, width, height);
		this.add(btQuatre);
		this.btCinq.setBounds(width + espacement, height * 6, width, height);
		this.add(btCinq);
		this.btSix.setBounds(width * 2 + espacement, height * 6, width, height);
		this.add(btSix);
		this.btSoustraction.setBounds(width * 3 + espacement, height * 6, width, height);
		this.add(btSoustraction);
		this.btUn.setBounds( espacement, height * 5, width, height);
		this.add(btUn);
		this.btDeux.setBounds(width + espacement, height * 5, width, height);
		this.add(btDeux);
		this.btTrois.setBounds(width * 2 + espacement, height * 5, width, height);
		this.add(btTrois);
		this.btMultiplier.setBounds(width * 3 + espacement, height * 5, width, height);
		this.add(btMultiplier);
		this.btCE.setBounds( espacement, height * 4, width, height);
		this.add(btCE);
		this.btC.setBounds( width + espacement, height * 4, width, height);
		this.add(btC);
		this.btSupp.setBounds(width * 2 + espacement, height * 4, width, height);
		this.add(btSupp);
		this.btDiviser.setBounds(width * 3 + espacement, height * 4, width, height);
		this.add(btDiviser);
		this.btModulo.setBounds( espacement, height * 3, width, height);
		this.add(btModulo);
		this.btRacine.setBounds(width  + espacement, height * 3, width, height);
		this.add(btRacine);
		this.btFraction.setBounds(width * 3 + espacement, height * 3, width, height);
		this.add(btFraction);
		this.btCarre.setBounds(width * 2 + espacement, height * 3, width, height);
		this.add(btCarre);

		this.Resultat.setBounds(espacement , 40 , width * 4 , 150);
		this.add(Resultat);


		//rendre les boutons cliquables
		this.btZero.addActionListener(this);
		this.btUn.addActionListener(this);
		this.btDeux.addActionListener(this);
		this.btTrois.addActionListener(this);
		this.btQuatre.addActionListener(this);
		this.btCinq.addActionListener(this);
		this.btSix.addActionListener(this);
		this.btSept.addActionListener(this);
		this.btHuit.addActionListener(this);
		this.btNeuf.addActionListener(this);
		this.btAddition.addActionListener(this);
		this.btSoustraction.addActionListener(this);
		this.btDiviser.addActionListener(this);
		this.btMultiplier.addActionListener(this);
		this.btRacine.addActionListener(this);
		this.btCarre.addActionListener(this);
		this.btFraction.addActionListener(this);
		this.btPlusouMoins.addActionListener(this);
		this.btDecimale.addActionListener(this);
		this.btModulo.addActionListener(this);
		this.btCE.addActionListener(this);
		this.btC.addActionListener(this);
		this.btSupp.addActionListener(this);
		this.btEgal.addActionListener(this);


		//on rend la fenêtre visible
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Calculatrice uneCalculatrice = new Calculatrice();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// on clear la fenetre
		if(e.getSource() == this.btC) {
			this.temp = 0 ;
			this.operation = "";
			this.Resultat.setText("");
		} 
		//on supprime le dernier caractere dans la fenetre
		else if(e.getSource() == this.btSupp) {
			this.Resultat.setText(this.Resultat.getText().substring(0, this.Resultat.getText().length() -1));

		} // on garde la premiere valeur mais on reinitialise la deuxieme
		else if(e.getSource() == this.btCE) {
			this.operation = "";
			this.Resultat.setText("");
		} 
		//on affiche les valeurs numerique
		else if(e.getSource() == this.btZero){
			this.Resultat.setText(this.Resultat.getText() + "0");

		} else if(e.getSource() == this.btUn){
			this.Resultat.setText(this.Resultat.getText() + "1");

		} else if(e.getSource() == this.btDeux){
			this.Resultat.setText(this.Resultat.getText() + "2");

		} else if(e.getSource() == this.btTrois){
			this.Resultat.setText(this.Resultat.getText() + "3");

		} else if(e.getSource() == this.btQuatre){
			this.Resultat.setText(this.Resultat.getText() + "4");

		} else if(e.getSource() == this.btCinq){
			this.Resultat.setText(this.Resultat.getText() + "5");

		} else if(e.getSource() == this.btSix){
			this.Resultat.setText(this.Resultat.getText() + "6");

		} else if(e.getSource() == this.btSept){
			this.Resultat.setText(this.Resultat.getText() + "7");

		} else if(e.getSource() == this.btHuit){
			this.Resultat.setText(this.Resultat.getText() + "8");

		} else if(e.getSource() == this.btNeuf){
			this.Resultat.setText(this.Resultat.getText() + "9");

		} 
		//on affiche la virgule si il n'y en a pas déjà une
		else if(e.getSource() == this.btDecimale) {
			if (this.Resultat.getText().indexOf(",") < 0) {
				this.Resultat.setText(this.Resultat.getText() + ",");
			}

			// on stock les valeurs numerique et de calcul
		} else if(e.getSource() == this.btAddition) {
			temp = Float.parseFloat(this.Resultat.getText());
			operation = "+" ;
			this.Resultat.setText("");

		} else if(e.getSource() == this.btSoustraction) {
			temp = Float.parseFloat(this.Resultat.getText());
			operation = "-" ;
			this.Resultat.setText("");

		} else if(e.getSource() == this.btDiviser) {
			temp = Float.parseFloat(this.Resultat.getText());
			operation = "÷" ;
			this.Resultat.setText("");

		} else if(e.getSource() == this.btMultiplier) {
			temp = Float.parseFloat(this.Resultat.getText());
			operation = "x" ;
			this.Resultat.setText("");

		} else if(e.getSource() == this.btMultiplier) {
			temp = Float.parseFloat(this.Resultat.getText());
			operation = "x" ;
			this.Resultat.setText("");

		} else if(e.getSource() == this.btModulo) {
			temp = Float.parseFloat(this.Resultat.getText());
			operation = "%" ;
			this.Resultat.setText("");

		} 
		// on veut le resultat
		else if(e.getSource() == this.btEgal) {
			if (this.temp == 0) {
				this.Resultat.setText(this.Resultat.getText());
				JOptionPane.showMessageDialog(this, "Choisissez une opération pour le calcul");
			} else {
				float calc = this.temp ;
				boolean bool = true ;
				switch (this.operation) {
				
				case ("+") :
					calc = calc + Float.parseFloat(this.Resultat.getText());
				break ;
				
				case ("x") :
					calc = calc * Float.parseFloat(this.Resultat.getText());
				break ;
				
				case ("-") :
					calc = calc - Float.parseFloat(this.Resultat.getText());
				break ;

				case ("÷") :
					if(Float.parseFloat(this.Resultat.getText()) == 0) {
						JOptionPane.showMessageDialog(this, "Division par 0 impossible !", "Erreur", JOptionPane.ERROR_MESSAGE); 
						bool = false ;
					} else {
					calc = calc / Float.parseFloat(this.Resultat.getText());
					}
				break ;
				
				case ("%") :
					if(Float.parseFloat(this.Resultat.getText()) == 0) {
						JOptionPane.showMessageDialog(this, "Modulo par 0 impossible !", "Erreur", JOptionPane.ERROR_MESSAGE); 
						bool = false ;
					} else {
					calc = calc % Float.parseFloat(this.Resultat.getText());
					}
				break ;
				
				} if (bool == true) {
					this.Resultat.setText(calc + "");
				} 
				// une erreur est survenu on vide l'input
				else {
					this.Resultat.setText("");
				}

			}


		} // on s'occupe des boutons dont les resultats s'affichent directement
		else if ( e.getSource() == this.btPlusouMoins) {
			this.temp = Float.parseFloat(this.Resultat.getText());
			float result = this.temp * (-1);
			this.Resultat.setText(result+"");
			
		} else if ( e.getSource() == this.btRacine) {
			this.temp = Float.parseFloat(this.Resultat.getText());
			float result = (float) Math.sqrt(this.temp);
			this.Resultat.setText(result+"");
			
		} else if ( e.getSource() == this.btCarre) {
			this.temp = Float.parseFloat(this.Resultat.getText());
			float result = this.temp * this.temp;
			this.Resultat.setText(result+"");
			
		} else if (e.getSource() == this.btFraction) {
			this.temp = Float.parseFloat(this.Resultat.getText());
			if(this.temp == 0) {
				JOptionPane.showMessageDialog(this, "Division par 0 impossible !", "Erreur", JOptionPane.ERROR_MESSAGE); 
				this.Resultat.setText("");
			} else {
				float result = 1 / this.temp ;
				this.Resultat.setText(result+"");
			}
		}
		

	}


}




