/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        ArrayList<Quake> earthquakes = new ArrayList<>();
        earthquakes.add(new Quake(4.2,"San Francisco","01-01-2000"));
        earthquakes.add(new Quake(5,"London","01-01-2000"));
        earthquakes.add(new Quake(3.5,"Tokyo","01-01-2000"));
        earthquakes.add(new Quake(5.5,"Mexico City","01-01-2000"));
        earthquakes.add(new Quake(6.3,"Moscow","01-01-2000"));
        earthquakes.add(new Quake(6.9,"Rio de Janeiro","01-01-2000"));
        earthquakes.add(new Quake(4.5,"Paris","01-01-2000"));

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of earthquakes
        /*ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, R.layout.list_item, earthquakes);*/
        EarthquakeAdapter adapter = new EarthquakeAdapter(this,earthquakes);
        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(adapter);
    }
}
