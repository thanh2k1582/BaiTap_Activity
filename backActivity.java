package thanh15081103.example.list_music_activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class backActivity extends AppCompatActivity {
    private Button back;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.back);
        back = (Button) findViewById(R.id.btn_back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(backActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
