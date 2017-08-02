import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventoMouse extends JFrame implements MouseListener{
	
	private JLabel texto;
	
	public EventoMouse() {
		super("Dev Cristiano Morais");
	}
	
	public void criarJanela() {
		texto = new JLabel("Teste de Eventos com o Mouse");
		
		// seta o Layout do JFrame
		setLayout(new FlowLayout());
		
		// adiciona o JLabel no JFrame
		add(texto, FlowLayout.LEFT);
		
		// Este componente (Janela) passa a ser um listener do mouse
		addMouseListener(this);
		
		// seta o Botao fechar para finalizar o programa
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// seta o tamanho da janela
		setSize(300,200);
		
		// mostra a janela
		setVisible(true);
		
		// Abre no meio da tela
		setLocationRelativeTo(null);
		
		
				
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		texto.setText("Clicado em [" + e.getX() + "," + e.getY() + "]");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		texto.setText("Mouse na Janela");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		texto.setText("Mouse fora da Janela");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		texto.setText("Pressionado em [" + e.getX() + "," + e.getY() + "]");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		texto.setText("Liberado em [" + e.getX() + "," + e.getY() + "]");
		
	}
	
	

	
}
