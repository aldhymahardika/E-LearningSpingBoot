package com.lawencon.elearning.dao.impl;

import java.util.List;
import java.util.Map;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lawencon.elearning.dao.MateriDao;
import com.lawencon.elearning.model.Materi;

@Repository("materi_repo_hibernate")
public class MateriDaoImpl extends BaseHibernate implements MateriDao {

	@Override
	public Materi insertMateri(Materi materi) throws Exception {
		em.persist(materi);
		return materi;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Materi> findByWeekAndDay(int week, int day) throws Exception {
		Query q = em.createQuery(" from Materi where week = :week and day = :day").setParameter("week", week)
				.setParameter("day", day);
		return q.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Map<String, Object>> findByCategory(String category, String pengajar, int week, int day) throws Exception {
		Query q = em.createQuery(
				"select m.judulMateri as judul, m.fileMateri as file, m.typeFile as type from Materi m left join m.category as c left outer join m.pengajar as trainer where c.id = :category  and trainer.id = :pengajar and m.week = : week and m.day = :day");
		q.setParameter("category", category);
		q.setParameter("pengajar", pengajar);
		q.setParameter("week", week);
		q.setParameter("day", day);
		List<Object[]>result = q.getResultList();
		return bMapperHibernate(result, "judul", "file", "type");
	}

}
