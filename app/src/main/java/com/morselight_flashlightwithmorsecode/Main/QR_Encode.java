package com.morselight_flashlightwithmorsecode.app.Main;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.morselight_flashlightwithmorsecode.app.R;
import com.google.zxing.Result;

import org.jetbrains.annotations.NotNull;

import androidmads.library.qrgenearator.QRGContents;
import androidmads.library.qrgenearator.QRGEncoder;

public class QR_Encode extends AppCompatActivity {

    EditText qrvalue;
    Button generateBtn;
    ImageView qrImage;



    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qr_encode);

        qrvalue = findViewById(R.id.qrInput);
        generateBtn = findViewById(R.id.generateBtn);
        qrImage = findViewById(R.id.qrPlaceHolder);


        generateBtn.setOnClickListener(v -> {
            String data = qrvalue.getText().toString();

            if (data.isEmpty()) {
                qrvalue.setError("Value Required!!");

            } else {
                QRGEncoder qrgEncoder = new QRGEncoder(data, null, QRGContents.Type.TEXT, 500);
                try {
                    Bitmap qrBits = qrgEncoder.getBitmap();
                    qrImage.setImageBitmap(qrBits);
                    Toast.makeText(getApplicationContext(),"QR Code Generated",Toast.LENGTH_LONG).show();

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
    }

}
