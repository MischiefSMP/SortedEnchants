package com.mischiefsmp.sortedenchants

import net.minecraft.nbt.*
import net.minecraft.nbt.visitor.NbtElementVisitor

abstract class AbstractNbtElementVisitor: NbtElementVisitor {
    override fun visitString(element: NbtString) { }
    override fun visitByte(element: NbtByte) { }
    override fun visitShort(element: NbtShort) { }
    override fun visitInt(element: NbtInt) { }
    override fun visitLong(element: NbtLong) { }
    override fun visitFloat(element: NbtFloat) { }
    override fun visitDouble(element: NbtDouble) { }
    override fun visitByteArray(element: NbtByteArray) { }
    override fun visitIntArray(element: NbtIntArray) { }
    override fun visitLongArray(element: NbtLongArray) { }
    override fun visitList(element: NbtList) { }
    override fun visitCompound(compound: NbtCompound) { }
    override fun visitEnd(element: NbtEnd) { }
}