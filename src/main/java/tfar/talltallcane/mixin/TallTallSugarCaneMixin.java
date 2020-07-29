package tfar.talltallcane.mixin;

import net.minecraft.block.CactusBlock;
import net.minecraft.block.SugarCaneBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin({SugarCaneBlock.class, CactusBlock.class})
public class TallTallSugarCaneMixin {
	@ModifyConstant(method = "randomTick",constant = @Constant(intValue = 3))
	private int tall(int o) {
		return 255;
	}
}
