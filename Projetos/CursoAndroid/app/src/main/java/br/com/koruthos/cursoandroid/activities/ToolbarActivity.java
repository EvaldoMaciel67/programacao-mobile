package br.com.koruthos.cursoandroid.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import br.com.koruthos.cursoandroid.R;
import br.com.koruthos.cursoandroid.databinding.ActivityToolbarBinding;

public class ToolbarActivity extends AppCompatActivity {

    private static final String TAG = "Toolbar";
    private ActivityToolbarBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Amarração dos componentes do layout
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_toolbar);

        // Customizar a toolbar
        setSupportActionBar(mBinding.toolbar);

        // Altera o titulo da toolbar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(R.string.app_name);
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        }

    }

    /**
     * Sobrescrever este método para definir qual sera o layout do menu da toolbar.
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar, menu);
        return true;
    }

    /**
     * Sobrescrever este metodo para tratar as opcoes de menu.
     *
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_toolbar_salvar:
                salvar();
                return true;
            case R.id.action_toolbar_editar:
                editar();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void editar() {
        Toast.makeText(this, "EDITAR", Toast.LENGTH_SHORT).show();
    }

    private void salvar() {
        Toast.makeText(this, "SALVAR!", Toast.LENGTH_SHORT).show();
        Intent it = new Intent(this, BotoesActivity.class);
        startActivity(it);
    }
}
