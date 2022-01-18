package com.geekbrains.tests

import com.geekbrains.tests.presenter.details.DetailsPresenter
import com.geekbrains.tests.view.ViewContract
import com.geekbrains.tests.view.details.ViewDetailsContract
import com.nhaarman.mockito_kotlin.mock
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test

class DetailsPresenterTest {

    private var presenter: DetailsPresenter? = null
    private val viewContract: ViewDetailsContract = mock()

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
        presenter?.onAttach(viewContract)
        assertNotNull(presenter?.viewContract)
    }

    @Test
    fun onDetach() {
        presenter?.onDetach()
        assertNull(presenter?.viewContract)
    }
}