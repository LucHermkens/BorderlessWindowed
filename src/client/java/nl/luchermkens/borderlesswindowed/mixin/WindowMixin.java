package nl.luchermkens.borderlesswindowed.mixin;

import net.minecraft.client.util.Window;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Window.class)
public class WindowMixin {
	@Shadow
	private long handle;

	@Inject(method = "<init>", at = @At("TAIL"))
	private void makeBorderless(CallbackInfo ci) {
		// Set window to borderless mode (remove decorations)
		if (handle != 0) {
			GLFW.glfwSetWindowAttrib(handle, GLFW.GLFW_DECORATED, GLFW.GLFW_FALSE);
		}
	}
}
