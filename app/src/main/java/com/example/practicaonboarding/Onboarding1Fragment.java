package com.example.practicaonboarding;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Onboarding1Fragment extends Fragment {

    private Button botonNext, botonSkip;
    private NavController navController;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_onboarding1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        botonNext = view.findViewById(R.id.button3);
        botonSkip = view.findViewById(R.id.button4);

        botonNext.setOnClickListener(v ->
                navController.navigate(R.id.action_onboarding1Fragment_to_onboarding2Fragment));

        botonSkip.setOnClickListener(v ->
                navController.navigate(R.id.action_onboarding1Fragment_to_homeFragment));
    }
}