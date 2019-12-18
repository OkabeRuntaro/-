package com.woniu.Dome2;

import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class MyClassPathXmlApplicationContext implements MyApplicationContext{

	
	
	
	public MyClassPathXmlApplicationContext() {
		super();
		// TODO Auto-generated constructor stub
	}
	Map<String,String> map = new HashMap<String,String>();
	public MyClassPathXmlApplicationContext(String filePath) {
		//URL获取resource对象
		//URL resource = MyClassPathXmlApplicationContext.class.getClassLoader().getResource(filePath);
		//使用dom4j生成解析xml的对象
		SAXReader reader = new SAXReader();
		//读取xml文档
		try {
			Document doc = reader.read(MyClassPathXmlApplicationContext.class.getClassLoader().getResource(filePath));
			//获得xml文档的跟标签
			Element root = doc.getRootElement();
			//获得子标签
			Iterator<Element> it = root.elementIterator();
			//遍历所有的子标签
			while(it.hasNext()) {
				Element child = it.next();
				List<Attrbute> attr = child.attributes();
				String id = null;
				String clazz = null;
				for (Attrbute a : attr) {
					switch (a.getAttrbuteName()) {
					case "id":
						id = a.getValue();
						break;
					case "clazz":
						id = a.getValue();
						break;
					}
				}
				map.put(id, clazz);
			}
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}
	

	@Override
	public Object getBean(String beanid) {
		String clazz = map.get(beanid);
		if(clazz==null) {
			throw new RuntimeException("found none!未找到类");
		}
		Object obj = null;
		try {
			obj = Class.forName(clazz).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}

}
