package fr.pcreations.labs.RESTDroid.core;

/**
 * <b>Class used to hold all your specifics needs without editing the core classes</b>
 * <p>
 * A module has to be register on {@link WebService} instance. It provides {@link Processor}, {@link ParserFactory} and {@link DaoFactory} that will be used during all process
 * </p>
 * 
 * @author Pierre Criulanscy
 *
 * @version 0.5
 * 
 * @see Processor
 * @see ParserFactory
 * @see DaoFactory
 * @see WebService#registerModule(Module)
 */
abstract public class Module {

	/**
	 * Instance of {@link Processor}
	 */
	protected Processor mProcessor;
	
	/**
	 * Initialize the {@link Processor} and the {@link ParserFactory} and {@link DaoFactory} of the processor
	 * 
	 * @see Module#setProcessor()
	 * @see Module#setParserFactory()
	 * @see Module#setDaoFactory()
	 */
	public void init() {
		mProcessor = setProcessor();
		mProcessor.setParserFactory(setParserFactory());
		mProcessor.setDaoFactory(setDaoFactory());
	}
	
	/**
	 * Return the {@link Processor} you want for this module
	 * 
	 * @return
	 * 		Instance of {@link Processor}
	 * 
	 * @see Module#mProcessor
	 */
	abstract public Processor setProcessor();
	
	/**
	 * Return the {@link ParserFactory} you want for this module
	 * 
	 * @return
	 * 		Instance of {@link ParserFactory}
	 */
	abstract public ParserFactory setParserFactory();
	
	/**
	 * Return the {@link DaoFactory} you want for this module
	 * 
	 * @return
	 * 		Instance of {@link DaoFactory}
	 */
	abstract public DaoFactory setDaoFactory();

	/**
	 * Getter for {@link Processor} field
	 * 
	 * @return
	 * 		The {@link Processor} field
	 * 
	 * @see Module#mProcessor
	 */
	public Processor getProcessor() {
		return mProcessor;
	}
	
	
	
}
