package com.springinaction.knights.config;

import com.springinaction.knights.*;
import org.springframework.context.annotation.*;

/**
 * author: zhaokl
 * <p>
 * created at: 17/03/2017 14:18
 * <p>
 * desc:
 */

@Configuration
public class KnightConfig{
	@Bean
	public Knight knight() {
		return new BraveKnight(quest());
	}

	@Bean
	public Quest quest() {
		return new SlayDragonQuest(System.out);
	}


}
