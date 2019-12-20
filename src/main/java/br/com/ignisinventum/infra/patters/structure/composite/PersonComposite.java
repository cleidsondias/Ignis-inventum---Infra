package br.com.ignisinventum.infra.patters.structure.composite;

import java.util.ArrayList;
import java.util.List;

import br.com.ignisinventum.infra.patters.structure.composite.interfaces.Component;
import br.com.ignisinventum.infra.patters.structure.composite.interfaces.Composite;

/**
 * The Class HeritageComposite.
 */
public class PersonComposite implements Composite<PersonComposite>, Component {

	/** The personas. */
	private List<PersonComposite> personas = new ArrayList<>();

	/**
	 * Adds the.
	 *
	 * @param person the person
	 * @return 
	 */
	@Override
	public PersonComposite add(PersonComposite person) {
		personas.add(person);
		return this;
	}

	/**
	 * Removes the.
	 *
	 * @param person the person
	 */
	@Override
	public PersonComposite remove(PersonComposite person) {
		personas.remove(person);
		return this;
	}

	/**
	 * Gets the children.
	 *
	 * @return the children
	 */
	@Override
	public List<PersonComposite> getChildren() {
		return personas;
	}
	
	@Override
	public Integer size() {
		Integer count = 1;
		for (PersonComposite person : personas) {
			count += person.size();
		}
		return count;
	}

	/**
	 * Excute.
	 */
	@Override
	public void excute() {
		System.out.println(this.hashCode());
	}

}
