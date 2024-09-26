package scenario;

import Pokemons.*;
import Classes.*;
import java.awt.Toolkit;
import java.util.Random;
import javax.swing.SwingUtilities;
/**
 *
 * @author eltho
 */
public class Battle extends javax.swing.JFrame {
       
    BattleController battleController = new BattleController();

    public Battle() {
        initComponents();
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/images.jpg")));
        
        //setVisual
        jp_btnAttacks.setVisible(false);
        jp_btnTroca.setVisible(false);
        jp_info.setVisible(false);

        //inicio de jogo
        battleController.gameInit();
        
        // Player
        AtualizarInfoBarJogador();
        //Enemy
        AtualizarInfoBarVilao();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_CaixaDeDialogo = new javax.swing.JPanel();
        lblTextBattle = new javax.swing.JLabel();
        jp_info = new javax.swing.JPanel();
        infoGolpeTipo = new javax.swing.JLabel();
        infoGolpeDano = new javax.swing.JLabel();
        infoGolpeAtributo = new javax.swing.JLabel();
        infoGolpeCusto = new javax.swing.JLabel();
        InfoGolpeNome = new javax.swing.JLabel();
        pb_Vida = new javax.swing.JProgressBar();
        pb_VidaOponente = new javax.swing.JProgressBar();
        pb_mana = new javax.swing.JProgressBar();
        pb_ManaOponente = new javax.swing.JProgressBar();
        mini_icon_poke6 = new javax.swing.JLabel();
        mini_icon_poke7 = new javax.swing.JLabel();
        mini_icon_poke8 = new javax.swing.JLabel();
        mini_icon_poke9 = new javax.swing.JLabel();
        mini_icon_poke10 = new javax.swing.JLabel();
        mini_icon_poke1 = new javax.swing.JLabel();
        mini_icon_poke2 = new javax.swing.JLabel();
        mini_icon_poke3 = new javax.swing.JLabel();
        mini_icon_poke4 = new javax.swing.JLabel();
        mini_icon_poke5 = new javax.swing.JLabel();
        iconTypeEnemy1 = new javax.swing.JLabel();
        iconTypeEnemy2 = new javax.swing.JLabel();
        iconTypePlayer1 = new javax.swing.JLabel();
        iconTypePlayer2 = new javax.swing.JLabel();
        lblNomePokemon = new javax.swing.JLabel();
        lblNomePokemonOponente = new javax.swing.JLabel();
        labelMPJogador = new javax.swing.JLabel();
        labelVidaJogador1 = new javax.swing.JLabel();
        labelVidaInimigo = new javax.swing.JLabel();
        labelMPInimigo = new javax.swing.JLabel();
        labelJogador = new javax.swing.JLabel();
        labelVilao = new javax.swing.JLabel();
        jp_btnAcoes = new javax.swing.JPanel();
        btnTrocar = new javax.swing.JButton();
        btnFlee = new javax.swing.JButton();
        btnDefend = new javax.swing.JButton();
        btnAttack = new javax.swing.JButton();
        jp_btnAttacks = new javax.swing.JPanel();
        lbl_type1 = new javax.swing.JLabel();
        lbl_type4 = new javax.swing.JLabel();
        lbl_type2 = new javax.swing.JLabel();
        lbl_type3 = new javax.swing.JLabel();
        btnGolpe1 = new javax.swing.JButton();
        btnGolpe2 = new javax.swing.JButton();
        btnGolpe3 = new javax.swing.JButton();
        btnGolpe4 = new javax.swing.JButton();
        jp_btnTroca = new javax.swing.JPanel();
        iconPoke1 = new javax.swing.JLabel();
        iconPoke2 = new javax.swing.JLabel();
        iconPoke3 = new javax.swing.JLabel();
        iconPoke4 = new javax.swing.JLabel();
        pb_iconPoke1HP = new javax.swing.JProgressBar();
        pb_iconPoke2HP = new javax.swing.JProgressBar();
        pb_iconPoke3HP = new javax.swing.JProgressBar();
        pb_iconPoke4HP = new javax.swing.JProgressBar();
        pb_iconPoke1Mana = new javax.swing.JProgressBar();
        pb_iconPoke2Mana = new javax.swing.JProgressBar();
        pb_iconPoke3Mana = new javax.swing.JProgressBar();
        pb_iconPoke4Mana = new javax.swing.JProgressBar();
        lbl_hpPoke1 = new javax.swing.JLabel();
        lbl_hpPoke2 = new javax.swing.JLabel();
        lbl_hpPoke3 = new javax.swing.JLabel();
        lbl_hpPoke4 = new javax.swing.JLabel();
        lbl_manaPoke1 = new javax.swing.JLabel();
        lbl_manaPoke2 = new javax.swing.JLabel();
        lbl_manaPoke3 = new javax.swing.JLabel();
        lbl_manaPoke4 = new javax.swing.JLabel();
        btnTroca1 = new javax.swing.JButton();
        btnTroca2 = new javax.swing.JButton();
        btnTroca3 = new javax.swing.JButton();
        btnTroca4 = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTextBattle.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        lblTextBattle.setText("O que o pokemon deve fazer?");

        infoGolpeTipo.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        infoGolpeTipo.setText("texto do golpe l1");

        infoGolpeDano.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        infoGolpeDano.setText("texto do golpe l2");

        infoGolpeAtributo.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        infoGolpeAtributo.setText("texto do golpe l3");

        infoGolpeCusto.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        infoGolpeCusto.setText("texto do golpe l4");

        InfoGolpeNome.setFont(new java.awt.Font("SansSerif", 1, 28)); // NOI18N
        InfoGolpeNome.setText("nome do golpe");

        javax.swing.GroupLayout jp_infoLayout = new javax.swing.GroupLayout(jp_info);
        jp_info.setLayout(jp_infoLayout);
        jp_infoLayout.setHorizontalGroup(
            jp_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_infoLayout.createSequentialGroup()
                .addGroup(jp_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoGolpeTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoGolpeDano, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoGolpeCusto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(infoGolpeAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(jp_infoLayout.createSequentialGroup()
                .addComponent(InfoGolpeNome, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_infoLayout.setVerticalGroup(
            jp_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_infoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InfoGolpeNome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jp_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoGolpeTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoGolpeAtributo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jp_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoGolpeCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoGolpeDano, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jp_CaixaDeDialogoLayout = new javax.swing.GroupLayout(jp_CaixaDeDialogo);
        jp_CaixaDeDialogo.setLayout(jp_CaixaDeDialogoLayout);
        jp_CaixaDeDialogoLayout.setHorizontalGroup(
            jp_CaixaDeDialogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_CaixaDeDialogoLayout.createSequentialGroup()
                .addGroup(jp_CaixaDeDialogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_CaixaDeDialogoLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblTextBattle))
                    .addGroup(jp_CaixaDeDialogoLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jp_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(275, 275, 275))
        );
        jp_CaixaDeDialogoLayout.setVerticalGroup(
            jp_CaixaDeDialogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_CaixaDeDialogoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblTextBattle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jp_CaixaDeDialogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 820, 230));

        pb_Vida.setBackground(new java.awt.Color(0, 0, 0));
        pb_Vida.setForeground(new java.awt.Color(0, 255, 51));
        getContentPane().add(pb_Vida, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 270, 10));

        pb_VidaOponente.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(pb_VidaOponente, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 140, 270, 10));

        pb_mana.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(pb_mana, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 270, 10));

        pb_ManaOponente.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(pb_ManaOponente, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 100, 270, 10));

        mini_icon_poke6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mini_icon/miniNoivern.png"))); // NOI18N
        getContentPane().add(mini_icon_poke6, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 150, -1, -1));

        mini_icon_poke7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mini_icon/miniGardevoir.png"))); // NOI18N
        getContentPane().add(mini_icon_poke7, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 150, -1, -1));

        mini_icon_poke8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mini_icon/miniAmpharos.png"))); // NOI18N
        getContentPane().add(mini_icon_poke8, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 150, -1, -1));

        mini_icon_poke9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mini_icon/miniBronzong.png"))); // NOI18N
        getContentPane().add(mini_icon_poke9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 150, -1, -1));

        mini_icon_poke10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mini_icon/miniGreninja.png"))); // NOI18N
        getContentPane().add(mini_icon_poke10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 150, 40, -1));

        mini_icon_poke1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mini_icon/miniCharmeleon.png"))); // NOI18N
        getContentPane().add(mini_icon_poke1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        mini_icon_poke2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mini_icon/miniBlastoise.png"))); // NOI18N
        getContentPane().add(mini_icon_poke2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        mini_icon_poke3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mini_icon/miniVenusaur.png"))); // NOI18N
        getContentPane().add(mini_icon_poke3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        mini_icon_poke4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mini_icon/miniGengar.png"))); // NOI18N
        getContentPane().add(mini_icon_poke4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));

        mini_icon_poke5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mini_icon/miniBlissey.png"))); // NOI18N
        getContentPane().add(mini_icon_poke5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        iconTypeEnemy1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/attribute/Flying_icon_SV.png"))); // NOI18N
        getContentPane().add(iconTypeEnemy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 110, -1, -1));

        iconTypeEnemy2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/attribute/Dragon_icon_SV.png"))); // NOI18N
        getContentPane().add(iconTypeEnemy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 70, -1, -1));

        iconTypePlayer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/attribute/Fire_icon_SV.png"))); // NOI18N
        getContentPane().add(iconTypePlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        iconTypePlayer2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/attribute/Flying_icon_SV.png"))); // NOI18N
        getContentPane().add(iconTypePlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 117, -1, -1));

        lblNomePokemon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNomePokemon.setText("Jogador");
        getContentPane().add(lblNomePokemon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 180, -1));

        lblNomePokemonOponente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNomePokemonOponente.setText("Inimigo");
        getContentPane().add(lblNomePokemonOponente, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 110, 170, -1));

        labelMPJogador.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelMPJogador.setText("Mana: 0");
        getContentPane().add(labelMPJogador, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 140, 20));

        labelVidaJogador1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelVidaJogador1.setText("Vida: 0");
        getContentPane().add(labelVidaJogador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 110, -1));

        labelVidaInimigo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelVidaInimigo.setText("Vida: 0");
        getContentPane().add(labelVidaInimigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 110, 110, -1));

        labelMPInimigo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelMPInimigo.setText("Mana: 0");
        getContentPane().add(labelMPInimigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 70, 160, -1));

        labelJogador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pokemon/charmeleon.png"))); // NOI18N
        getContentPane().add(labelJogador, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 260, -1));

        labelVilao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pokemon/noivern.png"))); // NOI18N
        labelVilao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(labelVilao, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 200, 267, -1));

        jp_btnAcoes.setLayout(null);

        btnTrocar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTrocar.setText("Trocar");
        btnTrocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrocarActionPerformed(evt);
            }
        });
        jp_btnAcoes.add(btnTrocar);
        btnTrocar.setBounds(190, 30, 130, 70);

        btnFlee.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFlee.setText("Fugir");
        btnFlee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFleeActionPerformed(evt);
            }
        });
        jp_btnAcoes.add(btnFlee);
        btnFlee.setBounds(190, 130, 130, 70);

        btnDefend.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDefend.setText("Defender");
        btnDefend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefendActionPerformed(evt);
            }
        });
        jp_btnAcoes.add(btnDefend);
        btnDefend.setBounds(30, 130, 130, 70);

        btnAttack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAttack.setText("Atacar");
        btnAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttackActionPerformed(evt);
            }
        });
        jp_btnAcoes.add(btnAttack);
        btnAttack.setBounds(30, 30, 130, 70);

        getContentPane().add(jp_btnAcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 450, 350, 230));

        jp_btnAttacks.setLayout(null);

        lbl_type1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/attribute/120px-NormalIC_LA.png"))); // NOI18N
        jp_btnAttacks.add(lbl_type1);
        lbl_type1.setBounds(44, 72, 116, 25);

        lbl_type4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/attribute/120px-FireIC_LA.png"))); // NOI18N
        jp_btnAttacks.add(lbl_type4);
        lbl_type4.setBounds(42, 165, 117, 25);

        lbl_type2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/attribute/120px-FireIC_LA.png"))); // NOI18N
        jp_btnAttacks.add(lbl_type2);
        lbl_type2.setBounds(206, 165, 116, 26);

        lbl_type3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/attribute/120px-FireIC_LA.png"))); // NOI18N
        jp_btnAttacks.add(lbl_type3);
        lbl_type3.setBounds(207, 72, 116, 25);

        btnGolpe1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGolpe1.setText("Golpe1");
        btnGolpe1.setMargin(new java.awt.Insets(0, 1, 24, 1));
        btnGolpe1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnGolpe1MouseMoved(evt);
            }
        });
        btnGolpe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGolpe1ActionPerformed(evt);
            }
        });
        jp_btnAttacks.add(btnGolpe1);
        btnGolpe1.setBounds(42, 35, 121, 65);

        btnGolpe2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGolpe2.setText("Golpe2");
        btnGolpe2.setMargin(new java.awt.Insets(0, 1, 24, 1));
        btnGolpe2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnGolpe2MouseMoved(evt);
            }
        });
        btnGolpe2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGolpe2ActionPerformed(evt);
            }
        });
        jp_btnAttacks.add(btnGolpe2);
        btnGolpe2.setBounds(204, 131, 121, 63);

        btnGolpe3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGolpe3.setText("Golpe3");
        btnGolpe3.setMargin(new java.awt.Insets(0, 1, 24, 1));
        btnGolpe3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnGolpe3MouseMoved(evt);
            }
        });
        btnGolpe3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGolpe3ActionPerformed(evt);
            }
        });
        jp_btnAttacks.add(btnGolpe3);
        btnGolpe3.setBounds(204, 35, 121, 65);

        btnGolpe4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGolpe4.setText("Golpe4");
        btnGolpe4.setMargin(new java.awt.Insets(0, 1, 24, 1));
        btnGolpe4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnGolpe4MouseMoved(evt);
            }
        });
        btnGolpe4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGolpe4ActionPerformed(evt);
            }
        });
        jp_btnAttacks.add(btnGolpe4);
        btnGolpe4.setBounds(40, 130, 121, 63);

        getContentPane().add(jp_btnAttacks, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 450, 350, 230));

        jp_btnTroca.setLayout(null);

        iconPoke1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/iconBlastoise.png"))); // NOI18N
        iconPoke1.setText("jLabel1");
        jp_btnTroca.add(iconPoke1);
        iconPoke1.setBounds(20, 30, 70, 70);

        iconPoke2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/iconGengar.png"))); // NOI18N
        iconPoke2.setText("jLabel1");
        jp_btnTroca.add(iconPoke2);
        iconPoke2.setBounds(177, 126, 70, 60);

        iconPoke3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/iconVenusaur.png"))); // NOI18N
        iconPoke3.setText("jLabel1");
        jp_btnTroca.add(iconPoke3);
        iconPoke3.setBounds(180, 30, 70, 70);

        iconPoke4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/iconBlissey.png"))); // NOI18N
        iconPoke4.setText("jLabel1");
        jp_btnTroca.add(iconPoke4);
        iconPoke4.setBounds(20, 120, 70, 70);
        jp_btnTroca.add(pb_iconPoke1HP);
        pb_iconPoke1HP.setBounds(90, 70, 70, 10);
        jp_btnTroca.add(pb_iconPoke2HP);
        pb_iconPoke2HP.setBounds(250, 160, 70, 10);
        jp_btnTroca.add(pb_iconPoke3HP);
        pb_iconPoke3HP.setBounds(250, 70, 70, 10);
        jp_btnTroca.add(pb_iconPoke4HP);
        pb_iconPoke4HP.setBounds(90, 160, 70, 10);
        jp_btnTroca.add(pb_iconPoke1Mana);
        pb_iconPoke1Mana.setBounds(90, 50, 70, 10);
        jp_btnTroca.add(pb_iconPoke2Mana);
        pb_iconPoke2Mana.setBounds(250, 140, 70, 10);
        jp_btnTroca.add(pb_iconPoke3Mana);
        pb_iconPoke3Mana.setBounds(250, 50, 70, 10);
        jp_btnTroca.add(pb_iconPoke4Mana);
        pb_iconPoke4Mana.setBounds(90, 140, 70, 10);

        lbl_hpPoke1.setText("hp / maxHP");
        jp_btnTroca.add(lbl_hpPoke1);
        lbl_hpPoke1.setBounds(90, 80, 70, 16);

        lbl_hpPoke2.setText("hp / maxHP");
        jp_btnTroca.add(lbl_hpPoke2);
        lbl_hpPoke2.setBounds(250, 170, 70, 16);

        lbl_hpPoke3.setText("hp / maxHP");
        jp_btnTroca.add(lbl_hpPoke3);
        lbl_hpPoke3.setBounds(250, 80, 70, 16);

        lbl_hpPoke4.setText("hp / maxHP");
        jp_btnTroca.add(lbl_hpPoke4);
        lbl_hpPoke4.setBounds(90, 170, 70, 16);

        lbl_manaPoke1.setText("mana/maxMa");
        jp_btnTroca.add(lbl_manaPoke1);
        lbl_manaPoke1.setBounds(90, 60, 80, 10);

        lbl_manaPoke2.setText("mana/maxMa");
        jp_btnTroca.add(lbl_manaPoke2);
        lbl_manaPoke2.setBounds(250, 150, 80, 10);

        lbl_manaPoke3.setText("mana/maxMa");
        jp_btnTroca.add(lbl_manaPoke3);
        lbl_manaPoke3.setBounds(250, 60, 80, 10);

        lbl_manaPoke4.setText("mana/maxMa");
        jp_btnTroca.add(lbl_manaPoke4);
        lbl_manaPoke4.setBounds(90, 150, 80, 10);

        btnTroca1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnTroca1.setText("Poke1");
        btnTroca1.setMargin(new java.awt.Insets(2, 40, 40, 14));
        btnTroca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTroca1ActionPerformed(evt);
            }
        });
        jp_btnTroca.add(btnTroca1);
        btnTroca1.setBounds(20, 30, 150, 70);

        btnTroca2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnTroca2.setText("Poke2");
        btnTroca2.setMargin(new java.awt.Insets(2, 40, 40, 14));
        btnTroca2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTroca2ActionPerformed(evt);
            }
        });
        jp_btnTroca.add(btnTroca2);
        btnTroca2.setBounds(180, 120, 150, 70);

        btnTroca3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnTroca3.setText("Poke3");
        btnTroca3.setMargin(new java.awt.Insets(2, 40, 40, 14));
        btnTroca3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTroca3ActionPerformed(evt);
            }
        });
        jp_btnTroca.add(btnTroca3);
        btnTroca3.setBounds(180, 30, 150, 70);

        btnTroca4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnTroca4.setText("Poke4");
        btnTroca4.setMargin(new java.awt.Insets(2, 40, 40, 14));
        btnTroca4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTroca4ActionPerformed(evt);
            }
        });
        jp_btnTroca.add(btnTroca4);
        btnTroca4.setBounds(20, 120, 150, 70);

        getContentPane().add(jp_btnTroca, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 450, 350, 230));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/field_1.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttackActionPerformed
        attackTime();
    }//GEN-LAST:event_btnAttackActionPerformed

    private void btnGolpe1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGolpe1MouseMoved
        AlterarInfoDeAtaque(0);
    }//GEN-LAST:event_btnGolpe1MouseMoved

    private void btnGolpe2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGolpe2MouseMoved
        AlterarInfoDeAtaque(1);
    }//GEN-LAST:event_btnGolpe2MouseMoved

    private void btnGolpe3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGolpe3MouseMoved
        AlterarInfoDeAtaque(2); 
    }//GEN-LAST:event_btnGolpe3MouseMoved

    private void btnGolpe4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGolpe4MouseMoved
        AlterarInfoDeAtaque(3);
    }//GEN-LAST:event_btnGolpe4MouseMoved

    private void btnFleeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFleeActionPerformed
        waitToGameOver("Voce optou por fugir dessa vez. Mas não se preocupe, pode sempre tentar de novo!");
    }//GEN-LAST:event_btnFleeActionPerformed

    private void btnTrocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrocarActionPerformed
        alterarPainelTroca();
    }//GEN-LAST:event_btnTrocarActionPerformed

    private void btnTroca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTroca1ActionPerformed
        TrocarPokemon(0);
    }//GEN-LAST:event_btnTroca1ActionPerformed

    private void btnTroca2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTroca2ActionPerformed
        TrocarPokemon(1);
    }//GEN-LAST:event_btnTroca2ActionPerformed

    private void btnTroca3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTroca3ActionPerformed
        TrocarPokemon(2);
    }//GEN-LAST:event_btnTroca3ActionPerformed

    private void btnTroca4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTroca4ActionPerformed
        TrocarPokemon(3);
    }//GEN-LAST:event_btnTroca4ActionPerformed

    private void btnGolpe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGolpe1ActionPerformed
        attack(0);
    }//GEN-LAST:event_btnGolpe1ActionPerformed

    private void btnGolpe2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGolpe2ActionPerformed
        attack(1);
    }//GEN-LAST:event_btnGolpe2ActionPerformed

    private void btnGolpe3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGolpe3ActionPerformed
        attack(2);
    }//GEN-LAST:event_btnGolpe3ActionPerformed

    private void btnGolpe4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGolpe4ActionPerformed
        attack(3);
    }//GEN-LAST:event_btnGolpe4ActionPerformed

    private void btnDefendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefendActionPerformed
        defend();
    }//GEN-LAST:event_btnDefendActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel InfoGolpeNome;
    private javax.swing.JButton btnAttack;
    private javax.swing.JButton btnDefend;
    private javax.swing.JButton btnFlee;
    private javax.swing.JButton btnGolpe1;
    private javax.swing.JButton btnGolpe2;
    private javax.swing.JButton btnGolpe3;
    private javax.swing.JButton btnGolpe4;
    private javax.swing.JButton btnTroca1;
    private javax.swing.JButton btnTroca2;
    private javax.swing.JButton btnTroca3;
    private javax.swing.JButton btnTroca4;
    private javax.swing.JButton btnTrocar;
    private javax.swing.JLabel iconPoke1;
    private javax.swing.JLabel iconPoke2;
    private javax.swing.JLabel iconPoke3;
    private javax.swing.JLabel iconPoke4;
    private javax.swing.JLabel iconTypeEnemy1;
    private javax.swing.JLabel iconTypeEnemy2;
    private javax.swing.JLabel iconTypePlayer1;
    private javax.swing.JLabel iconTypePlayer2;
    private javax.swing.JLabel infoGolpeAtributo;
    private javax.swing.JLabel infoGolpeCusto;
    private javax.swing.JLabel infoGolpeDano;
    private javax.swing.JLabel infoGolpeTipo;
    private javax.swing.JPanel jp_CaixaDeDialogo;
    private javax.swing.JPanel jp_btnAcoes;
    private javax.swing.JPanel jp_btnAttacks;
    private javax.swing.JPanel jp_btnTroca;
    private javax.swing.JPanel jp_info;
    private javax.swing.JLabel labelJogador;
    private javax.swing.JLabel labelMPInimigo;
    private javax.swing.JLabel labelMPJogador;
    private javax.swing.JLabel labelVidaInimigo;
    private javax.swing.JLabel labelVidaJogador1;
    private javax.swing.JLabel labelVilao;
    private javax.swing.JLabel lblNomePokemon;
    private javax.swing.JLabel lblNomePokemonOponente;
    private javax.swing.JLabel lblTextBattle;
    private javax.swing.JLabel lbl_hpPoke1;
    private javax.swing.JLabel lbl_hpPoke2;
    private javax.swing.JLabel lbl_hpPoke3;
    private javax.swing.JLabel lbl_hpPoke4;
    private javax.swing.JLabel lbl_manaPoke1;
    private javax.swing.JLabel lbl_manaPoke2;
    private javax.swing.JLabel lbl_manaPoke3;
    private javax.swing.JLabel lbl_manaPoke4;
    private javax.swing.JLabel lbl_type1;
    private javax.swing.JLabel lbl_type2;
    private javax.swing.JLabel lbl_type3;
    private javax.swing.JLabel lbl_type4;
    private javax.swing.JLabel mini_icon_poke1;
    private javax.swing.JLabel mini_icon_poke10;
    private javax.swing.JLabel mini_icon_poke2;
    private javax.swing.JLabel mini_icon_poke3;
    private javax.swing.JLabel mini_icon_poke4;
    private javax.swing.JLabel mini_icon_poke5;
    private javax.swing.JLabel mini_icon_poke6;
    private javax.swing.JLabel mini_icon_poke7;
    private javax.swing.JLabel mini_icon_poke8;
    private javax.swing.JLabel mini_icon_poke9;
    private javax.swing.JProgressBar pb_ManaOponente;
    private javax.swing.JProgressBar pb_Vida;
    private javax.swing.JProgressBar pb_VidaOponente;
    private javax.swing.JProgressBar pb_iconPoke1HP;
    private javax.swing.JProgressBar pb_iconPoke1Mana;
    private javax.swing.JProgressBar pb_iconPoke2HP;
    private javax.swing.JProgressBar pb_iconPoke2Mana;
    private javax.swing.JProgressBar pb_iconPoke3HP;
    private javax.swing.JProgressBar pb_iconPoke3Mana;
    private javax.swing.JProgressBar pb_iconPoke4HP;
    private javax.swing.JProgressBar pb_iconPoke4Mana;
    private javax.swing.JProgressBar pb_mana;
    // End of variables declaration//GEN-END:variables
    
    private void checkPokemonLife(){
        if(battleController.getCurrentePlayerPokemon().getCurrentHP() <= 0 && battleController.getOutPokemon(0).getCurrentHP() <= 0 &&
           battleController.getOutPokemon(1).getCurrentHP() <= 0 && battleController.getOutPokemon(2).getCurrentHP() <= 0 &&
           battleController.getOutPokemon(3).getCurrentHP() <= 0){
            waitToGameOver("Sinto muito, voce foi derrotado. Nao fique triste, cada derrota e um aprendizado!");
        }
        else if(battleController.getCurrenteEnemyPokemon().getCurrentHP() <= 0 && battleController.getOutEnemyPokemon(0).getCurrentHP()<=0 &&
                battleController.getOutEnemyPokemon(1).getCurrentHP()<=0 && battleController.getOutEnemyPokemon(2).getCurrentHP()<=0 &&
                battleController.getOutEnemyPokemon(3).getCurrentHP()<=0){
            waitToGameOver("Parabens!!! Voce derrotou seu inimigo. Mantenha-se firma na sua jornada!");
        }
        
    }
    
    private void waitToGameOver(String message){
        SwingUtilities.invokeLater(() -> {
            btnAttack.setEnabled(false);
            btnTrocar.setEnabled(false);
            btnDefend.setEnabled(false);
            btnFlee.setEnabled(false);
            lblTextBattle.setText("A batalha acabou!");
        });
        new Thread(() -> {
            try {
                Thread.sleep(4000); // Aguarda por 4000 milissegundos (4 segundos)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            SwingUtilities.invokeLater(() -> {
                setVisible(false);
                new GameOver(message).setVisible(true);
            });
        }).start();
    }
    
    private void waitToNextTurn(){
        SwingUtilities.invokeLater(() -> {
            btnAttack.setEnabled(false);
            btnTrocar.setEnabled(false);
            btnDefend.setEnabled(false);
            btnFlee.setEnabled(false);
        });
        
        new Thread(() -> {
            try {
                combateInfo(battleController.getCurrentePlayerPokemon());
                Thread.sleep(2100); // Aguarda por 2100 milissegundos (2.1 segundos)
                combateInfo(battleController.getCurrenteEnemyPokemon());
                Thread.sleep(2100); // Aguarda por 2100 milissegundos (2.1 segundos)
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Reabilita os botões na EDT
            SwingUtilities.invokeLater(() -> {
                btnAttack.setEnabled(true);
                btnTrocar.setEnabled(true);
                btnDefend.setEnabled(true);
                btnFlee.setEnabled(true);
            });
            exchangeCheck();
            checkPokemonLife();
        }).start();
        
    }

    
    private void AtualizarInfoBarJogador(){
        labelJogador.setIcon(battleController.getCurrentePlayerPokemon().getSprite());
        lblTextBattle.setText("O que o " + battleController.getCurrentePlayerPokemon().getName() + " deve fazer?");
        lblNomePokemon.setText(battleController.getCurrentePlayerPokemon().getName());
        pb_Vida.setMaximum(battleController.getCurrentePlayerPokemon().getHP());
        labelVidaJogador1.setText("Vida: " + String.valueOf(battleController.getCurrentePlayerPokemon().getCurrentHP()));
        pb_Vida.setValue(battleController.getCurrentePlayerPokemon().getCurrentHP());
        labelMPJogador.setText("Mana: " + String.valueOf(battleController.getCurrentePlayerPokemon().getMana()));
        pb_mana.setValue(battleController.getCurrentePlayerPokemon().getMana());
        iconTypePlayer1.setIcon(battleController.getCurrentePlayerPokemon().getAttributeIcon());
        if(battleController.getCurrentePlayerPokemon().getAttributeIcon2()== null){
            iconTypePlayer2.setIcon(null);
        } else iconTypePlayer2.setIcon(battleController.getCurrentePlayerPokemon().getAttributeIcon2());
    }
    
    private void atualizarStatusJogador(){
        pb_Vida.setValue(battleController.getCurrentePlayerPokemon().getCurrentHP());
        pb_mana.setValue(battleController.getCurrentePlayerPokemon().getMana());
        labelVidaJogador1.setText("Vida: " + String.valueOf(battleController.getCurrentePlayerPokemon().getCurrentHP()));
        labelMPJogador.setText("Mana: " + String.valueOf(battleController.getCurrentePlayerPokemon().getMana()));
    }

    
    private void AtualizarInfoBarVilao(){
        labelVilao.setIcon(battleController.getCurrenteEnemyPokemon().getSprite());
        pb_VidaOponente.setMaximum(battleController.getCurrenteEnemyPokemon().getHP());
        battleController.getCurrenteEnemyPokemon().setCurrentHP(battleController.getCurrenteEnemyPokemon().getHP());
        pb_VidaOponente.setValue(battleController.getCurrenteEnemyPokemon().getCurrentHP());
        pb_ManaOponente.setValue(battleController.getCurrenteEnemyPokemon().getMana());
        lblNomePokemonOponente.setText(battleController.getCurrenteEnemyPokemon().getName());
        labelVidaInimigo.setText("Vida: " + String.valueOf(battleController.getCurrenteEnemyPokemon().getCurrentHP()));
        labelMPInimigo.setText("Mana: " + String.valueOf(battleController.getCurrenteEnemyPokemon().getMana()));
        iconTypeEnemy1.setIcon(battleController.getCurrenteEnemyPokemon().getAttributeIcon());
        if(battleController.getCurrenteEnemyPokemon().getAttributeIcon2()== null){
            iconTypeEnemy2.setIcon(null);
        } else iconTypeEnemy2.setIcon(battleController.getCurrenteEnemyPokemon().getAttributeIcon2());
    }
    
    private void atualizarStatusVilao(){
        pb_VidaOponente.setValue(battleController.getCurrenteEnemyPokemon().getCurrentHP());
        pb_ManaOponente.setValue(battleController.getCurrenteEnemyPokemon().getMana());
        labelVidaInimigo.setText("Vida: " + String.valueOf(battleController.getCurrenteEnemyPokemon().getCurrentHP()));
        labelMPInimigo.setText("Mana: " + String.valueOf(battleController.getCurrenteEnemyPokemon().getMana()));
    }
    
    private void AlterarInfoDeAtaque(int i){
        jp_info.setVisible(true);
        
        InfoGolpeNome.setText(battleController.getCurrentePlayerPokemon().getAttacks()[i].getName());
        infoGolpeTipo.setText("Tipo: " + battleController.getCurrentePlayerPokemon().getAttacks()[i].getType());
        infoGolpeDano.setText("Dano: " + String.valueOf(battleController.getCurrentePlayerPokemon().getAttacks()[i].getPower()));
        infoGolpeAtributo.setText("Atributo: " + battleController.getCurrentePlayerPokemon().getAttacks()[i].getAttribute());
        infoGolpeCusto.setText("Custo: " + String.valueOf(battleController.getCurrentePlayerPokemon().getAttacks()[i].getCost()));
    }
    
    private void TrocarPokemon(int i){
        if (battleController.getOutPokemon(i).getCurrentHP() <= 0){
            lblTextBattle.setText("Você não pode trocar pra "+ battleController.getOutPokemon(i).getName() + " porque ele está morto");
        } else{
            jp_btnAcoes.setVisible(true);
            jp_btnTroca.setVisible(false);

            Pokemon trocaAtual = battleController.getCurrentePlayerPokemon();
            Pokemon trocaProximo = battleController.getOutPokemon(i);

            battleController.setCurrentPlayerPokemon(trocaProximo);
            battleController.setOutPokemon(trocaAtual, i);
            
            AtualizarInfoBarJogador();
        }
        
    }
    
    private void combateInfo(Pokemon pokemon){
        if (pokemon == battleController.getCurrentePlayerPokemon()){
            switch(battleController.getCurrentPlayerAction()){
                case 1:
                    atualizarStatusVilao();
                    if(!battleController.isMissAttackPlayer())
                        lblTextBattle.setText("O " + battleController.getCurrentePlayerPokemon().getName()+ " usou " + battleController.getMovePlayer().getName() + " e inflingiu " + battleController.getPlayerDMG() + " de dano!");
                    else 
                        lblTextBattle.setText("O "+ battleController.getCurrentePlayerPokemon().getName()+ " usou " + battleController.getMovePlayer().getName() + " mas errou ataque no inimigo que defendeu" );
                    break;
                case 2:
                    if (battleController.getCurrentPlayerAction() == 2 && battleController.getCurrentEnemyAction() == 2)
                        lblTextBattle.setText("Os 2 pokémons usaram defender");
                    else if(battleController.isMissAttackEnemy())
                        lblTextBattle.setText("O " + battleController.getCurrentePlayerPokemon().getName() + " usou defesa e conseguiu denfender");
                    else 
                        lblTextBattle.setText("O " + battleController.getCurrentePlayerPokemon().getName() + " usou defesa mas não conseguiu se defender");
            }   
        } else {
            switch(battleController.getCurrentEnemyAction()){
                case 1:
                    atualizarStatusJogador();
                    if(!battleController.isMissAttackEnemy())
                        lblTextBattle.setText("O " + battleController.getCurrenteEnemyPokemon().getName()+ " usou " + battleController.getMoveEnemy().getName() + " e inflingiu " + battleController.getEnemyDMG()+ " de dano!");
                    else 
                        lblTextBattle.setText("O "+ battleController.getCurrenteEnemyPokemon().getName()+ " usou " + battleController.getMoveEnemy().getName() + " mas errou ataque no inimigo que defendeu");
                    break;
                case 2:
                    if (battleController.getCurrentPlayerAction() == 2 && battleController.getCurrentEnemyAction() == 2)
                        lblTextBattle.setText("Os 2 pokémons usaram defender");
                    else  if(battleController.isMissAttackPlayer())
                        lblTextBattle.setText("O " + battleController.getCurrenteEnemyPokemon().getName() + " usou defesa e conseguiu denfender");
                    else
                        lblTextBattle.setText("O " + battleController.getCurrenteEnemyPokemon().getName() + " usou defesa mas não conseguiu se defender");
            }
        }
    }
    
    
    
    private void attack(int i){
        battleController.playerAttacks(i);
        if(!(battleController.getMovePlayer().getCost() > battleController.getCurrentePlayerPokemon().getMana())){
        battleController.turnControl();
        resetInfos();
        waitToNextTurn();
        }
        else{
         lblTextBattle.setText("Você não tem a mana suficiente para ativar este ataque");
        }
    }
    
    private void attackTime(){
        jp_btnAttacks.setVisible(true);
        jp_btnAcoes.setVisible(false);
        
        btnGolpe1.setText(battleController.getCurrentePlayerPokemon().getAttacks()[0].getName());
        btnGolpe2.setText(battleController.getCurrentePlayerPokemon().getAttacks()[1].getName());
        btnGolpe3.setText(battleController.getCurrentePlayerPokemon().getAttacks()[2].getName());
        btnGolpe4.setText(battleController.getCurrentePlayerPokemon().getAttacks()[3].getName());
        
        lbl_type1.setIcon(battleController.getCurrentePlayerPokemon().getAttacks()[0].getSprite());
        lbl_type2.setIcon(battleController.getCurrentePlayerPokemon().getAttacks()[1].getSprite());
        lbl_type3.setIcon(battleController.getCurrentePlayerPokemon().getAttacks()[2].getSprite());
        lbl_type4.setIcon(battleController.getCurrentePlayerPokemon().getAttacks()[3].getSprite());
        
        lblTextBattle.setText("Com qual ataque o " + battleController.getCurrentePlayerPokemon().getName() + " vai atacar ?");
    }
    
    private void defend(){
        battleController.PlayerDefend();
        battleController.turnControl();
        waitToNextTurn();
    }
    
    private void exchangeCheck(){
        if(battleController.getCurrentePlayerPokemon().getCurrentHP() <=0){
        alterarPainelTroca();
        }
        if(battleController.getCurrenteEnemyPokemon().getCurrentHP() <=0){
        battleController.setCurrentEnemyPokemon();
        AtualizarInfoBarVilao();
        }
    }
    
    private void resetInfos(){
        jp_btnAcoes.setVisible(true);
        jp_btnAttacks.setVisible(false);
        jp_info.setVisible(false);
    }
    
    private void alterarPainelTroca (){
        jp_btnTroca.setVisible(true);
        jp_btnAcoes.setVisible(false);
        
        iconPoke1.setIcon(battleController.getOutPokemon(0).getIcon());
        iconPoke2.setIcon(battleController.getOutPokemon(1).getIcon());
        iconPoke3.setIcon(battleController.getOutPokemon(2).getIcon());
        iconPoke4.setIcon(battleController.getOutPokemon(3).getIcon());
        
        btnTroca1.setText(battleController.getOutPokemon(0).getName());
        btnTroca2.setText(battleController.getOutPokemon(1).getName());
        btnTroca3.setText(battleController.getOutPokemon(2).getName());
        btnTroca4.setText(battleController.getOutPokemon(3).getName());
        
        pb_iconPoke1HP.setValue(battleController.getOutPokemon(0).getCurrentHP());
        pb_iconPoke2HP.setValue(battleController.getOutPokemon(1).getCurrentHP());
        pb_iconPoke3HP.setValue(battleController.getOutPokemon(2).getCurrentHP());
        pb_iconPoke4HP.setValue(battleController.getOutPokemon(3).getCurrentHP());
        pb_iconPoke1Mana.setValue(battleController.getOutPokemon(0).getMana());
        pb_iconPoke2Mana.setValue(battleController.getOutPokemon(1).getMana());
        pb_iconPoke3Mana.setValue(battleController.getOutPokemon(2).getMana());
        pb_iconPoke4Mana.setValue(battleController.getOutPokemon(3).getMana());
        
        lbl_hpPoke1.setText(String.valueOf(battleController.getOutPokemon(0).getCurrentHP())+ "/" +String.valueOf(battleController.getOutPokemon(0).getHP()) + " HP");
        lbl_hpPoke2.setText(String.valueOf(battleController.getOutPokemon(1).getCurrentHP())+ "/" +String.valueOf(battleController.getOutPokemon(1).getHP()) + " HP");
        lbl_hpPoke3.setText(String.valueOf(battleController.getOutPokemon(2).getCurrentHP())+ "/" +String.valueOf(battleController.getOutPokemon(2).getHP()) + " HP");
        lbl_hpPoke4.setText(String.valueOf(battleController.getOutPokemon(3).getCurrentHP())+ "/" +String.valueOf(battleController.getOutPokemon(3).getHP()) + " HP");
        lbl_manaPoke1.setText(String.valueOf(battleController.getOutPokemon(0).getMana())+ "/100" + " Mana");
        lbl_manaPoke2.setText(String.valueOf(battleController.getOutPokemon(1).getMana())+ "/100" + " Mana");
        lbl_manaPoke3.setText(String.valueOf(battleController.getOutPokemon(2).getMana())+ "/100" + " Mana");
        lbl_manaPoke4.setText(String.valueOf(battleController.getOutPokemon(3).getMana())+ "/100" + " Mana");
        
        lblTextBattle.setText("O " + battleController.getCurrentePlayerPokemon().getName() + " vai ser trocado por qual pokemon ?");
    }
}
