package moura.clara.maria.myapplication

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "thirdClass")
data class RoomEntity_ThirdClass ( // only stores data

    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "username") val username: String,
    @ColumnInfo(name = "pwd") val pwd: String,
    @ColumnInfo(name = "remember") val remember: Boolean

)