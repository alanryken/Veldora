package com.unnng.veldora.mining.data.local;

import com.unnng.veldora.enums.Rarity;
import com.unnng.veldora.mining.entity.Mine;

import java.util.ArrayList;
import java.util.List;

public class MineResources {
    public static List<Mine> mineList = new ArrayList<>();
    static {
        // COMMON（普通） - 废弃物和低价值矿石，30种
        mineList.add(new Mine(1, "碎石", Rarity.COMMON, 1.0, "普通的岩石碎片，毫无价值。"));
        mineList.add(new Mine(2, "锈铁块", Rarity.COMMON, 1.5, "生锈的铁块，无人问津。"));
        mineList.add(new Mine(3, "破损的矿渣", Rarity.COMMON, 1.0, "挖掘时留下的废弃物，无用。"));
        mineList.add(new Mine(4, "砂砾", Rarity.COMMON, 1.5, "细小的沙石，价值低。"));
        mineList.add(new Mine(5, "黏土块", Rarity.COMMON, 2.0, "普通的黏土，可用于简单工艺。"));
        mineList.add(new Mine(6, "石灰岩屑", Rarity.COMMON, 1.0, "破碎的石灰岩，无甚用途。"));
        mineList.add(new Mine(7, "煤渣", Rarity.COMMON, 1.5, "燃烧过的煤渣，价值低。"));
        mineList.add(new Mine(8, "破裂的石板", Rarity.COMMON, 1.0, "碎裂的石板，无用。"));
        mineList.add(new Mine(9, "风化岩", Rarity.COMMON, 1.5, "风化的岩石碎片，价值低。"));
        mineList.add(new Mine(10, "泥岩屑", Rarity.COMMON, 1.0, "泥岩的碎片，毫无价值。"));
        mineList.add(new Mine(11, "石英", Rarity.COMMON, 15.0, "常见矿石，用于玻璃和装饰。"));
        mineList.add(new Mine(12, "煤块", Rarity.COMMON, 20.0, "普通燃料，广泛用于冶炼。"));
        mineList.add(new Mine(13, "花岗岩", Rarity.COMMON, 18.0, "坚硬的岩石，用于建筑。"));
        mineList.add(new Mine(14, "砂岩", Rarity.COMMON, 15.0, "普通岩石，适合雕刻。"));
        mineList.add(new Mine(15, "石灰岩", Rarity.COMMON, 12.0, "常见矿石，用于建筑材料。"));
        mineList.add(new Mine(16, "页岩", Rarity.COMMON, 10.0, "普通岩石，价值一般。"));
        mineList.add(new Mine(17, "玄武岩", Rarity.COMMON, 15.0, "坚硬的火成岩，适合建筑。"));
        mineList.add(new Mine(18, "燧石", Rarity.COMMON, 12.0, "普通矿石，用于制作火种。"));
        mineList.add(new Mine(19, "大理石", Rarity.COMMON, 20.0, "装饰性岩石，价值普通。"));
        mineList.add(new Mine(20, "板岩", Rarity.COMMON, 15.0, "普通岩石，适合铺路。"));
        mineList.add(new Mine(21, "滑石", Rarity.COMMON, 10.0, "软质矿石，用于粉末制作。"));
        mineList.add(new Mine(22, "石膏", Rarity.COMMON, 12.0, "普通矿石，用于建筑。"));
        mineList.add(new Mine(23, "辉绿岩", Rarity.COMMON, 15.0, "坚硬岩石，适合建筑材料。"));
        mineList.add(new Mine(24, "浮石", Rarity.COMMON, 10.0, "轻质火山岩，价值低。"));
        mineList.add(new Mine(25, "凝灰岩", Rarity.COMMON, 12.0, "火山岩，适合装饰。"));
        mineList.add(new Mine(26, "长石", Rarity.COMMON, 15.0, "常见矿物，用于陶瓷。"));
        mineList.add(new Mine(27, "云母", Rarity.COMMON, 10.0, "片状矿物，价值普通。"));
        mineList.add(new Mine(28, "方解石", Rarity.COMMON, 12.0, "普通晶体，用于装饰。"));
        mineList.add(new Mine(29, "白云石", Rarity.COMMON, 15.0, "普通矿石，用于建筑。"));
        mineList.add(new Mine(30, "绿泥石", Rarity.COMMON, 10.0, "普通矿物，价值一般。"));

        // UNCOMMON（优秀） - 常见现实矿石，30种
        mineList.add(new Mine(31, "铜矿", Rarity.UNCOMMON, 50.0, "常见矿石，广泛用于工艺品和武器。"));
        mineList.add(new Mine(32, "铁矿", Rarity.UNCOMMON, 70.0, "建筑和锻造必需品，市场需求高。"));
        mineList.add(new Mine(33, "锡矿", Rarity.UNCOMMON, 30.0, "用于合金和器皿，价值中等。"));
        mineList.add(new Mine(34, "铅矿", Rarity.UNCOMMON, 40.0, "用于工业，价值中等。"));
        mineList.add(new Mine(35, "锌矿", Rarity.UNCOMMON, 50.0, "用于防腐材料，市场需求稳定。"));
        mineList.add(new Mine(36, "铝矿", Rarity.UNCOMMON, 60.0, "轻便耐用，适合工业用途。"));
        mineList.add(new Mine(37, "镍矿", Rarity.UNCOMMON, 70.0, "用于合金，价值中等。"));
        mineList.add(new Mine(38, "锰矿", Rarity.UNCOMMON, 60.0, "用于钢铁生产，市场需求高。"));
        mineList.add(new Mine(39, "萤石", Rarity.UNCOMMON, 50.0, "夜间发光，适合装饰。"));
        mineList.add(new Mine(40, "硫磺", Rarity.UNCOMMON, 40.0, "用于化工和药剂，价值中等。"));
        mineList.add(new Mine(41, "赤铁矿", Rarity.UNCOMMON, 70.0, "优质铁矿，适合高级锻造。"));
        mineList.add(new Mine(42, "磁铁矿", Rarity.UNCOMMON, 60.0, "含磁性的铁矿，价值较高。"));
        mineList.add(new Mine(43, "黄铁矿", Rarity.UNCOMMON, 50.0, "俗称愚人金，适合装饰。"));
        mineList.add(new Mine(44, "辉钼矿", Rarity.UNCOMMON, 60.0, "用于合金，价值中等。"));
        mineList.add(new Mine(45, "孔雀石", Rarity.UNCOMMON, 70.0, "绿色矿石，适合装饰和工艺。"));
        mineList.add(new Mine(46, "青金石", Rarity.UNCOMMON, 60.0, "蓝色矿石，用于染料和装饰。"));
        mineList.add(new Mine(47, "绿松石", Rarity.UNCOMMON, 70.0, "青绿色宝石，适合珠宝。"));
        mineList.add(new Mine(48, "碧玺", Rarity.UNCOMMON, 80.0, "色彩多样的宝石，市场需求高。"));
        mineList.add(new Mine(49, "石榴石", Rarity.UNCOMMON, 70.0, "红色宝石，用于装饰。"));
        mineList.add(new Mine(50, "橄榄石", Rarity.UNCOMMON, 60.0, "绿色宝石，价值中等。"));
        mineList.add(new Mine(51, "硅灰石", Rarity.UNCOMMON, 50.0, "用于陶瓷，价值普通。"));
        mineList.add(new Mine(52, "磷灰石", Rarity.UNCOMMON, 60.0, "用于肥料和工艺，价值中等。"));
        mineList.add(new Mine(53, "钛铁矿", Rarity.UNCOMMON, 70.0, "含钛矿石，适合合金。"));
        mineList.add(new Mine(54, "铬铁矿", Rarity.UNCOMMON, 60.0, "用于不锈钢生产，价值较高。"));
        mineList.add(new Mine(55, "硼砂", Rarity.UNCOMMON, 50.0, "用于化工，价值中等。"));
        mineList.add(new Mine(56, "重晶石", Rarity.UNCOMMON, 60.0, "用于工业，价值普通。"));
        mineList.add(new Mine(57, "菱镁矿", Rarity.UNCOMMON, 70.0, "用于耐火材料，市场需求高。"));
        mineList.add(new Mine(58, "辉石", Rarity.UNCOMMON, 60.0, "坚硬矿物，适合装饰。"));
        mineList.add(new Mine(59, "角闪石", Rarity.UNCOMMON, 50.0, "普通矿物，价值中等。"));
        mineList.add(new Mine(60, "玛瑙", Rarity.UNCOMMON, 70.0, "条纹状宝石，适合雕刻。"));

        // RARE（稀有） - 珍稀现实矿石和宝石，30种
        mineList.add(new Mine(61, "金矿", Rarity.RARE, 300.0, "象征财富的高档矿石，价值极高。"));
        mineList.add(new Mine(62, "银矿", Rarity.RARE, 280.0, "用于饰品和仪式，市场需求高。"));
        mineList.add(new Mine(63, "钴矿", Rarity.RARE, 320.0, "用于合金和电池，价值较高。"));
        mineList.add(new Mine(64, "蓝宝石", Rarity.RARE, 350.0, "晶莹剔透的宝石，深受珠宝商喜爱。"));
        mineList.add(new Mine(65, "红宝石", Rarity.RARE, 400.0, "象征热情的宝石，价值极高。"));
        mineList.add(new Mine(66, "翡翠", Rarity.RARE, 320.0, "象征吉祥的宝石，市场需求高。"));
        mineList.add(new Mine(67, "紫水晶", Rarity.RARE, 280.0, "用于仪式和装饰，价值较高。"));
        mineList.add(new Mine(68, "欧泊", Rarity.RARE, 300.0, "彩色宝石，闪耀光芒。"));
        mineList.add(new Mine(69, "钻石", Rarity.RARE, 450.0, "稀有且珍贵的宝石，价值极高。"));
        mineList.add(new Mine(70, "铂金", Rarity.RARE, 400.0, "珍贵金属，适合高级装备。"));
        mineList.add(new Mine(71, "钛矿", Rarity.RARE, 320.0, "轻质高强度矿石，工业用途广。"));
        mineList.add(new Mine(72, "铀矿", Rarity.RARE, 350.0, "稀有能源矿石，价值极高。"));
        mineList.add(new Mine(73, "锂矿", Rarity.RARE, 300.0, "用于电池，市场需求高。"));
        mineList.add(new Mine(74, "锆石", Rarity.RARE, 280.0, "闪耀的宝石，适合珠宝。"));
        mineList.add(new Mine(75, "海蓝宝", Rarity.RARE, 300.0, "蓝色宝石，象征海洋。"));
        mineList.add(new Mine(76, "碧玺", Rarity.RARE, 320.0, "多彩宝石，深受收藏家喜爱。"));
        mineList.add(new Mine(77, "托帕石", Rarity.RARE, 280.0, "黄色宝石，适合装饰。"));
        mineList.add(new Mine(78, "铍矿", Rarity.RARE, 300.0, "稀有矿石，用于高科技设备。"));
        mineList.add(new Mine(79, "萤石晶体", Rarity.RARE, 280.0, "发光晶体，装饰价值高。"));
        mineList.add(new Mine(80, "水晶簇", Rarity.RARE, 300.0, "透明晶体，适合仪式和装饰。"));
        mineList.add(new Mine(81, "铬矿", Rarity.RARE, 320.0, "用于高级合金，价值高。"));
        mineList.add(new Mine(82, "钨矿", Rarity.RARE, 350.0, "坚硬矿石，适合武器制造。"));
        mineList.add(new Mine(83, "钽矿", Rarity.RARE, 300.0, "稀有金属，用于电子设备。"));
        mineList.add(new Mine(84, "铌矿", Rarity.RARE, 320.0, "稀有金属，工业用途广。"));
        mineList.add(new Mine(85, "黑曜石", Rarity.RARE, 280.0, "坚硬的火山玻璃，用于工艺。"));
        mineList.add(new Mine(86, "石墨", Rarity.RARE, 300.0, "用于工业和书写工具，价值高。"));
        mineList.add(new Mine(87, "天青石", Rarity.RARE, 280.0, "蓝色矿石，用于染料。"));
        mineList.add(new Mine(88, "孔雀石晶", Rarity.RARE, 320.0, "优质孔雀石，装饰价值高。"));
        mineList.add(new Mine(89, "磷矿", Rarity.RARE, 300.0, "用于肥料和化工，价值高。"));
        mineList.add(new Mine(90, "硼矿", Rarity.RARE, 280.0, "稀有矿石，用于工业。"));

        // EPIC（史诗） - 珍稀奇幻矿石，20种
        mineList.add(new Mine(91, "黑曜晶", Rarity.EPIC, 1000.0, "史诗矿石，坚硬无比，用于高级装备。"));
        mineList.add(new Mine(92, "祖母绿", Rarity.EPIC, 1100.0, "史诗宝石，绿光耀眼，极难挖掘。"));
        mineList.add(new Mine(93, "陨铁", Rarity.EPIC, 1050.0, "史诗矿石，来自天外，适合打造神器。"));
        mineList.add(new Mine(94, "星辉晶", Rarity.EPIC, 1150.0, "史诗晶体，夜间散发星光。"));
        mineList.add(new Mine(95, "秘银矿", Rarity.EPIC, 1000.0, "史诗金属，轻盈且坚韧。"));
        mineList.add(new Mine(96, "精金矿", Rarity.EPIC, 1100.0, "史诗金属，坚不可摧。"));
        mineList.add(new Mine(97, "紫晶簇", Rarity.EPIC, 1050.0, "史诗晶体，散发紫色光芒。"));
        mineList.add(new Mine(98, "雷霆石", Rarity.EPIC, 1150.0, "史诗矿石，蕴含雷电之力。"));
        mineList.add(new Mine(99, "冰霜晶", Rarity.EPIC, 1000.0, "史诗晶体，寒气逼人。"));
        mineList.add(new Mine(100, "火焰矿", Rarity.EPIC, 1100.0, "史诗矿石，散发炽热能量。"));
        mineList.add(new Mine(101, "琥珀晶", Rarity.EPIC, 1050.0, "史诗晶体，封存古老力量。"));
        mineList.add(new Mine(102, "水晶龙骨", Rarity.EPIC, 1150.0, "史诗矿石，形似龙骨化石。"));
        mineList.add(new Mine(103, "星辰砂", Rarity.EPIC, 1000.0, "史诗矿砂，闪烁星光。"));
        mineList.add(new Mine(104, "暗影矿", Rarity.EPIC, 1100.0, "史诗矿石，融入黑暗之力。"));
        mineList.add(new Mine(105, "灵光石", Rarity.EPIC, 1050.0, "史诗晶石，散发灵性光芒。"));
        mineList.add(new Mine(106, "寒冰铁", Rarity.EPIC, 1150.0, "史诗金属，生长于极寒矿脉。"));
        mineList.add(new Mine(107, "烈焰晶", Rarity.EPIC, 1000.0, "史诗晶体，似火焰般燃烧。"));
        mineList.add(new Mine(108, "翡翠髓", Rarity.EPIC, 1100.0, "史诗宝石，绿光如玉。"));
        mineList.add(new Mine(109, "夜影石", Rarity.EPIC, 1050.0, "史诗矿石，仅在黑暗中发光。"));
        mineList.add(new Mine(110, "星光矿", Rarity.EPIC, 1150.0, "史诗矿石，蕴含星辰之力。"));

        // LEGENDARY（传说） - 虚拟矿石，7种
        mineList.add(new Mine(111, "星髓晶", Rarity.LEGENDARY, 2800.0, "传说矿石，蕴含宇宙能量，挖掘难度极高。"));
        mineList.add(new Mine(112, "虚空矿", Rarity.LEGENDARY, 3000.0, "传说矿石，蕴含空间之力，极其罕见。"));
        mineList.add(new Mine(113, "龙晶", Rarity.LEGENDARY, 2600.0, "传说晶体，散发龙的气息。"));
        mineList.add(new Mine(114, "天辉石", Rarity.LEGENDARY, 2900.0, "传说矿石，散发神圣光芒。"));
        mineList.add(new Mine(115, "暗影晶", Rarity.LEGENDARY, 2700.0, "传说晶体，融入黑暗之力。"));
        mineList.add(new Mine(116, "炎龙矿", Rarity.LEGENDARY, 2800.0, "传说矿石，炽热无比。"));
        mineList.add(new Mine(117, "星魂石", Rarity.LEGENDARY, 2900.0, "传说矿石，蕴含星魂之力。"));

        // MYTHIC（神话） - 终极虚拟矿石，3种
        mineList.add(new Mine(118, "星河晶核", Rarity.MYTHIC, 5000.0, "神话晶体，如银河般流动，极难挖掘。"));
        mineList.add(new Mine(119, "虚空神铁", Rarity.MYTHIC, 5500.0, "神话金属，掌控空间之力。"));
        mineList.add(new Mine(120, "永恒晶髓", Rarity.MYTHIC, 6000.0, "神话矿石，传说为世界核心碎片。"));
    }
}
