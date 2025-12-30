package nl.luchermkens.borderlesswindowed;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BorderlessWindowedClient implements ClientModInitializer {
	public static final String MOD_ID = "borderlesswindowed";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitializeClient() {
		LOGGER.info("Initializing BorderlessWindowed mod...");
	}
}
