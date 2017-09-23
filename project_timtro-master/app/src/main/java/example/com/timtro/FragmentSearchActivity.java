package example.com.timtro;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.InputType;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

/**
 * Created by Minh Cuong on 023/23/9/2017.
 */

public class FragmentSearchActivity extends Fragment {

    EditText search;
    Button cancel;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.activity_search, container, false);

        search = (EditText) v.findViewById(R.id.atctv_search);

        cancel = (Button) v.findViewById(R.id.btn_cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {/*
                if(!TextUtils.isEmpty(search.getText().toString())){
                    String location = search.getText().toString();
                    Intent intent = new Intent(getActivity(), MainActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.getString("address",location);
                    intent.putExtra("put_address",bundle);
                    startActivity(intent);
                    android.app.FragmentManager fragmentManager = getFragmentManager();
                    android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentManager.popBackStack();
                }else{*/
                    android.app.FragmentManager fragmentManager = getFragmentManager();
                    android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentManager.popBackStack();
                //}
            }
        });
        return v;
    }

}
