package com.mischiefsmp.sortedenchants

import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback
import net.minecraft.client.item.TooltipContext
import net.minecraft.item.ItemStack
import net.minecraft.nbt.*
import net.minecraft.text.Text

object Mod: ModInitializer {
    override fun onInitialize() {
        ItemTooltipCallback.EVENT.register(object: ItemTooltipCallback {
            override fun getTooltip(stack: ItemStack?, context: TooltipContext?, lines: MutableList<Text>?) {
                val enchantments = stack?.enchantments ?: return
                if(enchantments.size == 0) return

                enchantments.sortBy {
                    var string = ""
                    it.accept(object: AbstractNbtElementVisitor() {
                        override fun visitCompound(compound: NbtCompound) {
                            string = compound.get("id")!!.asString()
                        }
                    })
                    string
                }
            }
        })
    }
}