package me.souprpk.epiccore;

import org.bukkit.plugin.java.JavaPlugin;

public final class EpicCore extends JavaPlugin {

    private EpicCore instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public EpicCore getInstance() {
        return instance;
    }
}
