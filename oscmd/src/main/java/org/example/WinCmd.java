package org.example;

public class WinCmd {

    public static void runBatchFile(String batchFileName, String src, String dst, String log) {
        try {
            ProcessBuilder pb = new ProcessBuilder("cmd", "/C", batchFileName, src, dst, log);
            Process process = pb.start();
            process.waitFor();
            process.destroy();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
