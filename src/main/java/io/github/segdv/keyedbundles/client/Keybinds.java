package io.github.segdv.keyedbundles.client;

import org.lwjgl.glfw.GLFW;
import com.mojang.blaze3d.platform.InputConstants;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.KeyMapping;

public class Keybinds {
    public static String CATEGORY = "key.category.keyed-bundles";

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
