package com.example.muhtamimnahid.androidlot_1traininggroup;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Student_List extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student__list);

        String[] name = {"Muhtamim Fuwad Nahid", "Mujaffar Talha", "Chowdhury Iftekhar", "Md Kamran Ahmed", "Manjur Ahmed", "Suhaz Chowdhury", "Ariyan Khan", "Titon Foyez", "S.k. Wahab Reza", "Abu Hanif Numani", "Atikur Rahman", "Kazi Ashique Elahi", "Tutul Chandradas", "Majed Ahmed", "Shishir Paul", "Syed Nadir", "Adil Chowdhury", "Asif Muntasir Shuaib", "Shaidur Rahman Tayef", "Zahid Mahmud Emon", "S.M. Nurnobi", "Ranjith", "Jhuma Chanda Gupa", "Syed Ahsan Sirat", "Ashraful Islam", "Sopnohin Ripon", "Diponkar", "PH Saurav", "MD Bürhån Khåñ", "Syed Sabbir Bin Mowrosh", "Zi Shaan", "Rakhi Mazumder", "Nasreen Tuli", "Ripon Ahmed", "Mazharul Islam Khan Tipu", "সাকিব চৌধুরী", "Sri Linkon", "Aysha Ahmed", "Mustafizur Rahaman Khan Raju", "Misbahur Rahman", "UtHso DAs ShoUrav", "Mahmudul Hasan", "Ikram Khan", "Md. Shajidur Rahman Nishan", "তাহমিদ আহমেদ চৌধুরী", "Rakid Hasan Chowdhury", "Foyzur Rahman", "Sadikur Rahman Khaled", "Abdullah Al Mamun", "Sarwar Ahmed", "Rajan Biswas", "Aminul Islam"};
        listView = (ListView) findViewById(R.id.List_View);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, name);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        Fragment fragment;
        if (i == 0)

        {
            fragment = new fragment_muhtamim();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment, fragment);
            fragmentTransaction.commit();

        }
        if (i == 1)

        {
            fragment = new mujaffar_fragment();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment, fragment);
            fragmentTransaction.commit();

        }

        if (i == 2)

        {
            fragment = new iffti_fragment();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment, fragment);
            fragmentTransaction.commit();

        }

        if (i == 3)

        {
            fragment = new akram();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment, fragment);
            fragmentTransaction.commit();

        }

        if (i == 4)

        {
            fragment = new Monjur();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment, fragment);
            fragmentTransaction.commit();

        }

        if (i == 5)

        {
            fragment = new suhaz_frgment();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment, fragment);
            fragmentTransaction.commit();

        }

        if (i == 6)

        {
            fragment = new aryanfragment();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment, fragment);
            fragmentTransaction.commit();

        }

    }
}
