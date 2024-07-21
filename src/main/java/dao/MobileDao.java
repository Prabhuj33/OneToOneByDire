package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Battery;
import dto.Mobile;

public class MobileDao 
{

	public EntityManager getEntityManager()
	{
		return Persistence.createEntityManagerFactory("prabhu").createEntityManager();
	}
	
	public void updateMobile(int id,Mobile mobile)
	{
		EntityManager em=getEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Mobile dbMobile=em.find(Mobile.class,id);
	
	   if(dbMobile!=null)
	   {
		   et.begin();
		   mobile.setId(id);
		   mobile.setBattery(dbMobile.getBattery());
		   em.merge(mobile);
		   et.commit();
	   }
	   else
	   {
		   System.out.println("sorry mobile is not available");
	   }
	}

	public void deleteMobile(int id)
	{
		EntityManager em=getEntityManager();
		EntityTransaction et=em.getTransaction();
		Mobile dbMobile=em.find(Mobile.class,id);
	
	   if(dbMobile!=null)
	   {
		   et.begin();
//		   
//		   Battery dbBattery=dbMobile.getBattery();
//		   dbBattery.setMobile(null);
		   
		   em.remove(dbMobile);
		   et.commit();
		   
		}
	   else {
		   System.out.println("sorry mobile is not be present");
	   }
	}

	public void findMobile(int id)
	{
		EntityManager em =getEntityManager();
		Mobile dbMobile=em.find(Mobile.class,id);
		if(dbMobile!=null)
		{
			System.out.println(dbMobile);
		}
		else
		{
			System.out.println("sorry mobile not present");
		}
	}
	
}
