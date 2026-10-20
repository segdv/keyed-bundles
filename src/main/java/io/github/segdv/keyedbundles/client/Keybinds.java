package io.github.segdv.keyedbundles.client;

import com.mojang.blaze3d.platform.InputConstants;

//? if >=26.1 {
/*import net.fabricmc.fabric.api.client.keymapping.v1.KeyMappingHelper;
*///?} else {
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
//?}

import net.minecraft.client.KeyMapping;

public class Keybinds {
    //? if >=26.1 {
    /*public static final KeyMapping.Category CATEGORY = KeyMapping.Category.register(
            net.minecraft.resources.Identifier.fromNamespaceAndPath("keyed-bundles", "main"));
    *///?} elif >=1.21.9 {
    /*public static final KeyMapping.Category CATEGORY = KeyMapping.Category.register(
            net.minecraft.resources.ResourceLocation.fromNamespaceAndPath("keyed-bundles", "main"));
    *///?} else {
    public static final String CATEGORY = "key.category.keyed-bundles.main";
    //?}

    public static KeyMapping nextItem;
    public static KeyMapping previousItem;

    public static void register() {
        nextItem = registerMapping(new KeyMapping("key.keyed-bundles.next_item",
                inputType(), InputConstants.KEY_RIGHT, CATEGORY));

        previousItem = registerMapping(new KeyMapping("key.keyed-bundles.previous_item",
                inputType(), InputConstants.KEY_LEFT, CATEGORY));
    }

    private static InputConstants.Type inputType() {
        //? if >=26.3 {
        /*return InputConstants.Type.KEYBOARD;
        *///?} else {
        return InputConstants.Type.KEYSYM;
        //?}
    }

    private static KeyMapping registerMapping(KeyMapping mapping) {
        //? if >=26.1 {
        /*return KeyMappingHelper.registerKeyMapping(mapping);
        *///?} else {
        return KeyBindingHelper.registerKeyBinding(mapping);
        //?}
    }
}
