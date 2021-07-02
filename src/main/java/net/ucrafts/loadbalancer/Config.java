package net.ucrafts.loadbalancer;

import com.google.inject.Inject;
import com.velocitypowered.api.plugin.annotation.DataDirectory;
import de.leonhard.storage.Json;
import de.leonhard.storage.internal.FlatFile;

import java.nio.file.Path;

public class Config
{

    private final FlatFile config;

    @Inject
    public Config(@DataDirectory Path dataDirectory)
    {
        this.config = new Json("config", dataDirectory.toString());
    }

    public FlatFile getConfig()
    {
        return this.config;
    }
}
