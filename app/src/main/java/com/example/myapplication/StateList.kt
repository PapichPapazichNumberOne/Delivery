import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class StateList<T>(initialValue: List<T>) : ReadWriteProperty<Any?, List<T>> {
    private var state = mutableStateOf(initialValue)

    override fun getValue(thisRef: Any?, property: KProperty<*>): List<T> = state.value

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: List<T>) {
        state.value = value
    }
}
