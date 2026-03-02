package net.YMLVersion;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    

    @Override
    public void onEnable() {

        try {
            YMLVersion.builder()
                .plugin(this)
                .version("1.0")
                .resource("config.yml")
                .versionKey("config-ver")
                .build();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
