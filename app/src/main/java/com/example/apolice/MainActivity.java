package com.example.apolice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity  {

    EditText textName, textNumber, textIdade, textSexo, textValor;
    TextView textApolice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Adicionar valor do campo na variavel.
        textName = findViewById(R.id.textName); //R = Classe com o id de todos os atributos
        textNumber = findViewById(R.id.textNumber);
        textIdade = findViewById(R.id.textIdade);
        textSexo = findViewById(R.id.textSexo);
        textValor = findViewById(R.id.textValor);

        textApolice = findViewById(R.id.textApolice);


        //Erro na criação do metodo!

        /*
        public void calcular(View view){

        }
         */


        //Metodo calcular:
            int number = Integer.parseInt(textNumber.getText().toString());
            String name = textName.getText().toString();
            int idade = Integer.parseInt(textIdade.getText().toString());
            char sexo = textSexo.getText().toString().charAt(0);    //charAt para converter em Char
            double valor = Double.parseDouble(textValor.getText().toString());


            Apolice apolice = new Apolice(number, name, idade, sexo, valor);
            //Verificar com professor se é possivel usar Spring e injeção de dependências

            textApolice.setText("R$ " + apolice.calcularValor());
        //Acaba metodo

    }
}