package com.effective.section4.demo18;

//继承骨架类就只用实现towEleAdd方法，就可以完成一组对象的求和工作了。
public class SummationImpl<T> extends AbstractSummation{


	@Override
	public Object towEleAdd(Object obj01, Object obj02) {
		if(obj01 instanceof Integer){
			int temp1 = (int)obj01;
			int temp2 = (int)obj02;
			return temp1+temp2;
		}
		return null;
	}



}
