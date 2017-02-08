package mx.edu.utng.unidad_i_patronesdise;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ZENAIDO-PC on 13/09/2016.
 */
public class BisicletaAdapter extends ArrayAdapter<Bisicleta> {
    public BisicletaAdapter(Context context, ArrayList<Bisicleta> bisicletas){
        super(context, 0, bisicletas);
    }

    public View getView(int position, View convertView, ViewGroup parent){
      Bisicleta bisicleta = getItem(position);
        if (convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.bisicleta_layout, parent,false);
        }
        TextView txvBisi = (TextView)convertView.findViewById(R.id.txv_bs);

        txvBisi.setText(bisicleta.getMarca()+" "+bisicleta.getColor()+" "+bisicleta.getNumSerie());
        return convertView;
    }
}
