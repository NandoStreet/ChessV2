package code;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

class Factory {
    public ChessGamePiece crearPieza(ChessGameBoard tablero, String pieza, int color, int columna, int fila){
       ChessGamePiece objPieza = null;
       if("King".equals(pieza))
           objPieza = new King(tablero, columna, fila, color);
       else if("Queen".equals(pieza))
           objPieza = new Queen(tablero, columna, fila, color);
       else if("Rook".equals(pieza))
           objPieza = new Rook(tablero, columna, fila, color);
       else if("Knight".equals(pieza))
           objPieza = new Knight(tablero, columna, fila, color);
       else if("Bishop".equals(pieza))
           objPieza = new Bishop(tablero, columna, fila, color);
       else if("Pawn".equals(pieza))
           objPieza = new Pawn(tablero, columna, fila, color);
       
       return objPieza;
    }
}

class FactoryMain {
    public static void main( String[] args ){
        JFrame frame = new JFrame( "YetAnotherChessGame 1.0" );
        frame.setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
        frame.getContentPane().add( new ChessPanel() );
        frame.pack();
        frame.setVisible( true );
    }
}


