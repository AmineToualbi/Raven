package com.example.jacobgraves.myapplication.view.providers

import com.example.jacobgraves.myapplication.view.database.daos.RavenDao
import com.example.jacobgraves.myapplication.view.model.Raven
import javax.inject.Inject
import javax.inject.Singleton


@Singleton                      //Only 1 instance of this RavenProvider in the life of our app.
class RavenProvider @Inject constructor(
        private val ravenDao: RavenDao
) :  IRavenProvider {

    override fun getAll(): List<Raven> {
        return ravenDao.getAll()
    }

    override fun save(raven: Raven) {
        ravenDao.insert(raven)
    }

    override fun update(raven: Raven) {
        ravenDao.update(raven)
    }

    override fun delete(raven: Raven) {
        ravenDao.delete(raven)
    }
}