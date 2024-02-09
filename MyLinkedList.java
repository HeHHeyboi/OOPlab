import java.security.PublicKey;
import java.time.LocalDate;
import java.util.stream.DoubleStream;

import javax.xml.crypto.Data;

public class MyLinkedList {
	private Node first;
	private Node last;
	class Node{
		Employee data;
		Node next;
		public Node() {
			this.data = null;
			this.next = null;
		
		}
		public Node(String id,String name,LocalDate dte,double s) {
			this.data= new Employee(id, name, dte, s);
			this.next=null;
		}
		Employee getData() {
			return this.data;
		}
	}
	public MyLinkedList() {
		this.first = null;
		this.last = null;
	}
	public void addFirstNode(String id,String name,LocalDate dte,double s) {
		//add a new node at the last of this likedlist
		Node newNode = new Node(id, name, dte, s);
		this.first = newNode;
		this.last = newNode;
		
	}
	
	public void addLast(String id,String name,LocalDate dte,double s) {
		//add a new node at the last of this likedlist
		Node newNode = new Node(id, name, dte, s);
		if(first != null) {
			this.last.next = newNode;
			this.last = newNode;
		}
		else {
			this.first = newNode;
			this.last = newNode;
		}
	}
	public Node findbyId(String id) {
		//if found return node
		//else 
		Node curNode = this.first;
		while(curNode!=null) {
			if(curNode.data.getId().compareTo(id)==0) {
				return curNode;
			}
			curNode.next = curNode;
		}
		return null;
	}
	public void show() {
		Node curNode = this.first;
		while(curNode!=null) {
			System.out.println(curNode.data.toString());
			curNode.next = curNode;
		}
	}
	public void removeNode(String id) {
		
	}
	public void insertAfterNode(String id) {
		
	}
}


