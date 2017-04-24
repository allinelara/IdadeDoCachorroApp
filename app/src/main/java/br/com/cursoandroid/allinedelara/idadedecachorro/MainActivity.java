package br.com.cursoandroid.allinedelara.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText caixaDeEntradaId;
    private Button botaoDescobrirIdadeId;
    private TextView resultadoId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixaDeEntradaId = (EditText) findViewById(R.id.caixaDeTextoId);
        botaoDescobrirIdadeId = (Button) findViewById(R.id.botaoDescobrirIdadeId);
        resultadoId = (TextView) findViewById(R.id.resultadoId);

        botaoDescobrirIdadeId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoDigitado = caixaDeEntradaId.getText().toString();
                if(textoDigitado.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Nenhum número digitado.", Toast.LENGTH_LONG).show();
                }else {
                    int num = Integer.parseInt(textoDigitado);
                    int idade = num * 7;
                    resultadoId.setText("A idade do seu chachorro é igual a " + idade + " ano(s)");
                }
            }
        });
    }
}
