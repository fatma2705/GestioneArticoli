package it.prova.gestionearticolijspservletjpamaven.dao;

import java.util.List;

import it.prova.gestionearticolijspservletjpamaven.model.Articolo;
import jakarta.persistence.EntityManager;

public class ArticoloDAOImpl implements ArticoloDAO {
	
	private EntityManager entityManager;

	@Override
	public List<Articolo> list() throws Exception {
		return entityManager.createQuery("from Articolo",Articolo.class).getResultList();
	}

	@Override
	public Articolo get(Long id) throws Exception {
		return entityManager.find(Articolo.class, id);
	}

	@Override
	public void update(Articolo articoloInstance) throws Exception {
		 if (articoloInstance == null) {
			 throw new Exception("Impossibile eseguire l' update nel DB. Input non valido");
			 } articoloInstance = entityManager.merge(articoloInstance);
		
	}

	@Override
	public void insert(Articolo articoloInstance) throws Exception {
		if (articoloInstance == null) {
			 throw new Exception("Impossibile eseguire l' insert nel DB. Input non valido");
		}entityManager.persist(articoloInstance);
		
		
	}

	@Override
	public void delete(Articolo articoloInstance) throws Exception {
		if (articoloInstance == null) {
			 throw new Exception("Impossibile eseguire la delete nel DB. Input non valido");
		}entityManager.remove(entityManager.merge(articoloInstance));
	}

	@Override
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
		
	}

}
