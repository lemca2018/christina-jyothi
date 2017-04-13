package com.example.jyothi.chris;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Int3year extends AppCompatActivity {
    ListView l;
    String[] a = { "Admission Fee (One Time)          Rs.500/-","Special Fee (Yearly)                 Rs.1,200/- ","Administration Fee (One Time)               Rs.1,000/-","Tuition Fee (Per Semester) (Govt order)  Rs. 18,750/-","Caution Fee Deposit (One Time – Refundable)        Rs.10,000/-","Student welfare fund (Yearly)    Rs.2,445/-","Seminars, conference, internet etc (Yearly)                 Rs.2,600/-","PTA (Yearly)                           Rs.500/-","Total                                      Rs.43,245 /-"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_int3year);
        l= (ListView)findViewById(R.id.listview);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,a);
        l.setAdapter(adapter);
    }
}
