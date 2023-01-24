package interfaceSecre;

public interface Service <T extends Entiry>  {
	public void save(T entity);

	public void delete(T entity);

	public T findById(Long id);

}
