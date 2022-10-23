package com.w2sv.viewboundcontroller

import bindings.FragmentTestBinding
import de.mannodermaus.junit5.ActivityScenarioExtension
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.RegisterExtension

class DummyViewBoundFragment: ViewBoundFragment<FragmentTestBinding>(FragmentTestBinding::class.java)

internal class ViewBoundFragmentTest{
    @JvmField
    @RegisterExtension
    val scenarioExtension = ActivityScenarioExtension.launch<DummyViewBoundActivity>()

    @Test
    fun bindingPropertiesAccessible(){
        scenarioExtension.scenario.onActivity {
            val layoutId = it.binding.root.id

            it.supportFragmentManager
                .beginTransaction()
                .add(
                    layoutId,
                    DummyViewBoundFragment()
                )
                .commitNow()

            with(it.supportFragmentManager.findFragmentById(layoutId) as DummyViewBoundFragment){
                Assertions.assertEquals(-1, binding.root.id)
                Assertions.assertEquals(2131230781, binding.appTitleTextView.id)
            }
        }
    }
}