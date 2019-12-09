package br.com.ignisinventum.infra.patters.creational.singleton;

import java.io.Serializable;

/**
 * The Interface Singleton.
 *
 * @param <I> the generic type
 */
public interface Singleton<I extends Singleton<?>> extends Cloneable, Serializable {

}
