package br.com.koruthos.cursoandroid.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import br.com.koruthos.cursoandroid.R;
import br.com.koruthos.cursoandroid.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Main";

    /**
     * Declara uma variável para acessar o objeto de binding dos componentes
     * da tela da activity.
     */
    private ActivityMainBinding mBinding;

    /**
     * Tarefas do onCreate()
     * - Define o layout que será carregado na activity
     * - Define os eventos
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: ");

        // Carrega o layout através do data binding
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        // Acesso às views do layout
        mBinding.mainTxtHello.setText(R.string.alo_mamae);

        // Cadastra os eventos nos botoes
        mBinding.mainBtnLinearHorizontal.setOnClickListener(v -> exibirActivityLinear());
        mBinding.mainBtnFrame.setOnClickListener(v -> exibirActivityFrame());
        mBinding.mainBtnVisibilidade.setOnClickListener(v -> exibirVisibilidadeActivity());
        mBinding.mainBtnSair.setOnClickListener(v -> finish());

        // --- MODO TRADICIONAL ----
        // Define o layout da activity
        //setContentView(R.layout.activity_main);

        // Modo tradicional de acesso às views do layout
        //TextView hello = findViewById(R.id.hello);
        //hello.setText("Alô, mamãe!");
        // --- FIM MODO TRADICIONAL ----

        // Cadastra a toolbar na activity
        setSupportActionBar(mBinding.toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(R.string.app_name);
        }


        // Criação dos itens da navigation drawer
        PrimaryDrawerItem item1 = new PrimaryDrawerItem()
                .withIdentifier(1)
                .withName("Item 1");

        PrimaryDrawerItem item2 = new PrimaryDrawerItem()
                .withIdentifier(2)
                .withName("Item 2");

        SecondaryDrawerItem item3 = new SecondaryDrawerItem()
                .withIdentifier(3)
                .withName("Item 3");

        // Criação do header
        final AccountHeader header = new AccountHeaderBuilder()
                .withActivity(this)
                .withHeaderBackground(R.drawable.ic_launcher_background)
                .addProfiles(
                        new ProfileDrawerItem()
                                .withName("Fred Flintstones")
                                .withEmail("flintstons@email.com")
                                .withIcon(getResources().getDrawable(R.drawable.ic_launcher_background))
                )
                .build();

        // Configura a navigation drawer
        Drawer builder = new DrawerBuilder()
                .withActivity(this)
                .withToolbar(mBinding.toolbar)
                .withAccountHeader(header)
                .addDrawerItems(
                        item1,
                        item2,
                        new DividerDrawerItem(),
                        item3
                )
                .withOnDrawerItemClickListener((view, position, drawerItem) -> {
                    Toast.makeText(this, drawerItem.toString(), Toast.LENGTH_SHORT).show();
                    return true;
                })
                .build();






        // Tipos de log
        Log.v(TAG, "onCreate: VERBOSE");
        Log.d(TAG, "onCreate: DEBUG");
        Log.i(TAG, "onCreate: INFO");
        Log.w(TAG, "onCreate: WARN");
        Log.e(TAG, "onCreate: ERROR");
        Log.wtf(TAG, "onCreate: WTF?");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    private void exibirActivityLinear() {
        Log.d(TAG, "exibirActivityLinear: ");

        // Intenções são usadas para invocar alguma outra activity
        Intent it = new Intent(this, LayoutLinearActivity.class);
        startActivity(it);
    }


    private void exibirActivityFrame() {
        Log.d(TAG, "exibirActivityFrame: ");
        // Intenções são usadas para invocar alguma outra activity
        Intent it = new Intent(this, LayoutFrameActivity.class);
        startActivity(it);
    }


    private void exibirVisibilidadeActivity() {
        Log.d(TAG, "exibirVisibilidadeActivity: ");
        // Intenções são usadas para invocar alguma outra activity
        Intent it = new Intent(this, VisibilidadeActivity.class);
        startActivity(it);
    }

    /**
     * Sobrescrever este metodo para definir qual sera o layout a ser carregado
     * na toolbar
     *
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_salvar:
                Toast.makeText(this, "Salvando alguma coisa", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
