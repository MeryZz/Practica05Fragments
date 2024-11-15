package com.example.practicaonboarding;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import android.widget.Button;

public class Onboarding0Fragment extends Fragment {

    private Button botonStart, botonSkip;
    private NavController navController;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_onboarding0, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        botonStart = view.findViewById(R.id.button1);
        botonSkip = view.findViewById(R.id.button2);

        botonStart.setOnClickListener(v ->
                navController.navigate(R.id.action_onboarding0Fragment_to_onboarding1Fragment));

        botonSkip.setOnClickListener(v ->
                navController.navigate(R.id.action_onboarding0Fragment_to_homeFragment));
    }
}