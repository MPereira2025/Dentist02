/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Logica.Odontologo;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Logica.Turno;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author massi
 */
public class OdontologoJpaController implements Serializable {

    public OdontologoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public OdontologoJpaController(){
        emf = Persistence.createEntityManagerFactory("ConsultorioOdontologicoPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Odontologo odontologo) {
        if (odontologo.getListTurno() == null) {
            odontologo.setListTurno(new ArrayList<Turno>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Turno> attachedListTurno = new ArrayList<Turno>();
            for (Turno listTurnoTurnoToAttach : odontologo.getListTurno()) {
                listTurnoTurnoToAttach = em.getReference(listTurnoTurnoToAttach.getClass(), listTurnoTurnoToAttach.getIdTurno());
                attachedListTurno.add(listTurnoTurnoToAttach);
            }
            odontologo.setListTurno(attachedListTurno);
            em.persist(odontologo);
            for (Turno listTurnoTurno : odontologo.getListTurno()) {
                Odontologo oldOdontoOfListTurnoTurno = listTurnoTurno.getOdonto();
                listTurnoTurno.setOdonto(odontologo);
                listTurnoTurno = em.merge(listTurnoTurno);
                if (oldOdontoOfListTurnoTurno != null) {
                    oldOdontoOfListTurnoTurno.getListTurno().remove(listTurnoTurno);
                    oldOdontoOfListTurnoTurno = em.merge(oldOdontoOfListTurnoTurno);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Odontologo odontologo) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Odontologo persistentOdontologo = em.find(Odontologo.class, odontologo.getId());
            List<Turno> listTurnoOld = persistentOdontologo.getListTurno();
            List<Turno> listTurnoNew = odontologo.getListTurno();
            List<Turno> attachedListTurnoNew = new ArrayList<Turno>();
            for (Turno listTurnoNewTurnoToAttach : listTurnoNew) {
                listTurnoNewTurnoToAttach = em.getReference(listTurnoNewTurnoToAttach.getClass(), listTurnoNewTurnoToAttach.getIdTurno());
                attachedListTurnoNew.add(listTurnoNewTurnoToAttach);
            }
            listTurnoNew = attachedListTurnoNew;
            odontologo.setListTurno(listTurnoNew);
            odontologo = em.merge(odontologo);
            for (Turno listTurnoOldTurno : listTurnoOld) {
                if (!listTurnoNew.contains(listTurnoOldTurno)) {
                    listTurnoOldTurno.setOdonto(null);
                    listTurnoOldTurno = em.merge(listTurnoOldTurno);
                }
            }
            for (Turno listTurnoNewTurno : listTurnoNew) {
                if (!listTurnoOld.contains(listTurnoNewTurno)) {
                    Odontologo oldOdontoOfListTurnoNewTurno = listTurnoNewTurno.getOdonto();
                    listTurnoNewTurno.setOdonto(odontologo);
                    listTurnoNewTurno = em.merge(listTurnoNewTurno);
                    if (oldOdontoOfListTurnoNewTurno != null && !oldOdontoOfListTurnoNewTurno.equals(odontologo)) {
                        oldOdontoOfListTurnoNewTurno.getListTurno().remove(listTurnoNewTurno);
                        oldOdontoOfListTurnoNewTurno = em.merge(oldOdontoOfListTurnoNewTurno);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = odontologo.getId();
                if (findOdontologo(id) == null) {
                    throw new NonexistentEntityException("The odontologo with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Odontologo odontologo;
            try {
                odontologo = em.getReference(Odontologo.class, id);
                odontologo.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The odontologo with id " + id + " no longer exists.", enfe);
            }
            List<Turno> listTurno = odontologo.getListTurno();
            for (Turno listTurnoTurno : listTurno) {
                listTurnoTurno.setOdonto(null);
                listTurnoTurno = em.merge(listTurnoTurno);
            }
            em.remove(odontologo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Odontologo> findOdontologoEntities() {
        return findOdontologoEntities(true, -1, -1);
    }

    public List<Odontologo> findOdontologoEntities(int maxResults, int firstResult) {
        return findOdontologoEntities(false, maxResults, firstResult);
    }

    private List<Odontologo> findOdontologoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Odontologo.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Odontologo findOdontologo(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Odontologo.class, id);
        } finally {
            em.close();
        }
    }

    public int getOdontologoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Odontologo> rt = cq.from(Odontologo.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
