package sg.edu.rp.c346.id20037834.p09_ndpsongs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Song> al;
    ArrayAdapter<Song> aa;
    EditText etSongTitle, etSinger, etYear;
    RadioGroup rgRating;
    RadioButton rb1,rb2,rb3,rb4,rb5;
    Button btnInsert, btnShowList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etSongTitle = findViewById(R.id.etSongTitle);
        etSinger = findViewById(R.id.etSingerName);
        etYear = findViewById(R.id.etYear);
        rgRating = findViewById(R.id.rgRating);
        rb1 = findViewById(R.id.radioButton);
        rb2 = findViewById(R.id.radioButton2);
        rb3 = findViewById(R.id.radioButton3);
        rb4 = findViewById(R.id.radioButton4);
        rb5 = findViewById(R.id.radioButton5);
        btnInsert = findViewById(R.id.btnInsert);
        btnShowList = findViewById(R.id.btnShowList);
        aa = new ArrayAdapter<Song>(this, android.R.layout.simple_list_item_1, al);


        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DBHelper db = new DBHelper(MainActivity.this);
                db.insertSong(etSongTitle.getText().toString());
                db.insertSong(etSinger.getText().toString());
                db.insertSong(etSongTitle.getText().toString());

                switch(rgRating.getCheckedRadioButtonId()){
                    case 0:
                        if(rb1.isSelected()){
                            db.insertSong(rb1.getText().toString());
                            break;
                        }
                    case 1:
                        if(rb2.isSelected()){
                            db.insertSong(rb2.getText().toString());
                            break;
                        }
                    case 2:
                        if(rb3.isSelected()){
                            db.insertSong(rb3.getText().toString());
                            break;
                        }
                    case 3:
                        if(rb4.isSelected()){
                            db.insertSong(rb4.getText().toString());
                            break;
                        }
                    case 4:
                        if(rb5.isSelected()){
                            db.insertSong(rb5.getText().toString());
                            break;
                        }
                }
            }
        });

        btnShowList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toViewAllSongs = new Intent(MainActivity.this , ViewAllSongs.class);
                startActivity(toViewAllSongs);
            }
        });


    }

}