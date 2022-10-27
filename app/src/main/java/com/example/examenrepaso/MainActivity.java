package com.example.examenrepaso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection

        switch (item.getItemId()) {
            case R.id.activitySpinner:
                Toast.makeText(MainActivity.this,"Spinner", Toast.LENGTH_SHORT).show();
                Intent spinners = new Intent(MainActivity.this,SpinnersActivity.class);
                startActivity(spinners);
                return true;
            case R.id.submenuopcion1:
                 final int REQUEST_IMAGE_CAPTURE = 1;
                 final Uri locationForPhotos = null;
                Toast.makeText(MainActivity.this,"Redirigiendo a la camara", Toast.LENGTH_SHORT).show();
                Intent camara = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

              //camara.putExtra(MediaStore.EXTRA_OUTPUT,
             // Uri.withAppendedPath(Uri.parse("/sdcard/DCIM/Camera"), "fotoEjemplo"));

                startActivity(camara);
                return true;
            case R.id.submenuopcion2:
                Toast.makeText(MainActivity.this,"Redirigiendo a calendario", Toast.LENGTH_SHORT).show();
                Intent calendario = new Intent();
                startActivity(calendario);
                return true;
            case R.id.activityDialog:
                Toast.makeText(MainActivity.this,"Dialog", Toast.LENGTH_SHORT).show();
                Intent dialogos = new Intent(MainActivity.this,DialogActivity.class);
                startActivity(dialogos);

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}