package com.hirowassan.riptide;

import net.fabricmc.api.ModInitializer;

public class Riptide implements ModInitializer {
    @Override
    public void onInitialize() {
        Constants.LOGGER.debug(Constants.INITIALIZING, "1.20.1-fabric");
    }
}
