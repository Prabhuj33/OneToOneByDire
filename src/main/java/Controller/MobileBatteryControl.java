package Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dao.BatteryDao;
import dao.MobileDao;
import dto.Battery;
import dto.Mobile;

public class MobileBatteryControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//insert
//		
//		Mobile m=new Mobile();
//		m.setId(3);
//		m.setBrandname("Vivo");
//		m.setColor("Purple");
//		
//		Battery b=new Battery();
//		b.setId(103);
//		b.setBatteryname("Duralcel");
//		b.setCapacity(6000);
//		
//		m.setBattery(b);
//		b.setMobile(m);
//		
//		
//		EntityManagerFactory emf=Persistence.createEntityManagerFactory("prabhu");
//		EntityManager em=emf.createEntityManager();
//		EntityTransaction et=em.getTransaction();
//		et.begin();
//		em.persist(b);
//		em.persist(m);
//		et.commit();
	
	
	// update
//	
//	Mobile m=new Mobile();
//	m.setId(3);
//	m.setBrandname("Nokia");
//	m.setColor("black");
//	
//	MobileDao mo=new MobileDao();
//	mo.updateMobile(3, m);
//	
//	Battery b=new Battery();
//	b.setId(103);
//	b.setBatteryname("Dongo");
//	b.setCapacity(2000);
//	
//	BatteryDao bo=new BatteryDao();
//	bo.updateBattery(103, b);
		
		
		//delete
		
		
//	   MobileDao mo=new MobileDao();
//		mo.deleteMobile(3);
//////		
//		BatteryDao bo=new BatteryDao();
//		bo.deleteBattery(103);
//	
		
		MobileDao m=new MobileDao();
		m.findMobile(1);
	}

}
