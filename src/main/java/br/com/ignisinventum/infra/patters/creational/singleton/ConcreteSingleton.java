package br.com.ignisinventum.infra.patters.creational.singleton;

/**
 * The Class ConcreteSingleton.
 */
public class ConcreteSingleton implements Singleton<ConcreteSingleton> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 7745104911370265441L;

	/** The single instance. */
	private static ConcreteSingleton SINGLE_INSTANCE = null;

	/**
	 * Gets the single instance of ConcreteSingleton.
	 *
	 * @return single instance of ConcreteSingleton
	 */
	public ConcreteSingleton getInstance() {

		if (SINGLE_INSTANCE == null) {
			synchronized (this.getClass()) {
				if (SINGLE_INSTANCE == null) {
					SINGLE_INSTANCE = this.getInstance();
				}
			}
		}
		return SINGLE_INSTANCE;
	}

	/**
	 * Clone.
	 *
	 * @return the object
	 * @throws CloneNotSupportedException the clone not supported exception
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return SINGLE_INSTANCE;
	}

}
