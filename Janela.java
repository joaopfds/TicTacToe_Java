import javax.swing.*;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {
    JButton[] tabuleiro = new JButton[9];
    boolean elemento = false;
    boolean[] quadrantes = new boolean[9];

    public Janela() {
        setTitle("jogo da velha");
        setSize(800, 600);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(3);
        int cont = 0;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                tabuleiro[cont] = new JButton();
                add(tabuleiro[cont]);
                tabuleiro[cont].setBounds((100*i)+60, (100*j)+60, 95,95);
                cont++;
            }

        }
        tabuleiro[0].addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!quadrantes[0]){
                    switchJogada(tabuleiro[0]);
                    quadrantes[0] = true;
                }
            }
        });
        tabuleiro[1].addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!quadrantes[1]){
                    switchJogada(tabuleiro[1]);
                    quadrantes[1] = true;
                }
            }
        });
        tabuleiro[2].addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!quadrantes[2]){
                    switchJogada(tabuleiro[2]);
                    quadrantes[2] = true;
                }
            }
        });
        tabuleiro[3].addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!quadrantes[3]){
                    switchJogada(tabuleiro[3]);
                    quadrantes[3] = true;
                }
            }
        });
        tabuleiro[4].addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!quadrantes[4]){
                    switchJogada(tabuleiro[4]);
                    quadrantes[4] = true;
                }
            }
        });tabuleiro[5].addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!quadrantes[5]){
                    switchJogada(tabuleiro[5]);
                    quadrantes[5] = true;
                }
            }
        });
        tabuleiro[6].addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!quadrantes[6]){
                    switchJogada(tabuleiro[6]);
                    quadrantes[6] = true;
                }
            }
        });
        tabuleiro[7].addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!quadrantes[7]){
                    switchJogada(tabuleiro[7]);
                    quadrantes[7] = true;
                }
            }
        });
        tabuleiro[8].addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!quadrantes[8]){
                    switchJogada(tabuleiro[8]);
                    quadrantes[8] = true;
                }
            }
        });

    }

    public void fimDeJogo(){
        if ((tabuleiro[0].getText() == "X" && tabuleiro[1].getText() == "X" && tabuleiro[2].getText() == "X")
            || (tabuleiro[3].getText() == "X" && tabuleiro[4].getText() == "X" && tabuleiro[5].getText() == "X")
            || (tabuleiro[6].getText() == "X" && tabuleiro[7].getText() == "X" && tabuleiro[8].getText() == "X")
            || (tabuleiro[0].getText() == "X" && tabuleiro[3].getText() == "X" && tabuleiro[6].getText() == "X")
            || (tabuleiro[1].getText() == "X" && tabuleiro[4].getText() == "X" && tabuleiro[7].getText() == "X")
            || (tabuleiro[2].getText() == "X" && tabuleiro[5].getText() == "X" && tabuleiro[8].getText() == "X")
            || (tabuleiro[0].getText() == "X" && tabuleiro[4].getText() == "X" && tabuleiro[8].getText() == "X")
            || (tabuleiro[2].getText() == "X" && tabuleiro[4].getText() == "X" && tabuleiro[6].getText() == "X")
        ){
          JOptionPane.showMessageDialog(null, "X ganhou");
        }
        if ((tabuleiro[0].getText() == "O" && tabuleiro[1].getText() == "O" && tabuleiro[2].getText() == "O")
            || (tabuleiro[3].getText() == "O" && tabuleiro[4].getText() == "O" && tabuleiro[5].getText() == "O")
            || (tabuleiro[6].getText() == "O" && tabuleiro[7].getText() == "O" && tabuleiro[8].getText() == "O")
            || (tabuleiro[0].getText() == "O" && tabuleiro[3].getText() == "O" && tabuleiro[6].getText() == "O")
            || (tabuleiro[1].getText() == "O" && tabuleiro[4].getText() == "O" && tabuleiro[7].getText() == "O")
            || (tabuleiro[2].getText() == "O" && tabuleiro[5].getText() == "O" && tabuleiro[8].getText() == "O")
            || (tabuleiro[0].getText() == "O" && tabuleiro[4].getText() == "O" && tabuleiro[8].getText() == "O")
            || (tabuleiro[2].getText() == "O" && tabuleiro[4].getText() == "O" && tabuleiro[6].getText() == "O")
        ){
            JOptionPane.showMessageDialog(null, "O ganhou");
        }
    }

    public void switchJogada(JButton quadrante){
        if (elemento){
            quadrante.setText("O");
            elemento = false;
        }else{
            quadrante.setText("X");
            elemento = true;
        }
        fimDeJogo();
    }

    public static void main(String[] args) {

        new Janela();

    }
}
