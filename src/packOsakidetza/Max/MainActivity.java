package packOsakidetza.Max;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TableRow;
import android.widget.Toast;

public class MainActivity extends Activity
{
    TableRow tr1,tr2,tr3,tr4;
    boolean clickReady;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        tr1 = (TableRow)findViewById(R.id.tr1);
        tr2 = (TableRow)findViewById(R.id.tr2);
        tr3 = (TableRow)findViewById(R.id.tr3);
        tr4 = (TableRow)findViewById(R.id.tr4);
        
        clickReady = false;
        
        //LISTENERS DE LAS FILAS DE LAS TABLAS
        //PARA EL EFECTO DEL COLOR DE FONDO AL PASAR EL DEDO POR ENCIMA
        tr1.setOnTouchListener(new OnTouchListener() {

            public boolean onTouch(View v, MotionEvent event) {
                Rect rect = new Rect(v.getLeft(), v.getTop(), v.getRight(), v.getBottom());
                switch (event.getAction())
                {
                    case MotionEvent.ACTION_DOWN:
                        tr1.setBackgroundResource(R.drawable.first_row_shape_pressed); 
                        clickReady = true;
                        break;
                        
                    case MotionEvent.ACTION_UP:
                        tr1.setBackgroundResource(R.drawable.first_row_shape);
                        if(clickReady)
                        {                           
                            clickReady = false;
                            clickBtn1(v);
                        }
                        break;
                        
                    case MotionEvent.ACTION_MOVE:
                        if(!rect.contains((int)event.getX(), (int)event.getY()))
                        {
                            tr1.setBackgroundResource(R.drawable.first_row_shape);
                            clickReady = false;
                        }   
                        break;
                }
                return true;
            }
        });
        
        tr2.setOnTouchListener(new OnTouchListener() {

            public boolean onTouch(View v, MotionEvent event) {
                Rect rect = new Rect(v.getLeft(), v.getTop(), v.getRight(), v.getBottom());
                switch (event.getAction())
                {
                    case MotionEvent.ACTION_DOWN:
                        tr2.setBackgroundResource(R.drawable.inner_row_shape_pressed);
                        clickReady = true;
                        break;
                        
                    case MotionEvent.ACTION_UP:
                        tr2.setBackgroundResource(R.drawable.inner_row_shape);
                       if(clickReady)
                        {                           
                            clickReady = false;
                            clickBtn2(v);
                        }
                        break;
                        
                    case MotionEvent.ACTION_MOVE:
                        if(!rect.contains((int)event.getX(), (int)event.getY()))
                        {
                            tr2.setBackgroundResource(R.drawable.inner_row_shape);
                            clickReady = false;
                        } 
                        break;
                }
                return true;
            }
        });
        
        tr3.setOnTouchListener(new OnTouchListener() {

            public boolean onTouch(View v, MotionEvent event) {
                Rect rect = new Rect(v.getLeft(), v.getTop(), v.getRight(), v.getBottom());
                switch (event.getAction())
                {
                    case MotionEvent.ACTION_DOWN:
                        tr3.setBackgroundResource(R.drawable.inner_row_shape_pressed);
                        clickReady = true;
                        break;
                        
                    case MotionEvent.ACTION_UP:
                        tr3.setBackgroundResource(R.drawable.inner_row_shape);
                        if(clickReady)
                        {                           
                            clickReady = false;
                            clickBtn3(v);
                        }
                        break;
                        
                    case MotionEvent.ACTION_MOVE:                        
                        if(!rect.contains((int)event.getX(), (int)event.getY()))
                        {
                            tr3.setBackgroundResource(R.drawable.inner_row_shape);
                            clickReady = false;
                        }   
                        break;
                }
                return true;
            }
        });
        
        tr4.setOnTouchListener(new OnTouchListener() {

            public boolean onTouch(View v, MotionEvent event) {
                Rect rect = new Rect(v.getLeft(), v.getTop(), v.getRight(), v.getBottom());
                switch (event.getAction())
                {
                    case MotionEvent.ACTION_DOWN:
                        tr4.setBackgroundResource(R.drawable.last_row_shape_pressed);
                        clickReady = true;
                        break;
                        
                    case MotionEvent.ACTION_UP: 
                        tr4.setBackgroundResource(R.drawable.last_row_shape);
                        if(clickReady)
                        {                           
                            clickReady = false;
                            clickBtn4(v);
                        }
                        break;
                        
                    case MotionEvent.ACTION_MOVE:
                        if(!rect.contains((int)event.getX(), (int)event.getY()))
                        {
                            tr4.setBackgroundResource(R.drawable.last_row_shape);
                            clickReady = false;
                        }   
                        break;
                }
                return true;
            }
        });        
    }
    
    public void clickBtn1(View view)
    {
        startActivity(new Intent(this, CitaPrevia.class));
    }
    
    public void clickBtn2(View view)
    {
        Toast toast = Toast.makeText(this, "Has pulsado en botón 2", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void clickBtn3(View view)
    {
        Toast toast = Toast.makeText(this, "¡hola mundo!", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void clickBtn4(View view)
    {
        Uri number = Uri.parse("tel:945017100");
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
        startActivity(callIntent);
    }
}
