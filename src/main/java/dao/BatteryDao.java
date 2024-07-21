package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Battery;
import dto.Mobile;

public class BatteryDao
{

	public EntityManager getEntityManager()
	{
		return Persistence.createEntityManagerFactory("prabhu").createEntityManager();
	}
	public void updateBattery(int id,Battery battery)
	{
		EntityManager em=getEntityManager();
		EntityTransaction et=em.getTransaction();
		Battery dbBatter=em.find(Battery.class,id);
		if(dbBatter!=null)
		{
			et.begin();
			battery.setId(id);
			battery.setMobile(dbBatter.getMobile());
			em.merge(battery);
			et.commit();
		}
	}
	
	
	
	public void deleteBattery(int id)
	{
		EntityManager em=getEntityManager();
		EntityTransaction et=em.getTransaction();
		Battery dbBattery=em.find(Battery.class,id);
		if(dbBattery!=null)
		{
			et.begin();
            Mobile mo=dbBattery.getMobile();
            mo.setBattery(null);
			em.remove(dbBattery);
			et.commit();
		}
		else
		{
			System.out.println("sorry your batteruy not avilable ");
		}
	}
}
