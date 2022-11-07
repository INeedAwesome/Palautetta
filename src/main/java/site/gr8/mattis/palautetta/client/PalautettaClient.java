package site.gr8.mattis.palautetta.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(EnvType.CLIENT)
public class PalautettaClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		Logger logger = LoggerFactory.getLogger(PalautettaClient.class);
		logger.info("Hello World!");
	}
}
