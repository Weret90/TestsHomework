package com.geekbrains.tests

import com.geekbrains.tests.presenter.details.DetailsPresenter
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test

class DetailsPresenterTest {

    private var presenter: DetailsPresenter? = null

    @Before
    fun setUp() {
        presenter = DetailsPresenter(5)
    }

    @After
    fun tearDown() {
        presenter = null
    }

    @Test
    fun setCounter() {
        presenter?.setCounter(3)
        assertEquals(3, presenter?.count)
    }

    @Test
    fun onIncrement() {
        presenter?.onIncrement()
        assertEquals(6, presenter?.count)
    }

    @Test
    fun onDecrement() {
        presenter?.onDecrement()
        assertEquals(4, presenter?.count)
    }

    @Test
    fun onAttach() {
    }

    @Test
    fun onDetach() {
    }
}