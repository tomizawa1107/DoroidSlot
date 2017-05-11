package com.example.sample.droidslot;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import java.util.Random;
import android.widget.Button;
import android.widget.Toast;

public class DroidSlotActivity extends AppCompatActivity {
    int droidSide1 = -1;
    int droidSide2 = -1;
    int droidSide3 = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_droid_slot);
        final ImageView droidImage1 = (ImageView) this.findViewById(R.id.droidimageid1);
        final ImageView droidImage2 = (ImageView) this.findViewById(R.id.droidimageid2);
        final ImageView droidImage3 = (ImageView) this.findViewById(R.id.droidimageid3);

        final Random r = new Random();
        final Button b1 = (Button) this.findViewById(R.id.slotbuttonid1);
        final Button b2 = (Button) this.findViewById(R.id.slotbuttonid2);
        final Button b3 = (Button) this.findViewById(R.id.slotbuttonid3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                droidSide1 = r.nextInt(4);
                int drawableId;
                switch (droidSide1) {
                    case 0:
                        drawableId = R.drawable.droid_front;
                        break;
                    case 1:
                        drawableId = R.drawable.droid_back;
                        break;
                    case 2:
                        drawableId = R.drawable.droid_left;
                        break;
                    default:
                        drawableId = R.drawable.droid_right;
                }
                droidImage1.setImageResource(drawableId);
                if(droidSide1 == droidSide2 && droidSide2 == droidSide3){
                    Toast.makeText(getApplicationContext(),"おめでとう揃いました",Toast.LENGTH_SHORT).show();
                }
                b1.setEnabled(false);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                droidSide2 = r.nextInt(4);
                int drawableId;
                switch (droidSide2) {
                    case 0:
                        drawableId = R.drawable.droid_front;
                        break;
                    case 1:
                        drawableId = R.drawable.droid_back;
                        break;
                    case 2:
                        drawableId = R.drawable.droid_left;
                        break;
                    default:
                        drawableId = R.drawable.droid_right;
                }
                droidImage2.setImageResource(drawableId);
                if(droidSide1 == droidSide2 && droidSide2 == droidSide3) {
                    Toast.makeText(getApplicationContext(), "おめでとう揃いました", Toast.LENGTH_SHORT).show();
                }
                b2.setEnabled(false);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                droidSide3 = r.nextInt(4);
                int drawableId;
                switch (droidSide3) {
                    case 0:
                        drawableId = R.drawable.droid_front;
                        break;
                    case 1:
                        drawableId = R.drawable.droid_back;
                        break;
                    case 2:
                        drawableId = R.drawable.droid_left;
                        break;
                    default:
                        drawableId = R.drawable.droid_right;
                }
                droidImage3.setImageResource(drawableId);
                if(droidSide1 == droidSide2 && droidSide2 == droidSide3) {
                    Toast.makeText(getApplicationContext(), "おめでとう揃いました", Toast.LENGTH_SHORT).show();
                }
                b3.setEnabled(false);
            }
        });

    }
}

