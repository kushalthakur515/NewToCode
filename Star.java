import java.applet.Applet ;
import java.awt.* ;
import java.lang.Math ;

public class SnowFlakeBasic extends Applet
{
  Graphics graph;
   
  private void drawStar( int x, int y, int size )
  {
    int endX, endY ;
    
    // Six lines radiating from (x,y)
    for ( int i = 0; i<6; i++ )
    {
      endX = x + (int)(size*Math.cos( (2*Math.PI/6)*i ));
      endY = y - (int)(size*Math.sin( (2*Math.PI/6)*i ));
      graph.drawLine( x, y, endX, endY );
    }
  }
         
  public void paint ( Graphics gr )
  { 
    graph = gr;
    int width  = getSize().width;
    int height = getSize().height;
    int min;
    
    setBackground( Color.white );
    gr.setColor  ( Color.blue  );
    
    if ( height > width )
      min = height;
    else
      min = width;
      
    drawStar( width/2, height/2, min/4 );
  }
}
