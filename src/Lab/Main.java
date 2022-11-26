package Lab;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.util.Random;
public class Main extends javax.swing.JFrame {
    Random r = new Random();

    public Main() {
        initComponents();
        usuarios.add( new Admin ("admin", "password") );
        usuarios.add( new General ("username", "fifa2022") );
    }
    ArrayList<Usuario> usuarios = new ArrayList();
    ArrayList<Seleccion> equipos = new ArrayList();
    ArrayList<Jugador> jugadores = new ArrayList();
    
    ArrayList<Seleccion> Grupo1 = new ArrayList();
    ArrayList<Seleccion> Grupo2 = new ArrayList();
    ArrayList<Seleccion> Grupo3 = new ArrayList();
    ArrayList<Seleccion> Grupo4 = new ArrayList();
    
    ArrayList<Seleccion> Local = new ArrayList();
    ArrayList<Seleccion> Visita = new ArrayList();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdminPanel = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Partido_Local = new javax.swing.JComboBox<>();
        Partido_Visita = new javax.swing.JComboBox<>();
        Local_Posesion = new javax.swing.JFormattedTextField();
        Visita_Posesion = new javax.swing.JFormattedTextField();
        Local_Resultado = new javax.swing.JFormattedTextField();
        Visita_Resultado = new javax.swing.JFormattedTextField();
        Local_Faltas = new javax.swing.JFormattedTextField();
        Visita_Faltas = new javax.swing.JFormattedTextField();
        Local_Tiros = new javax.swing.JFormattedTextField();
        Visita_Tiros = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Seleccion_Nombre = new javax.swing.JFormattedTextField();
        Seleccion_Agregar = new javax.swing.JButton();
        Jugador_Seleccion = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Jugador_Nombre = new javax.swing.JFormattedTextField();
        Jugador_Posicion = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Jugador_Grupo = new javax.swing.JComboBox<>();
        Jugador_Agregador = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jugador_Text = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        Admin_Grupo1 = new javax.swing.JComboBox<>();
        Admin_Grupo2 = new javax.swing.JComboBox<>();
        Admin_Grupo3 = new javax.swing.JComboBox<>();
        Admin_Grupo4 = new javax.swing.JComboBox<>();
        Admin_Agregar1 = new javax.swing.JButton();
        Admin_Agregar2 = new javax.swing.JButton();
        Admin_Agregar3 = new javax.swing.JButton();
        Admin_Agregar4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Grupo_Seleccion = new javax.swing.JComboBox<>();
        GeneralPanel = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_Posiciones = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tabla_Estadisticas = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Tabla_Goleadores = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla_Equipo = new javax.swing.JTable();
        LoginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Username = new javax.swing.JFormattedTextField();
        Login = new javax.swing.JButton();
        Password = new javax.swing.JFormattedTextField();

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Local");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Visita");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Simulacion de Partido");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Posesion");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Resultado");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Faltas");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Tiros");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Local_Faltas, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Local_Posesion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Local_Resultado, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Partido_Local, javax.swing.GroupLayout.Alignment.LEADING, 0, 138, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Local_Tiros, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                .addComponent(Partido_Visita, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Visita_Resultado)
                                .addComponent(Visita_Faltas))
                            .addComponent(Visita_Tiros, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(140, 140, 140))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Visita_Posesion, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Partido_Local, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Partido_Visita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Local_Posesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(Visita_Posesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Local_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Visita_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Local_Faltas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Visita_Faltas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Local_Tiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Visita_Tiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("Partido", jPanel1);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nombre de Seleccion");

        Seleccion_Agregar.setText("Agregar");
        Seleccion_Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Seleccion_AgregarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                            .addComponent(Seleccion_Nombre)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(Seleccion_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(51, 51, 51)
                .addComponent(Seleccion_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(Seleccion_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar Seleccion", jPanel2);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nombre");

        Jugador_Posicion.setModel(new javax.swing.SpinnerNumberModel(1, 1, 26, 1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Posicion");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Seleccion");

        Jugador_Agregador.setText("Agregar");
        Jugador_Agregador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jugador_Agregador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jugador_AgregadorMouseClicked(evt);
            }
        });

        Jugador_Text.setColumns(20);
        Jugador_Text.setRows(5);
        jScrollPane1.setViewportView(Jugador_Text);

        javax.swing.GroupLayout Jugador_SeleccionLayout = new javax.swing.GroupLayout(Jugador_Seleccion);
        Jugador_Seleccion.setLayout(Jugador_SeleccionLayout);
        Jugador_SeleccionLayout.setHorizontalGroup(
            Jugador_SeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jugador_SeleccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Jugador_SeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jugador_Nombre, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jugador_Agregador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(Jugador_SeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Jugador_SeleccionLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(Jugador_SeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Jugador_Posicion)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                        .addGap(110, 110, 110)
                        .addGroup(Jugador_SeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(Jugador_Grupo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Jugador_SeleccionLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        Jugador_SeleccionLayout.setVerticalGroup(
            Jugador_SeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jugador_SeleccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Jugador_SeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Jugador_SeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(Jugador_SeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jugador_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jugador_Posicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jugador_Grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(Jugador_SeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Jugador_SeleccionLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Jugador_SeleccionLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(Jugador_Agregador)))
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("Agregar Jugador", Jugador_Seleccion);

        Admin_Grupo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_Grupo4ActionPerformed(evt);
            }
        });

        Admin_Agregar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Admin_Agregar1.setText("Agregar");
        Admin_Agregar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Admin_Agregar2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Admin_Agregar2.setText("Agregar");
        Admin_Agregar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Admin_Agregar3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Admin_Agregar3.setText("Agregar");
        Admin_Agregar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Admin_Agregar4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Admin_Agregar4.setText("Agregar");
        Admin_Agregar4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Asignacion de Grupo");

        Grupo_Seleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(Grupo_Seleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Admin_Grupo1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(Admin_Agregar1)))
                .addGap(67, 67, 67)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Admin_Grupo2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(Admin_Agregar2)
                        .addGap(19, 19, 19)))
                .addGap(71, 71, 71)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Admin_Grupo3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(Admin_Agregar3)
                        .addGap(22, 22, 22)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Admin_Grupo4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(Admin_Agregar4)
                        .addGap(26, 26, 26)))
                .addGap(40, 40, 40))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Grupo_Seleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Admin_Grupo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Admin_Grupo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Admin_Grupo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Admin_Grupo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Admin_Agregar4)
                    .addComponent(Admin_Agregar3)
                    .addComponent(Admin_Agregar2)
                    .addComponent(Admin_Agregar1))
                .addGap(107, 107, 107))
        );

        jTabbedPane1.addTab("Asignar Grupo", jPanel4);

        javax.swing.GroupLayout AdminPanelLayout = new javax.swing.GroupLayout(AdminPanel.getContentPane());
        AdminPanel.getContentPane().setLayout(AdminPanelLayout);
        AdminPanelLayout.setHorizontalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        AdminPanelLayout.setVerticalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        Tabla_Posiciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(Tabla_Posiciones);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Tabla de Posiciones", jPanel6);

        Tabla_Estadisticas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(Tabla_Estadisticas);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Estadisticas por Equipo", jPanel8);

        Tabla_Goleadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(Tabla_Goleadores);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Tabla de Goleadores", jPanel9);

        Tabla_Equipo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(Tabla_Equipo);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Partidos por Equipo", jPanel7);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        javax.swing.GroupLayout GeneralPanelLayout = new javax.swing.GroupLayout(GeneralPanel.getContentPane());
        GeneralPanel.getContentPane().setLayout(GeneralPanelLayout);
        GeneralPanelLayout.setHorizontalGroup(
            GeneralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        GeneralPanelLayout.setVerticalGroup(
            GeneralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LoginPanel.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Password");

        Login.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Login.setText("Ingresar");
        Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
        });
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(68, 68, 68)
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Username, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(Login)
                            .addComponent(Password))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(Login)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked
        
        String us = Username.getText();
        String pa = Password.getText();
        boolean bonito = false;
        for (int i = 0; i < usuarios.size(); i++){
            if (us.equals(usuarios.get(i).getUsername() ) && pa.equals(usuarios.get(i).getPassword() ) ){
                if (usuarios.get(i) instanceof Admin){
                    showAdminPanel();
                    bonito = true;
                } else if (usuarios.get(i) instanceof General){
                    bonito = true;
                }
            }
        }
        if (bonito == false){
            JOptionPane.showMessageDialog(this, "No existe este usuario");
        }

    }//GEN-LAST:event_LoginMouseClicked

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginActionPerformed

    private void Admin_Grupo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_Grupo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Admin_Grupo4ActionPerformed

    private void Seleccion_AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Seleccion_AgregarMouseClicked
        DefaultComboBoxModel Selecciones = (DefaultComboBoxModel) Grupo_Seleccion.getModel();
        DefaultComboBoxModel Sel = (DefaultComboBoxModel) Jugador_Grupo.getModel(); 
        
        String nombre = Seleccion_Nombre.getText();
        ArrayList<Jugador> Jugadores = new ArrayList();
        boolean repeticion = false;
        if (equipos.isEmpty() ){
            equipos.add(new Seleccion(nombre, 0, 0, 0 , 0, 0 , 0 , 0, Jugadores) );
            JOptionPane.showMessageDialog(this, "Seleccion Creada Exitosamente");
            try {
                escribirGrupos();
            } catch (IOException ex) {
                System.out.println("Oops");
            }
        }else{
            for (int i = 0; i < equipos.size(); i++){
                if (nombre.equalsIgnoreCase(equipos.get(i).getNombre() ) ){
                    repeticion = true;
                }
            }
            if (repeticion == true){
                JOptionPane.showMessageDialog(this, "Repeticion Detectada");
            }else{
                JOptionPane.showMessageDialog(this, "Seleccion Creada Exitosamente");
            try {
                escribirGrupos();
            } catch (IOException ex) {
                System.out.println("Oops");
            }
            }
        }
        Seleccion_Nombre.setText("");
       Sel = new DefaultComboBoxModel(equipos.toArray());
       Grupo_Seleccion.setModel(Sel);
       Jugador_Grupo.setModel(Sel);
    }//GEN-LAST:event_Seleccion_AgregarMouseClicked

    private void Jugador_AgregadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jugador_AgregadorMouseClicked
    
    try{    
        String nombre = Jugador_Nombre.getText();
        int posicion = (Integer) Jugador_Posicion.getValue();
        String dorse = "";
        for (int i = 0; i < 8; i++){
            dorse += r.nextInt(9);
        }
        int dorsal = Integer.parseInt(dorse);
        if (posicion == 1 || posicion == 13 || posicion == 26){
            Portero p = new Portero(nombre, dorsal, 0, 0, 0, 0, 0, 0, 0, posicion, 0);
            jugadores.add(p);
            equipos.get(Jugador_Grupo.getSelectedIndex() ).getJugadores().add(p);
            escribirJugadores();
            escribirEquipos();
        }else{
            Jugador j = new Jugador(nombre, dorsal, 0, 0, 0, 0, 0, 0, 0, posicion );
            jugadores.add(j);
            equipos.get(Jugador_Grupo.getSelectedIndex() ).getJugadores().add(j);
            escribirJugadores();
            escribirEquipos();
        }
    } catch(Exception e){
        System.out.println("Oops");
    }
    Jugador_Nombre.setText("");
    }//GEN-LAST:event_Jugador_AgregadorMouseClicked
    

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
                
            }
        });
        
    }

    public void showAdminPanel() {
        AdminPanel.setModal(true);
        AdminPanel.pack();
        AdminPanel.setLocationRelativeTo(this);
        AdminPanel.setVisible(true);
    }

    public void showGeneraPanel() {
        GeneralPanel.setModal(true);
        GeneralPanel.pack();
        GeneralPanel.setLocationRelativeTo(this);
        GeneralPanel.setVisible(true);
    }

    public void escribirEquipos() throws IOException {
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        String temp = "";
        for (int i = 0; i < equipos.size(); i++) {
            temp += equipos.get(i).toString() + "\n";
        }
        try {
            archivo = new File("./Seleccion.txt");
            fw = new FileWriter(archivo);
            bw = new BufferedWriter(fw);
            bw.write(temp);
            bw.newLine();
            bw.flush();

        } catch (Exception e) {
            System.out.println("Oops");
        }
        bw.close();
        fw.close();
    }
    
    public void escribirJugadores() throws IOException {
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        String temp = "";
        for (int i = 0; i < jugadores.size(); i++) {
            temp += jugadores.get(i).toString() + "\n";
        }
        try {
            archivo = new File("./Jugadores.txt");
            fw = new FileWriter(archivo);
            bw = new BufferedWriter(fw);
            bw.write(temp);
            bw.newLine();
            bw.flush();

        } catch (Exception e) {
            System.out.println("Oops");
        }
        bw.close();
        fw.close();
    }
    
    public void escribirGrupos() throws IOException {
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        String temp = "Grupo 1" + "\n";
        for (int i = 0; i < Grupo1.size(); i++) {
            temp += Grupo1.get(i).toString() + "\n";
        }
        temp += "Grupo 2" + "\n";
        for (int i = 0; i < Grupo2.size(); i++){
            temp += Grupo2.get(i).toString() + "\n";
        }
        temp += "Grupo 3" + "\n";
        for (int i = 0; i < Grupo3.size(); i++){
            temp += Grupo3.get(i).toString() + "\n";
        }
        temp += "Grupo 4" + "\n";
        for (int i = 0; i < Grupo4.size(); i++){
            temp += Grupo4.get(i).toString() + "\n";
        }
        try {
            archivo = new File("./Grupos.txt");
            fw = new FileWriter(archivo);
            bw = new BufferedWriter(fw);
            bw.write(temp);
            bw.newLine();
            bw.flush();

        } catch (Exception e) {
            System.out.println("Oops");
        }
        bw.close();
        fw.close();
    }
    public void escribirPartido() throws IOException {
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        String temp = "Equipo Local" + "\n";
        for (int i = 0; i < Local.size(); i++) {
            temp += Local.get(i).toString() + "\n";
        }
        temp += "Equipo Visita" + "\n";
        for (int i = 0; i < Visita.size() ; i++){
            temp += Visita.get(i).toString() + "\n";
        }
        try {
            archivo = new File("./Partido.txt");
            fw = new FileWriter(archivo);
            bw = new BufferedWriter(fw);
            bw.write(temp);
            bw.newLine();
            bw.flush();

        } catch (Exception e) {
            System.out.println("Oops");
        }
        bw.close();
        fw.close();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog AdminPanel;
    private javax.swing.JButton Admin_Agregar1;
    private javax.swing.JButton Admin_Agregar2;
    private javax.swing.JButton Admin_Agregar3;
    private javax.swing.JButton Admin_Agregar4;
    private javax.swing.JComboBox<String> Admin_Grupo1;
    private javax.swing.JComboBox<String> Admin_Grupo2;
    private javax.swing.JComboBox<String> Admin_Grupo3;
    private javax.swing.JComboBox<String> Admin_Grupo4;
    private javax.swing.JDialog GeneralPanel;
    private javax.swing.JComboBox<String> Grupo_Seleccion;
    private javax.swing.JButton Jugador_Agregador;
    private javax.swing.JComboBox<String> Jugador_Grupo;
    private javax.swing.JFormattedTextField Jugador_Nombre;
    private javax.swing.JSpinner Jugador_Posicion;
    private javax.swing.JPanel Jugador_Seleccion;
    private javax.swing.JTextArea Jugador_Text;
    private javax.swing.JFormattedTextField Local_Faltas;
    private javax.swing.JFormattedTextField Local_Posesion;
    private javax.swing.JFormattedTextField Local_Resultado;
    private javax.swing.JFormattedTextField Local_Tiros;
    private javax.swing.JButton Login;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JComboBox<String> Partido_Local;
    private javax.swing.JComboBox<String> Partido_Visita;
    private javax.swing.JFormattedTextField Password;
    private javax.swing.JButton Seleccion_Agregar;
    private javax.swing.JFormattedTextField Seleccion_Nombre;
    private javax.swing.JTable Tabla_Equipo;
    private javax.swing.JTable Tabla_Estadisticas;
    private javax.swing.JTable Tabla_Goleadores;
    private javax.swing.JTable Tabla_Posiciones;
    private javax.swing.JFormattedTextField Username;
    private javax.swing.JFormattedTextField Visita_Faltas;
    private javax.swing.JFormattedTextField Visita_Posesion;
    private javax.swing.JFormattedTextField Visita_Resultado;
    private javax.swing.JFormattedTextField Visita_Tiros;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}
