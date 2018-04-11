package com.example.daddy.fehtracker;

import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import static com.example.daddy.fehtracker.MainActivity.url;

class Signup extends AsyncTask<String, String, String>{


    @Override
    protected String doInBackground(String... strings) {
        try {
            URL theurl = new URL(url);

            HttpURLConnection urlConnection = (HttpURLConnection) theurl.openConnection();
            urlConnection.setDoOutput(true);
            OutputStreamWriter out = new OutputStreamWriter(urlConnection.getOutputStream());
            out.write("username=" + strings[0] + "password=" + strings[1]);
            out.close();

            /*InputStream stream = urlConnection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
            StringBuffer buffer = new StringBuffer();

            String line = "";
            while ((line = reader.readLine()) != null) {
                buffer.append(line);

                return buffer.toString();
            }*/
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }
}
