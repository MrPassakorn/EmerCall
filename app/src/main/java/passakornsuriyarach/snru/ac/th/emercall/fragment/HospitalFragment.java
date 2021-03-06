package passakornsuriyarach.snru.ac.th.emercall.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import passakornsuriyarach.snru.ac.th.emercall.R;
import passakornsuriyarach.snru.ac.th.emercall.utility.HospitalAdapter;

/**
 * Created by Admin on 22/2/2561.
 */

public class HospitalFragment extends Fragment {


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Create ListView

        ListView listView = getActivity().findViewById(R.id.listViewHopotal);
        int[] ints = new int[]{R.drawable.station1, R.drawable.station2,
                                R.drawable.station3, R.drawable.station4,
                                 R.drawable.station1, R.drawable.station2,
                                     R.drawable.station3, R.drawable.station4 };
        String[] titleStrings = new String[]{"Hopiltal 1","Hopiltal 2","Hopiltal 3","Hopiltal 4",
                                "Hopiltal 5","Hopiltal 6","Hopiltal 7","Hopiltal 8"};
        String[] phoneStrings = new String[]{"1111","1112","1113","1114","1115","1116","1117","1118"};
        HospitalAdapter hospitalAdapter = new HospitalAdapter(getActivity(), ints, titleStrings, phoneStrings);
        listView.setAdapter(hospitalAdapter);
    } // Main Method

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hospital, container, false);


        return view;
    }


} // Main class
