package com.it.ys.datetest;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws Exception {

		File srcFile = new File("D:\\java教程内容\\基础教程");

		File desFile = new File("d:\\基础教程");

		if (!desFile.exists()) {
			desFile.mkdirs();
		}

		mkdirFile(srcFile, desFile);
	}

	private static void mkdirFile(File srcFile, File desFile) throws IOException {
		
		File[] files = srcFile.listFiles();
		for (File sfile : files) {

			// 如果是文件夹
			if (sfile.isDirectory()) {

				String sName = srcFile.getName();
				File newDesFile = new File(desFile, sName);
				newDesFile.mkdir();
				mkdirFile(sfile, newDesFile);
				
			} else {// 如果是文件
				String srcName = sfile.getName();
				if (srcName.endsWith(".avi")) {

					File newDesFile = new File(desFile, srcName);
					copyFile(sfile, newDesFile);
				}
			}
		}
	}

	// 复制文件
	private static void copyFile(File sfile, File desFile) throws IOException {

		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sfile));

		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desFile));

		int len;
		byte[] bys = new byte[1024 * 10];
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}
		bis.close();
		bos.close();
	}
}
