package cn.xuyingqi.utils.tool.operate.file.impl;

import java.io.File;

import org.apache.log4j.Logger;

import cn.xuyingqi.utils.tool.operate.file.OperateFile;

/**
 * 打印文件名称
 * 
 * @author Administrator
 *
 */
public class PrintFileName implements OperateFile {

	// 日志
	private Logger logger = Logger.getLogger(OperateFile.class);

	@Override
	public void operateFile(File file) {
		// 文件不为空,且存在
		if (file != null && file.exists()) {
			this.logger.info(file.getName());
		}
	}
}
