package com.neusoft.pojo;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;

/**
 * A data access object (DAO) providing persistence and search support for Kehu
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.neusoft.pojo.Kehu
 * @author MyEclipse Persistence Tools
 */
@Service("kehuDAO")
public class KehuDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(KehuDAO.class);
	// property constants
	public static final String KNAME = "kname";
	public static final String KSEX = "ksex";
	public static final String KCONNECT = "kconnect";

	protected void initDao() {
		// do nothing
	}

	public void save(Kehu transientInstance) {
		log.debug("saving Kehu instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void update(Kehu transientInstance) {
		log.debug("saving Kehu instance");
		try {
			getHibernateTemplate().update(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Kehu persistentInstance) {
		log.debug("deleting Kehu instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Kehu findById(java.lang.Integer id) {
		log.debug("getting Kehu instance with id: " + id);
		try {
			Kehu instance = (Kehu) getHibernateTemplate().get(
					"com.neusoft.pojo.Kehu", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Kehu instance) {
		log.debug("finding Kehu instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Kehu instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Kehu as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByKname(Object kname) {
		return findByProperty(KNAME, kname);
	}

	public List findByKsex(Object ksex) {
		return findByProperty(KSEX, ksex);
	}

	public List findByKconnect(Object kconnect) {
		return findByProperty(KCONNECT, kconnect);
	}

	public List findAll() {
		log.debug("finding all Kehu instances");
		try {
			String queryString = "from Kehu";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Kehu merge(Kehu detachedInstance) {
		log.debug("merging Kehu instance");
		try {
			Kehu result = (Kehu) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Kehu instance) {
		log.debug("attaching dirty Kehu instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Kehu instance) {
		log.debug("attaching clean Kehu instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static KehuDAO getFromApplicationContext(ApplicationContext ctx) {
		return (KehuDAO) ctx.getBean("KehuDAO");
	}
}