package com.muhamadrifki192102139.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import cz.msebera.android.httpclient.Header;

public class addMahasiswaActivity extends AppCompatActivity {

    private Button _saveButton;
    private EditText _alamatEditText,_namaEditText,_nimEditText,_tahunMasukEditText,_tanggalLahitEditText,_tempatLahirEditText;
    private Spinner _jenisKelaminSpinner,_jpSpinner,_statusNikahSpinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_mahasiswa);

        initInputs();
        initSaveButton();

    }

    private void initSaveButton() {
    }

    private void initInputs() {
        _saveButton = findViewById(R.id.saveButton);
        _saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String alamat = _alamatEditText.getText().toString();
                String jenisKelamin = _jenisKelaminSpinner.getSelectedItem().toString();
                String jp = _jpSpinner.getSelectedItem().toString();
                String nama = _namaEditText.getText().toString();
                String nim = _nimEditText.getText().toString();
                String statusNikah = _statusNikahSpinner.getSelectedItem().toString();
                String tahunmasuk = _tahunMasukEditText.getText().toString();
                String tanggallahir = _tanggalLahitEditText.getText().toString();
                String tempatLahir = _tempatLahirEditText.getText().toString();

                try {
                    alamat = URLEncoder.encode(alamat,"utf-8");
                    nama = URLEncoder.encode(nama,"utf-8");
                    nim = URLEncoder.encode(nim,"utf-8");
                    tanggallahir = URLEncoder.encode(tanggallahir,"utf-8");
                    tempatLahir = URLEncoder.encode(tempatLahir,"utf-8");

                }catch (UnsupportedEncodingException e){
                    e.printStackTrace();
                }
            }
        });

    }
}