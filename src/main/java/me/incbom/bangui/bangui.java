package me.incbom.bangui;

import me.incbom.bangui.commands.BanGUICommand;
import me.incbom.bangui.listener.BanInventoryListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class BanGUI extends JavaPlugin {

    private static BanGUI plugin;

    @Override
    public void onEnable() {

        plugin = this;

        // Plugin startup logic
        getCommand("bangui").setExecutor(new BanGUICommand());

        getServer().getPluginManager().registerEvents(new BanInventoryListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static BanGUI getPlugin(){
        return plugin;
    }

}
