package br.com.ignisinventum.infra.patters.structural.composite;

public class ModelContext {
	
	private static PersonComposite granfather = new PersonComposite();
	
	public static void main(String[] args) {

		PersonComposite father = new PersonComposite();
		PersonComposite uncle = new PersonComposite();
		PersonComposite son = new PersonComposite();
		
		granfather.add(father.add(son));
		granfather.add(uncle);
		
		System.out.println(granfather.size());
		System.out.println(granfather.degree());
		System.out.println(son.size());
		

	}

}
