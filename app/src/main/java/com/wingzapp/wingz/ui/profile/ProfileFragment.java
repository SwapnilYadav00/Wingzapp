package com.wingzapp.wingz.ui.profile;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
import com.wingzapp.wingz.MainActivity;
import com.wingzapp.wingz.R;
import com.wingzapp.wingz.SyllabusActivity;
import com.wingzapp.wingz.TimeTableActivity;

import java.util.Objects;

public class ProfileFragment extends Fragment {
    TextView donate, contact, logout, name, number, email,web;
    DatabaseReference host;
    AlertDialog.Builder builder;
    String id = FirebaseAuth.getInstance().getCurrentUser().getUid();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        final View root = inflater.inflate(R.layout.fragment_profile, container, false);
        donate = root.findViewById(R.id.donate);
        contact = root.findViewById(R.id.contact);
        name = root.findViewById(R.id.name);
        web = root.findViewById(R.id.website);
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
        donate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage("Wingzapp serves many students, without charging a single penny from its user." +
                        " However, for updating the existing module and adding new features require us to invest a fair amount of time and money." +
                        "If you think that the services of Wingzapp are useful. Then you're welcomed to donate some money to Wingzapp." +
                        "For donation please contact us.")
                        .setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog alert = builder.create();
                alert.setTitle("Donation");
                alert.show();
            }
        });
        logout = root.findViewById(R.id.textView);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(getActivity(), Login.class));
                getActivity().finish();
            }
        });
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openurl();
            }
        });

        return root;
    }

    private void openurl() {
        Uri uri=Uri.parse("https://wingzapp.blogspot.com");
        Intent launchweb=new Intent(Intent.ACTION_VIEW, uri);
        startActivity(launchweb);
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