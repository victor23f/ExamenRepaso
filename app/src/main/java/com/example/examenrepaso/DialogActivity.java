package com.example.examenrepaso;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class DialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Titulo").
        setMessage("Mensaje").setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(DialogActivity.this, "Has elegido la opcion de aceptar", Toast.LENGTH_SHORT).show();

                            }
                        }).setNegativeButton("Cancel",new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(DialogActivity.this, "Has elegido la opcion de cancelar", Toast.LENGTH_SHORT).show();

                            }
                        });



                        AlertDialog dialog = builder.create();
        dialog.show();
    }


}