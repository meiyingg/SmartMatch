package com.example.smartmatch.logic.model
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * @className: MMNetResponse
 * @author: Voyager
 * @description: MMNet数据类
 * @date:  2023/9/22 20:53
 * @version 1.0
 **/
data class MMNetResponse(
    val code: Int,
    val `data`: Data,
    val msg: Any
)

data class Data(
    val mmnet_data: List<MmnetData>,
    val mmnet_num: Int
)

data class MmnetData(
    val C: C,
    val admin_id: String,
    val areas: Areas,
    val mmnet_id: Int,
    val mmnet_name: String
)

data class C(
    val c_data: List<CData>,
    val c_num: Int
)

data class Areas(
    val area_num: Int,
    val areas_data: List<AreasData>
)

data class CData(
    val id: Int
)

data class AreasData(
    val area: Area
)

data class Area(
    val area_c: List<AreaC>,
    val area_light: List<AreaLight>,
    val id: Int,
    val name: String,
    val scenarios_data: List<ScenariosData>,
    val scenarios_num: Int
)

data class AreaC(
    val id: Int
)

data class AreaLight(
    val c_id: Int,
    val light_id: Int
)

data class ScenariosData(
    val id: Int,
    val light_data: List<LightData>,
    val light_num: Int,
    val name: String
)

data class LightData(
    val light_id: Int,
    val light_wattage: Int,
    val percentage: Double
)