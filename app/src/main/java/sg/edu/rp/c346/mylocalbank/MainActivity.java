package sg.edu.rp.c346.mylocalbank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView btnDBS;
    TextView btnOCBC;
    TextView btnUOB;
    String wordClicked="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDBS=findViewById(R.id.DBS);
        btnOCBC=findViewById(R.id.OCBC);
        btnUOB=findViewById(R.id.UOB);

        registerForContextMenu(btnDBS);
        registerForContextMenu(btnOCBC);
        registerForContextMenu(btnUOB);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        //…
        menu.add(0, 0, 0, "Website");
        menu.add(0, 1, 1, "Contact the Bank");
        getMenuInflater().inflate(R.menu.menu_main, menu);
        if (v == btnDBS) {
            wordClicked = "DBS"
        }else if(v==btnOCBC){
            wordClicked = "OCBC"
        }else(v==btnUOB){
            wordClicked = "UOB"
        }
    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        // …
        if (item.getItemId() == 0) { //check whether the selected menu item ID is 0
            //code for action
            btnUOB.setText("DBS");
            Intent intentCall = new Intent(Intent.ACTION_View, Uri.parse("https://www.dbs.com.sg"));
            startActivity(intentCall);

            //Toast.makeText(MainActivity.this, "English is chosen", Toast.LENGTH_SHORT).show();

            return true; //menu item successfully handled
        } else if (item.getItemId() == 1) { //check if the selected menu item ID is 1
            //code for action
            btnUOB.setText("DBS");
            Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+18001111111));
            startActivity(intentCall);
            //Toast.makeText(MainActivity.this, "Italian is chosen", Toast.LENGTH_SHORT).show();

            return true;  //menu item successfully handled
        }
        return super.onContextItemSelected(item);
    }
    public boolean onContextItemSelected(MenuItem item) {
        // …
        if (item.getItemId() == 0) { //check whether the selected menu item ID is 0
            //code for action
            btnUOB.setText("OCBC");
            Intent intentCall = new Intent(Intent.ACTION_View, Uri.parse("https://www.ocbc.com"));
            startActivity(intentCall);

            //Toast.makeText(MainActivity.this, "English is chosen", Toast.LENGTH_SHORT).show();

            return true; //menu item successfully handled
        } else if (item.getItemId() == 1) { //check if the selected menu item ID is 1
            //code for action
            btnUOB.setText("OCBC");
            Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+18003633333));
            startActivity(intentCall);
            //Toast.makeText(MainActivity.this, "Italian is chosen", Toast.LENGTH_SHORT).show();

            return true;  //menu item successfully handled
        }
        return super.onContextItemSelected(item);
    }
    public boolean onContextItemSelected(MenuItem item) {
        // …
        if (item.getItemId() == 0) { //check whether the selected menu item ID is 0
            //code for action
            btnUOB.setText("UOB");
            Intent intentCall = new Intent(Intent.ACTION_View, Uri.parse("https://www.uob.com.sg"));
            startActivity(intentCall);

            //Toast.makeText(MainActivity.this, "English is chosen", Toast.LENGTH_SHORT).show();

            return true; //menu item successfully handled
        } else if (item.getItemId() == 1) { //check if the selected menu item ID is 1
            //code for action
            btnUOB.setText("UOB");
            Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+18002222121));
            startActivity(intentCall);
            //Toast.makeText(MainActivity.this, "Italian is chosen", Toast.LENGTH_SHORT).show();

            return true;  //menu item successfully handled
        }
        return super.onContextItemSelected(item);
    }
}