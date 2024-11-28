package labWorkNumbered;

public class Lab7_LinkedList {

	private Lab7_Link first; // this is a pointer of current basically
	
	public Lab7_LinkedList() {
		first = null;
	}
	
	public boolean isEmpty() {
		return (first==null);
	}
	
	public void insertHead(String name, String age, String degree, String yearOfStudy) {
		Lab7_Link newLink = new Lab7_Link( name,  age,  degree, yearOfStudy);
		newLink.next = first;
		first = newLink;
	}
	
	public Lab7_Link deleteHead() {
		Lab7_Link temp = first;// make a copy
		first = first.next;// move pointer right one
		return temp;// return our copy
	}
	
	public Lab7_Link delete(String key) {
		Lab7_Link current = first;
		Lab7_Link previous = first;
		
		while(!current.name.equals(key) ) {
			if(current.next ==null) {
				return null;//end of list
			}else {
				previous = current;
				current = current.next;
			}
		}
		// at this point it has been found
		
		if(current == first) {// if data is first one
			first = first.next;// move the pointer
			// this is the easy option
			
		}else {
			previous.next = current.next;
		}
		
		return current;
	}
	
	
	
	
	
	public void display() {
		Lab7_Link current = first;//create a copy of pointer
		while(current!=null) {
			current.displayLink();
			current = current.next;
		}
	}
	
	public void setFirstName(String name) {
		first.name = name;
	}
	public void setFirstAge(String age) {
		first.age = age;
	}
	public void setFirstDegree(String degree) {
		first.degree = degree;
	}
	public void setFirstYearOfStudy(String yearOfStudy) {
		first.yearOfStudy = yearOfStudy;
	}
	
	public Lab7_Link search(String par , String key) {
		Lab7_Link current = first;
		Lab7_Link previous = first;
		if(par.equals("Name")) {
			return findName(current ,previous ,key);
			
		}else if(par.equals("Age")) {
			return findAge(current ,previous ,key);
			
		}else if(par.equals("Degree")) {
			return findDegree(current ,previous ,key);
			
		}else if(par.equals("YearOfStudy")) {
			return findYearOfStudy(current ,previous ,key);
			
		}else {
			return null;
		}
		
	}
	
	public Lab7_Link findName(Lab7_Link current , Lab7_Link previous , String key) {
		while(!current.name.equals(key) ) {
			if(current.next ==null) {
				return null;//end of list
			}else {
				previous = current;
				current = current.next;
			}
		}	
		return current;
	}
	
	public Lab7_Link findAge(Lab7_Link current , Lab7_Link previous , String key) {
		while(!current.age.equals(key)) {
			if(current.next ==null) {
				return null;//end of list
			}else {
				previous = current;
				current = current.next;
			}
		}	
		return current;
	}
	
	public Lab7_Link findDegree(Lab7_Link current , Lab7_Link previous , String key) {
		while(!current.degree.equals(key) ) {
			if(current.next ==null) {
				return null;//end of list
			}else {
				previous = current;
				current = current.next;
			}
		}	
		return current;
	}
	
	public Lab7_Link findYearOfStudy(Lab7_Link current , Lab7_Link previous , String key) {
		while(!current.yearOfStudy.equals(key) ) {
			if(current.next ==null) {
				return null;//end of list
			}else {
				previous = current;
				current = current.next;
			}
		}	
		return current;
	}

	public void deleteSelectedLink(Lab7_Link current) {
		delete(current.name);
	}
	
	
	//so the first input is what category we are searching for
	//, andthe second one is the key we are searching for 
	// it will then print the linked list with that data
	//
}
