package mx.edu.utng.unidad_i_patronesdise;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

import java.util.ArrayList;


/**
 * Created by ZENAIDO-PC on 01/02/2017.
 */
public class PrototypeActivity10 extends AppCompatActivity {
    private EditText edtMarca;
    private EditText edtColor;
    private  EditText edtNumSerie;
    private EditText edtRodada;

    private Button btnClonar;

    private GridView grvBisi;
    private ArrayList<Bisicleta>bisicletas;
    private Bisicleta bisicleta;
    private BisicletaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prototype10);
        edtMarca = (EditText)findViewById(R.id.edt_marcabisi);
        edtColor = (EditText)findViewById(R.id.edt_colorVisicle);
        edtNumSerie = (EditText)findViewById(R.id.edt_n_serieBi);
        edtRodada =(EditText)findViewById(R.id.edt_rodada);

        btnClonar = (Button)findViewById(R.id.btn_clonarbisicle);

        grvBisi = (GridView)findViewById(R.id.grv_bisicleta);

        bisicletas= new ArrayList<Bisicleta>();
        bisicleta = new Bisicleta();

        btnClonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bisicleta.setMarca(edtMarca.getText().toString());
                bisicleta.setColor(edtColor.getText().toString());
                bisicleta.setNumSerie(edtNumSerie.getText().toString());
                bisicleta.setRodada(edtRodada.getText().toString());

               /* botella.setContenido(Integer.parseInt(edtContenido.getText().toString()));*/

                Bisicleta clon = (Bisicleta) bisicleta.clonable();
                bisicletas.add(clon);

                adapter = new BisicletaAdapter(PrototypeActivity10.this, (ArrayList)bisicletas);
                grvBisi.setAdapter(adapter);
            }
        });


    }




}
