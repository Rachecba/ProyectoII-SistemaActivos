/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.data;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import sistema.logic.Funcionario;
import sistema.logic.Funcionario;

/**
 *
 * @author leaca
 */
public class FuncionarioDAO extends AbstractFacade<Funcionario> implements Serializable{
    private final EntityManagerFactory emf;
    
    private EntityManager em;
    
    public FuncionarioDAO(EntityManagerFactory emf) {
        super(Funcionario.class);
        this.emf = emf;
        em = getEntityManager();
    }
    
    @Override
    protected final EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public void create(Funcionario obj){
        try {
            super.persist(obj);
        } catch (Exception e) {
            System.out.print("Error al crear el funcionario.\n\n Error:" + e + "\n\n");
        }
    }
    
    public void edit(Funcionario obj){
        try {
            super.merge(obj);
        } catch (Exception e) {
            System.out.print("Error al editando el funcionario.\n\n Error:" + e + "\n\n");
        }
    }
    
    public void delete(Funcionario obj){
        try {
            super.remove(obj);
        } catch (Exception e) {
            System.out.print("Error al borrando el funcionario.\n\n Error:" + e + "\n\n");
        }
    }
    
    @Override
    public List<Funcionario> findAll(){
        try {
            Query q = em.createQuery("Select obj from Funcionario obj");
            return q.getResultList();
        } catch (Exception e) {
            System.out.print("Error al recuperando los funcionarios.\n\n Error:" + e + "\n\n");
        }
        return null;
    }
}
