
package PUNTO5;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author eblanco
 */
public class PUNTO5 extends JFrame implements ActionListener{
Producto lapiz,aspirina,borrador,pan;
     public JPanel panel;
    public JLabel etiqueta1,etiqueta2,etiqueta3,etiqueta4,etiqueta5,ingre,proma,prome;
    public JTextField p1,p2,p3,p4,c1,c2,c3,c4,i1,i2,i3,i4,pr1,pr2,pr3,pr4,ing,promas,promes;
    public JButton botonIni,botonIns;
    
    public static void main(String[] args) {
       PUNTO5 a = new PUNTO5();
    }

    public PUNTO5(){
        setSize(450,650);
        setTitle("PRODUCTOS");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initComponents();
        setVisible(true);
    }
    private void initComponents(){
    
    paneles();
    crearEtiquetas();
    lineasTexto();
    botones();
    }
    private void paneles(){
    panel=new JPanel();
    panel.setBackground(Color.lightGray);
    panel.setLayout(null);
    this.getContentPane().add(panel);
    }
    private void crearEtiquetas(){
        //titulo
    etiqueta1=new JLabel();
    etiqueta1.setOpaque(true);
    etiqueta1.setHorizontalAlignment(SwingConstants.CENTER);
    etiqueta1.setText("PRODUCTOS");
    etiqueta1.setBounds(85, 30, 250, 40);
    etiqueta1.setBackground(Color.red);
    etiqueta1.setForeground(Color.WHITE);
    etiqueta1.setFont(new Font("cooper black",Font.ITALIC,22));
    panel.add(etiqueta1);
    
//Encabezado
    etiqueta2=new JLabel();
    etiqueta2.setOpaque(true);
    etiqueta2.setHorizontalAlignment(SwingConstants.CENTER);
    etiqueta2.setText("PRODUCTOS");
    etiqueta2.setBounds(15, 100, 90, 25);
    etiqueta2.setBackground(Color.ORANGE);
    etiqueta2.setForeground(Color.WHITE);
    etiqueta2.setFont(new Font("cooper black",Font.ITALIC,12));
    panel.add(etiqueta2);
    
    etiqueta3=new JLabel();
    etiqueta3.setOpaque(true);
    etiqueta3.setHorizontalAlignment(SwingConstants.CENTER);
    etiqueta3.setText("CANTIDAD");
    etiqueta3.setBounds(120, 100, 90, 25);
    etiqueta3.setBackground(Color.ORANGE);
    etiqueta3.setForeground(Color.WHITE);
    etiqueta3.setFont(new Font("cooper black",Font.ITALIC,12));
    panel.add(etiqueta3);
    
    etiqueta3=new JLabel();
    etiqueta3.setOpaque(true);
    etiqueta3.setHorizontalAlignment(SwingConstants.CENTER);
    etiqueta3.setText("IVA");
    etiqueta3.setBounds(225, 100, 90, 25);
    etiqueta3.setBackground(Color.ORANGE);
    etiqueta3.setForeground(Color.WHITE);
    etiqueta3.setFont(new Font("cooper black",Font.ITALIC,12));
    panel.add(etiqueta3);
    
    etiqueta3=new JLabel();
    etiqueta3.setOpaque(true);
    etiqueta3.setHorizontalAlignment(SwingConstants.CENTER);
    etiqueta3.setText("PRECIO");
    etiqueta3.setBounds(330, 100, 90, 25);
    etiqueta3.setBackground(Color.ORANGE);
    etiqueta3.setForeground(Color.WHITE);
    etiqueta3.setFont(new Font("cooper black",Font.ITALIC,12));
    panel.add(etiqueta3);
    
    etiqueta4=new JLabel();
    etiqueta4.setOpaque(true);
    etiqueta4.setHorizontalAlignment(SwingConstants.CENTER);
    etiqueta4.setText("Operaciones");
    etiqueta4.setBounds(30, 310, 90, 25);
    etiqueta4.setBackground(Color.ORANGE);
    etiqueta4.setForeground(Color.WHITE);
    etiqueta4.setFont(new Font("Arial",Font.ITALIC,12));
    panel.add(etiqueta4);
    
    etiqueta5=new JLabel();
    etiqueta5.setOpaque(true);
    etiqueta5.setHorizontalAlignment(SwingConstants.CENTER);
    etiqueta5.setText("Cálculos");
    etiqueta5.setBounds(30, 440, 90, 25);
    etiqueta5.setBackground(Color.ORANGE);
    etiqueta5.setForeground(Color.WHITE);
    etiqueta5.setFont(new Font("Arial",Font.ITALIC,12));
    panel.add(etiqueta5);
    
    etiqueta5=new JLabel();
    etiqueta5.setOpaque(true);
    etiqueta5.setHorizontalAlignment(SwingConstants.CENTER);
    etiqueta5.setText("Cálculos");
    etiqueta5.setBounds(30, 440, 90, 25);
    etiqueta5.setBackground(Color.ORANGE);
    etiqueta5.setForeground(Color.WHITE);
    etiqueta5.setFont(new Font("Arial",Font.ITALIC,12));
    panel.add(etiqueta5);
    
    //Etiquitas Calculos
     ingre=new JLabel();
    ingre.setOpaque(true);
    ingre.setHorizontalAlignment(SwingConstants.CENTER);
    ingre.setText("Ingresos");
    ingre.setBounds(15, 480, 90, 25);
    ingre.setBackground(Color.gray);
    ingre.setForeground(Color.WHITE);
    ingre.setFont(new Font("Arial",Font.ITALIC,13));
    panel.add(ingre);
    
     proma=new JLabel();
    proma.setOpaque(true);
    proma.setHorizontalAlignment(SwingConstants.CENTER);
    proma.setText("Producto más vendido");
    proma.setBounds(15, 520, 140, 25);
    proma.setBackground(Color.gray);
    proma.setForeground(Color.WHITE);
    proma.setFont(new Font("Arial",Font.ITALIC,13));
    panel.add(proma);
    
     prome=new JLabel();
    prome.setOpaque(true);
    prome.setHorizontalAlignment(SwingConstants.CENTER);
    prome.setText("Producto menos vendido");
    prome.setBounds(15, 560, 155, 25);
    prome.setBackground(Color.gray);
    prome.setForeground(Color.WHITE);
    prome.setFont(new Font("Arial",Font.ITALIC,13));
    panel.add(prome);
    }
    
    private void lineasTexto(){
        //Lapiz
    p1=new JTextField();
    p1.setBounds(15, 140, 90, 25);
    p1.setText("lapiz");
    p1.setEditable(false);
    panel.add(p1);
        //Aspirina
    p2=new JTextField();
    p2.setBounds(15,180, 90,25);
    p2.setText("aspirina");
    p2.setEditable(false);
    panel.add(p2);
        //Borrador
    p3=new JTextField();
    p3.setBounds(15, 220, 90, 25);
    p3.setText("borrador");
    p3.setEditable(false);
    panel.add(p3);
        //Pan
    p4=new JTextField();
    p4.setBounds(15,260, 90,25);
    p4.setText("pan");
    p4.setEditable(false);
    panel.add(p4);
    
    //cantidad
    //Lapiz
    c1=new JTextField();
    c1.setBounds(120, 140, 90, 25);
    c1.setText("18");
    c1.setEditable(false);
    panel.add(c1);
        //Aspirina
    c2=new JTextField();
    c2.setBounds(120,180, 90,25);
    c2.setText("25");
    c2.setEditable(false);
    panel.add(c2);
        //Borrador
    c3=new JTextField();
    c3.setBounds(120, 220, 90, 25);
    c3.setText("30");
    c3.setEditable(false);
    panel.add(c3);
        //Pan
    c4=new JTextField();
    c4.setBounds(120,260, 90,25);
    c4.setText("15");
    c4.setEditable(false);
    panel.add(c4);
    
    //iva
        //Lapiz
    i1=new JTextField();
    i1.setBounds(225, 140, 90, 25);
    i1.setText("16.0%");
    i1.setEditable(false);
    panel.add(i1);
         //Aspirina
    i2=new JTextField();
    i2.setBounds(225,180, 90,25);
    i2.setText("12.0%");
    i2.setEditable(false);
    panel.add(i2);
         //Borrador
    i3=new JTextField();
    i3.setBounds(225, 220, 90, 25);
    i3.setText("16.0%");
    i3.setEditable(false);
    panel.add(i3);
        //Pan
    i4=new JTextField();
    i4.setBounds(225,260, 90,25);
    i4.setText("4.0%");
    i4.setEditable(false);
    panel.add(i4);
    
    //Precio
        //Lapiz
    pr1=new JTextField();
    pr1.setBounds(330, 140, 90, 25);
    pr1.setText("$550.0");
    pr1.setEditable(false);
    panel.add(pr1);
        //Aspirina
    pr2=new JTextField();
    pr2.setBounds(330,180, 90,25);
    pr2.setText("$109.5");
    pr2.setEditable(false);
    panel.add(pr2);
        //Borrador
    pr3=new JTextField();
    pr3.setBounds(330, 220, 90, 25);
    pr3.setText("$207.3");
    pr3.setEditable(false);
    panel.add(pr3);
        //Pan
    pr4=new JTextField();
    pr4.setBounds(330,260, 90,25);
    pr4.setText("$150.0");
    pr4.setEditable(false);
    panel.add(pr4);
    
    //Calculos
        //ingresos
    ing=new JTextField();
    ing.setBounds(230,480, 150,25);
    ing.setText("");
    panel.add(ing);
        //producto mas vendido
    promas=new JTextField();
    promas.setBounds(230,520, 150, 25);
    promas.setText("");
    panel.add(promas);
        //producto menos vendido
    promes=new JTextField();
    promes.setBounds(230,560, 150,25);
    promes.setText("");
    panel.add(promes);
    
    }
    
    private void botones(){
    botonIns=new JButton();
    botonIns.setText("Vender Producto");
    botonIns.setBounds(150,350,140,35);
    botonIns.setBackground(Color.BLACK);
    botonIns.setForeground(Color.WHITE);
    panel.add(botonIns);
    
   botonIni=new JButton();
    botonIni.setText("Pedir Producto");
    botonIni.setBounds(160,390,120,35);
    botonIni.setBackground(Color.BLACK);
    botonIni.setForeground(Color.WHITE);
    panel.add(botonIni);
   
   
    botonIns.addActionListener(this);
    botonIni.addActionListener(this);
    
    }
     @Override
    public void actionPerformed(ActionEvent e) {
        char pregunta;int cant;
        if(e.getSource()==botonIns){
           do {
            int opc=Integer.parseInt(JOptionPane.showInputDialog("Ingrese tipo de producto"+"\n1. Lapices \n2. Aspirinas \n3. Borradores \n4. Panes"));
            switch(opc){
                case 1:
                    
                    if (Integer.parseInt(c1.getText())>0) {
                    cant=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Cantidad de lapices"));
                    lapiz=new Producto(cant, 16.0, 550.0);
                    JOptionPane.showMessageDialog(null,"El precio Total es de $: "+lapiz.calcularPrecio());
                    
                    int lapices=Integer.parseInt(c1.getText());
                    lapices-=cant;
                    c1.setText(String.valueOf(lapices));    
                    } else {
                        JOptionPane.showMessageDialog(null,"No hay más disponibles");
                    }
                    break;
                case 2:
                    
                    if (Integer.parseInt(c2.getText())>0) {
                    cant=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Cantidad de Aspirinas"));
                    aspirina=new Producto(cant, 12.0, 109.5);
                    JOptionPane.showMessageDialog(null,"El precio Total es de $: "+aspirina.calcularPrecio());
                    int aspirinas=Integer.parseInt(c2.getText());
                    aspirinas-=cant;
                    c2.setText(String.valueOf(aspirinas)); 
                    } else {
                         JOptionPane.showMessageDialog(null,"No hay más disponibles");
                    }
                    break;
                case 3:
                   
                    if (Integer.parseInt(c3.getText())>0) {
                    cant=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Cantidad de Borradores"));
                    borrador=new Producto(cant, 16.0, 207.3);
                    JOptionPane.showMessageDialog(null,"El precio Total es de $: "+borrador.calcularPrecio());
                    int borradores=Integer.parseInt(c3.getText());
                    borradores-=cant;
                    c3.setText(String.valueOf(borradores));
                    } else {
                        JOptionPane.showMessageDialog(null,"No hay más disponibles");
                    }
                    break;
                case 4:
                              
                    if (Integer.parseInt(c4.getText())>0) {
                    cant=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Cantidad de Panes"));
                    pan=new Producto(cant, 4.0, 150.0);
                    JOptionPane.showMessageDialog(null,"El precio Total es de $: "+pan.calcularPrecio());
                    int panes=Integer.parseInt(c4.getText());
                    panes-=cant;
                    c4.setText(String.valueOf(panes));
                    } else {
                        JOptionPane.showMessageDialog(null,"No hay más disponibles");
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Error al ingresar producto");
                    break;
                                           
            }
            String preguna=JOptionPane.showInputDialog("Desea Comprar otro producto s/n");
            pregunta= preguna.charAt(0);
                    } while (pregunta=='s');
            
            }
           // lapiz=new Producto();
        //Mandar a metodo;
        
         if(e.getSource()==botonIni){
             
            //Mandar a metodo;
        }
       

    }

}
