package me.souprpk.epiccore.api.updater;

import org.bukkit.plugin.java.JavaPlugin;

public class Updater {

    private String RESOURCE_ID;
    private JavaPlugin plugin;
    private boolean shouldUpdate;

    private String OLD_VERSION;

    public Updater(JavaPlugin plugin, String id, boolean shouldUpdate){
        this.RESOURCE_ID = id;
        this.plugin = plugin;
        this.shouldUpdate = shouldUpdate;

        OLD_VERSION = plugin.getDescription().getVersion();

        if(shouldUpdate && )
            download();
    }

    private void download(){

    }

    private String getSpigotVersion(){

    }
}
