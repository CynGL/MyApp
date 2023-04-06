package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;

public class MainActivity extends AppCompatActivity {
    //Declarar a variavel global da toolbar
    MaterialToolbar idToolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //declarar o xml para o java
        idToolBar = findViewById(R.id.idToolBar);

        //colocar a ação de clique o icone do menu
        idToolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Cliquei no menu", Toast.LENGTH_SHORT).show();

            }
        });
        idToolBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.mFavorito:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei Favorito",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mCompartilhar:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei no Compartilhar",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mPesquisar:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei no Pesquisar",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mNotificacao:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei na Notificação",
                                Toast.LENGTH_SHORT).show();
                        break;

                }
                return true;
            }
        });
    }
}