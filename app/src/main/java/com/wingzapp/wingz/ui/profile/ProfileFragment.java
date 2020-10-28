package com.wingzapp.wingz.ui.profile;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.wingzapp.wingz.Contactus;
import com.wingzapp.wingz.Login;
import com.wingzapp.wingz.R;
import com.wingzapp.wingz.app_info;

public class ProfileFragment extends Fragment {
    TextView  contact, logout, name, number, email,a_info;
    DatabaseReference host;
    AlertDialog.Builder builder;
    String id = FirebaseAuth.getInstance().getCurrentUser().getUid();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        final View root = inflater.inflate(R.layout.fragment_profile, container, false);
        contact = root.findViewById(R.id.contact);
        a_info = root.findViewById(R.id.appInfo);
        name = root.findViewById(R.id.name);
        number = root.findViewById(R.id.number);
        email = root.findViewById(R.id.email);
        builder = new AlertDialog.Builder(getActivity());
        host = FirebaseDatabase.getInstance().getReference().child("Student");
        read();

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Contactus.class);
                startActivity(intent);
            }
        });
        a_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), app_info.class);
                startActivity(intent);
            }
        });
        logout = root.findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(getActivity(), Login.class));
                getActivity().finish();
            }
        });

        return root;
    }


    private void read() {

        host.child(id).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String fullname = dataSnapshot.child("Fullname").getValue(String.class);
                String phone = dataSnapshot.child("Mobile").getValue(String.class);
                String mail = dataSnapshot.child("Email").getValue(String.class);
                name.setText(fullname);
                number.setText(phone);
                email.setText(mail);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }
}