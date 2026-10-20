package io.github.segdv.keyedbundles.client.mixin;

import java.util.List;

import io.github.segdv.keyedbundles.client.Keybinds;

import net.minecraft.client.gui.ItemSlotMouseAction;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.world.inventory.Slot;

//? if >=1.21.9 {
/*import net.minecraft.client.input.KeyEvent;
*///?}

import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractContainerScreen.class)
public abstract class AbstractContainerScreenMixin {
    @Shadow
    protected Slot hoveredSlot;

    @Shadow
    @Final
    private List<ItemSlotMouseAction> itemSlotMouseActions;

    //? if >=1.21.9 {
    /*@Inject(method = "keyPressed", at = @At("HEAD"), cancellable = true)
    private void keyedBundles$cycleBundleItem(KeyEvent event, CallbackInfoReturnable<Boolean> cir) {
        if (Keybinds.nextItem != null && Keybinds.nextItem.matches(event)) {
            keyedBundles$scroll(-1.0, cir);
        } else if (Keybinds.previousItem != null && Keybinds.previousItem.matches(event)) {
            keyedBundles$scroll(1.0, cir);
        }
    }
    *///?} else {
    @Inject(method = "keyPressed", at = @At("HEAD"), cancellable = true)
    private void keyedBundles$cycleBundleItem(int keyCode, int scanCode, int modifiers,
            CallbackInfoReturnable<Boolean> cir) {
        if (Keybinds.nextItem != null && Keybinds.nextItem.matches(keyCode, scanCode)) {
            keyedBundles$scroll(-1.0, cir);
        } else if (Keybinds.previousItem != null && Keybinds.previousItem.matches(keyCode, scanCode)) {
            keyedBundles$scroll(1.0, cir);
        }
    }
    //?}

    private void keyedBundles$scroll(double scroll, CallbackInfoReturnable<Boolean> cir) {
        if (this.hoveredSlot == null || !this.hoveredSlot.hasItem()) {
            return;
        }

        for (ItemSlotMouseAction action : this.itemSlotMouseActions) {
            if (action.matches(this.hoveredSlot) && action.onMouseScrolled(0.0, scroll,
                    this.hoveredSlot.index, this.hoveredSlot.getItem())) {
                cir.setReturnValue(true);
                return;
            }
        }
    }
}
