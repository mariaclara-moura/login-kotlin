package moura.clara.maria.myapplication

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface RoomDao_ThirdClass {

    @Query("SELECT * FROM thirdClass")
    fun getAll(): List<RoomEntity_ThirdClass>

    @Query("SELECT * FROM ThirdClass WHERE username LIKE :usernameInput")
    fun getByUsername(usernameInput: String): RoomEntity_ThirdClass

    @Insert
    fun insert(thirdClass: RoomEntity_ThirdClass)

    @Delete
    fun delete(thirdClass: RoomEntity_ThirdClass)

    @Query("UPDATE thirdClass SET pwd =:passwordInput WHERE username LIKE :usernameInput")
    fun updatePwd(usernameInput: String, passwordInput: String)
}