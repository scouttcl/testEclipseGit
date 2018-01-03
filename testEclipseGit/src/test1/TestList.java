package test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestList {

	private int id;
	private int age;
	private String name;
	
	public TestList(int id, int age, String name) {
		this.setId(id);
		this.setAge(age);
		this.setName(name);
	}
	
	public boolean equals(Object target) {
		if(this == target) {
			return true;
		}else if(!(target instanceof TestList)) {
			return false;
		}
		TestList tl = (TestList)target;
		if(this.getId() != tl.getId()) {
			return false;
		}
		if(this.getAge() != tl.getAge()) {
			return false;
		}
		boolean r;
		if(this.getName() != null) {
			r = this.getName().equals(tl.getName());
			return r;
		}else {
			r = (tl.getName() == null);
			return r;
		}
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:" + this.getId() + ",");
		sb.append("age:" + this.getAge() + ",");
		sb.append("name:" + this.getName());
		return sb.toString();
	}

	public static List<TestList> eradicateDuplicate(List<TestList> list){
		List<TestList> list2 = new ArrayList<TestList>();
		list2.add(list.get(0));
		for(int i = 1;i < list.size();i++) {
			if(!list2.contains(list.get(i))){
				list2.add(list.get(i));
			}
		}
		return list2;
	}
	public static void main(String[] args) {
		TestList tl1 = new TestList(1,12,"Joe");
		TestList tl2 = new TestList(2,12,"Bob");
		TestList tl3 = new TestList(3,22,"Joe");
		TestList tl4 = new TestList(4,4,"Duke");
		TestList tl5 = new TestList(4,4,"Duke");
		TestList tl6 = tl1;

		List<TestList> list = new ArrayList<TestList>();
		list.add(tl1);
		list.add(tl2);
		list.add(tl3);
		list.add(tl4);
		list.add(tl5);
		list.add(tl6);
		
		System.out.println("before eradicate:");
		for(int i = 0;i < list.size();i++) {
			System.out.println(list.get(i).toString());
		}
		List<TestList> list2 = eradicateDuplicate(list);
		System.out.println("after eradicate:");
		for(int i = 0;i < list2.size();i++) {
			System.out.println(list2.get(i).toString());
		}
		
		TestList[] paramArr = new TestList[list2.size()];
		TestList[] paramArr2 = null;
		paramArr2 = list2.toArray(paramArr);
		System.out.println("paramArr:" + Arrays.toString(paramArr));
		System.out.println("paramArr2:" + Arrays.toString(paramArr2));
		
	}

}
