
package ativaval1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class IntGraf2D extends javax.swing.JFrame{
    ArrayList<Triangulo> triangs = new ArrayList();
    ArrayList<Retangulo> retangs = new ArrayList();
    ArrayList<Circulo> circs = new ArrayList();
    ArrayList<Trapezoide> traps = new ArrayList();
  
    public IntGraf2D() {
        
        initComponents();
        pTitulo.setVisible(true);
        pTri.setVisible(false);
        pCirc.setVisible(false);
        pRet.setVisible(false);
        pTrap.setVisible(false);
        /*
        lbCirNome.setVisible(true);
            CirNome.setVisible(true);
            lbCirRaio.setVisible(true);
            CirRaio.setVisible(true);
            CircArea.setVisible(true);
            CircPerim.setVisible(true);
            Circulo.setVisible(true);
            
            lbRetNome.setVisible(false);
            RetNome.setVisible(false);
            lbRetBase.setVisible(false);
            RetBase.setVisible(false);
            lbRetAltura.setVisible(false);
            RetAltura.setVisible(false);
            RetArea.setVisible(false);
            RetPerim.setVisible(false);
            Retangulo.setVisible(false);
            
            lbTrapNome.setVisible(false);
            TrapNome.setVisible(false);
            lbTrapB1.setVisible(false);
            TrapB1.setVisible(false);
            lbTrapB2.setVisible(false);
            TrapB2.setVisible(false);
            lbTrapAltura.setVisible(false);
            TrapAltura.setVisible(false);
            TrapArea.setVisible(false);
            TrapPerim.setVisible(false);
            Trapezio.setVisible(false);
            
            lbTriNome.setVisible(false);
            TriNome.setVisible(false);
            lbTriBase.setVisible(false);
            TriBase.setVisible(false);
            lbTriAltura.setVisible(false);
            TriAltura.setVisible(false);
            TriArea.setVisible(false);
            TriPerim.setVisible(false);
            Triangulo.setVisible(false);*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pTri = new javax.swing.JPanel();
        lbTriBase = new javax.swing.JLabel();
        lbTriAltura = new javax.swing.JLabel();
        TriAltura = new javax.swing.JTextField();
        TriPerim = new javax.swing.JButton();
        TriArea = new javax.swing.JButton();
        lbTriNome = new javax.swing.JLabel();
        Triangulo = new javax.swing.JButton();
        TriNome = new javax.swing.JTextField();
        TriBase = new javax.swing.JTextField();
        pCirc = new javax.swing.JPanel();
        lbCirRaio = new javax.swing.JLabel();
        CircPerim = new javax.swing.JButton();
        CirNome = new javax.swing.JTextField();
        CircArea = new javax.swing.JButton();
        CirRaio = new javax.swing.JTextField();
        Circulo = new javax.swing.JButton();
        lbCirNome = new javax.swing.JLabel();
        pTrap = new javax.swing.JPanel();
        lbTrapB1 = new javax.swing.JLabel();
        lbTrapB2 = new javax.swing.JLabel();
        TrapB1 = new javax.swing.JTextField();
        lbTrapAltura = new javax.swing.JLabel();
        TrapB2 = new javax.swing.JTextField();
        TrapArea = new javax.swing.JButton();
        TrapAltura = new javax.swing.JTextField();
        TrapNome = new javax.swing.JTextField();
        TrapPerim = new javax.swing.JButton();
        Trapezio = new javax.swing.JButton();
        lbTrapNome = new javax.swing.JLabel();
        pRet = new javax.swing.JPanel();
        lbRetBase = new javax.swing.JLabel();
        lbRetAltura = new javax.swing.JLabel();
        RetAltura = new javax.swing.JTextField();
        RetBase = new javax.swing.JTextField();
        RetArea = new javax.swing.JButton();
        RetNome = new javax.swing.JTextField();
        RetPerim = new javax.swing.JButton();
        lbRetNome = new javax.swing.JLabel();
        Retangulo = new javax.swing.JButton();
        pTitulo = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        opcao = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formas 2D");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setRequestFocusEnabled(false);

        pTri.setPreferredSize(new java.awt.Dimension(367, 189));

        lbTriBase.setText("Base:");
        lbTriBase.setAlignmentX(0.5F);
        lbTriBase.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbTriAltura.setText("Altura:");
        lbTriAltura.setAlignmentX(0.5F);
        lbTriAltura.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        TriAltura.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        TriPerim.setText("Perímetro");
        TriPerim.setAlignmentX(0.5F);
        TriPerim.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TriPerim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TriPerimActionPerformed(evt);
            }
        });

        TriArea.setText("Area");
        TriArea.setAlignmentX(0.5F);
        TriArea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TriArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TriAreaActionPerformed(evt);
            }
        });

        lbTriNome.setText("Nome:");
        lbTriNome.setAlignmentX(0.5F);
        lbTriNome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Triangulo.setText("+Triangulo");
        Triangulo.setAlignmentX(0.5F);
        Triangulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Triangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrianguloActionPerformed(evt);
            }
        });

        TriNome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TriNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TriNomeActionPerformed(evt);
            }
        });

        TriBase.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout pTriLayout = new javax.swing.GroupLayout(pTri);
        pTri.setLayout(pTriLayout);
        pTriLayout.setHorizontalGroup(
            pTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTriLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TriArea, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbTriNome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbTriBase, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbTriAltura, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TriNome, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TriBase, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pTriLayout.createSequentialGroup()
                        .addComponent(Triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TriPerim))
                    .addComponent(TriAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pTriLayout.setVerticalGroup(
            pTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTriLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Triangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TriPerim)
                    .addComponent(TriArea))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TriNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTriNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TriBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTriBase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pTriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TriAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTriAltura))
                .addGap(124, 124, 124))
        );

        pCirc.setPreferredSize(new java.awt.Dimension(367, 189));

        lbCirRaio.setText("Raio:");
        lbCirRaio.setAlignmentX(0.5F);

        CircPerim.setText("Perímetro");
        CircPerim.setAlignmentX(0.5F);
        CircPerim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CircPerimActionPerformed(evt);
            }
        });

        CircArea.setText("Area");
        CircArea.setAlignmentX(0.5F);
        CircArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CircAreaActionPerformed(evt);
            }
        });

        Circulo.setText("+Circulo");
        Circulo.setAlignmentX(0.5F);
        Circulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CirculoActionPerformed(evt);
            }
        });

        lbCirNome.setText("Nome:");
        lbCirNome.setAlignmentX(0.5F);

        javax.swing.GroupLayout pCircLayout = new javax.swing.GroupLayout(pCirc);
        pCirc.setLayout(pCircLayout);
        pCircLayout.setHorizontalGroup(
            pCircLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCircLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCircLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbCirRaio)
                    .addComponent(lbCirNome)
                    .addComponent(CircArea))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCircLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Circulo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CirNome)
                    .addComponent(CirRaio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CircPerim)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pCircLayout.setVerticalGroup(
            pCircLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCircLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCircLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Circulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CircArea)
                    .addComponent(CircPerim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pCircLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CirNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCirNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pCircLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CirRaio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCirRaio))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        lbTrapB1.setText("Base 1:");
        lbTrapB1.setAlignmentX(0.5F);

        lbTrapB2.setText("Base 2:");
        lbTrapB2.setAlignmentX(0.5F);

        lbTrapAltura.setText("Altura:");
        lbTrapAltura.setAlignmentX(0.5F);

        TrapArea.setText("Area");
        TrapArea.setAlignmentX(0.5F);
        TrapArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrapAreaActionPerformed(evt);
            }
        });

        TrapPerim.setText("Perímetro");
        TrapPerim.setAlignmentX(0.5F);
        TrapPerim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrapPerimActionPerformed(evt);
            }
        });

        Trapezio.setText("+Trapezio");
        Trapezio.setAlignmentX(0.5F);
        Trapezio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrapezioActionPerformed(evt);
            }
        });

        lbTrapNome.setText("Nome:");
        lbTrapNome.setAlignmentX(0.5F);

        javax.swing.GroupLayout pTrapLayout = new javax.swing.GroupLayout(pTrap);
        pTrap.setLayout(pTrapLayout);
        pTrapLayout.setHorizontalGroup(
            pTrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTrapLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pTrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pTrapLayout.createSequentialGroup()
                        .addComponent(lbTrapAltura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TrapAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pTrapLayout.createSequentialGroup()
                        .addGroup(pTrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbTrapNome)
                            .addComponent(lbTrapB1)
                            .addComponent(lbTrapB2)
                            .addComponent(TrapArea))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pTrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TrapB1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pTrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TrapNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Trapezio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TrapB2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TrapPerim)
                .addGap(63, 63, 63))
        );
        pTrapLayout.setVerticalGroup(
            pTrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTrapLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pTrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Trapezio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TrapArea)
                    .addComponent(TrapPerim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pTrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbTrapNome)
                    .addComponent(TrapNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(pTrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TrapB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTrapB1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pTrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTrapB2)
                    .addComponent(TrapB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pTrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TrapAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTrapAltura))
                .addContainerGap())
        );

        pRet.setPreferredSize(new java.awt.Dimension(367, 189));

        lbRetBase.setText("Base:");
        lbRetBase.setAlignmentX(0.5F);

        lbRetAltura.setText("Altura:");
        lbRetAltura.setAlignmentX(0.5F);

        RetAltura.setAutoscrolls(false);

        RetBase.setAutoscrolls(false);

        RetArea.setText("Area");
        RetArea.setAlignmentX(0.5F);
        RetArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetAreaActionPerformed(evt);
            }
        });

        RetNome.setAutoscrolls(false);

        RetPerim.setText("Perímetro");
        RetPerim.setAlignmentX(0.5F);
        RetPerim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetPerimActionPerformed(evt);
            }
        });

        lbRetNome.setText("Nome:");
        lbRetNome.setAlignmentX(0.5F);

        Retangulo.setText("+Retangulo");
        Retangulo.setAlignmentX(0.5F);
        Retangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetanguloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pRetLayout = new javax.swing.GroupLayout(pRet);
        pRet.setLayout(pRetLayout);
        pRetLayout.setHorizontalGroup(
            pRetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRetLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pRetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pRetLayout.createSequentialGroup()
                        .addComponent(lbRetAltura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RetAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pRetLayout.createSequentialGroup()
                        .addGroup(pRetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pRetLayout.createSequentialGroup()
                                .addComponent(RetArea)
                                .addGap(6, 6, 6))
                            .addGroup(pRetLayout.createSequentialGroup()
                                .addComponent(lbRetNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(pRetLayout.createSequentialGroup()
                                .addComponent(lbRetBase)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(pRetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RetBase, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RetNome, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Retangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RetPerim)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        pRetLayout.setVerticalGroup(
            pRetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pRetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Retangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RetArea)
                    .addComponent(RetPerim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pRetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RetNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRetNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pRetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RetBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRetBase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pRetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RetAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRetAltura))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        Titulo.setBackground(new java.awt.Color(255, 255, 255));
        Titulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("Inserir formas 2D");

        opcao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        opcao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Circulo", "Retangulo", "Trapezio", "Triangulo" }));
        opcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pTituloLayout = new javax.swing.GroupLayout(pTitulo);
        pTitulo.setLayout(pTituloLayout);
        pTituloLayout.setHorizontalGroup(
            pTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTituloLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(pTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titulo)
                    .addGroup(pTituloLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(opcao, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );
        pTituloLayout.setVerticalGroup(
            pTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTituloLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pTri, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pCirc, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pTrap, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pRet, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(pTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(pTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pTrap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pRet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pCirc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void opcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoActionPerformed
        if(opcao.getSelectedItem().equals("Circulo") ){
            pCirc.setVisible(true);
                pRet.setVisible(false);
                    pTrap.setVisible(false);
                        pTri.setVisible(false);
            /*lbCirNome.setVisible(true);
            CirNome.setVisible(true);
            lbCirRaio.setVisible(true);
            CirRaio.setVisible(true);
            CircArea.setVisible(true);
            CircPerim.setVisible(true);
            Circulo.setVisible(true);

            lbRetNome.setVisible(false);
            RetNome.setVisible(false);
            lbRetBase.setVisible(false);
            RetBase.setVisible(false);
            lbRetAltura.setVisible(false);
            RetAltura.setVisible(false);
            RetArea.setVisible(false);
            RetPerim.setVisible(false);
            Retangulo.setVisible(false);

            lbTrapNome.setVisible(false);
            TrapNome.setVisible(false);
            lbTrapB1.setVisible(false);
            TrapB1.setVisible(false);
            lbTrapB2.setVisible(false);
            TrapB2.setVisible(false);
            lbTrapAltura.setVisible(false);
            TrapAltura.setVisible(false);
            TrapArea.setVisible(false);
            TrapPerim.setVisible(false);
            Trapezio.setVisible(false);

            lbTriNome.setVisible(false);
            TriNome.setVisible(false);
            lbTriBase.setVisible(false);
            TriBase.setVisible(false);
            lbTriAltura.setVisible(false);
            TriAltura.setVisible(false);
            TriArea.setVisible(false);
            TriPerim.setVisible(false);
            Triangulo.setVisible(false);*/
        }
        if(opcao.getSelectedItem().equals("Retangulo") ){
            pRet.setVisible(true);
                pTrap.setVisible(false);
                    pTri.setVisible(false);
                        pCirc.setVisible(false);
            /*lbCirNome.setVisible(false);
            CirNome.setVisible(false);
            lbCirRaio.setVisible(false);
            CirRaio.setVisible(false);
            CircArea.setVisible(false);
            CircPerim.setVisible(false);
            Circulo.setVisible(false);

            lbRetNome.setVisible(true);
            RetNome.setVisible(true);
            lbRetBase.setVisible(true);
            RetBase.setVisible(true);
            lbRetAltura.setVisible(true);
            RetAltura.setVisible(true);
            RetArea.setVisible(true);
            RetPerim.setVisible(true);
            Retangulo.setVisible(true);

            lbTrapNome.setVisible(false);
            TrapNome.setVisible(false);
            lbTrapB1.setVisible(false);
            TrapB1.setVisible(false);
            lbTrapB2.setVisible(false);
            TrapB2.setVisible(false);
            lbTrapAltura.setVisible(false);
            TrapAltura.setVisible(false);
            TrapArea.setVisible(false);
            TrapPerim.setVisible(false);
            Trapezio.setVisible(false);

            lbTriNome.setVisible(false);
            TriNome.setVisible(false);
            lbTriBase.setVisible(false);
            TriBase.setVisible(false);
            lbTriAltura.setVisible(false);
            TriAltura.setVisible(false);
            TriArea.setVisible(false);
            TriPerim.setVisible(false);
            Triangulo.setVisible(false);*/
        }
        if(opcao.getSelectedItem().equals("Trapezio") ){
            pTrap.setVisible(true);
                pTri.setVisible(false);
                    pRet.setVisible(false);
                        pCirc.setVisible(false);
            /*
            lbCirNome.setVisible(false);
            CirNome.setVisible(false);
            lbCirRaio.setVisible(false);
            CirRaio.setVisible(false);
            CircArea.setVisible(false);
            CircPerim.setVisible(false);
            Circulo.setVisible(false);

            lbRetNome.setVisible(false);
            RetNome.setVisible(false);
            lbRetBase.setVisible(false);
            RetBase.setVisible(false);
            lbRetAltura.setVisible(false);
            RetAltura.setVisible(false);
            RetArea.setVisible(false);
            RetPerim.setVisible(false);
            Retangulo.setVisible(false);

            lbTrapNome.setVisible(true);
            TrapNome.setVisible(true);
            lbTrapB1.setVisible(true);
            TrapB1.setVisible(true);
            lbTrapB2.setVisible(true);
            TrapB2.setVisible(true);
            lbTrapAltura.setVisible(true);
            TrapAltura.setVisible(true);
            TrapArea.setVisible(true);
            TrapPerim.setVisible(true);
            Trapezio.setVisible(true);

            lbTriNome.setVisible(false);
            TriNome.setVisible(false);
            lbTriBase.setVisible(false);
            TriBase.setVisible(false);
            lbTriAltura.setVisible(false);
            TriAltura.setVisible(false);
            TriArea.setVisible(false);
            TriPerim.setVisible(false);
            Triangulo.setVisible(false);*/
        }
        if(opcao.getSelectedItem().equals("Triangulo") ){
            pTri.setVisible(true);
                pRet.setVisible(false);
                    pCirc.setVisible(false);
                        pTrap.setVisible(false);
            /*lbCirNome.setVisible(false);
            CirNome.setVisible(false);
            lbCirRaio.setVisible(false);
            CirRaio.setVisible(false);
            CircArea.setVisible(false);
            CircPerim.setVisible(false);
            Circulo.setVisible(false);

            lbRetNome.setVisible(false);
            RetNome.setVisible(false);
            lbRetBase.setVisible(false);
            RetBase.setVisible(false);
            lbRetAltura.setVisible(false);
            RetAltura.setVisible(false);
            RetArea.setVisible(false);
            RetPerim.setVisible(false);
            Retangulo.setVisible(false);

            lbTrapNome.setVisible(false);
            TrapNome.setVisible(false);
            lbTrapB1.setVisible(false);
            TrapB1.setVisible(false);
            lbTrapB2.setVisible(false);
            TrapB2.setVisible(false);
            lbTrapAltura.setVisible(false);
            TrapAltura.setVisible(false);
            TrapArea.setVisible(false);
            TrapPerim.setVisible(false);
            Trapezio.setVisible(false);

            lbTriNome.setVisible(true);
            TriNome.setVisible(true);
            lbTriBase.setVisible(true);
            TriBase.setVisible(true);
            lbTriAltura.setVisible(true);
            TriAltura.setVisible(true);
            TriArea.setVisible(true);
            TriPerim.setVisible(true);
            Triangulo.setVisible(true);*/
        }
        if(opcao.getSelectedItem().equals("Selecione")){
        pTri.setVisible(false);
            pRet.setVisible(false);
                pCirc.setVisible(false);
                    pTrap.setVisible(false);
        }
    }//GEN-LAST:event_opcaoActionPerformed

    private void RetanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetanguloActionPerformed
        String retnome = RetNome.getText();
        String retbase = RetBase.getText();
        String retaltura = RetAltura.getText();
        
        Retangulo ret1 = new Retangulo(retnome, Double.parseDouble(retbase), Double.parseDouble(retaltura));
            retangs.add(ret1);
        JOptionPane.showMessageDialog(null, "Retangulo adicionado");
        
            RetNome.setText("");
            RetBase.setText("");
            RetAltura.setText("");
    }//GEN-LAST:event_RetanguloActionPerformed

    private void RetPerimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetPerimActionPerformed
        for(int i = 0; i < retangs.size();i++){
            String msg = "Perimetro do "+retangs.get(i).nome+": "+retangs.get(i).calcularPerimetro()+"\n";
            JOptionPane.showMessageDialog(null, msg);
        }
    }//GEN-LAST:event_RetPerimActionPerformed

    private void RetAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetAreaActionPerformed
        for(int i = 0; i < retangs.size();i++){
            String msg = "Area do "+retangs.get(i).nome+": "+retangs.get(i).calcularArea();
                JOptionPane.showMessageDialog(null, msg);
        }
    }//GEN-LAST:event_RetAreaActionPerformed

    private void TrapezioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrapezioActionPerformed
        String trapnome = TrapNome.getText();
        String trapb1 = TrapB1.getText();
        String trapb2 = TrapB2.getText();
        String trapaltura = TrapAltura.getText();
        Trapezoide trap1 = new Trapezoide(trapnome, Double.parseDouble(trapb1), Double.parseDouble(trapb2), Double.parseDouble(trapaltura));
        traps.add(trap1);
        JOptionPane.showMessageDialog(null, "Trapezio adicionado");
        TrapNome.setText("");
        TrapB1.setText("");
        TrapB2.setText("");
        TrapAltura.setText("");
    }//GEN-LAST:event_TrapezioActionPerformed

    private void TrapPerimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrapPerimActionPerformed
        for(int i = 0; i < traps.size();i++){
            String msg = "Perimetro do "+traps.get(i).nome+": "+traps.get(i).calcularPerimetro()+"\n";
            JOptionPane.showMessageDialog(null, msg);
        }

    }//GEN-LAST:event_TrapPerimActionPerformed

    private void TrapAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrapAreaActionPerformed
        for(int i = 0; i < traps.size();i++){
            String msg = "Area do "+traps.get(i).nome+": "+traps.get(i).calcularArea();
            JOptionPane.showMessageDialog(null, msg);
        }
    }//GEN-LAST:event_TrapAreaActionPerformed

    private void CirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CirculoActionPerformed
        String cirnome = CirNome.getText();
        String cirraio = CirRaio.getText();
        Circulo circ1 = new Circulo(cirnome, Double.parseDouble(cirraio));
        circs.add(circ1);
        JOptionPane.showMessageDialog(null, "Circulo adicionado");
        CirNome.setText("");
        CirRaio.setText("");
    }//GEN-LAST:event_CirculoActionPerformed

    private void CircAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CircAreaActionPerformed
        for(int i = 0; i < circs.size();i++){
            String msg = "Area do "+circs.get(i).nome+": "+circs.get(i).calcularArea();
            JOptionPane.showMessageDialog(null, msg);
        }
    }//GEN-LAST:event_CircAreaActionPerformed

    private void CircPerimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CircPerimActionPerformed
        for(int i = 0; i < circs.size();i++){
            String msg = "Perimetro do "+circs.get(i).nome+": "+circs.get(i).calcularPerimetro()+"\n";
            JOptionPane.showMessageDialog(null, msg);
        }
    }//GEN-LAST:event_CircPerimActionPerformed

    private void TriNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TriNomeActionPerformed

    }//GEN-LAST:event_TriNomeActionPerformed

    private void TrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrianguloActionPerformed
        String trinome = TriNome.getText();
        String tribase = TriBase.getText();
        String trialtura = TriAltura.getText();
        Triangulo tri1 = new Triangulo(trinome, Double.parseDouble(tribase), Double.parseDouble(trialtura));
        triangs.add(tri1);
        JOptionPane.showMessageDialog(null, "Triangulo adicionado");
        TriNome.setText("");
        TriBase.setText("");
        TriAltura.setText("");
    }//GEN-LAST:event_TrianguloActionPerformed

    private void TriAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TriAreaActionPerformed
        for(int i = 0; i < triangs.size();i++){
            String msg = "Area do "+triangs.get(i).nome+": "+triangs.get(i).calcularArea();
            JOptionPane.showMessageDialog(null, msg);
        }
    }//GEN-LAST:event_TriAreaActionPerformed

    private void TriPerimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TriPerimActionPerformed
        for(int i = 0; i < triangs.size();i++){
            String msg = "Perimetro do "+triangs.get(i).nome+": "+triangs.get(i).calcularPerimetro()+"\n";
            JOptionPane.showMessageDialog(null, msg);
        }
    }//GEN-LAST:event_TriPerimActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(IntGraf2D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntGraf2D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntGraf2D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntGraf2D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntGraf2D().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CirNome;
    private javax.swing.JTextField CirRaio;
    private javax.swing.JButton CircArea;
    private javax.swing.JButton CircPerim;
    private javax.swing.JButton Circulo;
    private javax.swing.JTextField RetAltura;
    private javax.swing.JButton RetArea;
    private javax.swing.JTextField RetBase;
    private javax.swing.JTextField RetNome;
    private javax.swing.JButton RetPerim;
    private javax.swing.JButton Retangulo;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextField TrapAltura;
    private javax.swing.JButton TrapArea;
    private javax.swing.JTextField TrapB1;
    private javax.swing.JTextField TrapB2;
    private javax.swing.JTextField TrapNome;
    private javax.swing.JButton TrapPerim;
    private javax.swing.JButton Trapezio;
    private javax.swing.JTextField TriAltura;
    private javax.swing.JButton TriArea;
    private javax.swing.JTextField TriBase;
    private javax.swing.JTextField TriNome;
    private javax.swing.JButton TriPerim;
    private javax.swing.JButton Triangulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCirNome;
    private javax.swing.JLabel lbCirRaio;
    private javax.swing.JLabel lbRetAltura;
    private javax.swing.JLabel lbRetBase;
    private javax.swing.JLabel lbRetNome;
    private javax.swing.JLabel lbTrapAltura;
    private javax.swing.JLabel lbTrapB1;
    private javax.swing.JLabel lbTrapB2;
    private javax.swing.JLabel lbTrapNome;
    private javax.swing.JLabel lbTriAltura;
    private javax.swing.JLabel lbTriBase;
    private javax.swing.JLabel lbTriNome;
    private javax.swing.JComboBox<String> opcao;
    private javax.swing.JPanel pCirc;
    private javax.swing.JPanel pRet;
    private javax.swing.JPanel pTitulo;
    private javax.swing.JPanel pTrap;
    private javax.swing.JPanel pTri;
    // End of variables declaration//GEN-END:variables

}
