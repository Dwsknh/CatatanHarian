package kominfo.go.id.storage.proyek1;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;
import android.widget.Toolbar;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_STORAGE = 100;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Aplikasi Catatan Proyek :");
        listView = findViewById(R.id.listView);
        listView.setOnItemClickListener(new
                                                AdapterView.OnItemClickListener() {
                                                    @Override
                                                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                        Intent intent = new Intent(MainActivity.this, InsertAndViewActivity.class);
                                                        Map<String, Object> data = (Map<String, Object>) parent.getAdapter().getItem(position);
                                                        intent.putExtra("filename", data.get("name".toString());
                                                    }
                                                }
        );
                                                        listView.setOnItemLongClickListener(new
                                                                                                    AdapterView.OnItemLongClickListener() {
                                                                                                        @Override
                                                                                                        public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                                                                                                            Map<String, Object> data = (Map<String, Object>) parent.getAdapter().getItem(position);
                                                                                                            
                                                                                                            tampilkanDialogKonfirmasiHapusCatatan(data.get("nama").toString());
                                                                                                            return true;
                                                                                                        }
                                                                                                    });
                                                                                               
                                                        
    }

    private void tampilkanDialogKonfirmasiHapusCatatan(String nama) {
    }
}