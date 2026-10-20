package io.github.segdv.keyedbundles.client;

import org.lwjgl.glfw.GLFW;
import com.mojang.blaze3d.platform.InputConstants;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.KeyMapping;

public class Keybinds {
    //? if >=1.21.9 {
    /*public static final KeyMapping.Category CATEGORY = KeyMapping.Category.register(
            net.minecraft.resources.ResourceLocation.fromNamespaceAndPath("keyed-bundles", "main"));
    *///?} else {
    public static final String CATEGORY = "key.category.keyed-bundles.main";
    //?}

    public static KeyMapping nextItem;
    public static KeyMapping previousItem;

    public static void register() {
        nextItem = KeyBindingHelper.registerKeyBinding(new KeyMapping("key.keyed-bundles.next_item",
                InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_RIGHT, CATEGORY));

        previousItem = KeyBindingHelper
                .registerKeyBinding(new KeyMapping("key.keyed-bundles.previous_item",
                        InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_LEFT, CATEGORY));
    }
}
