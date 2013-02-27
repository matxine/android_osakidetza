/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package packOsakidetza.Max;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

/**
 *
 * @author Max
 */
public class CitaPrevia extends Activity {
	
	private Button bAceptar;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.cita_previa);
        
        bAceptar = (Button)findViewById(R.id.btnAceptar);
        bAceptar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) 
			{
				onAceptar();			
			}
		});
    }
    
    private void onAceptar()
    {
    	EditText v_tis = (EditText)findViewById(R.id.inNumTis);
    	Spinner v_dia = (Spinner)findViewById(R.id.spinDia);
    	Spinner v_mes = (Spinner)findViewById(R.id.spinMes);
    	Spinner v_year = (Spinner)findViewById(R.id.spinYear);
    	
    	String tis = v_tis.getText().toString();
    	String dia = v_dia.getSelectedItem().toString();
    	String mes = v_mes.getSelectedItem().toString();
    	String year = v_year.getSelectedItem().toString();
    	
    	Intent in = new Intent(this, DatosCita.class);
    	in.putExtra("Tis", tis);
    	in.putExtra("FechaNac", dia +"/"+mes+"/"+year);
    	startActivity(in);
    }
}

