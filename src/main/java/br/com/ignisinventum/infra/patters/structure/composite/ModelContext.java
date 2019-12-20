package br.com.ignisinventum.infra.patters.structure.composite;

public class ModelContext {
	
	private static PersonComposite granfather = new PersonComposite();
	
	public static void main(String[] args) {

		PersonComposite father = new PersonComposite();
		PersonComposite son = new PersonComposite();
		
		granfather.add(father.add(son));
		
		System.out.println(granfather.size());
		

	}

}
