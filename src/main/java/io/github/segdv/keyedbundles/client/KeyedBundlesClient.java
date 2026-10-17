package io.github.segdv.keyedbundles.client;

import net.fabricmc.api.ClientModInitializer;

public class KeyedBundlesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Keybinds.register();
    }
}
