package packOsakidetza.Max;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class PedirCita extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pedir_cita);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pedir_cita, menu);
		return true;
	}

}
