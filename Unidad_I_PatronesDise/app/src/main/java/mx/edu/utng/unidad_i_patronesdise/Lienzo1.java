package mx.edu.utng.unidad_i_patronesdise;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by juan- on 11/09/2016.
 */
public class Lienzo1 extends View{
    private Control1 estado;
    private Foco foco;
    public Lienzo1(Context context, Control1 estado, Foco foco){
        super(context);
        this.estado=estado;
        this.foco=foco;

    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(estado != null && foco != null){
            foco.setCanvas(canvas);
            estado.presionarSwitch(foco,canvas);
        }
    }

    public Foco getTv() {
        return foco;
    }

    public void setTv(Foco foco) {
        this.foco = foco;
    }

    public Control1 getEstado() {
        return estado;
    }
    public void setEstado(Control1 estado) {
        this.estado = estado;
    }
}
