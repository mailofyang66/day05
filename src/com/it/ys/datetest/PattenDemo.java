package com.it.ys.datetest;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PattenDemo{

	public static void main(String[] args) throws Exception {
		
		Pattern pattern = Pattern.compile("http.{10,100}jpg");
		
		URL url=new URL("http://www.tooopen.com/img/87.aspx");
		
		InputStream inputStream = url.openStream();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(inputStream));
		
		List<String> list=new ArrayList<String>();
		
		String line=null;
		while((line=br.readLine())!=null){
			System.out.println(line);
			Matcher matcher = pattern.matcher(line);
			while(matcher.find()){
				list.add(matcher.group());
			}

		}
		
		
		for (String str : list) {
			try {
				URL ur=new URL(str);
				InputStream stream = ur.openStream();
				
				BufferedInputStream bis=new BufferedInputStream(stream);
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:\\pic"+System.currentTimeMillis()+".jpg"));
				int len;
				byte[] bys=new byte[2048*10];
				while((len=bis.read(bys))!=-1){
					bos.write(bys, 0, len);
				}
				
				bis.close();
				bos.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
