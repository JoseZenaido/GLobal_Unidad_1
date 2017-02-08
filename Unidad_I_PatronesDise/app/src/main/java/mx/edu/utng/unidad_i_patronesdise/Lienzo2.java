package mx.edu.utng.unidad_i_patronesdise;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by jony on 8/9/2016.
 */
public class Lienzo2 extends View {

    private Estrella2 estrella;

    public Lienzo2(Context context, Estrella2 estrella){
        super(context);
        this.estrella = estrella;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(estrella !=null){
            estrella.dibujar(canvas, estrella.getColor());
        }
    }

    public Estrella2 getEstrella() {
        return estrella;
    }

    public void setEstrella(Estrella2 estrella) {
        this.estrella = estrella;
    }
}
