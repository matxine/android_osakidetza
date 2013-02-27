package packOsakidetza.Max;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DatosCita extends Activity {

	private int tis;
	private String fechaNac;
	
	private TextView textDatos;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.datos_cita);
		
		Intent in = getIntent();
		tis = in.getExtras().getInt("Tis");
		fechaNac = in.getExtras().getString("FechaNac");
		
		textDatos = (TextView)findViewById(R.id.datosParaCita);
		textDatos.setText(fechaNac);
	}
}
