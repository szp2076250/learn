package com.xk.junit;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class Generator {
	@Test
	public void create() {
		try {
			List<String> warnings = new ArrayList<String>();
			ConfigurationParser cp = new ConfigurationParser(warnings);
			Configuration config = cp.parseConfiguration(new File("./src/com/xk/generator/generatorConfig.xml"));
			new MyBatisGenerator(
					config, 
					new DefaultShellCallback(true),
					warnings).generate(null);
			System.out.print("generate ok!");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.print(e.toString());
		}

	}
}
