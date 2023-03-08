package code;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

class Singleton {
    private static Singleton instancia = null;
    private Singleton() {
    }
    
    public static Singleton obtenerInstancia() {
        if(instancia == null)
            instancia = new Singleton();
        return instancia;
    }
    
    public void iniciarJuego() {
        JFrame frame = new JFrame( "YetAnotherChessGame 1.0" );
        frame.setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
        frame.getContentPane().add( new ChessPanel() );
        frame.pack();
        frame.setVisible( true );
    }
}

class SingletonMain {
    public static void main( String[] args ){
        Singleton juego1;
        juego1 = Singleton.obtenerInstancia();
        juego1.iniciarJuego();
    }
}


