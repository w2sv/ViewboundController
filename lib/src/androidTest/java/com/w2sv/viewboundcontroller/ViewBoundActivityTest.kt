package com.w2sv.viewboundcontroller

import bindings.ActivityTestBinding
import de.mannodermaus.junit5.ActivityScenarioExtension
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.RegisterExtension

class DummyViewBoundActivity: ViewBoundActivity<ActivityTestBinding>(ActivityTestBinding::class.java)

internal class ViewBoundActivityTest{
    @JvmField
    @RegisterExtension
    val scenarioExtension = ActivityScenarioExtension.launch<DummyViewBoundActivity>()

    @Test
    fun bindingPropertiesAccessible(){
        scenarioExtension.scenario.onActivity {
            Assertions.assertEquals(-1, it.binding.root.id)
            Assertions.assertEquals(2131230800, it.binding.dummyTv.id)
            Assertions.assertEquals(2131230799, it.binding.dummyIv.id)
        }
    }
}