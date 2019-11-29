package iubat.fragmentexample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import iubat.fragmentexample.Fragments.FragmentOne;
import iubat.fragmentexample.Fragments.FragmentTwo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectFrag(View view) {
        Fragment fr = new Fragment() ;

        if(view == findViewById(R.id.buttonFragement1)) {
            fr = new FragmentOne();
        }else  if(view == findViewById(R.id.buttonFragment2)) {
            fr = new FragmentTwo();
        }else{
            Toast.makeText(MainActivity.this, "No Fragment is called!", Toast.LENGTH_SHORT).show();
        }
        if(fr!=null) {
            android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
            android.support.v4.app.FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_place, fr);
            fragmentTransaction.commit();
        }
    }
}
