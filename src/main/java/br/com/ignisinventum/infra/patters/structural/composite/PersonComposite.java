package br.com.ignisinventum.infra.patters.structural.composite;

import java.util.ArrayList;
import java.util.List;

import br.com.ignisinventum.infra.patters.structural.composite.interfaces.Component;
import br.com.ignisinventum.infra.patters.structural.composite.interfaces.Composite;

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
	 * @return the person composite
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
	 * @return the person composite
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

	/**
	 * Size.
	 *
	 * @return the integer
	 */
	@Override
	public Integer size() {
		Integer count = 1;
		for (PersonComposite person : personas) {
			count += person.size();
		}
		return count;
	}

	/**
	 * Degree.
	 *
	 * @return the integer
	 */
	@Override
	public Integer degree() {
		Integer count = 1;
		if (personas.size() > 0) {
			count += personas.get(0).degree();
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
