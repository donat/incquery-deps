package hu.bme.incquery.deps.pub;


public interface IIncQueryDepsEngine {

	public abstract void registerChangeListener(IncQueryDepsChangeListener listener, Class... matcherClasses);

}