package moura.clara.maria.myapplication

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [RoomDB_ThirdClass::class], version = 1)
abstract class RoomDB_ThirdClass: RoomDatabase() {

    abstract fun thirdClassDao(): RoomDao_ThirdClass


}