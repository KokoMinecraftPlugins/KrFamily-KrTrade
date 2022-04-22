package krmcplugins.kokored.website.krfamilykrtrade;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import krmcplugins.kokored.website.krcore.util.PH;
import org.apache.commons.io.IOUtils;
import org.bukkit.plugin.java.JavaPlugin;

import krmcplugins.kokored.website.krcore.util.Config;
import krmcplugins.kokored.website.krcore.util.KrPlugins;
import krmcplugins.kokored.website.krcore.util.Language;

public final class KrTrade extends JavaPlugin {

    static Config config;
    static Language language;

    @Override
    public void onEnable() {
        
        //Setup config files
        Map<String, InputStream> configFileList = new HashMap<>();
//        configFileList.put("en-US.yml", getResource("languages/en-US.yml"));

        try {
            final File tempLangFile;
            tempLangFile = File.createTempFile("en-US", ".yml");
            tempLangFile.deleteOnExit();
            try (FileOutputStream out = new FileOutputStream(tempLangFile)) {
                IOUtils.copy(getResource("languages/en-US.yml"), out);
                language = new Language(KrPlugins.KrTrade, "en-US", tempLangFile);
            }catch (IOException e) {
                e.printStackTrace();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

        config = new Config(KrPlugins.KrTrade, configFileList);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static Config getConfigs() {
        return config;
    }

    public static Language getLanguage() {
        return language;
    }
}
