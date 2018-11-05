package com.clw.generator.main;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;

/**
 * MyBatis反向生成工具<p>
 * mybatis可以通过逆向工程的方式反向生成项目中所要的xml文件和Java代码<p>
 * 相关生成文件的配置在generatorConfig.xml文件中进行配置。
 * 
 * @version 1.0.0
 * 
 * @date 2017年8月9日 上午10:21:43
 *
 * @author chenliwu
 */
public class Generator {
	
	/**
	 * MyBatis反向生成DAO层方法
	 * @throws Exception
	 */
	public static void generator() throws Exception {

		ArrayList<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		// 指定逆向工程配置文件
		File configFile = new File("./src/generatorConfig.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
				callback, warnings);
		myBatisGenerator.generate(null);

	}
	
	public static void main(String[] args) {
		try {
			generator();
			System.out.println("执行完毕");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
