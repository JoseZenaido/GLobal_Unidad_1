package mx.edu.utng.unidad_i_patronesdise;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by ZENAIDO-PC on 14/09/2016.
 */
public class Lienso8 extends View {

    private Arbol arbol;

    public Lienso8(Context context, Arbol arbol){
        super(context);
        this.arbol = arbol;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(arbol!=null){
            arbol.dibujar(canvas, arbol.getColor());
        }
    }

    public Arbol getArbol() {

        return arbol;
    }

    public void setArbol(Arbol arbol) {

        this.arbol = arbol;
    }
}
