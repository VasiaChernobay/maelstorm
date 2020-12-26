package com.maelstorm.monitoring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CmdMonitoring implements Monitoring {

    @Override
    public void defaultPing() {
        String cmd = "ping -s 100 -c 6 google.com";
        Runtime run = Runtime.getRuntime();

        try {
            Process pr = run.exec(cmd);
            pr.waitFor();
            BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            String line = "";
            while ((line = buf.readLine()) != null) {
                System.out.println(line);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }catch (IOException ioException){
            ioException.printStackTrace();
        }

    }

    @Override
    public void ping(String resourceName) {

    }

    @Override
    public void ping(String resourceName, int packageAmount) {

    }
}
