package com.example.asus.listas;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    private static final String[] CORES = new String[] {"Verde","Azul","Amarelo","Branco"};
    private ArrayAdapter<String> meuAdaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);

     meuAdaptador  = new ArrayAdapter(this,android.R.layout.simple_list_item_1, CORES);
        setListAdapter(meuAdaptador);
}

    @Override
    protected void onListItemClick (ListView l, View v, int posicao, long id)
    {
        super.onListItemClick(l, v, posicao, id);
        Toast.makeText(this, "Usuário selecionou a cor " + CORES[posicao], Toast.LENGTH_SHORT).show();
    }

}
