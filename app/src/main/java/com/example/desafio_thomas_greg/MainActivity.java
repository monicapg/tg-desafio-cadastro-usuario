package com.example.desafio_thomas_greg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.desafio_thomas_greg.ui.UserListFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btnMain);
        button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          setContentView(R.layout.layout_list);

//                                          // Crie uma instância do fragmento
//                                          UserListFragment fragment = new UserListFragment();
//
//                                          // Adicione o fragmento ao contêiner
//                                          getSupportFragmentManager().beginTransaction()
//                                                  .replace(R.id.activity_main, fragment)
//                                                  .commit();

                                          Intent intent = new Intent(MainActivity.this, UserListFragment.class);
                                          startActivity(intent);
                                      }
                                  }
        );
    }

}