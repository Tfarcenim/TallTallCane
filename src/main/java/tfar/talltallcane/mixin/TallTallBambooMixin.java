package tfar.talltallcane.mixin;

import net.minecraft.block.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(BambooBlock.class)
public abstract class TallTallBambooMixin {

	@ModifyConstant(method = "randomTick",constant = @Constant(intValue = 16))
	private int tall(int o) {
		return 255;
	}

	@ModifyConstant(method = "updateLeaves",constant = @Constant(intValue = 11))
	private int alsoTall(int i) {
		return 255;
	}

	@ModifyConstant(method = "updateLeaves",constant = @Constant(intValue = 15))
	private int alsoAlsoTall(int i) {
		return 255;
	}
}
