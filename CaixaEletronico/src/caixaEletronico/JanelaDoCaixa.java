package caixaEletronico;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class JanelaDoCaixa extends JFrame implements ActionListener {
	JLabel l = new JLabel("Escolha uma Opção:");
	JButton b1 = new JButton("Deposito");
	JButton b2 = new JButton("Transferencia");
	JButton b3 = new JButton("Saque");
	JButton b4 = new JButton("Consultar Saldo");
	JButton b5 = new JButton("PIX");
	JButton b6 = new JButton("Poupança");
	JButton b7 = new JButton("Investimento");
	JButton b8 = new JButton("Pagar Conta");
	JButton b9 = new JButton("Extrato");
	JButton home = new JButton("Voltar");
	Color cor = new Color(0, 255, 187);
	Color cor1 = new Color(126, 230, 183);

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			JLabel ld1 = new JLabel("Quanto deseja depositar:");
			JTextField txt = new JTextField();
			JButton bd1 = new JButton("Depositar");
			home.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {

					l.setVisible(true);
					b1.setVisible(true);
					b2.setVisible(true);
					b3.setVisible(true);
					b4.setVisible(true);
					b5.setVisible(true);
					b6.setVisible(true);
					b7.setVisible(true);
					b8.setVisible(true);
					b9.setVisible(true);
					home.setVisible(false);
					ld1.setVisible(false);
					bd1.setVisible(false);
					txt.setVisible(false);
				}
			});
			bd1.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					String valor = txt.getText();

					int a = Integer.parseInt(valor);
					if (a > 0) {
						JOptionPane.showMessageDialog(null, "Você depositou R$" + a);
						ld1.setVisible(false);
						bd1.setVisible(false);
						txt.setVisible(false);
					} else if (a <= 0) {
						JOptionPane.showMessageDialog(null, "Digite um valor valido");
					}

				}
			});
			ld1.setBounds(350, 10, 200, 30);
			txt.setBounds(305, 50, 200, 30);
			bd1.setBounds(305, 115, 200, 30);
			bd1.setBackground(cor);

			l.setVisible(false);
			b1.setVisible(false);
			b2.setVisible(false);
			b3.setVisible(false);
			b4.setVisible(false);
			b5.setVisible(false);
			b6.setVisible(false);
			b7.setVisible(false);
			b8.setVisible(false);
			b9.setVisible(false);
			home.setVisible(true);

			add(ld1);
			add(txt);
			add(bd1);
			add(home);
		}
		if (e.getSource() == b2) {
			JLabel lt1 = new JLabel("Conta Destino:");
			JTextField txt = new JTextField();
			JLabel lt2 = new JLabel("Quanto deseja transferir");
			JTextField txt2 = new JTextField();
			JButton bt1 = new JButton("Transferir");
			home.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {

					l.setVisible(true);
					b1.setVisible(true);
					b2.setVisible(true);
					b3.setVisible(true);
					b4.setVisible(true);
					b5.setVisible(true);
					b6.setVisible(true);
					b7.setVisible(true);
					b8.setVisible(true);
					b9.setVisible(true);
					home.setVisible(false);
					lt1.setVisible(false);
					lt2.setVisible(false);
					bt1.setVisible(false);
					txt.setVisible(false);
					txt2.setVisible(false);
				}
			});
			bt1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String valor = txt.getText();
					String valor1 = txt2.getText();

					int a = Integer.parseInt(valor);
					int b = Integer.parseInt(valor1);
					if (a <= 0) {
						JOptionPane.showMessageDialog(null, "Conta invalida");
					} else if (a > 9999) {
						JOptionPane.showMessageDialog(null, "Conta invalida");
					} else if (b <= 0) {
						JOptionPane.showMessageDialog(null, "Não é possivel depositar R$" + b);
					} else {
						JOptionPane.showMessageDialog(null, "Você Transferiu R$" + b + " Para a conta : " + a);
					}

					lt1.setVisible(false);
					bt1.setVisible(false);
					lt2.setVisible(false);
					txt.setVisible(false);
					bt1.setVisible(false);
					txt2.setVisible(false);
					add(lt1);
					add(lt2);
				}
			});
			lt1.setBounds(350, 10, 200, 60);
			txt.setBounds(305, 50, 200, 30);
			lt2.setBounds(350, 60, 200, 60);
			txt2.setBounds(305, 100, 200, 30);
			bt1.setBounds(305, 150, 200, 30);
			bt1.setBackground(cor);

			l.setVisible(false);
			b1.setVisible(false);
			b2.setVisible(false);
			b3.setVisible(false);
			b4.setVisible(false);
			b5.setVisible(false);
			b6.setVisible(false);
			b7.setVisible(false);
			b8.setVisible(false);
			b9.setVisible(false);
			home.setVisible(true);

			add(lt1);
			add(txt);
			add(bt1);
			add(lt2);
			add(txt2);
			add(home);
		}
		if (e.getSource() == b3) {
			JLabel saque = new JLabel("Quanto gostaria de Sacar?");
			JTextField saqueValor = new JTextField();
			JButton botaoSaque = new JButton("Sacar");
			home.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					l.setVisible(true);
					b1.setVisible(true);
					b2.setVisible(true);
					b3.setVisible(true);
					b4.setVisible(true);
					b5.setVisible(true);
					b6.setVisible(true);
					b7.setVisible(true);
					b8.setVisible(true);
					b9.setVisible(true);
					home.setVisible(false);
					saque.setVisible(false);
					botaoSaque.setVisible(false);
					saqueValor.setVisible(false);
				}
			});
			botaoSaque.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					String valorSaque = saqueValor.getText();
					int a = Integer.parseInt(valorSaque);
					if (a <= 0) {
						JOptionPane.showMessageDialog(null, "Não é pssivel Sacar R$ " + a);
					} else if (a <= 999999999) {
						JOptionPane.showMessageDialog(null, "Voce Sacou R$ " + a);
					}
					saque.setBounds(350, 10, 200, 30);
					saqueValor.setBounds(305, 50, 200, 30);
					botaoSaque.setBounds(305, 1000, 200, 30);
					botaoSaque.setBackground(cor);

					saque.setVisible(false);
					botaoSaque.setVisible(false);
					saqueValor.setVisible(false);

				}
			});

			l.setVisible(false);
			b1.setVisible(false);
			b2.setVisible(false);
			b3.setVisible(false);
			b4.setVisible(false);
			b5.setVisible(false);
			b6.setVisible(false);
			b7.setVisible(false);
			b8.setVisible(false);
			b9.setVisible(false);
			home.setVisible(true);
			saque.setBounds(330, 10, 200, 60);
			saqueValor.setBounds(305, 60, 200, 30);
			botaoSaque.setBounds(305, 100, 200, 30);
			botaoSaque.setBackground(cor);

			saque.setVisible(true);
			botaoSaque.setVisible(true);
			saqueValor.setVisible(true);

			add(saque);
			add(saqueValor);
			add(botaoSaque);
			add(home);
		}
		if (e.getSource() == b4) {
			JOptionPane.showMessageDialog(null,
					"Você realizou o sonho de todas as pessoas e tem dinheiro quase infinito! Equivalente a R$ 999,999,999.00 Aproveite!");
		}
		if (e.getSource() == b5) {
			JLabel lpix = new JLabel("Digite a Chave Pix em CPF:");
			JTextField cpfPix = new JTextField();
			JLabel valorPix = new JLabel("Digite o Valor que deseja transferir:");
			JTextField vPixValor = new JTextField();
			JButton btPix = new JButton("Transferir");

			home.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {

					l.setVisible(true);
					b1.setVisible(true);
					b2.setVisible(true);
					b3.setVisible(true);
					b4.setVisible(true);
					b5.setVisible(true);
					b6.setVisible(true);
					b7.setVisible(true);
					b8.setVisible(true);
					b9.setVisible(true);
					home.setVisible(false);
					lpix.setVisible(false);
					valorPix.setVisible(false);
					vPixValor.setVisible(false);
					cpfPix.setVisible(false);
					btPix.setVisible(false);

				}
			});
			btPix.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String valorPix = vPixValor.getText();
					int a = Integer.parseInt(valorPix);
					String cpf = cpfPix.getText();
					int b = Integer.parseInt(cpf);

					if (a <= 0) {
						JOptionPane.showMessageDialog(null, "Não é possivel transferir R$" + a);
					} else if (a < 999999999) {
						JOptionPane.showMessageDialog(null,
								"Você transferiu R$ " + a + " Para a chave Pix de CPF " + b);
					}
				}
			});
			l.setVisible(false);
			b1.setVisible(false);
			b2.setVisible(false);
			b3.setVisible(false);
			b4.setVisible(false);
			b5.setVisible(false);
			b6.setVisible(false);
			b7.setVisible(false);
			b8.setVisible(false);
			b9.setVisible(false);
			home.setVisible(true);

			lpix.setBounds(330, 10, 200, 60);
			cpfPix.setBounds(305, 50, 200, 30);
			valorPix.setBounds(305, 60, 210, 60);
			vPixValor.setBounds(305, 100, 200, 30);
			btPix.setBounds(305, 150, 200, 30);
			btPix.setBackground(cor);

			add(lpix);
			add(cpfPix);
			add(valorPix);
			add(vPixValor);
			add(btPix);
			add(home);
		}
		if (e.getSource() == b6) {
			JLabel poupanca = new JLabel("Você tem R$ 999,999,999.00! Gostaria de Sacar?");
			JButton b31 = new JButton("Saque");
			home.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					l.setVisible(true);
					b1.setVisible(true);
					b2.setVisible(true);
					b3.setVisible(true);
					b4.setVisible(true);
					b5.setVisible(true);
					b6.setVisible(true);
					b7.setVisible(true);
					b8.setVisible(true);
					b9.setVisible(true);
					home.setVisible(false);
					poupanca.setVisible(false);
					b31.setVisible(false);
				}
			});
			b31.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JLabel saque = new JLabel("Quanto gostaria de Sacar?");
					JTextField saqueValor = new JTextField();
					JButton botaoSaque = new JButton("Sacar");
					home.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							l.setVisible(true);
							b1.setVisible(true);
							b2.setVisible(true);
							b3.setVisible(true);
							b4.setVisible(true);
							b5.setVisible(true);
							b6.setVisible(true);
							b7.setVisible(true);
							b8.setVisible(true);
							b9.setVisible(true);
							home.setVisible(false);
							saque.setVisible(false);
							botaoSaque.setVisible(false);
							saqueValor.setVisible(false);
						}
					});
					botaoSaque.addActionListener(new ActionListener() {

						public void actionPerformed(ActionEvent e) {
							String valorSaque = saqueValor.getText();
							int a = Integer.parseInt(valorSaque);
							if (a <= 0) {
								JOptionPane.showMessageDialog(null, "Não é pssivel Sacar R$ " + a);
							} else if (a <= 999999999) {
								JOptionPane.showMessageDialog(null, "Voce Sacou R$ " + a);
							}
							saque.setBounds(350, 10, 200, 30);
							saqueValor.setBounds(305, 50, 200, 30);
							botaoSaque.setBounds(305, 1000, 200, 30);
							botaoSaque.setBackground(cor);

							saque.setVisible(false);
							botaoSaque.setVisible(false);
							saqueValor.setVisible(false);

						}
					});

					l.setVisible(false);
					b1.setVisible(false);
					b2.setVisible(false);
					b3.setVisible(false);
					b4.setVisible(false);
					b5.setVisible(false);
					b6.setVisible(false);
					b7.setVisible(false);
					b8.setVisible(false);
					b9.setVisible(false);
					home.setVisible(true);
					saque.setBounds(330, 10, 200, 60);
					saqueValor.setBounds(305, 60, 200, 30);
					botaoSaque.setBounds(305, 100, 200, 30);
					botaoSaque.setBackground(cor);

					saque.setVisible(true);
					botaoSaque.setVisible(true);
					saqueValor.setVisible(true);

					poupanca.setVisible(false);
					b31.setVisible(false);

					add(saque);
					add(saqueValor);
					add(botaoSaque);
					add(home);

				}
			});

			l.setVisible(false);
			b1.setVisible(false);
			b2.setVisible(false);
			b3.setVisible(false);
			b4.setVisible(false);
			b5.setVisible(false);
			b6.setVisible(false);
			b7.setVisible(false);
			b8.setVisible(false);
			b9.setVisible(false);
			home.setVisible(true);

			poupanca.setBounds(275, 10, 400, 60);
			b31.setBounds(305, 150, 200, 30);
			b31.setBackground(cor);
			add(poupanca);
			add(home);
			add(b31);
		}
		if (e.getSource() == b7) {
			JOptionPane.showMessageDialog(null, "Os Investimentos ainda estão fechados");
		}
		if (e.getSource() == b8) {
			JLabel conta = new JLabel("Digite o codigo de Barras no Campo abaixo");
			JTextField codigoDeBarras = new JTextField();
			JButton btconta = new JButton("Pagar Conta");
			home.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					l.setVisible(true);
					b1.setVisible(true);
					b2.setVisible(true);
					b3.setVisible(true);
					b4.setVisible(true);
					b5.setVisible(true);
					b6.setVisible(true);
					b7.setVisible(true);
					b8.setVisible(true);
					b9.setVisible(true);
					home.setVisible(false);
					conta.setVisible(false);
					codigoDeBarras.setVisible(false);
					btconta.setVisible(false);
				}
			});
			btconta.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String numeroConta = codigoDeBarras.getText();

					long a = Integer.parseInt(numeroConta);

					if (a <= 0) {
						JOptionPane.showMessageDialog(null, "Não possivel ler Codigo de Barras");
					} else if (a <= 999999999) {
						JOptionPane.showMessageDialog(null, "Conta " + a + " Paga com Sucesso");
					}
				}
			});

			l.setVisible(false);
			b1.setVisible(false);
			b2.setVisible(false);
			b3.setVisible(false);
			b4.setVisible(false);
			b5.setVisible(false);
			b6.setVisible(false);
			b7.setVisible(false);
			b8.setVisible(false);
			b9.setVisible(false);
			home.setVisible(true);

			conta.setBounds(280, 10, 300, 30);
			codigoDeBarras.setBounds(305, 50, 200, 30);
			btconta.setBounds(305, 115, 200, 30);
			btconta.setBackground(cor);

			add(conta);
			add(codigoDeBarras);
			add(btconta);
			add(home);
		}
		if (e.getSource() == b9) {
			JOptionPane.showMessageDialog(null, "Falha ao acessar Banco de dados");
		}
	}

	public JanelaDoCaixa() {
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		home.setBounds(305, 200, 200, 30);
		l.setBounds(350, 10, 200, 60);
		b1.setBounds(100, 50, 200, 60);
		b2.setBounds(305, 50, 200, 60);
		b3.setBounds(510, 50, 200, 60);
		b4.setBounds(100, 115, 200, 60);
		b5.setBounds(305, 115, 200, 60);
		b6.setBounds(510, 115, 200, 60);
		b7.setBounds(100, 180, 200, 60);
		b8.setBounds(305, 180, 200, 60);
		b9.setBounds(510, 180, 200, 60);
		l.setBackground(cor);
		b1.setBackground(cor);
		b2.setBackground(cor);
		b3.setBackground(cor);
		b4.setBackground(cor);
		b5.setBackground(cor);
		b6.setBackground(cor);
		b7.setBackground(cor);
		b8.setBackground(cor);
		b9.setBackground(cor);
		home.setBackground(cor);
		add(l);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		setSize(810, 400);
		setLayout(null);
		setVisible(true);
		getContentPane().setBackground(cor1);
		;
	}

	public static void main(String[] args) {
		new JanelaDoCaixa();
	}
}
