package View;

import Model.*;
import org.hibernate.Session;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Angajat a1 = new Angajat();
		a1.setNumePrenume("ionel");
		Client c1 = new Client();
		c1.setNumePrenume("Gigel");

		Date azi = new Date();

		List<Date> ipo = new ArrayList<Date>();
		ipo.add(azi);

		Companie comp2 = new Companie();
		Instrument intr = new Instrument();
		intr.setEmitent("TurkisAirlains");

		Set<Stire> setStiri = new HashSet<Stire>();

		Companie comp = new Companie();

		comp.setNumeCompanie("GeneralMotors");

		Stire s1 = new Stire();

		s1.setCeTara(Tara.China);
		s1.setCeSector(SectorInstr.Industrial);
		s1.setSumar("urmeaza o miscare spectaculoasa!!");

		setStiri.add(s1);

		Conversatie cc1 = new Conversatie();
		cc1.setNume("a treia");
		cc1.setDiscutie("ceva foarte interesant");

		Portofoliu prtf = new Portofoliu();
		Portofoliu prtf2 = new Portofoliu();
		prtf.setName("Ginel");

		Instrument bin1 = new Instrument();
		bin1.setEmitent("SSIF5");
		bin1.setTipC(TipContract.Forward);
		bin1.setTipInstr(TipInstrument.Actiune);
		bin1.setStire(setStiri);
		// bin1.setCompanie(companie);
		Instrument bin2 = new Instrument();
		// bin2.setEmitent("SSIF6");
		Instrument bin4 = new Instrument();
		bin4.setEmitent("SSIF7");

		List<Instrument> bxt = new ArrayList<Instrument>();
		bxt.add(bin1);
		bxt.add(bin2);
		bxt.add(bin4);

		prtf.setInstrumente(bxt);
		s1.getStireInstrumet().add(bin1);

		Session session = Controller.hibernateUtil.getSessionFactory()
				.openSession();
		session.beginTransaction();

		// session.save(ba34);
		// ba35 = (bActiune)session.get(bActiune.class, 32768L);
		/*
		 * prtf.getInstrumente().add( (bActiune) session.get(bActiune.class,
		 * 32768L));
		 */
		//
		// System.out.println(ba35.getEmitent());

		session.save(bin1);
		session.save(s1);

		// bin2 = (Instrument) session.get(Instrument.class, 1L);
		// session.save(c1);

		// prtf2 = (Portofoliu) session.get(Portofoliu.class, 2L);

		/*
		 * for(bInstrument i : prtf2.getInstrumente()){
		 * System.out.println(i.getEmitent());}
		 */

		// prtf2.getInstrumente().add(ba34);

		session.getTransaction().commit();

		session.close();

		// System.out.println(bin2.getTipInstr());
	}

}
