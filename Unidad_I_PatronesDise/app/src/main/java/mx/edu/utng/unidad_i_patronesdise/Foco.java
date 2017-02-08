package mx.edu.utng.unidad_i_patronesdise;

import android.graphics.Canvas;

/**
 * Created by juan- on 11/09/2016.
 */
public class Foco {

    private Control1 estado;
    private Canvas canvas;

    public Foco(Control1 estado){
        this.estado=estado;
    }

    public  void presionarBoton(){
        estado.presionarSwitch(this,canvas);
    }
    public Control1 getEstado() {
        return estado;
    }

    public void setEstado(Control1 estado) {
        this.estado = estado;
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }




}

