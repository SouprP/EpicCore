package me.souprpk.epiccore;

import org.bukkit.plugin.java.JavaPlugin;

public final class EpicCore extends JavaPlugin {

    private static EpicCore instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static EpicCore getInstance() {
        return instance;
    }
}
