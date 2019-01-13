/**
 * Copyright [2019] [RAFAEL ALCOCER CALDERA]
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * 	http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package rafael.alcocer.caldera.springbatch.tasklet.step;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.stereotype.Component;

@Component
public class MyTasklet implements Tasklet {

	private static Logger logger = LoggerFactory.getLogger(MyTasklet.class);

	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
		String[] items = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
		StringBuilder builder = new StringBuilder();

		for (String item : items) {
			builder.append(item.toUpperCase());
		}

		logger.info("##### Result: " + builder);

		return RepeatStatus.FINISHED;
	}
}