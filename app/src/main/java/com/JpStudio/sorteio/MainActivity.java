package com.JpStudio.sorteio;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alterarText(View view){

        //Scanner s = new Scanner(System.in);
        //int nI, nF, nf;

        //System.out.print("Escolha até que numero irá o sorteio: ");
        //nf = s.nextInt();
        //nF = nf + 1;

        int num = new Random().nextInt(11);
        //TextView texto2 = findViewById(R.id.textTwo);
        //texto2.setText("Será sorteado um número de 0 a "+nF);
        TextView texto = findViewById(R.id.textTwo);
        texto.setText("O número sorteado foi: "+num);

    }

}