package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double valorUm = 0;
    int operacao = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicar(View view) {
        TextView txtResultado = findViewById(R.id.txtResultado);

        String valorResultado = txtResultado.getText().toString();

        if (view.getId() == R.id.btnUm) {
            txtResultado.setText(valorResultado + "1");
        }

        if (view.getId() == R.id.btnDois) {
            txtResultado.setText(valorResultado + "2");
        }

        if (view.getId() == R.id.btnTres) {
            txtResultado.setText(valorResultado + "3");
        }

        if (view.getId() == R.id.btnQuatro) {
            txtResultado.setText(valorResultado + "4");
        }

        if (view.getId() == R.id.btnCinco) {
            txtResultado.setText(valorResultado + "5");
        }

        if (view.getId() == R.id.btnSeis) {
            txtResultado.setText(valorResultado + "6");
        }

        if (view.getId() == R.id.btnSete) {
            txtResultado.setText(valorResultado + "7");
        }

        if (view.getId() == R.id.btnOito) {
            txtResultado.setText(valorResultado + "8");
        }

        if (view.getId() == R.id.btnNove) {
            txtResultado.setText(valorResultado + "9");
        }

        if (view.getId() == R.id.btnZero) {
            txtResultado.setText(valorResultado + "0");
        }

        if (view.getId() == R.id.btnPonto){
            txtResultado.setText(valorResultado + ".");
        }

        if (view.getId() == R.id.btnLimpar){
            txtResultado.setText(" ");
        }


        // Operação de Soma
        if (view.getId() == R.id.btnSoma) {
            valorUm = Double.parseDouble(valorResultado);
            operacao = 1;
            txtResultado.setText("");
        }

        // Operação de Subtração
        if (view.getId() == R.id.btnSubtracao) {
            valorUm = Double.parseDouble(valorResultado);
            operacao = 2;
            txtResultado.setText("");
        }

        // Operação de Multiplicação
        if (view.getId() == R.id.btnMultiplicacao) {
            valorUm = Double.parseDouble(valorResultado);
            operacao = 3;
            txtResultado.setText("");
        }

        // Operação de Divisão
        if (view.getId() == R.id.btnDivisao) {
            valorUm = Double.parseDouble(valorResultado);
            operacao = 4;
            txtResultado.setText("");
        }

        // Operação de Porcentagem
        if (view.getId() == R.id.btnPorcentagem) {
            valorUm = Double.parseDouble(valorResultado);
            operacao = 5;
            txtResultado.setText("");
        }

        // Operação de Potência
        if (view.getId() == R.id.btnPotencia) {
            valorUm = Double.parseDouble(valorResultado);
            operacao = 6;
            txtResultado.setText("");
        }

        // Operação Igual
        if (view.getId() == R.id.btnIgual) {
            Double valorDois = Double.parseDouble(valorResultado);
            if (operacao == 1) {
                Double resultado = valorUm + valorDois;
                txtResultado.setText(resultado.toString());
            }
            if (operacao == 2) {
                Double resultado = valorUm - valorDois;
                txtResultado.setText(resultado.toString());
            }
            if (operacao == 3) {
                Double resultado = valorUm * valorDois;
                txtResultado.setText(resultado.toString());
            }
            if (operacao == 4) {
                Double resultado = valorUm / valorDois;
                txtResultado.setText(resultado.toString());
            }
            if (operacao == 5) {
                Double resultado = (valorUm * valorDois) / 100 ;
                txtResultado.setText(resultado.toString());
            }
            if (operacao == 6) {
                Double resultado =  Math.pow(valorUm, valorDois );
                txtResultado.setText(resultado.toString());
            }

            // Operação de Limpar
            if (view.getId() == R.id.btnLimpar) {
                valorUm = Double.parseDouble(valorResultado);
                txtResultado.setText("");
            }
        }
    }
}









//Activity
//classe R - referencia para os recursos
//xml