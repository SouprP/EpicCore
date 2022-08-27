package me.souprpk.epiccore.logger;

import org.bukkit.plugin.Plugin;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Logger {

    private Plugin plugin;

    public Logger(Plugin plugin){
        this.plugin = plugin;
    }

    public void createLog() {

        File log = new File(plugin.getDataFolder(), "logs");

        if(!log.exists()) {

            log.mkdir();
        }
    }

    /**
     * Log to file
     * @param message the messeage to log
     *
     **/
    public void log(String message){
        try {
            createLog();
            LocalDateTime now = LocalDateTime.now();
            String date = now.getYear() + "-" + now.getMonthValue() + "-" + now.getDayOfMonth();

            File file = new File(plugin.getDataFolder() + "/logs", date + ".txt");
            if(!file.exists())
                file.createNewFile();

            String hour = "[" + now.getHour() + ":" + now.getMinute() + ":" + now.getSecond() + "] ";
            FileWriter write = new FileWriter(file, true);
            write.write(hour + message + "\n");
            write.close();

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
