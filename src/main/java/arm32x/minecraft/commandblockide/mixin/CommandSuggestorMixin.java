package arm32x.minecraft.commandblockide.mixin;

import arm32x.minecraft.commandblockide.extensions.CommandSuggestorExtension;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.CommandSuggestor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Environment(EnvType.CLIENT)
@Mixin(CommandSuggestor.class)
public final class CommandSuggestorMixin implements CommandSuggestorExtension {
	public int ide$y = 72;

	@ModifyConstant(method = { "showSuggestions(Z)V", "render(Lnet/minecraft/client/util/math/MatrixStack;II)V" }, constant = @Constant(intValue = 72))
	public int getY(int seventyTwo) {
		return ide$y;
	}

	@Override
	public void setY(int y) {
		ide$y = y;
	}
}
